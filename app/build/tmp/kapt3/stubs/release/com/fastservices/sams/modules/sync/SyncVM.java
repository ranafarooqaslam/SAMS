package com.fastservices.sams.modules.sync;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0010\u001a\u00020\u000b2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0012j\b\u0012\u0004\u0012\u00020\u000b`\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0002J \u0010\u0015\u001a\u00020\u00162\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0012j\b\u0012\u0004\u0012\u00020\u000b`\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0006\u0010\u0018\u001a\u00020\u0016J\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0016H\u0002J)\u0010\u001d\u001a\u00020\u00162\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001aH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/fastservices/sams/modules/sync/SyncVM;", "Lcom/fastservices/sams/modules/base/BaseVM;", "()V", "googleService", "Lcom/fastservices/sams/network/GoogleWebService;", "getGoogleService", "()Lcom/fastservices/sams/network/GoogleWebService;", "setGoogleService", "(Lcom/fastservices/sams/network/GoogleWebService;)V", "syncLogger", "Landroid/arch/lifecycle/MutableLiveData;", "", "getSyncLogger", "()Landroid/arch/lifecycle/MutableLiveData;", "syncStatus", "getSyncStatus", "addTofiles", "files", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "path", "deleteFiles", "", "downloadData", "startSyncData", "updateToken", "Lcom/fastservices/sams/data/models/google/GoogleAuth;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadData", "uploadFilesToDrive", "", "auth", "(Ljava/util/List;Lcom/fastservices/sams/data/models/google/GoogleAuth;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class SyncVM extends com.fastservices.sams.modules.base.BaseVM {
    @org.jetbrains.annotations.Nullable()
    private com.fastservices.sams.network.GoogleWebService googleService;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.String> syncStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.String> syncLogger = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.fastservices.sams.network.GoogleWebService getGoogleService() {
        return null;
    }
    
    public final void setGoogleService(@org.jetbrains.annotations.Nullable()
    com.fastservices.sams.network.GoogleWebService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.String> getSyncStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.String> getSyncLogger() {
        return null;
    }
    
    public final void startSyncData() {
    }
    
    private final void uploadData() {
    }
    
    private final void deleteFiles(java.util.ArrayList<java.lang.String> files) {
    }
    
    private final java.lang.String addTofiles(java.util.ArrayList<java.lang.String> files, java.lang.String path) {
        return null;
    }
    
    private final void downloadData() {
    }
    
    public SyncVM() {
        super();
    }
}