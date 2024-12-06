package com.fastservices.sams.modules.skuwise

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.databinding.DataBindingUtil
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fastservices.sams.R
import com.fastservices.sams.databinding.FragmentSkuWiseSummaryBinding
import com.fastservices.sams.modules.base.BaseFragment
import com.fastservices.sams.modules.base.BaseVM

class SKUWiseSummary : BaseFragment() {
    override fun getVM(): BaseVM? {
        return viewModel
    }

    override fun setVM() {
        viewModel = ViewModelProviders.of(this).get(SKUWiseVM::class.java)
    }

    lateinit var binding: FragmentSkuWiseSummaryBinding
    override fun doBinding(inflater: LayoutInflater, container: ViewGroup?): View {
        return DataBindingUtil.inflate<FragmentSkuWiseSummaryBinding>(inflater, getLayoutResId(), container, false).also {
            binding = it
            binding.viewModel = viewModel
        }.root
    }


    override fun getLayoutResId() = R.layout.fragment_sku_wise_summary

    override fun getTitle() = "SKU Wise Summary"

    private lateinit var viewModel: SKUWiseVM

    override fun setUp() {

        val manager = androidx.recyclerview.widget.LinearLayoutManager(context)
        binding.recyclerView.layoutManager = manager
    }

    override fun setObservers() {

        viewModel.dataLoaded.observe(viewLifecycleOwner, Observer { value ->

            if (value == true) {
                if (binding.recyclerView.adapter == null) {
                    val adapter = SkuWiseAdapter(viewModel.summary)
                    binding.recyclerView.adapter = adapter
                } else {
                    binding.recyclerView.adapter?.notifyDataSetChanged()
                }
            }
        })
    }

    companion object {
        fun newInstance() = SKUWiseSummary()
    }
}