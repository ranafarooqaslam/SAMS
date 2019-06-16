package com.fastservices.sams.modules.outlet

import android.app.Activity
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnTouchListener
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.ArrayAdapter
import android.widget.PopupMenu
import com.fastservices.sams.R
import com.fastservices.sams.databinding.FragmentOutletBinding
import com.fastservices.sams.modules.base.BaseActivity
import com.fastservices.sams.modules.base.BaseFragment
import com.fastservices.sams.modules.base.BaseVM
import com.fastservices.sams.modules.outletnoorder.OutletNoOrderFragment
import kotlinx.android.synthetic.main.fragment_outlet.*


class OutletSelectorFragment : OutletFragment(), ClickListener, View.OnClickListener {


    override fun getTitle() = "Select Outlet"

    override fun setUp() {
        super.setUp()
        bottomLayout?.visibility = View.GONE

    }

    override fun onClickItem(position: Int) {
        outletsAdapter?.getItemAtPosition(position)?.let {
            val intent = Intent()
            intent.putExtra(EXTRA_SELECTED_OUTLET, it)
            activity?.setResult(Activity.RESULT_OK, intent)
            activity?.finish()
        }

    }

    override fun onClickedUnOrderAtPosition(position: Int) {
        // do nothing
    }


    companion object {

        const val EXTRA_SELECTED_OUTLET = "extra_outlet"
        fun newInstance() = OutletSelectorFragment().apply {

        }
    }
}