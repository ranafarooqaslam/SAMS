package com.fastservices.sams.modules.complaints

import androidx.recyclerview.widget.RecyclerView
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import com.fastservices.sams.R
import com.fastservices.sams.data.entities.ComplaintReason

class ReasonsAdapter(val data: ArrayList<ComplaintReason>) : RecyclerView.Adapter<ReasonsVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ReasonsVH {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_reason, parent, false)
        return ReasonsVH(itemView)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ReasonsVH, position: Int) {
        holder.setData(data[position])
    }
}

class ReasonsVH(val view: View) : RecyclerView.ViewHolder(view), TextWatcher {
    override fun afterTextChanged(s: Editable?) {
        dataItem?.remarks = etReason.text.toString()
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

    }

    private val cbReason = view.findViewById<CheckBox>(R.id.cbReason)
    private val etReason = view.findViewById<CheckBox>(R.id.etReason)
    private var dataItem: ComplaintReason? = null

    init {
        cbReason.setOnCheckedChangeListener { _, isChecked ->
            dataItem?.check = isChecked
        }
        etReason.addTextChangedListener(this)
    }

    fun setData(item: ComplaintReason) {
        dataItem = item
        etReason.text = dataItem?.remarks ?: ""
        cbReason.text = dataItem?.complaintReason
        cbReason.isChecked = dataItem?.check == true
    }
}