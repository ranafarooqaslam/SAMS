package com.fastservices.sams.modules.dailyproductivity

import androidx.lifecycle.ViewModelProviders
import androidx.databinding.DataBindingUtil
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fastservices.sams.R
import com.fastservices.sams.databinding.FragmentDailyProductivityBinding
import com.fastservices.sams.modules.base.BaseFragment
import com.fastservices.sams.modules.base.BaseVM
import com.fastservices.sams.modules.dashboard.DashboardVM

class DailyProductivityFragment : BaseFragment() {
    override fun getVM(): BaseVM? {
        return viewModel
    }


    override fun setVM() {
        viewModel = ViewModelProviders.of(this).get(DPViewModel::class.java)
    }

    lateinit var binding: FragmentDailyProductivityBinding
    override fun doBinding(inflater: LayoutInflater, container: ViewGroup?): View {
        return DataBindingUtil.inflate<FragmentDailyProductivityBinding>(inflater, getLayoutResId(), container, false).also {
            binding = it
            binding.viewModel = viewModel
        }.root
    }


    override fun getLayoutResId() = R.layout.fragment_daily_productivity

    override fun getTitle() = "Daily Productivity Report"

    private lateinit var viewModel: DPViewModel

    override fun setUp() {

    }

    override fun setObservers() {
    }

    companion object {

        fun newInstance() = DailyProductivityFragment()
    }
}