package com.fastservices.sams.modules.complaints

import androidx.databinding.ObservableArrayList
import androidx.recyclerview.widget.RecyclerView
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fastservices.sams.R
import com.fastservices.sams.data.entities.ComplaintReason
import kotlinx.android.synthetic.main.item_reason.view.*

class ReasonsAdapter(val data: ArrayList<ComplaintReason>) : androidx.recyclerview.widget.RecyclerView.Adapter<ReasonsVH>() {
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

class ReasonsVH(val view: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(view), TextWatcher {
    override fun afterTextChanged(s: Editable?) {
        dataItem?.remarks = etReason.text.toString()
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

    }

    private val cbReason = view.cbReason
    private val etReason = view.etReason
    private var dataItem: ComplaintReason? = null

    init {
        cbReason.setOnCheckedChangeListener { buttonView, isChecked ->
            dataItem?.check = isChecked
        }
        etReason.addTextChangedListener(this)
    }

    fun setData(item: ComplaintReason) {
        dataItem = item
        etReason.setText(dataItem?.remarks ?: "")
        cbReason.text = dataItem?.complaintReason
        cbReason.isChecked = dataItem?.check == true
    }

}