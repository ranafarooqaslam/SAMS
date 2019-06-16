package com.fastservices.sams.modules.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0006\u0010\u0015\u001a\u00020\u000fJ\u0012\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/fastservices/sams/modules/login/LoginActivity;", "Lcom/fastservices/sams/modules/base/BaseActivity;", "Landroid/view/View$OnClickListener;", "()V", "binding", "Lcom/fastservices/sams/databinding/ActivityLoginBinding;", "getBinding", "()Lcom/fastservices/sams/databinding/ActivityLoginBinding;", "setBinding", "(Lcom/fastservices/sams/databinding/ActivityLoginBinding;)V", "viewModel", "Lcom/fastservices/sams/modules/login/LoginVM;", "getViewModel", "Lcom/fastservices/sams/modules/base/BaseVM;", "onClick", "", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openMainActivity", "setUp", "Companion", "app_debug"})
public final class LoginActivity extends com.fastservices.sams.modules.base.BaseActivity implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    public com.fastservices.sams.databinding.ActivityLoginBinding binding;
    private com.fastservices.sams.modules.login.LoginVM viewModel;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EXTRA_LOGO = "logo";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EXTRA_BACKGROUND_IMAGE = "background_image";
    public static final com.fastservices.sams.modules.login.LoginActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.databinding.ActivityLoginBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.databinding.ActivityLoginBinding p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void setUp(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.fastservices.sams.modules.base.BaseVM getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    public final void openMainActivity() {
    }
    
    public LoginActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/fastservices/sams/modules/login/LoginActivity$Companion;", "", "()V", "EXTRA_BACKGROUND_IMAGE", "", "getEXTRA_BACKGROUND_IMAGE", "()Ljava/lang/String;", "EXTRA_LOGO", "getEXTRA_LOGO", "getIntent", "Landroid/content/Intent;", "applicationContext", "Landroid/content/Context;", "clientInfo", "Lcom/fastservices/sams/data/models/ClientInfo;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEXTRA_LOGO() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEXTRA_BACKGROUND_IMAGE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context applicationContext, @org.jetbrains.annotations.NotNull()
        com.fastservices.sams.data.models.ClientInfo clientInfo) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}