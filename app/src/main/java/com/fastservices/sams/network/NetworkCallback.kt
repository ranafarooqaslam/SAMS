package fastservices.teamsuite.module.network

interface NetworkCallback<T> {

    fun networkSuccess(result: T)
    fun networkFailed(error: String)
}