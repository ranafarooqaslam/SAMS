package com.fastservices.sams.modules.outlet

import androidx.databinding.ObservableArrayList
import android.graphics.Color
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fastservices.sams.R
import com.fastservices.sams.data.entities.OrderMaster
import com.fastservices.sams.data.entities.Outlet
import kotlinx.android.synthetic.main.item_list_outlet.view.*
import java.lang.ref.WeakReference

class OutletsAdapter(var data: ObservableArrayList<Outlet>,
                     val noOrders: List<Int>?,
                     private val clickListener: ClickListener?) : androidx.recyclerview.widget.RecyclerView.Adapter<OutletVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, type: Int): OutletVH {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_list_outlet, parent, false)

        return OutletVH(itemView, clickListener)
    }

    override fun getItemCount(): Int {

        return data.size
    }

    override fun onBindViewHolder(holder: OutletVH, position: Int) {

        if (position % 2 == 0)
            holder.rootLayout.setBackgroundColor(Color.parseColor("#ffffff"))
        else
            holder.rootLayout.setBackgroundColor(Color.parseColor("#f2f2f2"))

        holder.tvLabelUnitCarton.visibility = View.INVISIBLE
        holder.tvValueUnitCarton.visibility = View.INVISIBLE

        val item = data[position]
        holder.tvOutletName.text = item.outletName
        holder.tvAddress.text = item.storeAddress
        holder.tvOwner.text = item.ownerName
        if (noOrders == null) {
            holder.unOrder.visibility = View.GONE
            holder.outletIcon.setImageResource(R.drawable.ic_store_grey)
            holder.rootLayout.isEnabled = true
        } else {

            if (item.label.isNotBlank()) {
                holder.unOrder.visibility = View.GONE
                holder.outletIcon.setImageResource(R.drawable.ic_store_green)
                holder.rootLayout.isEnabled = false
                holder.tvLabelUnitCarton.visibility = View.VISIBLE
                holder.tvValueUnitCarton.visibility = View.VISIBLE
                holder.tvValueUnitCarton.text = item.label
            } else if (noOrders?.contains(item.outletID) == true) {
                holder.unOrder.visibility = View.GONE
                holder.outletIcon.setImageResource(R.drawable.ic_store_red)
                holder.rootLayout.isEnabled = false
            } else {
                holder.outletIcon.setImageResource(R.drawable.ic_store_grey)
                holder.unOrder.visibility = View.VISIBLE
                holder.rootLayout.isEnabled = true
            }
        }


    }

    fun getItemAtPosition(pos: Int) = data.get(pos)

}

class OutletVH(view: View, listener: ClickListener?) : androidx.recyclerview.widget.RecyclerView.ViewHolder(view), View.OnClickListener {


    val rootLayout = view.rootLayout
    val tvOutletName = view.tvOutletName
    val tvAddress = view.tvAddress
    val tvOwner = view.tvOwner
    val unOrder = view.tvUnorder
    val outletIcon = view.ivOutletIcon
    val tvLabelUnitCarton = view.tvLabelUnitCarton
    val tvValueUnitCarton = view.tvValueUnitCarton
    var listenerRef: WeakReference<ClickListener?>? = null

    init {
        listenerRef = WeakReference(listener)
        unOrder.setOnClickListener(this)
        rootLayout.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when (v?.id) {
            unOrder.id -> listenerRef?.get()?.onClickedUnOrderAtPosition(adapterPosition)
            rootLayout.id -> listenerRef?.get()?.onClickItem(adapterPosition)
        }
    }


}

interface ClickListener {

    fun onClickedUnOrderAtPosition(position: Int)
    fun onClickItem(position: Int)

}