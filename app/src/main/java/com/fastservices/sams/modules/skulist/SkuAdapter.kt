package com.fastservices.sams.modules.skulist

import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.fastservices.sams.R
import com.fastservices.sams.data.entities.Category
import com.fastservices.sams.data.entities.RoundUp2Decimal
import com.fastservices.sams.data.entities.SKU
import java.lang.ref.WeakReference
import com.amulyakhare.textdrawable.TextDrawable


class SkuAdapter(val data: List<SKU>, val clickListener: ClickListener) : RecyclerView.Adapter<SkuVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): SkuVH {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_sku, parent, false)

        return SkuVH(itemView, clickListener)

    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: SkuVH, position: Int) {
        holder.bind(data[position])
    }
}

class SkuVH(val view: View, listener: ClickListener) : RecyclerView.ViewHolder(view), View.OnClickListener {
    private lateinit var item: SKU
    val refListener = WeakReference<ClickListener>(listener)
    val tvItemCode = view.findViewById<TextView>(R.id.tvItemCode)
    val tvItemName = view.findViewById<TextView>(R.id.tvItemName)
    val tvRetailPrice = view.findViewById<TextView>(R.id.tvRetailPrice)
    val tvTradePrice = view.findViewById<TextView>(R.id.tvTradePrice)
    val rootLayout = view.findViewById<View>(R.id.rootLayout)

    val tvOrderUnits = view.findViewById<TextView>(R.id.tvOrderUnits)
    val tvOrderCartona = view.findViewById<TextView>(R.id.tvOrderCarton)
    val tvSubtotal = view.findViewById<TextView>(R.id.tvSubtotal)

    val ivIcon = view.findViewById<ImageView>(R.id.ivSkuImage)
    override fun onClick(v: View?) {
        when (v?.id) {
            rootLayout.id -> refListener.get()?.onItemClicked(item)
            tvItemName.id -> v.isSelected = true
        }

    }


    fun bind(item: SKU) {
        this.item = item

        if (adapterPosition % 2 == 0)
            rootLayout.setBackgroundColor(Color.parseColor("#ffffff"))
        else
            rootLayout.setBackgroundColor(Color.parseColor("#f2f2f2"))

        tvItemCode.text = item.SKU_CODE
        tvItemName.text = item.SKU_NAME
        tvRetailPrice.text = RoundUp2Decimal(item.RETAIL_PRICE)
        tvTradePrice.text = RoundUp2Decimal(item.TRADE_PRICE)

        if (item.NO_OF_UNITS > 0 || item.NO_OF_CARTONS > 0) {
            ivIcon.setImageResource(R.drawable.ic_green_tick)
        } else {
            val drawable = TextDrawable.builder()
                    .buildRound(item.SKU_NAME[0].toString(), Color.parseColor("#989898"))
            ivIcon.setImageDrawable(drawable)
        }

        tvItemName.setOnClickListener(this)
        tvItemName.isSelected = false
        rootLayout.setOnClickListener(this)

        tvOrderUnits.text = item.NO_OF_UNITS.toString()
        tvOrderCartona.text = item.NO_OF_CARTONS.toString()
        tvSubtotal.text = item.getSubTotal()


    }
}

interface ClickListener {
    fun onItemClicked(item: SKU)
}