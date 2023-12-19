package com.fastservices.sams.modules.outletnoorder

import android.Manifest
import android.annotation.SuppressLint
import android.app.AlertDialog
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import android.content.Intent
import android.content.pm.PackageManager
import androidx.databinding.DataBindingUtil
import android.location.Location
import android.os.Bundle
import android.provider.Settings
import androidx.core.app.ActivityCompat
import android.text.method.LinkMovementMethod
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RadioButton
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.fastservices.sams.R
import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.Outlet
import com.fastservices.sams.data.entities.RoundUp2Decimal
import com.fastservices.sams.databinding.FragmentOutletNoOrderBinding
import com.fastservices.sams.modules.addoutlet.isLocationEnabled
import com.fastservices.sams.modules.base.BaseFragment
import com.fastservices.sams.modules.base.BaseVM
import com.github.florent37.rxgps.RxGps
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.imagepicker.FilePickUtils
import com.imagepicker.LifeCycleCallBackManager
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.annotations.NonNull
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_outlet_no_order.*
import kotlinx.android.synthetic.main.fragment_outlet_no_order.btnTakeGPS
import kotlinx.android.synthetic.main.fragment_outlet_no_order.imagesContainer
import kotlinx.android.synthetic.main.fragment_outlet_no_order.ivCamera
import kotlinx.android.synthetic.main.fragment_outlet_no_order.tvClosingBalance
import kotlinx.android.synthetic.main.fragment_outlet_no_order.tvContactNumber
import kotlinx.android.synthetic.main.fragment_outlet_no_order.tvLastOrderAmount
import kotlinx.android.synthetic.main.fragment_outlet_no_order.tvLastOrderDate
import kotlinx.android.synthetic.main.fragment_outlet_no_order.tvMapLink
import kotlinx.android.synthetic.main.fragment_outlet_no_order.tvStoreType
import kotlinx.android.synthetic.main.fragment_take_order.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

class OutletNoOrderFragment : BaseFragment() {

    lateinit var binding: FragmentOutletNoOrderBinding
    lateinit var viewModel: OutletNoOrderVM

    override fun doBinding(inflater: LayoutInflater, container: ViewGroup?): View {
        return DataBindingUtil.inflate<FragmentOutletNoOrderBinding>(inflater, getLayoutResId(), container, false).also {
            binding = it
            binding.viewModel = viewModel
        }.root
    }

    override fun getVM(): BaseVM? {
        return viewModel
    }

    override fun getTitle() = "Outlet No-order"

    override fun getLayoutResId() = R.layout.fragment_outlet_no_order


    override fun setUp() {
        filePickUtils = FilePickUtils(this, onFileChoose)
        lifeCycleCallBackManager = filePickUtils.callBackManager
        multiLineRadioGroup.setOnCheckedChangeListener { viewGroup: ViewGroup?, radioButton: RadioButton? ->

            viewModel.selectedReasonId = radioButton?.id ?: -1
        }

        lblReason.text = "Select reason for not tracking order at ${viewModel.outlet?.outletName}"

        GlobalScope.launch {

//            val input = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US)
            val output = SimpleDateFormat("EEE, dd MMM yyyy", Locale.US)
            viewModel.outlet?.let {
                tvLastOrderAmount.text = RoundUp2Decimal(it.lastOrderAmount)
                tvContactNumber.text = it.phoneNumber
                if (it.lastOrderDate.isNotEmpty()) {
                    try {
                        tvLastOrderDate.text = output.format(SamsApplication.sdf.parse(it.lastOrderDate))
                    } catch (e: Exception) {
                        tvLastOrderDate.text = it.lastOrderDate
                    }
                } else {
                    tvLastOrderDate.text = "Never"

                }

                tvClosingBalance.text = RoundUp2Decimal(it.closing)
                val channelName = SamsApplication.getDB().channelDao().getSubChannelName(it.subChannelID)
                tvStoreType.text = channelName
            }
        }

        btnTakeGPS.setOnClickListener(this)
        ivCamera.setOnClickListener(this)

    }

    override fun setVM() {
        viewModel = ViewModelProviders.of(this).get(OutletNoOrderVM::class.java)
        viewModel.outlet = arguments?.getSerializable(ARGS_OUTLET) as Outlet
    }

    override fun onClick(v: View?) {

        when (v?.id) {
            R.id.btnTakeGPS -> getGPSLocation()
            R.id.ivCamera -> takePicture()
            else -> super.onClick(v)
        }

    }

    override fun setObservers() {

        viewModel.dataLoaded.observe(viewLifecycleOwner, Observer { _ ->

            viewModel.reasons.forEach {

                val radio = RadioButton(context)
                radio.text = it.unOrderReason
                radio.id = it.unOrderReasonID
                multiLineRadioGroup.addButtons(radio)
            }

        })

        viewModel.dataInserted.observe(viewLifecycleOwner, Observer {

            activity?.supportFragmentManager?.popBackStack()

        })

    }

    private val onFileChoose = FilePickUtils.OnFileChoose { fileUri, requestCode, size ->
        val v = LayoutInflater.from(context).inflate(R.layout.item_image_view, null)
        val iv: ImageView = v.findViewById(R.id.iv)
        Glide.with(this)
                .load(fileUri)
                .apply(RequestOptions.centerCropTransform())
                .thumbnail(0.1f)
                .into(iv)


        viewModel.imageTaken(fileUri)
        imagesContainer.addView(v)

    }

    lateinit var filePickUtils: FilePickUtils
    lateinit var lifeCycleCallBackManager: LifeCycleCallBackManager

    private fun takePicture() {
        if (imagesContainer.childCount < 5)
            filePickUtils.requestImageCamera(FilePickUtils.CAMERA_PERMISSION, false, false);

    }

    @SuppressLint("CheckResult", "SetTextI18n")
    private fun getGPSLocation() {

        Log.d("LocationCheck", "getGPSLocation")
        if(!isLocationEnabled(context!!)){
            Log.d("LocationCheck", "getGPSLocation1")
            val alert = AlertDialog.Builder(context)
            alert.setTitle("Location")
            alert.setMessage("Please enable location services")
            alert.setPositiveButton("OK") { dialog,which->
                startActivity( Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS));
                dialog.dismiss()
            }
            alert.show()

            return
        }
        lateinit var fusedLocationClient: FusedLocationProviderClient
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(context!!)

        if (ActivityCompat.checkSelfPermission(
                context!!,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                context!!,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            Log.d("LocationCheck", "getGPSLocation222")
            Log.d("LocationCheck", "getGPSLocation1")
            ActivityCompat.requestPermissions(
                activity!!,
                arrayOf(
                    Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.ACCESS_COARSE_LOCATION
                ),
                1223
            )
            return
        }
        fusedLocationClient.lastLocation.addOnSuccessListener { location : Location? ->
            // Got last known location. In some rare situations this can be null.
            Log.d("LocationCheck", "getGPSLocation2")
            if(location != null) {
                if(viewModel.outlet!!.validateRadius==1){
                    Log.d("LocationCheck", "getGPSLocation3")
                    var currentLocation = location


                    var outletLocation = Location("")
                    outletLocation.setLatitude(viewModel.outlet!!.latitude)
                    outletLocation.setLongitude(viewModel.outlet!!.longtidue)

                    var distance = currentLocation!!.distanceTo(outletLocation)
                    if (distance < viewModel.outlet!!.radius) {
                        Log.d("LocationCheck", "orderSummaryClicked: Within Radius")
                        viewModel.latitude = location!!.latitude
                        viewModel.longtidue = location!!.longitude
                        tvMapLink.setText("http://maps.google.com/maps?q=${viewModel.latitude},${viewModel.longtidue}")
                        tvMapLink.linksClickable = true
                        tvMapLink.movementMethod = LinkMovementMethod()
                    }else{
                        Log.d("LocationCheck", "getGPSLocation4")
                        val alert = AlertDialog.Builder(context)
                        alert.setTitle("Location")
                        alert.setMessage("You are not within allowed radius of your outlet. To take order please make sure you are in your outlet.")
                        alert.setPositiveButton("OK") { dialog,which->
                            //startActivity( Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS));
                            dialog.dismiss()
                        }
                        alert.show()
                    }
                }
                else {
                    Log.d("LocationCheck", "getGPSLocation5")
                    viewModel.latitude = location!!.latitude
                    viewModel.longtidue = location!!.longitude
                    tvMapLink.setText("http://maps.google.com/maps?q=${viewModel.latitude},${viewModel.longtidue}")
                    tvMapLink.linksClickable = true
                    tvMapLink.movementMethod = LinkMovementMethod()
                }
            }
            else {
                viewModel.latitude = 34.77
                viewModel.longtidue = 77.67
                tvMapLink.text = "http://maps.google.com/maps?q=${viewModel.latitude},${viewModel.longtidue}"
                tvMapLink.linksClickable = true
                tvMapLink.movementMethod = LinkMovementMethod()
            }
            Log.d("LocationCheck", "getGPSLocation6")
        }


       /* RxGps(activity).locationLowPower()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { location ->

                            Log.d("LocationCheck", "getGPSLocation2")
                            if(viewModel.outlet!!.validateRadius==1){
                                Log.d("LocationCheck", "getGPSLocation3")
                                var currentLocation = Location("")
                                currentLocation.setLatitude(location.latitude)
                                currentLocation.setLongitude(location.longitude)

                                var outletLocation = Location("")
                                outletLocation.setLatitude(viewModel.outlet!!.latitude)
                                outletLocation.setLongitude(viewModel.outlet!!.longtidue)

                                var distance = currentLocation.distanceTo(outletLocation);
                                if (distance < viewModel.outlet!!.radius) {
                                    Log.d("LocationCheck", "orderSummaryClicked: Within Radius")
                                    viewModel.latitude = location.latitude
                                    viewModel.longtidue = location.longitude
                                    tvMapLink.setText("http://maps.google.com/maps?q=${viewModel.latitude},${viewModel.longtidue}")
                                    tvMapLink.linksClickable = true
                                    tvMapLink.movementMethod = LinkMovementMethod()
                                }else{
                                    Log.d("LocationCheck", "getGPSLocation4")
                                    val alert = AlertDialog.Builder(context)
                                    alert.setTitle("Location")
                                    alert.setMessage("You are not within allowed radius of your outlet. To take order please make sure you are in your outlet.")
                                    alert.setPositiveButton("OK") { dialog,which->
                                        //startActivity( Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS));
                                        dialog.dismiss()
                                    }
                                    alert.show()
                                }
                            }else{
                                Log.d("LocationCheck", "getGPSLocation5")
                                viewModel.latitude = location.latitude
                                viewModel.longtidue = location.longitude
                                tvMapLink.setText("http://maps.google.com/maps?q=${viewModel.latitude},${viewModel.longtidue}")
                                tvMapLink.linksClickable = true
                                tvMapLink.movementMethod = LinkMovementMethod()
                            }

                            Log.d("LocationCheck", "getGPSLocation6")

                        }, { throwable ->
                    if (throwable is RxGps.PermissionException) {
                        //the user does not allow the permission
                        Log.d("LocationCheck", "getGPSLocation7")
                    } else if (throwable is RxGps.PlayServicesNotAvailableException) {
                        // play services not found
                        Log.d("LocationCheck", "getGPSLocation8")
                    }
                }

                )*/

    }

    override fun onRequestPermissionsResult(requestCode: Int, @NonNull permissions: Array<String>, @NonNull grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (lifeCycleCallBackManager != null) {
            lifeCycleCallBackManager.onRequestPermissionsResult(requestCode, permissions, grantResults)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (lifeCycleCallBackManager != null) {
            lifeCycleCallBackManager.onActivityResult(requestCode, resultCode, data)
        }
    }

    companion object {

        const val ARGS_OUTLET = "args_outlet"

        fun newInstance(outlet: Outlet) = OutletNoOrderFragment().apply {
            val args = Bundle()
            args.putSerializable(ARGS_OUTLET, outlet)
            arguments = args
        }
    }
}