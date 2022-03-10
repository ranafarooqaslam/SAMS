package com.fastservices.sams.modules.base

import android.app.AlertDialog
import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.fastservices.sams.R
import dmax.dialog.SpotsDialog

abstract class BaseActivity : AppCompatActivity() {

    private var progressDialog: AlertDialog? = null

    abstract fun setUp(savedInstanceState: Bundle?)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        progressDialog = SpotsDialog.Builder().setContext(this).setMessage(R.string.loading).build()
        setUp(savedInstanceState)
        getViewModel()?.showLoader?.observe(this, Observer { show ->
            if (show == true)
                showProgressDialog()
            else
                hideProgressDialog()
        })

//        getViewModel()?.errorLiveData?.observe(this, Observer { error ->
//            error?.let {
//                showDialog(it)
//            }
//        })


    }


    public fun showProgressDialog() {
        if (progressDialog?.isShowing != true) {
            progressDialog?.show()
        }
    }

    public fun hideProgressDialog() {
        if (progressDialog?.isShowing == true)
            progressDialog?.dismiss()
    }

    fun showToast(text: String?) {
        text?.let { Toast.makeText(applicationContext, it, Toast.LENGTH_SHORT).show() }

    }

    fun showDialog(message:String){
            val alert = AlertDialog.Builder(this)
            alert.setTitle("Warning")
            alert.setMessage(message)
        alert.setPositiveButton("Ok"){dialog, which ->
            dialog.dismiss()
        }
            alert.show()
    }

    abstract fun getViewModel(): BaseVM?

    fun replaceFragment(fragment: BaseFragment, addToBackStack: Boolean) {
        supportFragmentManager?.beginTransaction()?.apply {
            replace(R.id.fragmentContainer, fragment)
            if (addToBackStack) addToBackStack(null)
            commit()
        }
    }

    fun addFragment(fragment: BaseFragment, addToBackStack: Boolean) {
        supportFragmentManager?.beginTransaction()?.apply {
            add(R.id.fragmentContainer, fragment)
            if (addToBackStack) addToBackStack(null)
            commit()
        }
    }

}