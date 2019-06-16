package com.fastservices.sams.modules.summary

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.fastservices.sams.R
import com.fastservices.sams.data.entities.DecimalFormattedAmount
import com.fastservices.sams.data.entities.RoundUp2Decimal
import com.fastservices.sams.data.entities.RoundUp4Decimal
import com.fastservices.sams.modules.base.BaseFragment
import com.fastservices.sams.modules.base.BaseVM
import com.fastservices.sams.modules.takeorder.OrderVM
import kotlinx.android.synthetic.main.fragment_order_summary.*

class OrderSummaryFragment : BaseFragment() {


    override fun getTitle() = "Take Order"


    private lateinit var viewModel: OrderVM
    private lateinit var binding: com.fastservices.sams.databinding.FragmentOrderSummaryBinding

    override fun doBinding(inflater: LayoutInflater, container: ViewGroup?): View {
        return DataBindingUtil.inflate<com.fastservices.sams.databinding.FragmentOrderSummaryBinding>(inflater, getLayoutResId(), container, false).also {
            binding = it
            binding.viewModel = viewModel
        }.root
    }

    override fun getVM(): BaseVM? {
        return viewModel
    }


    override fun getLayoutResId() = R.layout.fragment_order_summary

    override fun setUp() {

        viewModel.performCalculations()

        if (viewModel.outlet?.credit == 1) {
            radioCredit.isChecked = true

        } else {
            radioCash.isChecked = true
        }
        viewModel.paymentType = viewModel.outlet?.credit ?: 0

        btnBack.setOnClickListener(this)
    }

    override fun setVM() {

        viewModel = ViewModelProviders.of(activity!!).get(OrderVM::class.java)

    }

    override fun setObservers() {


        viewModel.summaryModelLiveData.observe(viewLifecycleOwner, Observer { data ->


            if (data != null) {
                tvGrossAmount.text = DecimalFormattedAmount(RoundUp4Decimal(data.grossAmout))
                tvCompanyDiscount.text =  DecimalFormattedAmount(RoundUp4Decimal(data.companyDiscount))
                tvGST.text =  DecimalFormattedAmount(RoundUp4Decimal(data.gst))
                tvDistDiscount.text =  DecimalFormattedAmount(RoundUp4Decimal(data.distributorDiscount))
                tvTradeOffer.text =  DecimalFormattedAmount(RoundUp4Decimal(data.tradeOffer))
                tvNetAmount.text = DecimalFormattedAmount(RoundUp4Decimal(data.netAmount))
            }
        })

        viewModel.freeSKusLoaded.observe(viewLifecycleOwner, Observer { list ->
            // display free skus
            if (list != null) {
                llFreeSkusContainer.removeAllViews()
                list.forEach {
                    val view = LayoutInflater.from(context).inflate(R.layout.item_free_sku, null, false)
                    view.findViewById<TextView>(R.id.tvSkuName).text = it.skU_Name
                    view.findViewById<TextView>(R.id.tvSkuQuantity).text = it.quantity.toString()
                    llFreeSkusContainer.addView(view)
                }
            }
        })

        viewModel.orderSavedLiveData.observe(viewLifecycleOwner, Observer { value ->

            if (value == true) {
                activity?.finish()
            }
        })


    }

    override fun onClick(v: View?) {
        when(v?.id){
            btnBack.id -> activity?.onBackPressed()
            else -> super.onClick(v)
        }
    }

    companion object {

        fun newInstance() = OrderSummaryFragment().apply {

        }
    }
}
