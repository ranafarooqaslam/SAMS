package com.fastservices.sams.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"AUTH", "", "EXEC_SP", "GET_CHANNELS", "GET_CLIENT_INFO", "GET_COMPLAINT_REASON", "GET_MENU", "GET_OUTLETS", "GET_SECTIONS", "GET_TOKEN", "INSERT_MERCHANDISING", "INSERT_NO_ORDER", "INSERT_ORDER", "INSERT_ORDER_BOOKER_END", "INSERT_ORDER_BOOKER_START", "INSERT_OUTLETS", "INSERT_OUTLET_COMPLAINT", "INSERT_REPLACEMENT", "INSERT_STOCK_POSITIONING", "POST_FILE", "POST_FILE_META", "app_debug"})
public final class EndpointsKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_CLIENT_INFO = "api/MultiTenant/GetClientInfo";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_TOKEN = "token";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXEC_SP = "api/ExecuteSP/Get";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_MENU = "api/Menu/GetMenu";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_OUTLETS = "api/Outlet/GetOutlet";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INSERT_OUTLETS = "api/Outlet/InsertOutlet";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INSERT_MERCHANDISING = "api/Marchandise/InsertMarchandise";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_SECTIONS = "api/Area/GetUserSection";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_CHANNELS = "api/Outlet/GetChannel";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String POST_FILE_META = "drive/v2/files";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String POST_FILE = "upload/drive/v2/files/{id}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AUTH = "/oauth2/v4/token";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_COMPLAINT_REASON = "api/Outlet/GetComplaintReason";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INSERT_OUTLET_COMPLAINT = "api/Outlet/InsertOutletComplaint";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INSERT_ORDER = "api/Order/InsertOrder";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INSERT_NO_ORDER = "api/Order/InsertNoOrder";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INSERT_ORDER_BOOKER_START = "api/OrderBooker/InsertOrderBookerStartDay";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INSERT_ORDER_BOOKER_END = "api/OrderBooker/InsertOrderBookerEndDay";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INSERT_STOCK_POSITIONING = "api/Outlet/InsertOutletStock";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INSERT_REPLACEMENT = "api/Item/InsertReplacement";
}