package com.fastservices.sams.modules.sync

import android.annotation.SuppressLint
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.databinding.DataBindingUtil
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

class SyncFragment : BaseFragment(), View.OnClickListener {

    lateinit var binding: FragmentSyncBinding
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
        binding.tvLastSync.text = SamsApplication.getPreferenceManager().getLastSync()
        binding.syncDescritpion.movementMethod = ScrollingMovementMethod()
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
                binding.syncDescritpion.text = binding.syncDescritpion.text.toString().plus(logLine)
            }
        })
    }

    @SuppressLint("SetTextI18n")
    private fun syncError() {
        binding.tvSync.isEnabled = true
        binding.tvSync.alpha = 1f
        binding.syncDescritpion.text = binding.syncDescritpion.text.toString().plus("\n") + " ** Sync Error **".plus("\n")
    }

    @SuppressLint("SetTextI18n")
    private fun syncStart() {
        binding.tvSync.isEnabled = false
        binding.tvSync.alpha = 0.5f
        binding.syncDescritpion.text = "--- Sync Started ---".plus("\n")
    }

    private fun syncComplete() {
        binding.tvSync.isEnabled = true
        binding.tvSync.alpha = 1f
        binding.tvLastSync.text = SamsApplication.getPreferenceManager().getLastSync()
        showToast("Sync Completed at ${binding.tvLastSync.text}")

    }

    companion object {
        fun newInstance() = SyncFragment().apply {
            val args = Bundle()
            arguments = args
        }
    }
}