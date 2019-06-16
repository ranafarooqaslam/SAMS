package com.fastservices.sams;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0016R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/fastservices/sams/SamsApplication;", "Landroid/app/Application;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "onCreate", "", "Companion", "app_release"})
public final class SamsApplication extends android.app.Application {
    private final java.lang.String TAG = null;
    private static com.fastservices.sams.network.RestClient restClient;
    private static android.content.Context appContext;
    private static com.bumptech.glide.Glide glide;
    private static com.fastservices.sams.prefs.PreferenceManager preferenceManager;
    private static com.fastservices.sams.data.database.AppDatabase appDatabase;
    private static com.fastservices.sams.network.mock.MockRestClient mockRestClient;
    @org.jetbrains.annotations.NotNull()
    private static final java.text.SimpleDateFormat sdf = null;
    public static final com.fastservices.sams.SamsApplication.Companion Companion = null;
    
    public final java.lang.String getTAG() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public SamsApplication() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\u0006J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\fJ\u0006\u0010\u001a\u001a\u00020\u001bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001c"}, d2 = {"Lcom/fastservices/sams/SamsApplication$Companion;", "", "()V", "appContext", "Landroid/content/Context;", "appDatabase", "Lcom/fastservices/sams/data/database/AppDatabase;", "glide", "Lcom/bumptech/glide/Glide;", "mockRestClient", "Lcom/fastservices/sams/network/mock/MockRestClient;", "preferenceManager", "Lcom/fastservices/sams/prefs/PreferenceManager;", "restClient", "Lcom/fastservices/sams/network/RestClient;", "sdf", "Ljava/text/SimpleDateFormat;", "getSdf", "()Ljava/text/SimpleDateFormat;", "getAppContext", "getDB", "getDocumentDate", "", "getMockWebService", "Lcom/fastservices/sams/network/mock/MockWebService;", "getPreferenceManager", "getWebService", "Lcom/fastservices/sams/network/WebService;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.fastservices.sams.network.WebService getWebService() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.fastservices.sams.prefs.PreferenceManager getPreferenceManager() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getAppContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.fastservices.sams.data.database.AppDatabase getDB() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDocumentDate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.text.SimpleDateFormat getSdf() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.fastservices.sams.network.mock.MockWebService getMockWebService() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}