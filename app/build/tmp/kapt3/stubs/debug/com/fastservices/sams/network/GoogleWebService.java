package com.fastservices.sams.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH\'J,\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\'J@\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u0006H\'\u00a8\u0006\u0016"}, d2 = {"Lcom/fastservices/sams/network/GoogleWebService;", "", "postFileContent", "Lkotlinx/coroutines/Deferred;", "Lcom/fastservices/sams/data/models/google/GFileResponse;", "token", "", "mimeType", "id", "uploadType", "file", "Lokhttp3/RequestBody;", "postFileInfo", "contentType", "body", "Lcom/fastservices/sams/data/models/google/PostBodyFile;", "refeshToken", "Lcom/fastservices/sams/data/models/google/GoogleAuth;", "client_secret", "grant_type", "refresh_token", "client_id", "app_debug"})
public abstract interface GoogleWebService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "drive/v2/files")
    public abstract kotlinx.coroutines.Deferred<com.fastservices.sams.data.models.google.GFileResponse> postFileInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.fastservices.sams.data.models.google.PostBodyFile body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "upload/drive/v2/files/{id}")
    public abstract kotlinx.coroutines.Deferred<com.fastservices.sams.data.models.google.GFileResponse> postFileContent(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String mimeType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "uploadType")
    java.lang.String uploadType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    okhttp3.RequestBody file);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/oauth2/v4/token")
    @retrofit2.http.FormUrlEncoded()
    public abstract kotlinx.coroutines.Deferred<com.fastservices.sams.data.models.google.GoogleAuth> refeshToken(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "client_secret")
    java.lang.String client_secret, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "grant_type")
    java.lang.String grant_type, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "refresh_token")
    java.lang.String refresh_token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "client_id")
    java.lang.String client_id);
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}