package com.fastservices.sams.modules.stockpositioning

import android.support.v7.widget.RecyclerView
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import com.fastservices.sams.R
import com.fastservices.sams.data.entities.StockPosition
import kotlin.collections.ArrayList

class StockPositioningAdapter(var data: ArrayList<StockPosition>) : RecyclerView.Adapter<StockVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, type: Int): StockVH {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_stock_positioning, parent, false)

        return StockVH(itemView)
    }

    override fun getItemCount(): Int {

        return data.size
    }

    override fun onBindViewHolder(holder: StockVH, position: Int) {

        holder.bind(data[position])

    }

}

class StockVH(view: View) : RecyclerView.ViewHolder(view), TextWatcher {


    val name = view.findViewById<TextView>(R.id.tvStockName)
    val quantity = view.findViewById<EditText>(R.id.etQty)

    var dataItem: StockPosition? = null

    init {
        quantity.addTextChangedListener(this)
    }

    fun bind(item: StockPosition) {
        dataItem = item

        name.text = item.SKU_NAME.plus("\n").plus(item.SKU_CODE)
        quantity.setText(item.Quantity?.toString())
    }

    override fun afterTextChanged(s: Editable?) {
        s ?: return
        dataItem?.Quantity = s.toString()

    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
    }


}
