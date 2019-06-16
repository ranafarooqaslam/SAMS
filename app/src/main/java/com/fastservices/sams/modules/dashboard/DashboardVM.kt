package com.fastservices.sams.modules.dashboard

import android.arch.lifecycle.MutableLiveData
import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.Menu
import com.fastservices.sams.modules.base.BaseVM
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class DashboardVM : BaseVM() {

    val dayStarted = MutableLiveData<Boolean>()
    val dayEnded = MutableLiveData<Boolean>()


    val TAG = "DashboardVM"
    var menuItems: List<Menu>? = null

    init {

        checkDayStarted()

    }

    fun startMyDay() {
        GlobalScope.launch(Dispatchers.IO) {
            try {
                val user = SamsApplication.getPreferenceManager().getUser() ?: return@launch
                showLoader.postValue(true)
                val dailyProcess = SamsApplication.getWebService().insertOrderBookerStartDay(user.DistributionID, user.UserId).await().obDailyProcess
                if (dailyProcess.isNotEmpty()) {
                    SamsApplication.getPreferenceManager().saveDocumentDate(dailyProcess[0].startDayDateTime)
                    menuItems = SamsApplication.getDB().menuDao().getAllItems()
                    dayStarted.postValue(true)
                    dayEnded.postValue(false)
                }
            } catch (e: Exception) {
                handleError(e)
                e.printStackTrace()
            }

            showLoader.postValue(false)
        }
    }

    fun checkDayStarted() {
        GlobalScope.launch {
            if (SamsApplication.getDocumentDate().isNotBlank()) {
                menuItems = SamsApplication.getDB().menuDao().getAllItems()
                dayStarted.postValue(true)
                dayEnded.postValue(false)
            }

        }
    }

    fun endMyDay() {

        GlobalScope.launch {
            try {
                val user = SamsApplication.getPreferenceManager().getUser() ?: return@launch
                showLoader.postValue(true)

                val response = SamsApplication.getWebService().insertOrderBookerEndDay(user.DistributionID, user.UserId, SamsApplication.getDocumentDate()).await()

                SamsApplication.getPreferenceManager().saveDocumentDate("")
                menuItems?.forEach {
                    it.isActive = false
                }
                dayEnded.postValue(true)
                dayStarted.postValue(false)

            } catch (e: Exception) {
                e.printStackTrace()
                handleError(e)
            }

            showLoader.postValue(false)

        }
    }
}