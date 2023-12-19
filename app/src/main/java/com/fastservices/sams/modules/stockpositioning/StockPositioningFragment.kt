package com.fastservices.sams.modules.stockpositioning

import android.app.Activity
import android.app.AlertDialog
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import android.content.Intent
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import com.fastservices.sams.IOnBackPressed
import com.fastservices.sams.R
import com.fastservices.sams.data.entities.Outlet
import com.fastservices.sams.modules.base.BaseFragment
import com.fastservices.sams.modules.base.BaseVM
import com.fastservices.sams.modules.outlet.OutletSelectorFragment
import com.fastservices.sams.outletselector.OutletSelectorActivity
import kotlinx.android.synthetic.main.fragment_stock_position.*
import kotlinx.android.synthetic.main.layout_bottom_bar.*

class StockPositioningFragment : BaseFragment() ,IOnBackPressed{
    override fun onBackPressed(): Boolean {
        showClosingDialog()
        return true
    }


    private lateinit var viewModel: StockPositioningVM
    private lateinit var binding: com.fastservices.sams.databinding.FragmentStockPositionBinding
    override fun doBinding(inflater: LayoutInflater, container: ViewGroup?): View {
        return DataBindingUtil.inflate<com.fastservices.sams.databinding.FragmentStockPositionBinding>(inflater, getLayoutResId(), container, false).also {
            binding = it
            binding.viewModel = viewModel
        }.root
    }

    override fun getVM(): BaseVM? {
        return viewModel
    }

    override fun getTitle() = "Stock Positioning"

    override fun getLayoutResId() = R.layout.fragment_stock_position

    var adapter: StockPositioningAdapter? = null

    override fun setUp() {

        val manager: androidx.recyclerview.widget.RecyclerView.LayoutManager = androidx.recyclerview.widget.LinearLayoutManager(
            context
        ) as androidx.recyclerview.widget.RecyclerView.LayoutManager
        rvStockPositioning.layoutManager = manager

        tvSelectedOutlet.setOnClickListener(this)
    }

    override fun setVM() {
        viewModel = ViewModelProviders.of(this).get(StockPositioningVM::class.java)
    }

    override fun setObservers() {

        viewModel.skusLoaded.observe(viewLifecycleOwner, Observer { value ->
            if (value == true) {

                if (adapter == null) {
                    adapter = StockPositioningAdapter(viewModel.sku)
                }
                if(viewModel.sku.isNotEmpty())  listEmptyLabel.visibility = View.GONE else View.VISIBLE
                if (rvStockPositioning.adapter == null)
                    rvStockPositioning.adapter = adapter
                else
                    adapter?.notifyDataSetChanged()

            }
        })

        viewModel.stockAdded.observe(viewLifecycleOwner, Observer { value->

            if(value == true){
                showToast("Stock positioning Added")
                activity?.supportFragmentManager?.popBackStack()
            }
        })

    }

    override fun onClick(v: View?) {

        when (v?.id) {
            tvSelectedOutlet.id -> {
                if(viewModel.selectedOutlet == null)
                OutletSelectorActivity.startActivity(this)
                else showConfirmationDialog()
            }
            ivHome.id -> {
                showClosingDialog()
            }
            else -> super.onClick(v)
        }

    }



    private fun showConfirmationDialog() {
        val alert = AlertDialog.Builder(activity)
        alert.setTitle("Warning")
        alert.setIcon(android.R.drawable.ic_dialog_alert)
        alert.setMessage("By changing outlet you will lose unsaved data of currently selected Oultet \n${viewModel.selectedOutlet?.outletName}")
        alert.setPositiveButton("CHANGE"){dialog, which ->
            dialog.dismiss()
            OutletSelectorActivity.startActivity(this)
        }
        alert.setNegativeButton("CANCEL"){dialog, which ->
            dialog.dismiss()
        }

        alert.show()
    }

    private fun showClosingDialog() {
        val alert = AlertDialog.Builder(activity)
        alert.setTitle("Warning")
        alert.setIcon(android.R.drawable.ic_dialog_alert)
        alert.setMessage("Have you completed/saved stock positioning?")
        alert.setPositiveButton("YES"){dialog, which ->
            dialog.dismiss()
            activity?.supportFragmentManager?.popBackStackImmediate(null, androidx.fragment.app.FragmentManager.POP_BACK_STACK_INCLUSIVE)
        }
        alert.setNegativeButton("NO"){dialog, which ->
            dialog.dismiss()
        }

        alert.show()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == OutletSelectorActivity.REQ_CODE) {
            if (resultCode == Activity.RESULT_OK) {
                // outlet selected
                viewModel.selectedOutlet = data?.getSerializableExtra(OutletSelectorFragment.EXTRA_SELECTED_OUTLET) as? Outlet
                viewModel.selectedOutlet?.let {
                    tvSelectedOutlet.text = it.outletName
                }
                viewModel.outletSelected()

            }
        }

    }

    companion object {

        fun newInstance() = StockPositioningFragment().apply {

        }
    }
}