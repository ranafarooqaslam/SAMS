package com.fastservices.sams.data.repos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/fastservices/sams/data/repos/RepoMenu;", "", "user", "Lcom/fastservices/sams/data/models/UserInfo;", "(Lcom/fastservices/sams/data/models/UserInfo;)V", "SP_NAME", "", "getSP_NAME", "()Ljava/lang/String;", "body", "Lcom/fastservices/sams/data/models/PostBody;", "Lcom/fastservices/sams/data/models/Parameter;", "getBody", "()Lcom/fastservices/sams/data/models/PostBody;", "getUser", "()Lcom/fastservices/sams/data/models/UserInfo;", "getMenuItemsLocal", "", "Lcom/fastservices/sams/data/entities/Menu;", "getMenuItemsRemote", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAndSaveMenu", "saveMenuItems", "", "items", "app_debug"})
public final class RepoMenu {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String SP_NAME = "uspGetAndroidMenu";
    @org.jetbrains.annotations.NotNull()
    private final com.fastservices.sams.data.models.PostBody<com.fastservices.sams.data.models.Parameter> body = null;
    @org.jetbrains.annotations.NotNull()
    private final com.fastservices.sams.data.models.UserInfo user = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSP_NAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.data.models.PostBody<com.fastservices.sams.data.models.Parameter> getBody() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.fastservices.sams.data.entities.Menu> getMenuItemsLocal() {
        return null;
    }
    
    private final void saveMenuItems(java.util.List<com.fastservices.sams.data.entities.Menu> items) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loadAndSaveMenu(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.fastservices.sams.data.entities.Menu>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.data.models.UserInfo getUser() {
        return null;
    }
    
    public RepoMenu(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.models.UserInfo user) {
        super();
    }
}