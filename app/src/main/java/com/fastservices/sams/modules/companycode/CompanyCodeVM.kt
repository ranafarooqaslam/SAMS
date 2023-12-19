package com.fastservices.sams.modules.companycode

import androidx.lifecycle.MutableLiveData
import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.models.ClientInfo
import com.fastservices.sams.modules.base.BaseVM
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class CompanyCodeVM : BaseVM() {

    val TAG = "CompanyCodeVM"
    var companyCode: String = ""

    var clientInfo = MutableLiveData<ClientInfo>()


    fun postCompanyCode() {
        if (companyCode.isEmpty()) {
            errorLiveData.postValue("Please enter company code")
            return
        }

        showLoader.postValue(true)
        compositeDisposable.add(SamsApplication.getWebService().getClientInfo(companyCode)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribe(
                        { response ->
                            showLoader.postValue(false)
                            SamsApplication.getPreferenceManager().saveClientCode(response.ClientConnString)
                            SamsApplication.getPreferenceManager().saveCompanyCode(companyCode)
                            SamsApplication.getPreferenceManager().saveClientInfo(response)
                            clientInfo.postValue(response)
                        },
                        { error ->
                            showLoader.postValue(false)
                            handleError(error)
                        }
                )
        )

    }
}