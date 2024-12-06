package com.fastservices.sams.modules.outlet

import android.app.Activity
import android.content.Intent
import android.view.View
import com.fastservices.sams.R

class OutletSelectorFragment: OutletFragment(), ClickListener, View.OnClickListener {

    override fun getTitle() = "Select Outlet"

    override fun setUp() {
        super.setUp()
        view?.findViewById<androidx.cardview.widget.CardView>(R.id.bottomLayout)?.visibility = View.GONE
    }

    override fun onClickItem(position: Int) {
        outletsAdapter?.getItemAtPosition(position)?.let {
            val intent = Intent()
            intent.putExtra(EXTRA_SELECTED_OUTLET, it)
            activity?.setResult(Activity.RESULT_OK, intent)
            activity?.finish()
        }

    }

    override fun onClickedUnOrderAtPosition(position: Int) { }

    companion object {
        const val EXTRA_SELECTED_OUTLET = "extra_outlet"
        fun newInstance() = OutletSelectorFragment().apply { }
    }
}