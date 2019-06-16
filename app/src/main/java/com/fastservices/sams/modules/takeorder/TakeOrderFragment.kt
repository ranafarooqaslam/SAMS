package com.fastservices.sams.modules.takeorder

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.provider.Settings
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
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
import com.github.florent37.rxgps.RxGps
import com.imagepicker.FilePickUtils
import com.imagepicker.LifeCycleCallBackManager
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.annotations.NonNull
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_take_order.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

class TakeOrderFragment : BaseFragment(), ClickListener {


    lateinit var binding: FragmentTakeOrderBinding
    lateinit var viewModel: OrderVM

    override fun doBinding(inflater: LayoutInflater, container: ViewGroup?): View {
        return DataBindingUtil.inflate<com.fastservices.sams.databinding.FragmentTakeOrderBinding>(inflater, getLayoutResId(), container, false).also {
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

    override fun setUp() {

        filePickUtils = FilePickUtils(this, onFileChoose)
        lifeCycleCallBackManager = filePickUtils.callBackManager

        val manager = LinearLayoutManager(context)
        rvCategories.layoutManager = manager

        val dividerItemDecoration = DividerItemDecoration(rvCategories.getContext(),
                manager.orientation);
        rvCategories.addItemDecoration(dividerItemDecoration);

        btnTakeGPS.setOnClickListener(this)
        ivCamera.setOnClickListener(this)
        GlobalScope.launch {


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

        if(viewModel.latitude != 0.0){
            tvMapLink.setText("http://maps.google.com/maps?q=${viewModel.latitude},${viewModel.longtidue}")
        }
        viewModel.images.forEach {
            addImageViewToContainer(it)
        }


    }

    override fun setVM() {
        viewModel = ViewModelProviders.of(activity!!).get(OrderVM::class.java)
        viewModel.outlet = arguments?.getSerializable(ARGS_OUTLET) as? Outlet
    }

    override fun setObservers() {
        viewModel.categoriesLoaded.observe(viewLifecycleOwner, Observer { value ->
            if (value == true) {
                if (categoriesAdapter == null) {
                    categoriesAdapter = CategoryAdapter(viewModel.categories, this)

                }
                if (rvCategories.adapter == null)
                    rvCategories.adapter = categoriesAdapter
                categoriesAdapter?.notifyDataSetChanged()
            }
        })

        viewModel.summaryClicked.observe(viewLifecycleOwner, Observer { value ->
            if (value == true) {
                viewModel.summaryClicked.postValue(false)
                (activity as? BaseActivity)?.replaceFragment(OrderDetailFragment.newInstance(), true)
            }
        })

        viewModel.showEmptyView.observe(viewLifecycleOwner, Observer { show ->
            if (show == true)
                emptyView.visibility = View.VISIBLE
            else
                emptyView.visibility = View.GONE
        })

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
                alert.setPositiveButton("YES") { dialog, which ->
                    dialog.dismiss()
                    val fl = v.parent as FrameLayout
                    val uri = fl.tag as String
                    (fl.parent as? LinearLayout)?.removeView(fl)
                    viewModel.removeFileUri(uri)
                }
                alert.setNegativeButton("NO") { dialog, which ->
                    dialog.dismiss()
                }
                alert.show()

            }
            else -> super.onClick(v)
        }

    }

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


    private val onFileChoose = FilePickUtils.OnFileChoose { fileUri, requestCode, size ->
       addImageViewToContainer(fileUri)

        viewModel.imageTaken(fileUri)


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
        imagesContainer.addView(v)
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