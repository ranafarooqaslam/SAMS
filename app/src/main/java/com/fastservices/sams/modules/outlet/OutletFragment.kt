package com.fastservices.sams.modules.outlet

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnTouchListener
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.PopupMenu
import com.fastservices.sams.MainActivity
import com.fastservices.sams.R
import com.fastservices.sams.databinding.FragmentOutletBinding
import com.fastservices.sams.modules.base.BaseActivity
import com.fastservices.sams.modules.base.BaseFragment
import com.fastservices.sams.modules.base.BaseVM
import com.fastservices.sams.modules.outletnoorder.OutletNoOrderFragment
import com.fastservices.sams.modules.takeorder.TakeOrderActivity
import kotlinx.android.synthetic.main.fragment_outlet.*


open class OutletFragment : BaseFragment(), ClickListener, View.OnClickListener {

    var outletsAdapter: OutletsAdapter? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun doBinding(inflater: LayoutInflater, container: ViewGroup?): View {
        return DataBindingUtil.inflate<FragmentOutletBinding>(inflater, getLayoutResId(), container, false).also {
            binding = it
            binding.viewModel = viewModel
        }.root
    }

    override fun getVM(): BaseVM? {
        return viewModel
    }

    override fun getTitle() = "Outlet"

    override fun getLayoutResId() = R.layout.fragment_outlet

    private lateinit var viewModel: OutletsVM
    private lateinit var binding: FragmentOutletBinding


    override fun setUp() {
        val manager: RecyclerView.LayoutManager = LinearLayoutManager(context)
        rvOutlets.layoutManager = manager
        rvOutlets.adapter = outletsAdapter
        btnSection.setOnClickListener(this)
        rvOutlets.setOnTouchListener(OnTouchListener { v, event ->
            val imm = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
            imm?.hideSoftInputFromWindow(etFilter.windowToken, 0)

            false
        })


    }

    override fun setVM() {
        viewModel = ViewModelProviders.of(this).get(OutletsVM::class.java)

    }

    override fun onResume() {
        super.onResume()
        if (activity is MainActivity) {
            viewModel.loadOrdersList()
        }
    }

    override fun setObservers() {

        viewModel.notifyAdapter.observe(viewLifecycleOwner, Observer { _ ->

            if (outletsAdapter == null) {
                outletsAdapter = OutletsAdapter(viewModel.outletList, viewModel.noOrdersList, this)
                rvOutlets.adapter = outletsAdapter

            }

            outletsAdapter?.notifyDataSetChanged()
        })
    }

    private var sectionPopup: PopupMenu? = null

    private fun populateSectionSpinner() {

        sectionPopup = PopupMenu(activity, btnSection)
        viewModel.sections?.forEach {
            sectionPopup?.menu?.add(0, it.sectionID, 0, it.sectionName)
        }

        sectionPopup?.setOnMenuItemClickListener { item ->
            btnSection.text = item.title
            viewModel.applyAreaFilter(item.itemId)
            true
        }

    }

    override fun onClick(v: View?) {

        when (v?.id) {
            btnSection.id -> {
                if (sectionPopup == null)
                    populateSectionSpinner()
                sectionPopup?.show()
            }
            else -> super.onClick(v)
        }
    }

    override fun onClickedUnOrderAtPosition(position: Int) {
        outletsAdapter?.getItemAtPosition(position)?.let {
            (activity as? BaseActivity)?.replaceFragment(OutletNoOrderFragment.newInstance(it), true)
        }

    }

    override fun onClickItem(position: Int) {
        if (context == null) return
        outletsAdapter?.getItemAtPosition(position)?.let {
            TakeOrderActivity.startActivity(context!!, it)
        }

    }

    companion object {

        fun newInstance() = OutletFragment().apply {

        }
    }
}