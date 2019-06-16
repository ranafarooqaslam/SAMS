package com.fastservices.sams.modules.merchandise

import android.app.Activity
import android.app.AlertDialog
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.databinding.DataBindingUtil
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.fastservices.sams.R
import com.fastservices.sams.data.entities.Outlet
import com.fastservices.sams.modules.base.BaseFragment
import com.fastservices.sams.modules.base.BaseVM
import com.fastservices.sams.modules.outlet.OutletSelectorFragment
import com.fastservices.sams.outletselector.OutletSelectorActivity
import com.imagepicker.FilePickUtils
import com.imagepicker.LifeCycleCallBackManager
import io.reactivex.annotations.NonNull
import kotlinx.android.synthetic.main.fragment_merchandising.*


class MerchandisingFragment : BaseFragment(), View.OnClickListener {

    override fun getTitle() = "Merchandising"

    override fun getLayoutResId() = R.layout.fragment_merchandising

    private lateinit var viewModel: MerchandisingVM
    private lateinit var binding: com.fastservices.sams.databinding.FragmentMerchandisingBinding

    override fun doBinding(inflater: LayoutInflater, container: ViewGroup?): View {
        return DataBindingUtil.inflate<com.fastservices.sams.databinding.FragmentMerchandisingBinding>(inflater, getLayoutResId(), container, false).also {
            binding = it
            binding.viewModel = viewModel
        }.root
    }

    override fun getVM(): BaseVM? {
        return viewModel
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

        Glide.with(this)
                .load(fileUri)
                .apply(RequestOptions.centerCropTransform())
                .into(ivFullImage)

        when (requestCode) {
            CAMERA_BEFORE_MERCH -> {
                imageContainerBefore.addView(v)
                viewModel.imageTakenBeforeMerchandising(fileUri)

            }
            CAMERA_AFTER_MERCH -> {
                imageContainerAfter.addView(v)
                viewModel.imageTakenAfterMerchandising(fileUri)
            }
        }
    }
    lateinit var filePickUtils: FilePickUtils
    lateinit var lifeCycleCallBackManager: LifeCycleCallBackManager

    override fun onClick(v: View?) {

        when (v?.id) {
            ivCameraBeforeMerchandise.id -> if (imageContainerBefore.childCount < 5) takePicture(CAMERA_BEFORE_MERCH)
            ivCameraAfterMerchandise.id -> if (imageContainerAfter.childCount < 5) takePicture(CAMERA_AFTER_MERCH)
            tvSelectedOutlet.id -> OutletSelectorActivity.startActivity(this)
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

    override fun setVM() {
        viewModel = ViewModelProviders.of(this).get(MerchandisingVM::class.java)
    }

    override fun setObservers() {
//        viewModel.outletsLoaded.observe(viewLifecycleOwner, Observer {
//            populateOutletsInSpinner()
//        })
        viewModel.merchandiseAdded.observe(viewLifecycleOwner, Observer { value ->
            if (value == null) return@Observer

            when (value) {
                "success" -> activity?.supportFragmentManager?.popBackStack()
            }
        })
    }

    private fun takePicture(requestCode: Int) {

        filePickUtils.requestImageCamera(requestCode, false, true);

    }


//    fun populateOutletsInSpinner() {
//        val adapter = ArrayAdapter<Outlet>(context, android.R.layout.simple_spinner_item, viewModel.outlets)
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        spSelectOutlet.adapter = adapter
//        spSelectOutlet.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//            }
//
//            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//                viewModel.outletSelected(parent?.getItemAtPosition(position) as? Outlet)
//            }
//        }
//    }


    override fun setUp() {
        filePickUtils = FilePickUtils(this, onFileChoose)
        lifeCycleCallBackManager = filePickUtils.callBackManager
        ivCameraAfterMerchandise.setOnClickListener(this)
        ivCameraBeforeMerchandise.setOnClickListener(this)
        tvSelectedOutlet.setOnClickListener(this)

    }


    override fun onRequestPermissionsResult(requestCode: Int, @NonNull permissions: Array<String>, @NonNull grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (lifeCycleCallBackManager != null) {
            lifeCycleCallBackManager.onRequestPermissionsResult(requestCode, permissions, grantResults)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == OutletSelectorActivity.REQ_CODE) {
            if (resultCode == Activity.RESULT_OK) {
                // outlet selected
                viewModel.selectedOutlet = data?.getSerializableExtra(OutletSelectorFragment.EXTRA_SELECTED_OUTLET) as? Outlet
                viewModel.selectedOutlet?.let {
                    tvSelectedOutlet.text = it.outletName
                }

            }
        } else

            if (lifeCycleCallBackManager != null) {
                lifeCycleCallBackManager.onActivityResult(requestCode, resultCode, data)
            }

    }

    companion object {
        fun newInstance() = MerchandisingFragment().apply {

        }

        const val CAMERA_BEFORE_MERCH = 424
        const val CAMERA_AFTER_MERCH = 425

    }
}