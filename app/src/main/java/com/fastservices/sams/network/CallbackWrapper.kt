package fastservices.teamsuite.module.network

import io.reactivex.observers.DisposableObserver
import okhttp3.ResponseBody
import org.json.JSONObject
import retrofit2.HttpException
import java.io.IOException
import java.lang.ref.WeakReference
import java.net.SocketTimeoutException


abstract class CallbackWrapper<T>(callback: NetworkCallback<T>?) : DisposableObserver<T>() {

    var ref: WeakReference<NetworkCallback<T>> = WeakReference(callback!!)


    protected abstract fun networkSuccess(result: T)


    override fun onComplete() {

    }

    override fun onNext(result: T) {
        networkSuccess(result)
    }

    override fun onError(e: Throwable) {

        val callback = ref.get()

        if (e is HttpException) {
            val responseBody = e.response().errorBody()
            callback?.networkFailed(getErrorMessage(responseBody) ?: "Network failed")
        } else if (e is SocketTimeoutException) {
            callback?.networkFailed("Request timed out")
        } else if (e is IOException) {
            callback?.networkFailed("Connection error")
        } else {
            callback?.networkFailed("Unknown error")
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
}