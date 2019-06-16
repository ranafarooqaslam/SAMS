package com.fastservices.sams.data.repos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/fastservices/sams/data/repos/RepoReplacementReason;", "", "user", "Lcom/fastservices/sams/data/models/UserInfo;", "(Lcom/fastservices/sams/data/models/UserInfo;)V", "SP_NAME", "", "body", "Lcom/fastservices/sams/data/models/PostBody;", "Lcom/fastservices/sams/data/models/ParametersDistID;", "getUser", "()Lcom/fastservices/sams/data/models/UserInfo;", "getAllReasonsRemote", "", "Lcom/fastservices/sams/data/entities/ReplacementReason;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncDown", "", "app_debug"})
public final class RepoReplacementReason {
    private final java.lang.String SP_NAME = "uspGetReplacementReasonAndroid";
    private final com.fastservices.sams.data.models.PostBody<com.fastservices.sams.data.models.ParametersDistID> body = null;
    @org.jetbrains.annotations.NotNull()
    private final com.fastservices.sams.data.models.UserInfo user = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllReasonsRemote(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.fastservices.sams.data.entities.ReplacementReason>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object syncDown(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.data.models.UserInfo getUser() {
        return null;
    }
    
    public RepoReplacementReason(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.models.UserInfo user) {
        super();
    }
}