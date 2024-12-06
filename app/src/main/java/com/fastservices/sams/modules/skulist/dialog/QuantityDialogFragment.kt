package com.fastservices.sams.modules.skulist.dialog

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import com.fastservices.sams.R
import com.fastservices.sams.data.entities.SKU

class QuantityDialogFragment : androidx.fragment.app.DialogFragment(), View.OnClickListener {
    lateinit var item: SKU
    var units = 0
    var discount = 0
    var cartons = 0
    var initialUnits = 0
    var initialDiscount = 0
    var initialCartons = 0
    lateinit var layoutDiscount: LinearLayout
    var unitsET: EditText? = null
    var discountET: EditText? = null
    var cartonsET: EditText? = null
    var isAllowDiscount: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        item           = arguments?.getSerializable(EXTRA_SKU) as SKU
        initialCartons = item.NO_OF_CARTONS
        initialUnits   = item.NO_OF_UNITS
        initialDiscount   = item.SPECIAL_DISCOUNT

        units    = initialUnits
        discount = initialDiscount
        cartons  = initialCartons
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.dialog_quatitiy_selection, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        layoutDiscount = view.findViewById (R.id.layoutDiscount) as LinearLayout

        if (isAllowDiscount) {
            layoutDiscount.visibility = View.VISIBLE
        }
        else {
            layoutDiscount.visibility = View.GONE
        }

        unitsET = view.findViewById (R.id.tvUnitCount) as EditText
        cartonsET = view.findViewById (R.id.tvCartonCount) as EditText
        discountET = view.findViewById (R.id.tvDiscountCount) as EditText

        discountET!!.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) { }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(!s.isNullOrEmpty())
                    discount = Integer.parseInt(s.toString())
            }
        })

        unitsET!!.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) { }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(!s.isNullOrEmpty())
                    units = Integer.parseInt(s.toString())
            }
        })

        cartonsET!!.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) { }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(!s.isNullOrEmpty())
                    cartons = Integer.parseInt(s.toString())
            }
        })

        view.findViewById<TextView>(R.id.tvItemName).text = item.SKU_NAME
        view.findViewById<TextView>(R.id.tvItemName).isSelected = true

        view.findViewById<TextView>(R.id.tvUnitPlus).setOnClickListener(this)
        view.findViewById<TextView>(R.id.tvUnitSubtract).setOnClickListener(this)
        view.findViewById<TextView>(R.id.tvDiscountPlus).setOnClickListener(this)
        view.findViewById<TextView>(R.id.tvDiscountSubtract).setOnClickListener(this)
        view.findViewById<TextView>(R.id.tvCartonPlus).setOnClickListener(this)
        view.findViewById<TextView>(R.id.tvCartonSubtract).setOnClickListener(this)
        view.findViewById<Button>(R.id.btnCancel).setOnClickListener(this)
        view.findViewById<Button>(R.id.btnSave).setOnClickListener(this)

        unitsET!!.text = Editable.Factory.getInstance().newEditable(units.toString())
        discountET!!.text = Editable.Factory.getInstance().newEditable(discount.toString())
        cartonsET!!.text = Editable.Factory.getInstance().newEditable(cartons.toString())
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            v?.findViewById<TextView>(R.id.tvUnitPlus)?.id -> units++
            v?.findViewById<TextView>(R.id.tvUnitSubtract)?.id -> units = Math.max(0, units - 1)
            v?.findViewById<TextView>(R.id.tvDiscountPlus)?.id -> discount++
            v?.findViewById<TextView>(R.id.tvDiscountSubtract)?.id -> discount = Math.max(0, discount - 1)
            v?.findViewById<TextView>(R.id.tvCartonPlus)?.id -> cartons++
            v?.findViewById<TextView>(R.id.tvCartonSubtract)?.id -> cartons = Math.max(0, cartons - 1)
            v?.findViewById<Button>(R.id.btnSave)?.id -> saveCounts()
            v?.findViewById<Button>(R.id.btnCancel)?.id -> dismiss()
        }

        unitsET!!.text = Editable.Factory.getInstance().newEditable(units.toString())
        discountET!!.text = Editable.Factory.getInstance().newEditable(discount.toString())
        cartonsET!!.text = Editable.Factory.getInstance().newEditable(cartons.toString())
    }

    private fun saveCounts() {
        if (units != initialUnits || cartons != initialCartons) {
            val intent = Intent()
            item.SPECIAL_DISCOUNT = discount
            intent.putExtra(EXTRA_SKU, item)
            intent.putExtra(EXTRA_UNITS, units)
            intent.putExtra(EXTRA_CARTONS, cartons)
            intent.putExtra(EXTRA_DISCOUNT, discount)
            targetFragment?.onActivityResult(0, RESULT_DATA_CHANGED, intent)
        }
        dismiss()
    }

    companion object {
        fun newInstance(item: SKU, isAllowDiscount: Boolean): QuantityDialogFragment {
            return QuantityDialogFragment().apply {
                val args = Bundle()
                args.putSerializable(EXTRA_SKU, item)
                this.isAllowDiscount = isAllowDiscount
                arguments = args
            }
        }
        const val RESULT_DATA_CHANGED = 4
        const val EXTRA_SKU = "extra_sku_item"
        const val EXTRA_UNITS = "ex_units"
        const val EXTRA_CARTONS = "ex_cartons"
        const val EXTRA_DISCOUNT = "ex_discount"
    }
}