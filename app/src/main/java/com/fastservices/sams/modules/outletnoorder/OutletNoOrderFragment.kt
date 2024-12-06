package com.fastservices.sams.modules.outletnoorder

import android.Manifest
import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.os.Bundle
import android.provider.Settings
import android.text.method.LinkMovementMethod
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RadioButton
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
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
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.imagepicker.FilePickUtils
import com.imagepicker.LifeCycleCallBackManager
import io.reactivex.annotations.NonNull
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
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

    @SuppressLint("SetTextI18n")
    override fun setUp() {
        filePickUtils = FilePickUtils(this, onFileChoose)
        lifeCycleCallBackManager = filePickUtils.callBackManager
        binding.multiLineRadioGroup.setOnCheckedChangeListener { _: ViewGroup?, radioButton: RadioButton? ->
            viewModel.selectedReasonId = radioButton?.id ?: -1
        }

        binding.lblReason.text = "Select reason for not tracking order at ${viewModel.outlet?.outletName}"

        GlobalScope.launch {
            val output = SimpleDateFormat("EEE, dd MMM yyyy", Locale.US)
            viewModel.outlet.let {
                binding.tvLastOrderAmount.text = RoundUp2Decimal(it.lastOrderAmount)
                binding.tvContactNumber.text = it.phoneNumber
                if (it.lastOrderDate.isNotEmpty()) {
                    try {
                        binding.tvLastOrderDate.text = output.format(SamsApplication.sdf.parse(it.lastOrderDate))
                    } catch (e: Exception) {
                        binding.tvLastOrderDate.text = it.lastOrderDate
                    }
                } else {
                    binding.tvLastOrderDate.text = "Never"
                }

                binding.tvClosingBalance.text = RoundUp2Decimal(it.closing)
                val channelName = SamsApplication.getDB().channelDao().getSubChannelName(it.subChannelID)
                binding.tvStoreType.text = channelName
            }
        }

        binding.btnTakeGPS.setOnClickListener(this)
        binding.ivCamera.setOnClickListener(this)
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
        viewModel.dataLoaded.observe(viewLifecycleOwner) { _ ->
            viewModel.reasons.forEach {
                val radio = RadioButton(context)
                radio.text = it.unOrderReason
                radio.id = it.unOrderReasonID
                binding.multiLineRadioGroup.addButtons(radio)
            }
        }

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
        binding.imagesContainer.addView(v)

    }

    lateinit var filePickUtils: FilePickUtils
    lateinit var lifeCycleCallBackManager: LifeCycleCallBackManager

    private fun takePicture() {
        if (binding.imagesContainer.childCount < 5)
            filePickUtils.requestImageCamera(FilePickUtils.CAMERA_PERMISSION, false, false);

    }

    @SuppressLint("CheckResult", "SetTextI18n")
    private fun getGPSLocation() {

        Log.d("LocationCheck", "getGPSLocation")
        if(!isLocationEnabled(requireContext())){
            Log.d("LocationCheck", "getGPSLocation1")
            val alert = AlertDialog.Builder(context)
            alert.setTitle("Location")
            alert.setMessage("Please enable location services")
            alert.setPositiveButton("OK") { dialog, which->
                startActivity( Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS));
                dialog.dismiss()
            }
            alert.show()

            return
        }
        val fusedLocationClient: FusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(requireContext())

        if (ActivityCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            Log.d("LocationCheck", "getGPSLocation222")
            Log.d("LocationCheck", "getGPSLocation1")
            ActivityCompat.requestPermissions(
                requireActivity(),
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
                        binding.tvMapLink.setText("http://maps.google.com/maps?q=${viewModel.latitude},${viewModel.longtidue}")
                        binding.tvMapLink.linksClickable = true
                        binding.tvMapLink.movementMethod = LinkMovementMethod()
                    } else {
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
                    binding.tvMapLink.text = "http://maps.google.com/maps?q=${viewModel.latitude},${viewModel.longtidue}"
                    binding.tvMapLink.linksClickable = true
                    binding.tvMapLink.movementMethod = LinkMovementMethod()
                }
            }
            else {
                viewModel.latitude = 34.77
                viewModel.longtidue = 77.67
                binding.tvMapLink.text = "http://maps.google.com/maps?q=${viewModel.latitude},${viewModel.longtidue}"
                binding.tvMapLink.linksClickable = true
                binding.tvMapLink.movementMethod = LinkMovementMethod()
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