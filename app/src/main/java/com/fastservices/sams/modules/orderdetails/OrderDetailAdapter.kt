package com.fastservices.sams.modules.orderdetails

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fastservices.sams.R
import com.fastservices.sams.data.entities.OrderItem
import com.fastservices.sams.data.entities.RoundUp2Decimal
import kotlinx.android.synthetic.main.item_order_details.view.*
import java.lang.ref.WeakReference
import java.util.*

class OrderDetailAdapter(var data: ArrayList<OrderItem>, val clickListener: DeleteClickListener) : androidx.recyclerview.widget.RecyclerView.Adapter<OrderRowVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, type: Int): OrderRowVH {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_order_details, parent, false)

        return OrderRowVH(itemView, clickListener)
    }

    override fun getItemCount(): Int {

        return data.size
    }

    override fun onBindViewHolder(holder: OrderRowVH, position: Int) {

        holder.bind(data[position])


    }

}

class OrderRowVH(view: View, clicklistner: DeleteClickListener) : androidx.recyclerview.widget.RecyclerView.ViewHolder(view), View.OnClickListener {

    val ref = WeakReference<DeleteClickListener>(clicklistner)

    lateinit var item: OrderItem

    override fun onClick(v: View?) {
        ref.get()?.onItemDeleted(item)
    }

    val lblItemName = view.lblItemName
    val lblNumberOfPieces = view.lblNumberOfPieces
    val lblUnitPricesOfPieces = view.lblUnitPricesOfPieces
    val lblNumberCarton = view.lblNumberCarton
    val lblUnitPriceCarton = view.lblUnitPriceCarton
    val lblTotalPrice = view.lblTotalPrice
    val ivDelete = view.ivDelete

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
