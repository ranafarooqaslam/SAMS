package com.fastservices.sams.modules.login

import androidx.lifecycle.MutableLiveData
import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.models.UserInfo
import com.fastservices.sams.data.repos.*
import com.fastservices.sams.data.repos.promotions.*
import com.fastservices.sams.modules.base.BaseVM
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class LoginVM : BaseVM() {

    val TAG = javaClass.name

    var username = ""
    var password = ""

    val loginSuccess = MutableLiveData<UserInfo>()

    fun doLogin() {
        if (username.isEmpty()) {
            errorLiveData.postValue("Please input username")
            return

        }
        if (password.isEmpty()) {
            errorLiveData.postValue("Please input password")
            return
        }

        showLoader.postValue(true)
        GlobalScope.launch {
            try {
                val login = SamsApplication.getWebService().getToken(username, password, "password").await()
                SamsApplication.getPreferenceManager().saveUser(login)
                SamsApplication.getPreferenceManager().saveToken("${login.token_type} ${login.access_token}")

                RepoMenu(login).loadAndSaveMenu()
//                RepoOutlet(login).syncDownOutlets()
//                RepoSection(login).syncDownSections()
//                RepoChannel(login).syncDownChannels()

//                RepoComplaints(login).syncDownComplaints()
//                RepoReplacementReason(login).syncDown()

//                RepoSKUCategory(login).syncDownCategoies()

//                RepoNoOrderReason().syncDownData()

//                RepoBasketDetail(login).syncDown()
//                RepoBasketMaster(login).syncDown()
//                RepoPromotionCustomerType(login).syncDown()
//                RepoPromotionOffer(login).syncDown()
//                RepoSKUGroup(login).syncDown()
//                RepoPromotions(login).syncDown()
//                RepoPromotionValueClass(login).syncDown()




                loginSuccess.postValue(login)
                SamsApplication.getPreferenceManager().hasUserLoggedIn(true)
            } catch (e: Throwable) {
                e.printStackTrace()
                handleError(e)
            } finally {
                showLoader.postValue(false)
            }


        }
    }


}