package com.fastservices.sams.network

import com.fastservices.sams.data.models.google.GFileResponse
import com.fastservices.sams.data.models.google.GoogleAuth
import com.fastservices.sams.data.models.google.PostBodyFile
import kotlinx.coroutines.Deferred
import okhttp3.RequestBody
import retrofit2.http.*

public interface GoogleWebService {


    @POST(POST_FILE_META)
    public fun postFileInfo(@Header("Authorization") token: String, @Header("Content-Type") contentType: String = "application/json", @Body body: PostBodyFile): Deferred<GFileResponse>

    @PUT(POST_FILE)
    fun postFileContent(@Header("Authorization") token: String, @Header("Content-Type") mimeType: String, @Path("id") id: String, @Query("uploadType") uploadType: String, @Body file: RequestBody): Deferred<GFileResponse>

    @FormUrlEncoded
    @POST(AUTH)
    fun refeshToken(@Header("Content-Type") contentType: String, @Field("client_secret") client_secret: String,
                    @Field("grant_type") grant_type: String, @Field("refresh_token") refresh_token: String,
                    @Field("client_id") client_id: String): Deferred<GoogleAuth>


}