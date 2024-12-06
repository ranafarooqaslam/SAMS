package com.fastservices.sams.modules.outletwise

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fastservices.sams.R
import com.fastservices.sams.databinding.FragmentOutletWiseSummaryBinding
import com.fastservices.sams.modules.base.BaseFragment
import com.fastservices.sams.modules.base.BaseVM

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
        binding.recyclerView.layoutManager = manager
    }

    override fun setObservers() {

        viewModel.dataLoaded.observe(viewLifecycleOwner, Observer { value ->

            if (value == true) {
                if (binding.recyclerView.adapter == null) {
                    val adapter = OutletWiseAdapter(viewModel.summary)
                    binding.recyclerView.adapter = adapter
                } else {
                    binding.recyclerView.adapter?.notifyDataSetChanged()
                }
            }
        })
    }

    companion object {
        fun newInstance() = OutletWiseSummary()
    }
}