package com.fastservices.sams.modules.outlet

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.ObservableArrayList
import androidx.recyclerview.widget.RecyclerView
import com.fastservices.sams.R
import com.fastservices.sams.data.entities.Outlet
import java.lang.ref.WeakReference

class OutletsAdapter(var data: ObservableArrayList<Outlet>, val noOrders: List<Int>?, private val clickListener: ClickListener?, private val activity: Activity) : RecyclerView.Adapter<OutletVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, type: Int): OutletVH {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_list_outlet, parent, false)
        return OutletVH(itemView, clickListener)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: OutletVH, position: Int) {
        if (position % 2 == 0) holder.rootLayout.setBackgroundColor(Color.parseColor("#ffffff"))
        else holder.rootLayout.setBackgroundColor(Color.parseColor("#f2f2f2"))

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
        }
        else {
            if (item.label.isNotBlank()) {
                holder.unOrder.visibility = View.GONE
                holder.outletIcon.setImageResource(R.drawable.ic_store_green)
                holder.rootLayout.isEnabled = false
                holder.tvLabelUnitCarton.visibility = View.VISIBLE
                holder.tvValueUnitCarton.visibility = View.VISIBLE
                holder.tvValueUnitCarton.text = item.label
            } else if (noOrders.contains(item.outletID)) {
                holder.unOrder.visibility = View.GONE
                holder.outletIcon.setImageResource(R.drawable.ic_store_red)
                holder.rootLayout.isEnabled = false
            } else {
                holder.outletIcon.setImageResource(R.drawable.ic_store_grey)
                holder.unOrder.visibility = View.GONE
                holder.rootLayout.isEnabled = true
            }
        }

        holder.btGetDirection.setOnClickListener {
            try {
                if(item?.latitude != null && item.latitude > 0.0 && item.longtidue > 0.0) {
                    openGoogleMaps(item.latitude, item.longtidue, activity)
                }
                else {
                    Toast.makeText(activity, "Location is missing or Invalid", Toast.LENGTH_SHORT).show()
                }
            }
            catch (ex: Exception) {
                Toast.makeText(activity, ex.message?:"Error Occurred", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun getItemAtPosition(pos: Int) = data[pos]

    }

    private fun openGoogleMaps(latitude: Double, longitude: Double, activity: Activity) {
        val uri = String.format("geo:%f,%f", latitude, longitude)
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
        intent.setPackage("com.google.android.apps.maps")
        if (intent.resolveActivity(activity.packageManager) != null) {
            activity.startActivity(intent)
        } else {
            val webUri = Uri.parse(String.format("https://www.google.com/maps?q=%f,%f", latitude, longitude))
            val webIntent = Intent(Intent.ACTION_VIEW, webUri)
            activity.startActivity(webIntent)
        }
    }

class OutletVH(view: View, listener: ClickListener?) : RecyclerView.ViewHolder(view), View.OnClickListener {
    val rootLayout: View = view
    val tvOutletName = view.findViewById<TextView>(R.id.tvOutletName)
    val btGetDirection = view.findViewById<TextView>(R.id.btGetDirection)
    val tvAddress = view.findViewById<TextView>(R.id.tvAddress)
    val tvOwner = view.findViewById<TextView>(R.id.tvOwner)
    val unOrder = view.findViewById<TextView>(R.id.tvUnorder)
    val outletIcon = view.findViewById<ImageView>(R.id.ivOutletIcon)
    val tvLabelUnitCarton = view.findViewById<TextView>(R.id.tvLabelUnitCarton)
    val tvValueUnitCarton = view.findViewById<TextView>(R.id.tvValueUnitCarton)
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