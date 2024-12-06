package com.fastservices.sams.modules.orderdetails

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import com.fastservices.sams.R
import com.fastservices.sams.data.entities.OrderItem
import com.fastservices.sams.data.entities.RoundUp2Decimal
import java.lang.ref.WeakReference
import java.util.*

class OrderDetailAdapter(var data: ArrayList<OrderItem>, val clickListener: DeleteClickListener) : androidx.recyclerview.widget.RecyclerView.Adapter<OrderRowVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, type: Int): OrderRowVH {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_order_details, parent, false)
        return OrderRowVH(itemView, clickListener)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: OrderRowVH, position: Int) {
        holder.bind(data[position])
    }
}

class OrderRowVH(view: View, clicklistner: DeleteClickListener): androidx.recyclerview.widget.RecyclerView.ViewHolder(view), View.OnClickListener {

    val ref = WeakReference(clicklistner)

    lateinit var item: OrderItem

    override fun onClick(v: View?) {
        ref.get()?.onItemDeleted(item)
    }

    val lblItemName = view.findViewById<TextView>(R.id.lblItemName)
    val lblNumberOfPieces = view.findViewById<TextView>(R.id.lblNumberOfPieces)
    val lblUnitPricesOfPieces = view.findViewById<TextView>(R.id.lblUnitPricesOfPieces)
    val lblNumberCarton = view.findViewById<TextView>(R.id.lblNumberCarton)
    val lblUnitPriceCarton = view.findViewById<TextView>(R.id.lblUnitPriceCarton)
    val lblTotalPrice = view.findViewById<TextView>(R.id.lblTotalPrice)
    val ivDelete = view.findViewById<AppCompatImageView>(R.id.ivDelete)

    fun bind(orderItem: OrderItem) {
        item = orderItem
        lblItemName.text = orderItem.skuItem.SKU_NAME
        lblNumberOfPieces.text = orderItem.skuItem.NO_OF_UNITS.toString()
        lblUnitPricesOfPieces.text = RoundUp2Decimal(orderItem.price)
        lblNumberCarton.text = orderItem.skuItem.NO_OF_CARTONS.toString()
        lblUnitPriceCarton.text = RoundUp2Decimal(orderItem.price * orderItem.unitInCase)
        lblTotalPrice.text = RoundUp2Decimal(orderItem.quantity * orderItem.price)
        ivDelete.setOnClickListener(this)
    }
}

interface DeleteClickListener {
    fun onItemDeleted(item: OrderItem)
}
