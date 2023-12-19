package com.fastservices.sams.modules.pricing

import androidx.lifecycle.MutableLiveData
import androidx.databinding.ObservableField
import android.util.Log
import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.Category
import com.fastservices.sams.data.entities.DecimalFormattedAmount
import com.fastservices.sams.data.entities.RoundUp2Decimal
import com.fastservices.sams.data.entities.SKU
import com.fastservices.sams.data.models.SKUPricingModel
import com.fastservices.sams.data.models.SKUWiseSummaryModel
import com.fastservices.sams.data.repos.RepoSKU
import com.fastservices.sams.data.repos.RepoSKUCategory
import com.fastservices.sams.modules.base.BaseVM
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class PricingVM : BaseVM() {


    val skuLoaded = MutableLiveData<Boolean>()

    val categoryLoaded = MutableLiveData<Boolean>()

    lateinit var sku: List<SKU>

    lateinit var category: List<Category>

    init {
        GlobalScope.launch {

            val user = SamsApplication.getPreferenceManager().getUser() ?: return@launch

            category = RepoSKUCategory(user).getCategoriesLocal()


            categoryLoaded.postValue(true)

        }
    }

    fun loadSKUs(cat_id: Int) {
        GlobalScope.launch {
            showLoader.postValue(true)
            val user = SamsApplication.getPreferenceManager().getUser() ?: return@launch
            sku = RepoSKU(user).getAllSKUForCategory(cat_id)
            skuLoaded.postValue(true)
            showLoader.postValue(false)
        }
    }
}