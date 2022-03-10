package com.fastservices.sams.modules.pricing

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.fastservices.sams.R
import com.fastservices.sams.data.entities.Category
import com.fastservices.sams.databinding.FragmentPricingReportBinding
import com.fastservices.sams.modules.base.BaseFragment
import com.fastservices.sams.modules.base.BaseVM
import kotlinx.android.synthetic.main.fragment_pricing_report.*

class PricingFragment : BaseFragment() {
    override fun getVM(): BaseVM? {
        return viewModel
    }


    override fun setVM() {
        viewModel = ViewModelProviders.of(this).get(PricingVM::class.java)
    }

    lateinit var binding: com.fastservices.sams.databinding.FragmentPricingReportBinding
    override fun doBinding(inflater: LayoutInflater, container: ViewGroup?): View {
        return DataBindingUtil.inflate<FragmentPricingReportBinding>(inflater, getLayoutResId(), container, false).also {
            binding = it
            binding.viewModel = viewModel
        }.root
    }


    override fun getLayoutResId() = R.layout.fragment_pricing_report

    override fun getTitle() = "Pricing"

    private lateinit var viewModel: PricingVM

    override fun setUp() {

        val manager = LinearLayoutManager(context)
        recyclerView.layoutManager = manager

    }

    private fun populateCategory() {

        val adapterChannel = ArrayAdapter<Category>(activity!!, android.R.layout.simple_spinner_item, viewModel.category)
        adapterChannel.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spCategory.adapter = adapterChannel
        spCategory.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                (parent?.getItemAtPosition(position) as? Category)?.let {
                    viewModel.loadSKUs(it.SKU_HIE_ID)
                } ?: run {
                    viewModel.loadSKUs(-1)
                }
            }
        }


    }

    override fun setObservers() {

        viewModel.skuLoaded.observe(viewLifecycleOwner, Observer { value ->

            if (value == true) {
                recyclerView.adapter = PricingAdapter(viewModel.sku)
            }
        })

        viewModel.categoryLoaded.observe(viewLifecycleOwner, Observer { value ->
            if (value == true) {
                populateCategory()
            }
        })
    }

    companion object {

        fun newInstance() = PricingFragment()
    }
}