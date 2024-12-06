package com.fastservices.sams.modules.orderdetails

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
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

class OrderDetailFragment : BaseFragment(), DeleteClickListener {
    override fun onItemDeleted(item: OrderItem) {
        val index = viewModel.removeOrderItem(item)
        binding.rvOrderItems.adapter?.notifyItemRemoved(index)
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
        val manager: RecyclerView.LayoutManager = LinearLayoutManager(
            context
        )
        binding.rvOrderItems.layoutManager = manager
        binding.rvOrderItems.adapter = OrderDetailAdapter(viewModel.getOrders(), this)
    }

    override fun setVM() {
        viewModel = ViewModelProviders.of(requireActivity()).get(OrderVM::class.java)
    }

    override fun setObservers() {
        viewModel.summaryClicked.observe(viewLifecycleOwner) { value ->
            if (value == true) {
                viewModel.summaryClicked.postValue(false)
                (activity as? BaseActivity)?.replaceFragment(
                    OrderSummaryFragment.newInstance(),
                    true
                )
            }
        }

        viewModel.grossAmountObservable.observe(viewLifecycleOwner, Observer { value ->
            if (value != null) {
                binding.tvTotalPrice.text = "Gross Amount : $value"
                binding.lblFooterTotalPrice.text = value.toString()
            }
        })

        viewModel.totalUnitsObservable.observe(viewLifecycleOwner, Observer { value->
            if(value != null) {
                binding.tvFooterTotalUnit.text = value.toString()
            }
        })

        viewModel.totalCartonssObservable.observe(viewLifecycleOwner, Observer { value->
            if(value != null){
                binding.tvFooterCartons.text = value.toString()
            }
        })
    }

    companion object {
        fun newInstance() = OrderDetailFragment().apply { }
    }
}