package com.fastservices.sams.modules.skulist

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fastservices.sams.R
import com.fastservices.sams.data.entities.Category
import com.fastservices.sams.data.entities.SKU
import com.fastservices.sams.modules.base.BaseActivity
import com.fastservices.sams.modules.base.BaseFragment
import com.fastservices.sams.modules.base.BaseVM
import com.fastservices.sams.modules.orderdetails.OrderDetailFragment
import com.fastservices.sams.modules.skulist.dialog.QuantityDialogFragment
import com.fastservices.sams.modules.takeorder.OrderVM
import kotlinx.android.synthetic.main.fragment_sku_list.*

class SkuListFragment : BaseFragment(), ClickListener {


    lateinit var binding: com.fastservices.sams.databinding.FragmentSkuListBinding
    private var adapter: SkuAdapter? = null

    override fun doBinding(inflater: LayoutInflater, container: ViewGroup?): View {
        return DataBindingUtil.inflate<com.fastservices.sams.databinding.FragmentSkuListBinding>(inflater, getLayoutResId(), container, false).also {
            binding = it
            binding.viewModel = activityViewModel
        }.root
    }

    override fun getVM(): BaseVM? {
        return activityViewModel
    }

    override fun getTitle() = "Take Order"//viewModel.category?.SKU_HIE_NAME ?: "SKUs"

    override fun getLayoutResId() = R.layout.fragment_sku_list


    override fun setUp() {

        val manager = LinearLayoutManager(context)
        rvSKUs.layoutManager = manager
        val category = arguments?.getSerializable(ARGS_CATEGORY) as? Category ?: return

        activityViewModel.categoryId = category.SKU_HIE_ID
        activityViewModel.loadSKUs()
        if (adapter == null) {
            adapter = SkuAdapter(activityViewModel.skuAdapterDataList, this)

        }

        if (rvSKUs.adapter == null) {
            rvSKUs.adapter = adapter
            if (adapter!!.itemCount > 0)
                emptyView.visibility = View.GONE
            else
                emptyView.visibility = View.VISIBLE
        }
    }

    private lateinit var activityViewModel: OrderVM

    override fun setVM() {
        activityViewModel = ViewModelProviders.of(activity!!).get(OrderVM::class.java)
        //   activityViewModel.category = arguments?.getSerializable(ARGS_CATEGORY) as? Category
    }

    override fun setObservers() {

        activityViewModel.dataListUpdated.observe(viewLifecycleOwner, Observer { value ->
            value ?: return@Observer
            if (value) {
                adapter?.notifyDataSetChanged()
            }
        })

        activityViewModel.summaryClicked.observe(viewLifecycleOwner, Observer { value ->
            if (value == true) {
                activityViewModel.summaryClicked.postValue(false)
                (activity as? BaseActivity)?.replaceFragment(OrderDetailFragment.newInstance(), true)
            }
        })

        activityViewModel.grossAmountObservable.observe(viewLifecycleOwner, Observer { value ->
            if (value != null)
                tvTotalPrice.text = "Total Amount : ${value}"
        })


    }

    override fun onPause() {
        super.onPause()
    }

    override fun onItemClicked(item: SKU) {

        val dialog = QuantityDialogFragment.newInstance(item)
        dialog.setTargetFragment(this, 2)
        dialog.show(fragmentManager, "dialog")

    }

    override fun onDetach() {
        super.onDetach()
        Log.e("sku","detached")

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == QuantityDialogFragment.RESULT_DATA_CHANGED) {
            // update activityViewModel
            activityViewModel.updateSKU(data?.getSerializableExtra(QuantityDialogFragment.EXTRA_SKU) as SKU,
                    data.getIntExtra(QuantityDialogFragment.EXTRA_UNITS, 0),
                    data.getIntExtra(QuantityDialogFragment.EXTRA_CARTONS, 0))

            activityViewModel.addOrderItem(data?.getSerializableExtra(QuantityDialogFragment.EXTRA_SKU) as SKU,
                    data.getIntExtra(QuantityDialogFragment.EXTRA_UNITS, 0),
                    data.getIntExtra(QuantityDialogFragment.EXTRA_CARTONS, 0))
        }
    }

    override fun onClick(v: View?) {

        when (v?.id) {
            else -> super.onClick(v)
        }

    }


    companion object {

        const val ARGS_CATEGORY = "args_categoruy"

        fun newInstance(category: Category) = SkuListFragment().apply {
            val args = Bundle()
            args.putSerializable(ARGS_CATEGORY, category)
            arguments = args
        }
    }
}