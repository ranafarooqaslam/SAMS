package com.fastservices.sams.modules.outlet

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.PopupMenu
import androidx.core.view.get
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fastservices.sams.MainActivity
import com.fastservices.sams.R
import com.fastservices.sams.databinding.FragmentOutletBinding
import com.fastservices.sams.modules.base.BaseActivity
import com.fastservices.sams.modules.base.BaseFragment
import com.fastservices.sams.modules.base.BaseVM
import com.fastservices.sams.modules.outletnoorder.OutletNoOrderFragment
import com.fastservices.sams.modules.takeorder.TakeOrderActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

open class OutletFragment: BaseFragment(), ClickListener, View.OnClickListener {

    var outletsAdapter: OutletsAdapter? = null

    override fun doBinding(inflater: LayoutInflater, container: ViewGroup?): View {
        return DataBindingUtil.inflate<FragmentOutletBinding>(inflater, getLayoutResId(), container, false).also {
            binding = it
            binding.viewModel = viewModel
        }.root
    }

    override fun getVM(): BaseVM? {
        return viewModel
    }

    override fun getTitle() = "Outlet"

    override fun getLayoutResId() = R.layout.fragment_outlet

    private lateinit var viewModel: OutletsVM
    private lateinit var binding: FragmentOutletBinding

    @SuppressLint("ClickableViewAccessibility")
    override fun setUp() {
        val manager: RecyclerView.LayoutManager = LinearLayoutManager(context)
        binding.rvOutlets.layoutManager = manager
        binding.rvOutlets.adapter = outletsAdapter
        binding.btnSection.setOnClickListener(this)
        binding.btnOutOfArea.setOnClickListener(this)

        binding.rvOutlets.setOnTouchListener { _, _ ->
            val imm = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
            imm?.hideSoftInputFromWindow(binding.etFilter.windowToken, 0)
            false
        }

        viewModel.outOfAreaAvailable.observe(this) { t ->
            if (t == true) {
                binding.checkBoxLayout.visibility = View.VISIBLE
            } else {
                binding.checkBoxLayout.visibility = View.GONE
            }
        }

        binding.checkOutOfArea.setOnCheckedChangeListener { _, b ->
            if(b) {
                binding.btnOutOfArea.visibility = View.VISIBLE
            }
            else {
                binding.btnOutOfArea.visibility = View.GONE
                binding.btnSection.text = viewModel.sections!![0].sectionName
                sectionPopup?.menu?.get(0)?.itemId?.let { viewModel.applyAreaFilter(it) }
                binding.btnOutOfArea.text = "Out of Area"
            }
        }
    }

    override fun setVM() {
        viewModel = ViewModelProviders.of(this).get(OutletsVM::class.java)
    }

    override fun onResume() {
        super.onResume()
        if (activity is MainActivity) {
            viewModel.loadOrdersList()
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun setObservers() {
        viewModel.notifyAdapter.observe(viewLifecycleOwner) { _ ->
            if (outletsAdapter == null) {
                outletsAdapter = OutletsAdapter(viewModel.outletList, viewModel.noOrdersList, this, requireActivity())
                binding.rvOutlets.adapter = outletsAdapter
            }
            outletsAdapter?.notifyDataSetChanged()
        }
    }

    private var sectionPopup: PopupMenu? = null
    private var sectionOutOfAreaPopup: PopupMenu? = null

    private fun populateSectionSpinner() {
        sectionPopup = PopupMenu(activity, binding.btnSection)
        viewModel.sections?.forEach {
            sectionPopup?.menu?.add(0, it.sectionID, 0, it.sectionName)
        }

        sectionPopup?.setOnMenuItemClickListener { item ->
            binding.btnSection.text = item.title
            viewModel.applyAreaFilter(item.itemId)
            true
        }
    }

    private fun populateOutOfAreaSectionSpinner() {
        sectionOutOfAreaPopup = PopupMenu(activity, binding.btnOutOfArea)
        viewModel.sectionsOutOfArea?.forEach {
            sectionOutOfAreaPopup?.menu?.add(0, it.sectionID, 0, it.sectionName)
        }

        sectionOutOfAreaPopup?.setOnMenuItemClickListener { item ->
            binding.btnOutOfArea.text = item.title
            viewModel.applyOutOfAreaFilter(item.itemId)
            true
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val scope = CoroutineScope(Dispatchers.Main)

        scope.launch {
            delay(500)
            if (!viewModel.sections.isNullOrEmpty()) {
                populateSectionSpinner()
                populateOutOfAreaSectionSpinner()
                binding.btnSection.text = viewModel.sections!![0].sectionName
                sectionPopup?.menu?.get(0)?.itemId?.let { viewModel.applyAreaFilter(it) }
            }
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            binding.btnSection.id -> {
                if (sectionPopup == null)
                    populateSectionSpinner()
                sectionPopup?.show()
            }
            binding.btnOutOfArea.id -> {
                if (sectionOutOfAreaPopup == null)
                    populateOutOfAreaSectionSpinner()
                sectionOutOfAreaPopup?.show()
            }
            else -> super.onClick(v)
        }
    }

    override fun onClickedUnOrderAtPosition(position: Int) {
        outletsAdapter?.getItemAtPosition(position)?.let {
            (activity as? BaseActivity)?.replaceFragment(OutletNoOrderFragment.newInstance(it), true)
        }
    }

    override fun onClickItem(position: Int) {
        if (context == null) return
        outletsAdapter?.getItemAtPosition(position)?.let {
            TakeOrderActivity.startActivity(requireContext(), it)
        }
    }

    companion object {
        fun newInstance() = OutletFragment().apply { }
    }
}