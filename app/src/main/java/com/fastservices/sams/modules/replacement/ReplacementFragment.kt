package com.fastservices.sams.modules.replacement

import android.app.Activity
import android.app.AlertDialog
import android.app.DatePickerDialog
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
import com.fastservices.sams.data.entities.ReplacementReason
import com.fastservices.sams.data.entities.SKU
import com.fastservices.sams.modules.base.BaseFragment
import com.fastservices.sams.modules.base.BaseVM
import com.fastservices.sams.modules.outlet.OutletSelectorFragment
import com.fastservices.sams.modules.stockpositioning.SKUNameID
import com.fastservices.sams.outletselector.OutletSelectorActivity
import com.imagepicker.FilePickUtils
import com.imagepicker.LifeCycleCallBackManager
import io.reactivex.annotations.NonNull
import kotlinx.android.synthetic.main.fragment_replacement.*
import java.text.SimpleDateFormat
import java.util.*


class ReplacementFragment : BaseFragment(), View.OnClickListener {


    private lateinit var viewModel: ReplacementVM
    private lateinit var binding: com.fastservices.sams.databinding.FragmentReplacementBinding
    override fun doBinding(inflater: LayoutInflater, container: ViewGroup?): View {
        return DataBindingUtil.inflate<com.fastservices.sams.databinding.FragmentReplacementBinding>(inflater, getLayoutResId(), container, false).also {
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

        when (requestCode) {
            CAMERA_STOCK_IMAGES -> {
                imagesContainerStock.addView(v)
                viewModel.stockImageTaken(fileUri)
            }
            CAMERA_INVOICE_IMAGES -> {
                imagesContainerInvoice.addView(v)
                viewModel.invoiceImageTaken(fileUri)
            }

        }
    }
    lateinit var filePickUtils: FilePickUtils
    lateinit var lifeCycleCallBackManager: LifeCycleCallBackManager

    override fun onClick(v: View?) {

        when (v?.id) {
            R.id.ivCameraStockImage -> takePicture(CAMERA_STOCK_IMAGES)
            R.id.ivCameraInvoice -> takePicture(CAMERA_INVOICE_IMAGES)
            tvSelectedOutlet.id -> OutletSelectorActivity.startActivity(this)
            ivCalender.id,tvPurchaseDate.id -> openDatePicker()
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

    private fun openDatePicker() {
        val calendar = Calendar.getInstance()
        viewModel.selectedDate?.let {

            calendar.time = it
        }
        val dialog = DatePickerDialog(context, { view, year, month, dayOfMonth ->
            val selected = "$year-${month + 1}-$dayOfMonth"
            viewModel.selectedDate = SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(selected)
            viewModel.purchaseDate = selected
            tvPurchaseDate.text = SimpleDateFormat("dd, MMM yyyy", Locale.US).format(viewModel.selectedDate)

        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH))
        dialog.show()
    }

    override fun setVM() {
        viewModel = ViewModelProviders.of(this).get(ReplacementVM::class.java)

    }

    override fun setObservers() {

        viewModel.skusLoaded.observe(viewLifecycleOwner, Observer { value ->
            if (value == true) {
                viewModel.skusLoaded.value = false
                populateSKUs()
                populateReasons()

            }
        })

        viewModel.dataSubmitted.observe(viewLifecycleOwner, Observer { value->
            if(value == true){
                activity?.supportFragmentManager?.popBackStack()
            }

        })

    }

    private fun populateSKUs() {

        val adapter = ArrayAdapter<SKU>(context, android.R.layout.simple_spinner_item, viewModel.sku)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spSKU.adapter = adapter
        spSKU.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                viewModel.selectedSkuID = -1
                viewModel.totalPrice.set("0.0")
                viewModel.selectedSkuPrice = 0.0
                viewModel.quantity.set("")
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                (parent?.getItemAtPosition(position) as? SKU)?.let {
                    viewModel.selectedSkuID = it.SKU_ID
                    viewModel.selectedSkuPrice = it.TRADE_PRICE
                    viewModel.totalPrice.set("0.0")
                    viewModel.quantity.set("")

                }
            }
        }


    }

    private fun populateReasons() {

        val adapter = ArrayAdapter<ReplacementReason>(context, android.R.layout.simple_spinner_item, viewModel.replacementReasons)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spReason.adapter = adapter
        spReason.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                viewModel.selectedReasonId = -1
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                (parent?.getItemAtPosition(position) as? ReplacementReason)?.let {
                    viewModel.selectedReasonId = it.replacementReasonID

                }
            }
        }


    }

    private fun takePicture(requestCode: Int) {

        filePickUtils.requestImageCamera(requestCode, false, true);

    }


    override fun getTitle() = "Replacement"

    override fun getLayoutResId() = R.layout.fragment_replacement

    override fun setUp() {
        filePickUtils = FilePickUtils(this, onFileChoose)
        lifeCycleCallBackManager = filePickUtils.callBackManager
        ivCameraStockImage.setOnClickListener(this)
        ivCameraInvoice.setOnClickListener(this)
        tvSelectedOutlet.setOnClickListener(this)
        tvPurchaseDate.setOnClickListener(this)
        ivCalender.setOnClickListener(this)

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
                viewModel.outletSelected()

            }
        } else if (lifeCycleCallBackManager != null) {
            lifeCycleCallBackManager.onActivityResult(requestCode, resultCode, data)
        }
    }

    companion object {
        fun newInstance() = ReplacementFragment().apply {

        }

        const val CAMERA_STOCK_IMAGES = 424
        const val CAMERA_INVOICE_IMAGES = 425

    }
}