package com.fastservices.sams.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/fastservices/sams/network/GoogleDriveClient;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "apiService", "Lcom/fastservices/sams/network/GoogleWebService;", "getService", "TokenInterceptor", "app_release"})
public final class GoogleDriveClient {
    private com.fastservices.sams.network.GoogleWebService apiService;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.network.GoogleWebService getService() {
        return null;
    }
    
    public GoogleDriveClient(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/fastservices/sams/network/GoogleDriveClient$TokenInterceptor;", "Lokhttp3/Interceptor;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "app_release"})
    static final class TokenInterceptor implements okhttp3.Interceptor {
        private final android.content.Context context = null;
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public okhttp3.Response intercept(@org.jetbrains.annotations.Nullable()
        okhttp3.Interceptor.Chain chain) {
            return null;
        }
        
        public TokenInterceptor(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
    }
}