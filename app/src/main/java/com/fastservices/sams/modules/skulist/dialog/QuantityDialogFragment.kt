package com.fastservices.sams.modules.skulist.dialog

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import com.fastservices.sams.R
import com.fastservices.sams.data.entities.SKU
import kotlinx.android.synthetic.main.dialog_quatitiy_selection.*

class QuantityDialogFragment : androidx.fragment.app.DialogFragment(), View.OnClickListener {


    lateinit var item: SKU

    var units = 0
    var cartons = 0

    var initialUnits = 0
    var initialCartons = 0
    var unitsET: EditText? = null
    var cartonsET: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        item = arguments?.getSerializable(EXTRA_SKU) as SKU
        initialCartons = item.NO_OF_CARTONS
        initialUnits = item.NO_OF_UNITS

        units = initialUnits
        cartons = initialCartons

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        return inflater.inflate(R.layout.dialog_quatitiy_selection, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        unitsET = view.findViewById (R.id.tvUnitCount) as EditText
        cartonsET = view.findViewById (R.id.tvCartonCount) as EditText
        unitsET!!.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s!=null && s.isNotEmpty())
                    units = Integer.parseInt(s.toString())
            }
        })
        cartonsET!!.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s!=null && s.isNotEmpty())
                    cartons = Integer.parseInt(s.toString())
            }
        })
        tvItemName.text = item.SKU_NAME
        tvItemName.isSelected = true

        tvUnitPlus.setOnClickListener(this)
        tvUnitSubtract.setOnClickListener(this)
        tvCartonPlus.setOnClickListener(this)
        tvCartonSubtract.setOnClickListener(this)

        btnCancel.setOnClickListener(this)
        btnSave.setOnClickListener(this)

        unitsET!!.text = Editable.Factory.getInstance().newEditable(units.toString())
        cartonsET!!.text = Editable.Factory.getInstance().newEditable(cartons.toString())
    }

    override fun onClick(v: View?) {

        when (v?.id) {
            tvUnitPlus.id -> units++
            tvUnitSubtract.id -> units = Math.max(0, units - 1)
            tvCartonPlus.id -> cartons++
            tvCartonSubtract.id -> cartons = Math.max(0, cartons - 1)
            btnSave.id -> saveCounts()
            btnCancel.id -> dismiss()

        }

        unitsET!!.text = Editable.Factory.getInstance().newEditable(units.toString())
        cartonsET!!.text = Editable.Factory.getInstance().newEditable(cartons.toString())

    }

    fun saveCounts() {

        if (units != initialUnits || cartons != initialCartons) {
            val intent = Intent()
            intent.putExtra(EXTRA_SKU, item)
            intent.putExtra(EXTRA_UNITS, units)
            intent.putExtra(EXTRA_CARTONS, cartons)
            targetFragment?.onActivityResult(0, RESULT_DATA_CHANGED, intent)
        }
        dismiss()
    }


    companion object {
        fun newInstance(item: SKU): QuantityDialogFragment {
            return QuantityDialogFragment().apply {
                val args = Bundle()
                args.putSerializable(EXTRA_SKU, item)
                arguments = args
            }
        }

        const val RESULT_DATA_CHANGED = 4
        const val EXTRA_SKU = "extra_sku_item"
        const val EXTRA_UNITS = "ex_units"
        const val EXTRA_CARTONS = "ex_cartons"
    }
}