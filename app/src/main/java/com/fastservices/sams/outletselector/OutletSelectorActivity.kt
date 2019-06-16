package com.fastservices.sams.outletselector

import android.content.Intent
import android.os.Bundle
import com.fastservices.sams.R
import com.fastservices.sams.modules.base.BaseActivity
import com.fastservices.sams.modules.base.BaseFragment
import com.fastservices.sams.modules.base.BaseVM
import com.fastservices.sams.modules.outlet.OutletFragment
import com.fastservices.sams.modules.outlet.OutletSelectorFragment
import kotlinx.android.synthetic.main.app_bar_main.*

class OutletSelectorActivity : BaseActivity() {
    override fun setUp(savedInstanceState: Bundle?) {

        setContentView(R.layout.activity_outlet_selector)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Select Outlet"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        if (savedInstanceState == null) {
            replaceFragment(OutletSelectorFragment.newInstance(), false)
        }
    }

    override fun getViewModel(): BaseVM? {
        return null
    }

    companion object {

        const val REQ_CODE = 101

        fun startActivity(fragment: BaseFragment) {
            fragment.startActivityForResult(Intent(fragment.context, OutletSelectorActivity::class.java), REQ_CODE)
        }
    }
}