package com.fastservices.sams.modules.outletnoorder

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.provider.Settings
import android.text.method.LinkMovementMethod
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
import com.imagepicker.FilePickUtils
import com.imagepicker.LifeCycleCallBackManager
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.annotations.NonNull
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_outlet_no_order.*
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

    @SuppressLint("CheckResult")
    private fun getGPSLocation() {


        if(!isLocationEnabled(context!!)){
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

        RxGps(activity).locationLowPower()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { location ->
                            viewModel.latitude = location.latitude
                            viewModel.longtidue = location.longitude
                            tvMapLink.setText("http://maps.google.com/maps?q=${viewModel.latitude},${viewModel.longtidue}")
                            tvMapLink.linksClickable = true
                            tvMapLink.movementMethod = LinkMovementMethod()

                        }, { throwable ->
                    if (throwable is RxGps.PermissionException) {
                        //the user does not allow the permission
                    } else if (throwable is RxGps.PlayServicesNotAvailableException) {
                        // play services not found
                    }
                }

                )

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