package com.fastservices.sams.modules.takeorder

import android.app.AlertDialog
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import com.fastservices.sams.R
import com.fastservices.sams.data.entities.Outlet
import com.fastservices.sams.modules.base.BaseActivity
import com.fastservices.sams.modules.base.BaseVM
import kotlinx.android.synthetic.main.app_bar_main.*

class TakeOrderActivity : BaseActivity() {


    private lateinit var viewModel: OrderVM

    override fun setUp(savedInstanceState: Bundle?) {
        viewModel = ViewModelProviders.of(this).get(OrderVM::class.java)
        setContentView(R.layout.activity_outlet_selector)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Take Order"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        if (savedInstanceState == null) {
            replaceFragment(TakeOrderFragment.newInstance(intent.getSerializableExtra(EXTRA_OUTLET) as Outlet), false)
        }

    }

    override fun getViewModel(): BaseVM? {
        return viewModel
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if(item?.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        if (supportFragmentManager.fragments.size > 1||supportFragmentManager.backStackEntryCount>0)
            super.onBackPressed()
        else {
            // activity is about to finish, lets ask user confirmation
            if (viewModel.containsAnyOrder()) {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Cancel Order")
                builder.setMessage("Are you sure you want cancel order?")
                builder.setPositiveButton("Yes") { dialog, which ->
                    dialog.dismiss()
                    super.onBackPressed()
                }
                builder.setNegativeButton("No") { dialog, which ->
                    dialog.dismiss()
                }

                builder.show()
            } else {
                super.onBackPressed()
            }
        }
    }

    companion object {
        const val EXTRA_OUTLET = "outlet"
        fun startActivity(c: Context, outlet: Outlet) {
            val intent = Intent(c, TakeOrderActivity::class.java)
            intent.putExtra(EXTRA_OUTLET, outlet)
            c.startActivity(intent)
        }
    }
}