package com.fastservices.sams.modules.base

import android.app.AlertDialog
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.fragment.app.FragmentManager
import com.fastservices.sams.R
import com.fastservices.sams.SamsApplication
import com.fastservices.sams.modules.companycode.CompanyCodeActivity
import com.fastservices.sams.modules.dashboard.DashboardFragment
import kotlinx.android.synthetic.main.layout_bottom_bar.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

abstract class BaseFragment : androidx.fragment.app.Fragment(), View.OnClickListener {

    abstract fun doBinding(inflater: LayoutInflater, container: ViewGroup?): View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        setVM()
        getVM()?.errorLiveData?.observe(viewLifecycleOwner) { msg ->
            msg?.let {
                showDialog(it)
                getVM()?.errorLiveData?.postValue(null)
            }
        }

        getVM()?.showLoader?.observe(viewLifecycleOwner) { show ->
            if (show == true)
                showProgressDialog()
            else
                hideProgressDialog()
        }
        setObservers()
        return doBinding(inflater, container)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as? BaseActivity)?.supportActionBar?.title = getTitle()

        if (context != null)
            setUp()

        ivOverflow?.setOnClickListener(this)
        ivHome?.setOnClickListener(this)
    }

    abstract fun getVM(): BaseVM?

    abstract fun setObservers()

    abstract fun setVM()

    abstract fun getTitle(): String

    @LayoutRes
    abstract fun getLayoutResId(): Int

    abstract fun setUp()

    private fun showProgressDialog() {
        (activity as? BaseActivity)?.showProgressDialog()
    }

    private fun hideProgressDialog() {
        (activity as? BaseActivity)?.hideProgressDialog()
    }

    fun showToast(text: String?) {
        if (text == null) return
        activity?.let { Toast.makeText(activity, text, Toast.LENGTH_LONG).show() }
    }

    fun showDialog(message:String?){
        activity?.let {
            val alert = AlertDialog.Builder(activity)
            alert.setTitle("Warning")
            alert.setIcon(android.R.drawable.ic_dialog_alert)
            alert.setMessage(message)
            alert.setPositiveButton("Ok"){dialog, which ->
                dialog.dismiss()
            }
            alert.show()
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            ivOverflow.id -> showPopupMenu()
            ivHome.id -> {
                if (this !is DashboardFragment)
                    activity?.supportFragmentManager?.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
            }
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
                docDate = SimpleDateFormat("EEE, MMM dd",Locale.US).format(date)
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
}