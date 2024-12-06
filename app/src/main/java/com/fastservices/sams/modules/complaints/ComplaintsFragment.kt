package com.fastservices.sams.modules.complaints

import android.app.Activity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import android.content.Intent
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fastservices.sams.R
import com.fastservices.sams.modules.base.BaseFragment
import com.fastservices.sams.modules.base.BaseVM
import com.fastservices.sams.data.entities.Outlet
import com.fastservices.sams.modules.outlet.OutletSelectorFragment
import com.fastservices.sams.outletselector.OutletSelectorActivity

class ComplaintsFragment : BaseFragment() {

    override fun getTitle() = "Complaints"

    override fun getLayoutResId() = R.layout.fragment_complaints

    private lateinit var viewModel: ComplaintsVM
    private lateinit var binding: com.fastservices.sams.databinding.FragmentComplaintsBinding

    override fun doBinding(inflater: LayoutInflater, container: ViewGroup?): View {
        return DataBindingUtil.inflate<com.fastservices.sams.databinding.FragmentComplaintsBinding>(inflater, getLayoutResId(), container, false).also {
            binding = it
            binding.viewModel = viewModel
        }.root
    }

    override fun getVM(): BaseVM? {
        return viewModel
    }


    override fun setVM() {
        viewModel = ViewModelProviders.of(this).get(ComplaintsVM::class.java)
    }

    override fun setObservers() {
        viewModel.reasonsLoaded.observe(viewLifecycleOwner, Observer { value ->
            if (value == null) return@Observer
            if (value == true) {
                binding.rvComplaintReasons.adapter?.notifyDataSetChanged()
            }
        })
        viewModel.complaintStatus.observe(viewLifecycleOwner, Observer { value ->
            if (value == null) return@Observer
            if (value == true)
                activity?.supportFragmentManager?.popBackStack()
        })
    }


    override fun setUp() {

        val manager = LinearLayoutManager(context)
        binding.rvComplaintReasons.layoutManager = manager
        val dividerItemDecoration =
            androidx.recyclerview.widget.DividerItemDecoration(
                binding.rvComplaintReasons.context,
                manager.orientation
            )

        binding.rvComplaintReasons.addItemDecoration(dividerItemDecoration)

        binding.rvComplaintReasons.adapter = ReasonsAdapter(viewModel.reasons)

        binding.tvSelectedOutlet.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            binding.tvSelectedOutlet.id -> OutletSelectorActivity.startActivity(this)
            else -> super.onClick(v)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == OutletSelectorActivity.REQ_CODE) {
            if (resultCode == Activity.RESULT_OK) {
                // outlet selected
                viewModel.selectedOutlet = data?.getSerializableExtra(OutletSelectorFragment.EXTRA_SELECTED_OUTLET) as? Outlet
                viewModel.selectedOutlet?.let {
                    binding.tvSelectedOutlet.text = it.outletName
                }
            }
        }
    }


    companion object {
        fun newInstance() = ComplaintsFragment().apply {

        }


    }
}