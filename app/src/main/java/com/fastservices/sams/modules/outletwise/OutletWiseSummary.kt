package com.fastservices.sams.modules.outletwise

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fastservices.sams.R
import com.fastservices.sams.databinding.FragmentOutletWiseSummaryBinding
import com.fastservices.sams.databinding.FragmentSkuWiseSummaryBinding
import com.fastservices.sams.modules.base.BaseFragment
import com.fastservices.sams.modules.base.BaseVM
import kotlinx.android.synthetic.main.fragment_sku_wise_summary.*

class OutletWiseSummary : BaseFragment() {
    override fun getVM(): BaseVM? {
        return viewModel
    }


    override fun setVM() {
        viewModel = ViewModelProviders.of(this).get(OutletWiseVM::class.java)
    }

    lateinit var binding: FragmentOutletWiseSummaryBinding
    override fun doBinding(inflater: LayoutInflater, container: ViewGroup?): View {
        return DataBindingUtil.inflate<FragmentOutletWiseSummaryBinding>(inflater, getLayoutResId(), container, false).also {
            binding = it
            binding.viewModel = viewModel
        }.root
    }


    override fun getLayoutResId() = R.layout.fragment_outlet_wise_summary

    override fun getTitle() = "Outlet Wise Summary"

    private lateinit var viewModel: OutletWiseVM

    override fun setUp() {

        val manager = LinearLayoutManager(context)
        recyclerView.layoutManager = manager

    }

    override fun setObservers() {

        viewModel.dataLoaded.observe(viewLifecycleOwner, Observer { value ->

            if (value == true) {
                if (recyclerView.adapter == null) {
                    val adapter = OutletWiseAdapter(viewModel.summary)
                    recyclerView.adapter = adapter
                } else {
                    recyclerView.adapter?.notifyDataSetChanged()
                }
            }
        })
    }

    companion object {

        fun newInstance() = OutletWiseSummary()
    }
}