package com.fastservices.sams.modules.dashboard

import android.app.AlertDialog
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.graphics.PorterDuff
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.fastservices.sams.R
import com.fastservices.sams.databinding.FragmentAddOutletBinding
import com.fastservices.sams.databinding.FragmentDashboardBinding
import com.fastservices.sams.modules.addoutlet.AddOutletFragment
import com.fastservices.sams.modules.addoutlet.AddOutletVM
import com.fastservices.sams.modules.base.BaseActivity
import com.fastservices.sams.modules.base.BaseFragment
import com.fastservices.sams.modules.base.BaseVM
import com.fastservices.sams.modules.complaints.ComplaintsFragment
import com.fastservices.sams.modules.merchandise.MerchandisingFragment
import com.fastservices.sams.modules.outlet.OutletFragment
import com.fastservices.sams.modules.replacement.ReplacementFragment
import com.fastservices.sams.modules.reports.ReportFragment
import com.fastservices.sams.modules.stockpositioning.StockPositioningFragment
import com.fastservices.sams.modules.sync.SyncFragment
import kotlinx.android.synthetic.main.fragment_dashboard.*

class DashboardFragment : BaseFragment(), View.OnClickListener {

    lateinit var binding: com.fastservices.sams.databinding.FragmentDashboardBinding
    override fun doBinding(inflater: LayoutInflater, container: ViewGroup?): View {
        return DataBindingUtil.inflate<FragmentDashboardBinding>(inflater, getLayoutResId(), container, false).also {
            binding = it
            binding.viewModel = viewModel
        }.root
    }


    override fun getLayoutResId() = R.layout.fragment_dashboard

    override fun getTitle() = "SAMS Dashboard"

    private lateinit var viewModel: DashboardVM

    override fun setUp() {

        tvTakeOrder.setOnClickListener(this)
        tvAddOutlet.setOnClickListener(this)
        tvStockReturn.setOnClickListener(this)
        tvViewReport.setOnClickListener(this)
        tvStockPositioning.setOnClickListener(this)
        tvDataSync.setOnClickListener(this)
        tvMerchendising.setOnClickListener(this)
        tvEndMyDay.setOnClickListener(this)
        tvOutletCompaint.setOnClickListener(this)


    }


    override fun onClick(v: View?) {

        when (v?.id) {
            R.id.tvTakeOrder -> (activity as? BaseActivity)?.replaceFragment(OutletFragment.newInstance(), true)
            R.id.tvAddOutlet -> (activity as? BaseActivity)?.replaceFragment(AddOutletFragment.newInstance(), true)
            R.id.tvStockReturn -> (activity as? BaseActivity)?.replaceFragment(ReplacementFragment.newInstance(), true)
            R.id.tvViewReport -> (activity as? BaseActivity)?.replaceFragment(ReportFragment.newInstance(), true)
            R.id.tvStockPositioning -> (activity as? BaseActivity)?.replaceFragment(StockPositioningFragment.newInstance(), true)
            R.id.tvDataSync -> (activity as? BaseActivity)?.replaceFragment(SyncFragment.newInstance(), true)
            tvMerchendising.id -> (activity as? BaseActivity)?.replaceFragment(MerchandisingFragment.newInstance(), true)
            tvOutletCompaint.id ->   (activity as? BaseActivity)?.replaceFragment(ComplaintsFragment.newInstance(), true)
            tvEndMyDay.id -> showConfirmationDialog()
            else -> super.onClick(v)
        }

    }

    private fun showConfirmationDialog() {
        val alertDialog = AlertDialog.Builder(activity)
        alertDialog.setTitle("Confirm")
        alertDialog.setTitle("Are you sure you want to end day now?")
        alertDialog.setNegativeButton("Cancel") { dialog, _ ->
            dialog.dismiss()
        }

        alertDialog.setPositiveButton("End"){dialog, which ->
            dialog.dismiss()
            viewModel.endMyDay()
        }

        alertDialog.create().show()

    }

    override fun getVM(): BaseVM? {
        return viewModel
    }

    override fun setVM() {
        viewModel = ViewModelProviders.of(this).get(DashboardVM::class.java)
    }

    override fun setObservers() {
        viewModel.dayStarted.observe(viewLifecycleOwner, Observer { res ->

            if(res == true){
                binding.viewModel = viewModel
                binding.notifyChange()
                tvStartMyDay.visibility = View.GONE
                tvEndMyDay.visibility = View.VISIBLE
            }


        })

        viewModel.dayEnded.observe(viewLifecycleOwner, Observer { res ->

            if(res == true){
                binding.viewModel = viewModel
                binding.notifyChange()
                tvStartMyDay.visibility = View.VISIBLE
                tvEndMyDay.visibility = View.GONE
            }


        })
    }

    companion object {

        fun newInstance() = DashboardFragment().apply {
            val args = Bundle()
            arguments = args
        }
    }

}