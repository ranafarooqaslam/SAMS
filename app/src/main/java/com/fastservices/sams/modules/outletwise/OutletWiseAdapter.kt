package com.fastservices.sams.modules.outletwise

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.fastservices.sams.R
import com.fastservices.sams.data.entities.DecimalFormattedAmount
import com.fastservices.sams.data.entities.RoundUp2Decimal
import com.fastservices.sams.data.models.OutletWiseSummaryModel
import com.fastservices.sams.data.models.SKUWiseSummaryModel


class OutletWiseAdapter(val data: List<OutletWiseSummaryModel>) : RecyclerView.Adapter<OutletVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): OutletVH {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.row_outlet_wise_summary, parent, false)

        return OutletVH(itemView)

    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: OutletVH, position: Int) {
        holder.bind(data[position])
    }
}

class OutletVH(val view: View) : RecyclerView.ViewHolder(view) {
    val tvCode = view.findViewById<TextView>(R.id.tvOutletCode)
    val tvName = view.findViewById<TextView>(R.id.tvOutletName)
    val tvNetAmount = view.findViewById<TextView>(R.id.tvNetAmount)

    fun bind(item: OutletWiseSummaryModel) {

        tvCode.text = item.OUTLET_CODE.toString()
        tvName.text = item.OUTLET_NAME
        tvNetAmount.text = DecimalFormattedAmount(RoundUp2Decimal(item.NET_AMOUNT).toDouble())

    }
}
