package com.fastservices.sams.modules.takeorder

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
import android.widget.*
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.fastservices.sams.R
import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.Category
import com.fastservices.sams.data.entities.Outlet
import com.fastservices.sams.data.entities.RoundUp2Decimal
import com.fastservices.sams.databinding.FragmentTakeOrderBinding
import com.fastservices.sams.modules.addoutlet.isLocationEnabled
import com.fastservices.sams.modules.base.BaseActivity
import com.fastservices.sams.modules.base.BaseFragment
import com.fastservices.sams.modules.base.BaseVM
import com.fastservices.sams.modules.orderdetails.OrderDetailFragment
import com.fastservices.sams.modules.skulist.SkuListFragment
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.imagepicker.FilePickUtils
import com.imagepicker.LifeCycleCallBackManager
import io.reactivex.annotations.NonNull
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

class TakeOrderFragment: BaseFragment(), ClickListener {

    lateinit var binding:   FragmentTakeOrderBinding
    lateinit var viewModel: OrderVM

    override fun doBinding(inflater: LayoutInflater, container: ViewGroup?): View {
        return DataBindingUtil.inflate<FragmentTakeOrderBinding>(inflater, getLayoutResId(), container, false).also {
            binding = it
            binding.viewModel = viewModel
        }.root
    }

    override fun getVM(): BaseVM? {
        return viewModel
    }

    override fun getTitle() = "Take Order"

    override fun getLayoutResId() = R.layout.fragment_take_order

    private var categoriesAdapter: CategoryAdapter? = null

    @SuppressLint("SetTextI18n")
    override fun setUp() {
        filePickUtils = FilePickUtils(this, onFileChoose)
        lifeCycleCallBackManager = filePickUtils.callBackManager

        binding.lblReasonTakeOrder.text = "Select reason for not tracking order at ${viewModel.outlet?.outletName}"

        val manager = LinearLayoutManager(context)
        binding.rvCategories.layoutManager = manager

        val dividerItemDecoration =
            DividerItemDecoration(
                binding.rvCategories.context,
                manager.orientation
            )
        binding.rvCategories.addItemDecoration(dividerItemDecoration);

        binding.btnTakeGPS.setOnClickListener(this)
        binding.ivCamera.setOnClickListener(this)
        GlobalScope.launch {
            val output = SimpleDateFormat("EEE, dd MMM yyyy", Locale.US)
            viewModel.outlet?.let {
                binding.tvLastOrderAmount.text = RoundUp2Decimal(it.lastOrderAmount)
                binding.tvContactNumber.text = it.phoneNumber
                if (it.lastOrderDate.isNotEmpty()) {
                    try {
                        binding.tvLastOrderDate.text = output.format(SamsApplication.sdf.parse(it.lastOrderDate)!!)
                    }
                    catch (e: Exception) {
                        binding.tvLastOrderDate.text = it.lastOrderDate
                    }
                }
                else {
                    binding.tvLastOrderDate.text = "Never"
                }

                binding.tvClosingBalance.text = RoundUp2Decimal(it.closing)
                val channelName = SamsApplication.getDB().channelDao().getSubChannelName(it.subChannelID)
                binding.tvStoreType.text = channelName
            }
        }

        if(viewModel.latitude != 0.0) {
            binding.tvMapLink.text = "http://maps.google.com/maps?q=${viewModel.latitude},${viewModel.longtidue}"
        }
        viewModel.images.forEach {
            addImageViewToContainer(it)
        }

        binding.radioTakeOrder.setOnCheckedChangeListener { _, b ->
            if(b) {
                viewModel.optionSelected.value = 1
                binding.orderSummary.text = "Order Summary"
                binding.takeOrderLayout.visibility = View.VISIBLE
                binding.noOrderLayout.visibility   = View.GONE
            }
            else {
                binding.takeOrderLayout.visibility = View.GONE
                binding.noOrderLayout.visibility   = View.VISIBLE
            }
        }

        binding.radioNoOrder.setOnCheckedChangeListener { _, b ->
            if(b) {
                viewModel.optionSelected.value = 2
                binding.orderSummary.text = "Submit"
                binding.takeOrderLayout.visibility = View.GONE
                binding.noOrderLayout.visibility   = View.VISIBLE
            }
            else {
                binding.takeOrderLayout.visibility = View.VISIBLE
                binding.noOrderLayout.visibility   = View.GONE
            }
        }

        binding.multiLineRadioGroupTakeOrder.setOnCheckedChangeListener { _: ViewGroup?, radioButton: RadioButton? ->
            viewModel.selectedReasonId = radioButton?.id ?: -1
        }
    }

    override fun setVM() {
        viewModel = ViewModelProviders.of(requireActivity()).get(OrderVM::class.java)
        viewModel.outlet = arguments?.getSerializable(ARGS_OUTLET) as? Outlet
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun setObservers() {

        viewModel.dataInserted.observe(viewLifecycleOwner) { dt ->
            if(dt) {
                requireActivity().onBackPressedDispatcher.onBackPressed()
            }
        }

        viewModel.categoriesLoaded.observe(viewLifecycleOwner) { value ->
            if (value == true) {
                if (categoriesAdapter == null) {
                    categoriesAdapter = CategoryAdapter(viewModel.categories, this)
                }
                if (binding.rvCategories.adapter == null)
                    binding.rvCategories.adapter = categoriesAdapter
                categoriesAdapter?.notifyDataSetChanged()
            }
        }

        viewModel.summaryClicked.observe(viewLifecycleOwner) { value ->
            if (value == true) {
                viewModel.summaryClicked.postValue(false)
                (activity as? BaseActivity)?.replaceFragment(
                    OrderDetailFragment.newInstance(),
                    true
                )
            }
        }

        viewModel.showEmptyView.observe(viewLifecycleOwner) { show ->
            if (show == true) {
                binding.emptyView.visibility = View.VISIBLE
            }
            else {
                binding.emptyView.visibility = View.GONE
            }
        }

        viewModel.dataLoaded.observe(viewLifecycleOwner) { _ ->
            viewModel.reasons.forEach {
                val radio = RadioButton(context)
                radio.text = it.unOrderReason
                radio.id = it.unOrderReasonID
                binding.multiLineRadioGroupTakeOrder.addButtons(radio)
            }
        }
    }

    override fun onItemClicked(item: Category) {
        (activity as? BaseActivity)?.replaceFragment(SkuListFragment.newInstance(item), true)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnTakeGPS -> getGPSLocation()
            R.id.ivCamera -> takePicture()
            R.id.iv -> {
                val alert = AlertDialog.Builder(v.context)
                alert.setTitle("Warning")
                alert.setMessage("Do you want to delete this picture?")
                alert.setPositiveButton("YES") { dialog, _ ->
                    dialog.dismiss()
                    val fl = v.parent as FrameLayout
                    val uri = fl.tag as String
                    (fl.parent as? LinearLayout)?.removeView(fl)
                    viewModel.removeFileUri(uri)
                }
                alert.setNegativeButton("NO") { dialog, _ ->
                    dialog.dismiss()
                }
                alert.show()
            }
            else -> super.onClick(v)
        }
    }

    private fun takePicture() {
        if (binding.imagesContainer.childCount < 5)
            filePickUtils.requestImageCamera(FilePickUtils.CAMERA_PERMISSION, false, false)
    }

    @SuppressLint("CheckResult", "SetTextI18n")
    private fun getGPSLocation() {
        Log.d("LocationCheck", "getGPSLocation")
        if(!isLocationEnabled(requireContext())) {
            Log.d("LocationCheck", "isLocationEnabled")
            val alert = AlertDialog.Builder(context)
            alert.setTitle("Location")
            alert.setMessage("Please enable location services")
            alert.setPositiveButton("OK") { dialog, _ ->
                startActivity( Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS));
                dialog.dismiss()
            }
            alert.show()
            return
        }
        Log.d("LocationCheck", "getGPSLocation1")

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
                    Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION
                ),
                1223
            )
            return
        }

        fusedLocationClient.lastLocation.addOnSuccessListener { location : Location? ->
            // Got last known location. In some rare situations this can be null.
            Log.d("LocationCheck", "getGPSLocation2")
            if(location != null) {
                if(viewModel.outlet!!.validateRadius==1) {
                    Log.d("LocationCheck", "getGPSLocation3")
                    val currentLocation = location

                    val outletLocation = Location("")
                    outletLocation.latitude = viewModel.outlet!!.latitude
                    outletLocation.longitude = viewModel.outlet!!.longtidue

                    val distance = currentLocation!!.distanceTo(outletLocation)
                    if (distance < viewModel.outlet!!.radius) {
                        Log.d("LocationCheck", "orderSummaryClicked: Within Radius")
                        viewModel.latitude = location!!.latitude
                        viewModel.longtidue = location!!.longitude
                        binding.tvMapLink.text = "http://maps.google.com/maps?q=${viewModel.latitude},${viewModel.longtidue}"
                        binding.tvMapLink.linksClickable = true
                        binding.tvMapLink.movementMethod = LinkMovementMethod()
                    }
                    else {
                        Log.d("LocationCheck", "getGPSLocation4")
                        val alert = AlertDialog.Builder(context)
                        alert.setTitle("Location")
                        alert.setMessage("You are not within allowed radius of your outlet. To take order please make sure you are in your outlet.")
                        alert.setPositiveButton("OK") { dialog, _ ->
                            //startActivity( Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS));
                            dialog.dismiss()
                        }
                        alert.show()
                    }
                }
                else {
                    Log.d("LocationCheck", "getGPSLocation5")
                    viewModel.latitude  = location.latitude
                    viewModel.longtidue = location.longitude
                    binding.tvMapLink.text = "http://maps.google.com/maps?q=${viewModel.latitude},${viewModel.longtidue}"
                    binding.tvMapLink.linksClickable = true
                    binding.tvMapLink.movementMethod = LinkMovementMethod()
                }
                Log.d("LocationCheck", "getGPSLocation6")
            }
            else {
                Toast.makeText(context, "Unable to get Location", Toast.LENGTH_SHORT).show()
            }
        }

        /* RxGps(activity).locationLowPower()
                 .subscribeOn(Schedulers.newThread())
                 .observeOn(AndroidSchedulers.mainThread())
                 .subscribe(
                         { location ->
                             Log.d("LocationCheck", "getGPSLocation2")
                             ProgressDialogFragment.hideProgressBar(activity!!)
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
                         }, { throwable ->
                     if (throwable is RxGps.PermissionException) {
                         //the user does not allow the permission
                         ProgressDialogFragment.hideProgressBar(activity!!)
                     } else if (throwable is RxGps.PlayServicesNotAvailableException) {
                         // play services not found
                         ProgressDialogFragment.hideProgressBar(activity!!)
                     }
                 }
                 )*/
    }


    override fun onRequestPermissionsResult(requestCode: Int, @NonNull permissions: Array<String>, @NonNull grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        lifeCycleCallBackManager.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        lifeCycleCallBackManager.onActivityResult(requestCode, resultCode, data)
    }


    private val onFileChoose = FilePickUtils.OnFileChoose { fileUri, requestCode, size ->
        addImageViewToContainer(fileUri)
        viewModel.imageTaken(fileUri)
        viewModel.imageTakenNoOrder(fileUri)
    }

    private fun addImageViewToContainer(fileUri: String?) {
        val v = LayoutInflater.from(context).inflate(R.layout.item_image_view, null)
        val iv: ImageView = v.findViewById(R.id.iv)
        v.tag = fileUri
        iv.setOnClickListener(this)
        Glide.with(this)
                .load(fileUri)
                .apply(RequestOptions.centerCropTransform())
                .thumbnail(0.1f)
                .into(iv)
        binding.imagesContainer.addView(v)
    }

    lateinit var filePickUtils: FilePickUtils
    lateinit var lifeCycleCallBackManager: LifeCycleCallBackManager


    companion object {

        const val ARGS_OUTLET = "args_outlet"

        fun newInstance(outlet: Outlet) = TakeOrderFragment().apply {
            val args = Bundle()
            args.putSerializable(ARGS_OUTLET, outlet)
            arguments = args
        }
    }
}