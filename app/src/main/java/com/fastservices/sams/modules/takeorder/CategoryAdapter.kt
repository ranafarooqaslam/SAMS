package com.fastservices.sams.modules.takeorder

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.fastservices.sams.R
import com.fastservices.sams.data.entities.Category
import java.lang.ref.WeakReference

class CategoryAdapter(val data: List<Category>, val clickListener: ClickListener) : RecyclerView.Adapter<CategoryVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): CategoryVH {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_category, parent, false)

        return CategoryVH(itemView, clickListener)

    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: CategoryVH, position: Int) {
        holder.bind(data[position])
    }
}

class CategoryVH(val view: View, listener: ClickListener) : RecyclerView.ViewHolder(view), View.OnClickListener {
    private lateinit var item: Category
    val refListener = WeakReference<ClickListener>(listener)
    val tv = view.findViewById<TextView>(android.R.id.text1)
    override fun onClick(v: View?) {
        refListener.get()?.onItemClicked(item)
    }


    fun bind(category: Category) {
        this.item = category
        tv.text = item.SKU_HIE_NAME
        tv.setOnClickListener(this)

    }
}

interface ClickListener {
    fun onItemClicked(item: Category)
}