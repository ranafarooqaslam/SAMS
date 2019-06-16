package com.fastservices.sams.modules.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\n\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u0006\u0010\r\u001a\u00020\u0006J\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0016\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u0012\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0006J\u0010\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/fastservices/sams/modules/base/BaseActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "progressDialog", "Landroid/app/AlertDialog;", "addFragment", "", "fragment", "Lcom/fastservices/sams/modules/base/BaseFragment;", "addToBackStack", "", "getViewModel", "Lcom/fastservices/sams/modules/base/BaseVM;", "hideProgressDialog", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "replaceFragment", "setUp", "showDialog", "message", "", "showProgressDialog", "showToast", "text", "app_debug"})
public abstract class BaseActivity extends android.support.v7.app.AppCompatActivity {
    private android.app.AlertDialog progressDialog;
    private java.util.HashMap _$_findViewCache;
    
    public abstract void setUp(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState);
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void showProgressDialog() {
    }
    
    public final void hideProgressDialog() {
    }
    
    public final void showToast(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    public final void showDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.fastservices.sams.modules.base.BaseVM getViewModel();
    
    public final void replaceFragment(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.modules.base.BaseFragment fragment, boolean addToBackStack) {
    }
    
    public final void addFragment(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.modules.base.BaseFragment fragment, boolean addToBackStack) {
    }
    
    public BaseActivity() {
        super();
    }
}