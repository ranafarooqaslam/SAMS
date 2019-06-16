package com.fastservices.sams.modules.skulist.dialog

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fastservices.sams.R
import com.fastservices.sams.data.entities.SKU
import kotlinx.android.synthetic.main.dialog_quatitiy_selection.*

class QuantityDialogFragment : DialogFragment(), View.OnClickListener {


    lateinit var item: SKU

    var units = 0
    var cartons = 0

    var initialUnits = 0
    var initialCartons = 0

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

        tvItemName.text = item.SKU_NAME
        tvItemName.isSelected = true

        tvUnitPlus.setOnClickListener(this)
        tvUnitSubtract.setOnClickListener(this)
        tvCartonPlus.setOnClickListener(this)
        tvCartonSubtract.setOnClickListener(this)

        btnCancel.setOnClickListener(this)
        btnSave.setOnClickListener(this)

        tvUnitCount.text = units.toString()
        tvCartonCount.text = cartons.toString()
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

        tvUnitCount.text = units.toString()
        tvCartonCount.text = cartons.toString()

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