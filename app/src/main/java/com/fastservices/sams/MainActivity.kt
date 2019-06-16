package com.fastservices.sams

import android.os.Bundle
import com.fastservices.sams.modules.base.BaseActivity
import com.fastservices.sams.modules.base.BaseVM
import com.fastservices.sams.modules.dashboard.DashboardFragment
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : BaseActivity() {
    override fun setUp(savedInstanceState: Bundle?) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show()

        getSupportActionBar()?.setHomeButtonEnabled(true);
        getSupportActionBar()?.setDisplayShowHomeEnabled(true);
        getSupportActionBar()?.setIcon(R.drawable.toolbar_icon);
        if (savedInstanceState == null) {
            replaceFragment(DashboardFragment.newInstance(), false)
        }

    }

    override fun getViewModel(): BaseVM? {
        return null
    }

    override fun onBackPressed() {
        val fragment =
                this.supportFragmentManager.findFragmentById(R.id.fragmentContainer)
       val iOnBack = fragment as? IOnBackPressed
        if(iOnBack == null)
            super.onBackPressed()
        else {
            if(!iOnBack.onBackPressed()){
                super.onBackPressed()
            }
        }

    }


}


interface IOnBackPressed {
    fun onBackPressed(): Boolean
}