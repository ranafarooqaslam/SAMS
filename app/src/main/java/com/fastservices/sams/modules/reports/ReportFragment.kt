package com.fastservices.sams.modules.reports

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fastservices.sams.R
import com.fastservices.sams.modules.base.BaseActivity
import com.fastservices.sams.modules.base.BaseFragment
import com.fastservices.sams.modules.base.BaseVM
import com.fastservices.sams.modules.dailyproductivity.DailyProductivityFragment
import com.fastservices.sams.modules.outletwise.OutletWiseSummary
import com.fastservices.sams.modules.pricing.PricingAdapter
import com.fastservices.sams.modules.pricing.PricingFragment
import com.fastservices.sams.modules.skuwise.SKUWiseSummary
import kotlinx.android.synthetic.main.fragment_reports.*

class ReportFragment : BaseFragment() {

    override fun doBinding(inflater: LayoutInflater, container: ViewGroup?): View {
        return inflater.inflate(getLayoutResId(), container,false)
    }

    override fun getVM(): BaseVM? {
        return null
    }
    override fun getTitle() = "Reports"

    override fun getLayoutResId() = R.layout.fragment_reports

    override fun setUp() {
        tvDailyProductivity.setOnClickListener(this)
        tvSKUWiseSummary.setOnClickListener(this)
        tvOutletWiseSummay.setOnClickListener(this)
        tvPricing.setOnClickListener(this)
    }
    override fun setVM() {

    }

    override fun setObservers() {

    }

    override fun onClick(v: View?) {

        when(v?.id){
            tvDailyProductivity.id ->  (activity as? BaseActivity)?.replaceFragment(DailyProductivityFragment.newInstance(), true)
            tvSKUWiseSummary.id -> (activity as? BaseActivity)?.replaceFragment(SKUWiseSummary.newInstance(), true)
            tvOutletWiseSummay.id -> (activity as? BaseActivity)?.replaceFragment(OutletWiseSummary.newInstance(), true)
            tvPricing.id -> (activity as? BaseActivity)?.replaceFragment(PricingFragment.newInstance(), true)
        }
    }
    companion object {
        fun newInstance() = ReportFragment().apply {

        }
    }
}