package com.fastservices.sams.modules.reports

import android.app.AlertDialog
import android.content.Intent
import android.content.pm.PackageManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModelProviders
import com.fastservices.sams.R
import com.fastservices.sams.SamsApplication
import com.fastservices.sams.databinding.FragmentOutletBinding
import com.fastservices.sams.databinding.FragmentReportsBinding
import com.fastservices.sams.modules.base.BaseActivity
import com.fastservices.sams.modules.base.BaseFragment
import com.fastservices.sams.modules.base.BaseVM
import com.fastservices.sams.modules.companycode.CompanyCodeActivity
import com.fastservices.sams.modules.dailyproductivity.DailyProductivityFragment
import com.fastservices.sams.modules.dashboard.DashboardFragment
import com.fastservices.sams.modules.outlet.OutletsVM
import com.fastservices.sams.modules.outletwise.OutletWiseSummary
import com.fastservices.sams.modules.pricing.PricingFragment
import com.fastservices.sams.modules.skuwise.SKUWiseSummary
import kotlinx.android.synthetic.main.fragment_reports.*
import kotlinx.android.synthetic.main.layout_bottom_bar.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

class ReportFragment : BaseFragment() {

    override fun doBinding(inflater: LayoutInflater, container: ViewGroup?): View {
        return DataBindingUtil.inflate<FragmentReportsBinding>(inflater, getLayoutResId(), container, false).also {
            binding = it
            binding.viewModel = viewModel
        }.root
    }

    override fun getVM(): BaseVM? {
        return viewModel
    }
    override fun getTitle() = "Reports"

    override fun getLayoutResId() = R.layout.fragment_reports

    private lateinit var viewModel: ReportVM
    private lateinit var binding: FragmentReportsBinding

    override fun setUp() {
        tvDailyProductivity.setOnClickListener(this)
        tvSKUWiseSummary.setOnClickListener(this)
        tvOutletWiseSummay.setOnClickListener(this)
        tvPricing.setOnClickListener(this)
        bottomLayout.bringToFront()
        ivHome.setOnClickListener(this)
        ivOverflow.setOnClickListener(this)
    }

    override fun setVM() {
        viewModel = ViewModelProviders.of(this).get(ReportVM::class.java)
    }

    override fun setObservers() {

    }

    override fun onClick(v: View?) {
        when(v?.id) {
            tvDailyProductivity.id ->  (activity as? BaseActivity)?.replaceFragment(DailyProductivityFragment.newInstance(), true)
            tvSKUWiseSummary.id -> (activity as? BaseActivity)?.replaceFragment(SKUWiseSummary.newInstance(), true)
            tvOutletWiseSummay.id -> (activity as? BaseActivity)?.replaceFragment(OutletWiseSummary.newInstance(), true)
            tvPricing.id -> (activity as? BaseActivity)?.replaceFragment(PricingFragment.newInstance(), true)
            ivHome.id -> activity?.supportFragmentManager?.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
            ivOverflow.id -> showPopupMenu()
        }
    }

    private fun showPopupMenu() {
        var docDate = SamsApplication.getDocumentDate()
        if(docDate.isBlank()) {
            docDate = "Day not started"
        }
        else {
            val date = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US).parse(docDate)
            date?.let {
                docDate = SimpleDateFormat("EEE, MMM dd", Locale.US).format(date)
            }
        }
        var appVersion = ""

        val popupmenu = PopupMenu(activity, ivOverflow)
        popupmenu.menuInflater.inflate(R.menu.overflow, popupmenu.menu)

        popupmenu.show()
        popupmenu.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.info -> {
                    val builder = AlertDialog.Builder(activity)
                    builder.setTitle("Information")
                    try {
                        val pInfo = activity?.packageName?.let { context?.packageManager?.getPackageInfo(it, 0) }
                        appVersion = pInfo?.versionName.plus(" (${pInfo?.versionCode})")
                    }
                    catch (e: PackageManager.NameNotFoundException) {
                        e.printStackTrace()
                    }

                    var message = "User: " + SamsApplication.getPreferenceManager().getUser()?.UserName + "\n"
                    message = message.plus("Distributor: ${SamsApplication.getPreferenceManager().getUser()?.DistributorName}\n")
                    message = message.plus("Working Date: ${docDate}\n")
                    message = message.plus("App version: $appVersion" )
                    builder.setMessage(message)
                    builder.setPositiveButton("OK") { dialog, _ ->
                        dialog.dismiss()
                    }
                    builder.show()
                }

                R.id.logout -> {
                    val builder = AlertDialog.Builder(activity)
                    builder.setTitle("Logout Confirmation")
                    builder.setMessage("Are you sure you want to logout. All unsync data will be erased")
                    builder.setPositiveButton("Yes") { dialog, _ ->
                        dialog.dismiss()
                        startActivity(Intent(activity?.applicationContext, CompanyCodeActivity::class.java))
                        GlobalScope.launch {
                            SamsApplication.getPreferenceManager().logout()
                            SamsApplication.getDB().clearAllTables()
                            activity?.finish()
                        }
                    }
                    builder.setNegativeButton("No") { dialog, _ ->
                        dialog.dismiss()
                    }
                    builder.show()
                }
            }
            true
        }
        return
    }

    companion object {
        fun newInstance() = ReportFragment().apply { }
    }
}