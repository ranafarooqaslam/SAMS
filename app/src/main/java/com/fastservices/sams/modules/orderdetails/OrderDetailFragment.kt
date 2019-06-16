package com.fastservices.sams.modules.orderdetails

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fastservices.sams.R
import com.fastservices.sams.data.entities.OrderItem
import com.fastservices.sams.modules.base.BaseActivity
import com.fastservices.sams.modules.base.BaseFragment
import com.fastservices.sams.modules.base.BaseVM
import com.fastservices.sams.modules.summary.OrderSummaryFragment
import com.fastservices.sams.modules.takeorder.OrderVM
import kotlinx.android.synthetic.main.fragment_order_details.*

class OrderDetailFragment : BaseFragment(), DeleteClickListener {
    override fun onItemDeleted(item: OrderItem) {


        val index = viewModel.removeOrderItem(item)
        rvOrderItems.adapter?.notifyItemRemoved(index)
    }

    override fun getTitle() = "Take Order"


    private lateinit var viewModel: OrderVM
    private lateinit var binding: com.fastservices.sams.databinding.FragmentOrderDetailsBinding

    override fun doBinding(inflater: LayoutInflater, container: ViewGroup?): View {
        return DataBindingUtil.inflate<com.fastservices.sams.databinding.FragmentOrderDetailsBinding>(inflater, getLayoutResId(), container, false).also {
            binding = it
            binding.viewModel = viewModel
        }.root
    }

    override fun getVM(): BaseVM? {
        return viewModel
    }


    override fun getLayoutResId() = R.layout.fragment_order_details

    override fun setUp() {

        val manager: RecyclerView.LayoutManager = LinearLayoutManager(context) as RecyclerView.LayoutManager
        rvOrderItems.layoutManager = manager

        rvOrderItems.adapter = OrderDetailAdapter(viewModel.getOrders(), this)
    }

    override fun setVM() {

        viewModel = ViewModelProviders.of(activity!!).get(OrderVM::class.java)

    }

    override fun setObservers() {

        viewModel.summaryClicked.observe(viewLifecycleOwner, Observer { value ->
            if (value == true) {
                viewModel.summaryClicked.postValue(false)
                (activity as? BaseActivity)?.replaceFragment(OrderSummaryFragment.newInstance(), true)
            }
        })

        viewModel.grossAmountObservable.observe(viewLifecycleOwner, Observer { value ->
            if (value != null) {
                tvTotalPrice.text = "Gross Amount : ${value}"
                lblFooterTotalPrice.text = value.toString()
            }
        })

        viewModel.totalUnitsObservable.observe(viewLifecycleOwner, Observer { value->

            if(value != null){
                tvFooterTotalUnit.text = value.toString()
            }

        })

        viewModel.totalCartonssObservable.observe(viewLifecycleOwner, Observer { value->
            if(value != null){
                tvFooterCartons.text = value.toString()
            }
        })

    }

    companion object {

        fun newInstance() = OrderDetailFragment().apply {

        }
    }
}