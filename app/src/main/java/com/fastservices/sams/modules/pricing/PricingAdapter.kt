package com.fastservices.sams.modules.pricing

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.fastservices.sams.R
import com.fastservices.sams.data.entities.DecimalFormattedAmount
import com.fastservices.sams.data.entities.RoundUp2Decimal
import com.fastservices.sams.data.entities.SKU
import com.fastservices.sams.data.models.SKUPricingModel
import com.fastservices.sams.data.models.SKUWiseSummaryModel


class PricingAdapter(val data: List<SKU>) : RecyclerView.Adapter<SkuVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): SkuVH {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.row_pricing_report, parent, false)

        return SkuVH(itemView)

    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: SkuVH, position: Int) {
        holder.bind(data[position])
    }
}

class SkuVH(val view: View) : RecyclerView.ViewHolder(view) {
    val tvName = view.findViewById<TextView>(R.id.tvSkuName)
    val tvTrade = view.findViewById<TextView>(R.id.tvSKUTrade)
    val tvRetail = view.findViewById<TextView>(R.id.tvSKURetail)

    fun bind(item: SKU) {

        tvName.text = item.SKU_NAME
        tvTrade.text = DecimalFormattedAmount(RoundUp2Decimal(item.TRADE_PRICE).toDouble())
        tvRetail.text = DecimalFormattedAmount(RoundUp2Decimal(item.RETAIL_PRICE).toDouble())

    }
}
