package com.fastservices.sams.modules.skuwise

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.fastservices.sams.R
import com.fastservices.sams.data.entities.DecimalFormattedAmount
import com.fastservices.sams.data.entities.RoundUp2Decimal
import com.fastservices.sams.data.models.SKUWiseSummaryModel


class SkuWiseAdapter(val data: List<SKUWiseSummaryModel>) : androidx.recyclerview.widget.RecyclerView.Adapter<SkuVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): SkuVH {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.row_sku_wise_summary, parent, false)

        return SkuVH(itemView)

    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: SkuVH, position: Int) {
        holder.bind(data[position])
    }
}

class SkuVH(val view: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(view) {
    val tvItemName = view.findViewById<TextView>(R.id.tvSkuName)
    val tvQuantity = view.findViewById<TextView>(R.id.tvSKUQty)
    val tvNetAmount = view.findViewById<TextView>(R.id.tvSKUAmount)

    fun bind(item: SKUWiseSummaryModel) {

        tvItemName.text = item.SKU_NAME
        val totalCtn=item.QUANTITY_UNIT/item.QUANTITY_CTN
        if(totalCtn>0){
            val extraUnits=item.QUANTITY_UNIT%item.QUANTITY_CTN
            tvQuantity.text = totalCtn.toString().plus(" - ").plus(extraUnits.toString())
        }else{
            val value=0
            tvQuantity.text = value.toString().plus(" - ").plus(item.QUANTITY_UNIT.toString())
        }

        tvNetAmount.text = DecimalFormattedAmount(RoundUp2Decimal(item.NET_AMOUNT).toDouble())

    }
}
