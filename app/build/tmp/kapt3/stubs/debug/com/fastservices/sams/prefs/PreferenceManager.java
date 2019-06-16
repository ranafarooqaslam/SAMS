package com.fastservices.sams.prefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006J\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0014\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0015J\u0010\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u001b\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u000e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0006J\u000e\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0013J\u000e\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0006J\u000e\u0010$\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0013J\u0006\u0010%\u001a\u00020\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/fastservices/sams/prefs/PreferenceManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "KEY_AUTH_CODE", "", "KEY_DOCUMENT_DATE", "KEY_LAST_SYNC", "KEY_LOGIN_COMPLETE", "KEY_TOKEN", "KEY_USER", "preferences", "Landroid/content/SharedPreferences;", "getClientCode", "getDocumentDate", "getLastSync", "getToken", "getUser", "Lcom/fastservices/sams/data/models/UserInfo;", "hasUserLoggedIn", "", "", "signedIn", "logout", "saveClientCode", "code", "saveClientInfo", "clientInfo", "Lcom/fastservices/sams/data/models/ClientInfo;", "saveDocumentDate", "startDayDateTime", "saveMenu", "user", "saveToken", "token", "saveUser", "updateLastSync", "Companion", "app_debug"})
public final class PreferenceManager {
    private android.content.SharedPreferences preferences;
    private final java.lang.String KEY_USER = "user";
    private final java.lang.String KEY_TOKEN = "access_token";
    private final java.lang.String KEY_AUTH_CODE = "client_code";
    private final java.lang.String KEY_LAST_SYNC = "last_sync_millis";
    private final java.lang.String KEY_LOGIN_COMPLETE = "login_completed";
    private final java.lang.String KEY_DOCUMENT_DATE = "doc_date";
    private static com.fastservices.sams.prefs.PreferenceManager instance;
    public static final com.fastservices.sams.prefs.PreferenceManager.Companion Companion = null;
    
    public final boolean saveUser(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.models.UserInfo user) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fastservices.sams.data.models.UserInfo getUser() {
        return null;
    }
    
    public final boolean saveClientCode(@org.jetbrains.annotations.Nullable()
    java.lang.String code) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClientCode() {
        return null;
    }
    
    public final boolean logout() {
        return false;
    }
    
    public final boolean saveClientInfo(@org.jetbrains.annotations.Nullable()
    com.fastservices.sams.data.models.ClientInfo clientInfo) {
        return false;
    }
    
    public final boolean saveToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final boolean saveMenu(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.models.UserInfo user) {
        return false;
    }
    
    public final void updateLastSync() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastSync() {
        return null;
    }
    
    public final void hasUserLoggedIn(boolean signedIn) {
    }
    
    public final boolean hasUserLoggedIn() {
        return false;
    }
    
    public final void saveDocumentDate(@org.jetbrains.annotations.NotNull()
    java.lang.String startDayDateTime) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDocumentDate() {
        return null;
    }
    
    private PreferenceManager(android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/fastservices/sams/prefs/PreferenceManager$Companion;", "", "()V", "instance", "Lcom/fastservices/sams/prefs/PreferenceManager;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.fastservices.sams.prefs.PreferenceManager getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}