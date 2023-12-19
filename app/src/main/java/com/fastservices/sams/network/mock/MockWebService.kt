package com.fastservices.sams.network.mock

import com.fastservices.sams.data.entities.Channel
import com.fastservices.sams.data.entities.Menu
import com.fastservices.sams.data.entities.Outlet
import com.fastservices.sams.data.entities.Section
import com.fastservices.sams.data.models.Parameters
import com.fastservices.sams.data.models.ParentID
import com.fastservices.sams.data.models.PostBody
import com.fastservices.sams.data.models.ResponseListBody
import com.fastservices.sams.network.EXEC_SP
import kotlinx.coroutines.Deferred
import retrofit2.http.Body
import retrofit2.http.GET

public interface MockWebService {


    @GET("menu")
    public fun getMenu(): Deferred<ResponseListBody<Menu>>

    @GET("outlet")
    fun getOutlets(): Deferred<ResponseListBody<Outlet>>

    @GET("sections")
    public fun getSections(): Deferred<ResponseListBody<Section>>

    @GET("channels")
    public fun getChannel(): Deferred<ResponseListBody<Channel>>


}