package com.fastservices.sams.modules.base

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import androidx.lifecycle.Observer
import com.fastservices.sams.R


abstract class BaseActivity : AppCompatActivity() {

    private var progressDialog: AlertDialog? = null

    abstract fun setUp(savedInstanceState: Bundle?)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val inflater = LayoutInflater.from(this)
        val progressBar = inflater.inflate(android.R.layout.simple_spinner_item, null) as AppCompatTextView

        progressDialog = AlertDialog.Builder(this)
            .setTitle(R.string.loading)
            .setView(progressBar)
            .setCancelable(false)
            .create()

//        progressDialog = SpotsDialog.Builder().setContext(this).setMessage(R.string.loading).build()
        setUp(savedInstanceState)
        getViewModel()?.showLoader?.observe(this) { show ->
            if (show == true)
                showProgressDialog()
            else
                hideProgressDialog()
        }
    }

    fun showProgressDialog() {
        if (progressDialog?.isShowing != true) {
            progressDialog?.show()
        }
    }

    fun hideProgressDialog() {
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