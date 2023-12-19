package com.fastservices.sams.modules.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import okhttp3.ResponseBody
import org.json.JSONObject
import retrofit2.HttpException
import java.io.IOException
import java.net.SocketTimeoutException
import io.reactivex.disposables.CompositeDisposable


open class BaseVM : ViewModel() {

    var compositeDisposable = CompositeDisposable()
    val errorLiveData = MutableLiveData<String>()

    val showLoader = MutableLiveData<Boolean>()


    fun handleError(e: Throwable) {
        when (e) {
            is HttpException -> {
                val responseBody = e.response().errorBody()
                errorLiveData.postValue(getErrorMessage(responseBody) ?: "Network failed")
            }
            is SocketTimeoutException -> {
                errorLiveData.postValue("Request timed out")
            }
            is IOException -> {
                errorLiveData.postValue("Connection error")
            }
            else -> {
                errorLiveData.postValue("Unknown error "  + e.message)
            }
        }


    }

    private fun getErrorMessage(responseBody: ResponseBody?): String? {
        return try {
            val jsonObject = JSONObject(responseBody?.string())
            var error = jsonObject.optString("message")
            if (error.isEmpty()) error = jsonObject.optString("error_description")
            if (error.isEmpty()) error = jsonObject.optString("error")
            if (error.isEmpty()) error = "Unknown error"
            error
        } catch (e: Exception) {
            e.message
        }

    }

    fun destroy() {
        compositeDisposable.dispose()
    }
}