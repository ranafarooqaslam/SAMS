package com.fastservices.sams.network.mock;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003H\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u0003H\'\u00a8\u0006\f"}, d2 = {"Lcom/fastservices/sams/network/mock/MockWebService;", "", "getChannel", "Lkotlinx/coroutines/Deferred;", "Lcom/fastservices/sams/data/models/ResponseListBody;", "Lcom/fastservices/sams/data/entities/Channel;", "getMenu", "Lcom/fastservices/sams/data/entities/Menu;", "getOutlets", "Lcom/fastservices/sams/data/entities/Outlet;", "getSections", "Lcom/fastservices/sams/data/entities/Section;", "app_debug"})
public abstract interface MockWebService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "menu")
    public abstract kotlinx.coroutines.Deferred<com.fastservices.sams.data.models.ResponseListBody<com.fastservices.sams.data.entities.Menu>> getMenu();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "outlet")
    public abstract kotlinx.coroutines.Deferred<com.fastservices.sams.data.models.ResponseListBody<com.fastservices.sams.data.entities.Outlet>> getOutlets();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "sections")
    public abstract kotlinx.coroutines.Deferred<com.fastservices.sams.data.models.ResponseListBody<com.fastservices.sams.data.entities.Section>> getSections();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "channels")
    public abstract kotlinx.coroutines.Deferred<com.fastservices.sams.data.models.ResponseListBody<com.fastservices.sams.data.entities.Channel>> getChannel();
}