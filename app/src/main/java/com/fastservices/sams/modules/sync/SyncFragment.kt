package com.fastservices.sams.modules.sync

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fastservices.sams.Constants
import com.fastservices.sams.R
import com.fastservices.sams.SamsApplication
import com.fastservices.sams.databinding.FragmentSyncBinding
import com.fastservices.sams.modules.base.BaseFragment
import com.fastservices.sams.modules.base.BaseVM
import com.fastservices.sams.network.GoogleDriveClient
import kotlinx.android.synthetic.main.fragment_sync.*

class SyncFragment : BaseFragment(), View.OnClickListener {

    lateinit var binding: com.fastservices.sams.databinding.FragmentSyncBinding
    override fun doBinding(inflater: LayoutInflater, container: ViewGroup?): View {
        return DataBindingUtil.inflate<FragmentSyncBinding>(inflater, getLayoutResId(), container, false).also {
            binding = it
            binding.viewModel = viewModel
        }.root
    }


    override fun getLayoutResId() = R.layout.fragment_sync

    override fun getTitle() = "SAMS Dashboard"

    private lateinit var viewModel: SyncVM

    override fun setUp() {

        tvLastSync.text = SamsApplication.getPreferenceManager().getLastSync()
        syncDescritpion.movementMethod = ScrollingMovementMethod()

    }


    override fun onClick(v: View?) {
        when (v?.id) {

            else -> super.onClick(v)
        }

    }

    override fun getVM(): BaseVM? {
        return viewModel
    }

    override fun setVM() {
        Constants.appContext= context?.applicationContext
        viewModel = ViewModelProviders.of(this).get(SyncVM::class.java)
        context?.let { viewModel.googleService = GoogleDriveClient(it).getService() }

    }

    override fun setObservers() {

        viewModel.syncStatus.observe(viewLifecycleOwner, Observer { status ->
            if (status == null)
                return@Observer
            when (status) {
                "complete" -> syncComplete()
                "start" -> syncStart()
                "error" -> syncError()
            }

        })

        viewModel.syncLogger.observe(viewLifecycleOwner, Observer { log->
            log?.let {
                val logLine = it.plus("\n")
                syncDescritpion.text = syncDescritpion.text.toString().plus(logLine)

            }
        })
    }

    private fun syncError() {
        tvSync.isEnabled = true
        tvSync.alpha = 1f
        syncDescritpion.text = " ** Sync Error **".plus("\n")
    }

    private fun syncStart() {
        tvSync.isEnabled = false
        tvSync.alpha = 0.5f
        syncDescritpion.text = "--- Sync Started ---".plus("\n")
    }

    private fun syncComplete() {
        tvSync.isEnabled = true
        tvSync.alpha = 1f
        tvLastSync.text = SamsApplication.getPreferenceManager().getLastSync()
        showToast("Sync Completed at ${tvLastSync.text}")

    }

    companion object {

        fun newInstance() = SyncFragment().apply {
            val args = Bundle()
            arguments = args
        }
    }

}