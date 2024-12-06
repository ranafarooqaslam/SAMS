package com.fastservices.sams.modules.summary

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.databinding.DataBindingUtil
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.fastservices.sams.R
import com.fastservices.sams.data.entities.DecimalFormattedAmount
import com.fastservices.sams.data.entities.RoundUp4Decimal
import com.fastservices.sams.modules.base.BaseFragment
import com.fastservices.sams.modules.base.BaseVM
import com.fastservices.sams.modules.takeorder.OrderVM

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
            binding.radioCredit.isChecked = true
        }
        else {
            binding.radioCash.isChecked = true
        }
        viewModel.paymentType = viewModel.outlet?.credit ?: 0

        binding.btnBack.setOnClickListener(this)
    }

    override fun setVM() {
        viewModel = ViewModelProviders.of(requireActivity()).get(OrderVM::class.java)
    }

    override fun setObservers() {
        viewModel.summaryModelLiveData.observe(viewLifecycleOwner) { data ->
            if (data != null) {
                binding.tvGrossAmount.text = DecimalFormattedAmount(RoundUp4Decimal(data.grossAmout))
                binding.tvCompanyDiscount.text =
                    DecimalFormattedAmount(RoundUp4Decimal(data.companyDiscount))
                binding.tvGST.text = DecimalFormattedAmount(RoundUp4Decimal(data.gst))
                binding.tvDistDiscount.text =
                    DecimalFormattedAmount(RoundUp4Decimal(data.distributorDiscount))
                binding.tvTradeOffer.text = DecimalFormattedAmount(RoundUp4Decimal(data.tradeOffer))
                binding.tvNetAmount.text = DecimalFormattedAmount(RoundUp4Decimal(data.netAmount))
            }
        }

        viewModel.freeSKusLoaded.observe(viewLifecycleOwner) { list ->
            if (list != null) {
                binding.llFreeSkusContainer.removeAllViews()
                list.forEach {
                    val view =
                        LayoutInflater.from(context).inflate(R.layout.item_free_sku, null, false)
                    view.findViewById<TextView>(R.id.tvSkuName).text = it.skU_Name
                    view.findViewById<TextView>(R.id.tvSkuQuantity).text = it.quantity.toString()
                    binding.llFreeSkusContainer.addView(view)
                }
            }
        }

        viewModel.orderSavedLiveData.observe(viewLifecycleOwner) { value ->
            if (value == true) {
                activity?.finish()
            }
        }
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            binding.btnBack.id -> activity?.onBackPressed()
            else -> super.onClick(v)
        }
    }

    companion object {
        fun newInstance() = OrderSummaryFragment().apply { }
    }
}
