package com.fastservices.sams.modules.addoutlet

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.content.Intent
import android.databinding.BindingAdapter
import android.databinding.DataBindingUtil
import android.provider.Settings
import android.text.method.LinkMovementMethod
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.*
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.fastservices.sams.R
import com.fastservices.sams.data.entities.Channel
import com.fastservices.sams.data.entities.Locality
import com.fastservices.sams.data.entities.Section
import com.fastservices.sams.data.entities.SubChannel
import com.fastservices.sams.databinding.FragmentAddOutletBinding
import com.fastservices.sams.modules.base.BaseFragment
import com.fastservices.sams.modules.base.BaseVM
import com.github.florent37.rxgps.RxGps
import com.imagepicker.FilePickUtils
import com.imagepicker.FilePickUtils.CAMERA_PERMISSION
import com.imagepicker.LifeCycleCallBackManager
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.annotations.NonNull
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_add_outlet.*


class AddOutletFragment : BaseFragment(), View.OnClickListener {

    val TAG = "AddOutletFragment"

    override fun doBinding(inflater: LayoutInflater, container: ViewGroup?): View {
        return DataBindingUtil.inflate<FragmentAddOutletBinding>(inflater, getLayoutResId(), container, false).also {
            binding = it
            binding.viewModel = viewModel
        }.root
    }


    override fun getTitle() = "Add Outlet"

    override fun getLayoutResId() = R.layout.fragment_add_outlet

    private lateinit var viewModel: AddOutletVM
    private lateinit var binding: FragmentAddOutletBinding

    override fun setUp() {
        filePickUtils = FilePickUtils(this, onFileChoose)
        lifeCycleCallBackManager = filePickUtils.callBackManager
        btnTakeGPS.setOnClickListener(this)
        ivCamera.setOnClickListener(this)
        tvSubmit.setOnClickListener(this)

        scrollView.setOnTouchListener(View.OnTouchListener { v, event ->
            val imm = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
            imm?.hideSoftInputFromWindow(etComment.windowToken, 0)

            false
        })


    }

    override fun getVM(): BaseVM? {
        return viewModel
    }

    override fun setVM() {
        viewModel = ViewModelProviders.of(this).get(AddOutletVM::class.java)
    }

    override fun setObservers() {
        viewModel.dataLoaded.observe(viewLifecycleOwner, android.arch.lifecycle.Observer { value ->
            if (value == null) return@Observer
            when (value) {
                AddOutletVM.CHANNELS -> populateChannel()
                AddOutletVM.SECTIONS -> populateSections()
            }
            populateChannel()
        })

        viewModel.submit.observe(viewLifecycleOwner, android.arch.lifecycle.Observer {
            showToast("Outlet Added")
            activity?.supportFragmentManager?.popBackStack()
//            (activity as? BaseActivity)?.replaceFragment(DashboardFragment.newInstance(), false)
        })
    }

    private fun populateChannel() {

        val adapterChannel = ArrayAdapter<Channel>(activity!!, android.R.layout.simple_spinner_item, viewModel.channels)
        adapterChannel.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spChannel.adapter = adapterChannel
        spChannel.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                (parent?.getItemAtPosition(position) as? Channel)?.let {
                    viewModel.outlet.ChannelID = it.id
                    populateSubChannels()
                }
            }
        }


    }

    private fun populateSections() {
        val adapterSections = ArrayAdapter<Section>(activity!!, android.R.layout.simple_spinner_item, viewModel.sections)
        adapterSections.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spSector.adapter = adapterSections
        spSector.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                (parent?.getItemAtPosition(position) as? Section)?.let {
                    viewModel.outlet.SectionID = it.sectionID
                    populateLocalities()
                }
            }
        }
    }

    fun populateLocalities() {
        val adapterLocality = ArrayAdapter<Locality>(activity!!, android.R.layout.simple_spinner_item, viewModel.localities.filter { it.sectionID == viewModel.outlet.SectionID })
        adapterLocality.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spLocality.adapter = adapterLocality
        spLocality.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                (parent?.getItemAtPosition(position) as? Locality)?.let {
                    viewModel.outlet.LocalityID = it.routeID
                }
            }
        }
    }

    fun populateSubChannels() {
        val adapterSubChannel = ArrayAdapter<SubChannel>(activity!!, android.R.layout.simple_spinner_item, viewModel.subChannels.filter { it.parentID == viewModel.outlet.ChannelID })
        adapterSubChannel.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spSubchannel.adapter = adapterSubChannel
        spSubchannel.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                (parent?.getItemAtPosition(position) as? SubChannel)?.let {
                    viewModel.outlet.SubChannelID = it.id
                }
            }
        }
    }

    private val onFileChoose = FilePickUtils.OnFileChoose { fileUri, requestCode, size ->
        val v = LayoutInflater.from(context).inflate(R.layout.item_image_view, null)
        val iv: ImageView = v.findViewById(R.id.iv)
        v.tag = fileUri
        iv.setOnClickListener(this)
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

    override fun onClick(v: View?) {

        when (v?.id) {
            R.id.btnTakeGPS -> getGPSLocation()
            R.id.ivCamera -> takePicture()
            tvSubmit.id -> viewModel.submitRequest()
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
            filePickUtils.requestImageCamera(CAMERA_PERMISSION, false, false);

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

        RxGps(activity).locationHight()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { location ->
                            viewModel.outlet.Latitude = location.latitude
                            viewModel.outlet.Longtidue = location.longitude
                            tvMapLink.setText("http://maps.google.com/maps?q=${viewModel.outlet.Latitude},${viewModel.outlet.Longtidue}")
                            tvMapLink.linksClickable = true
                            tvMapLink.movementMethod = LinkMovementMethod()

                        }, { throwable ->
                    if (throwable is RxGps.PermissionException) {
                        Log.d(TAG, "exception")
                        //the user does not allow the permission
                    } else if (throwable is RxGps.PlayServicesNotAvailableException) {
                        // play services not found
                        Log.d(TAG, "exception")
                    }
                }

                )

    }


    override fun onRequestPermissionsResult(requestCode: Int, @NonNull permissions: Array<String>, @NonNull grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
       if(grantResults.isEmpty()) return

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
        fun newInstance() = AddOutletFragment().apply {

        }

        const val MAPS_API_KEY = "AIzaSyDaZG2HhTFBIrjJxsrVipT4f466uvJNGFE"
    }
}

