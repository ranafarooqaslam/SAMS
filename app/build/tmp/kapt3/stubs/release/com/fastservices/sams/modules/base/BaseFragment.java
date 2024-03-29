package com.fastservices.sams.modules.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u000bH\'J\b\u0010\f\u001a\u00020\rH&J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0011H&J\b\u0010\u001a\u001a\u00020\u0011H&J\b\u0010\u001b\u001a\u00020\u0011H&J\u0010\u0010\u001c\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\rJ\b\u0010\u001e\u001a\u00020\u0011H\u0002J\b\u0010\u001f\u001a\u00020\u0011H\u0002J\u0010\u0010 \u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\r\u00a8\u0006\""}, d2 = {"Lcom/fastservices/sams/modules/base/BaseFragment;", "Landroid/support/v4/app/Fragment;", "Landroid/view/View$OnClickListener;", "()V", "doBinding", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "getLayoutResId", "", "getTitle", "", "getVM", "Lcom/fastservices/sams/modules/base/BaseVM;", "hideProgressDialog", "", "onClick", "v", "onCreateView", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setObservers", "setUp", "setVM", "showDialog", "message", "showPopupMenu", "showProgressDialog", "showToast", "text", "app_release"})
public abstract class BaseFragment extends android.support.v4.app.Fragment implements android.view.View.OnClickListener {
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.view.View doBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container);
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.fastservices.sams.modules.base.BaseVM getVM();
    
    public abstract void setObservers();
    
    public abstract void setVM();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getTitle();
    
    @android.support.annotation.LayoutRes()
    public abstract int getLayoutResId();
    
    public abstract void setUp();
    
    private final void showProgressDialog() {
    }
    
    private final void hideProgressDialog() {
    }
    
    public final void showToast(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    public final void showDialog(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void showPopupMenu() {
    }
    
    public BaseFragment() {
        super();
    }
}