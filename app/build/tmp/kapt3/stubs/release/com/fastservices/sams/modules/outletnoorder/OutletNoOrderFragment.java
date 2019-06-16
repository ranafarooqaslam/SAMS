package com.fastservices.sams.modules.outletnoorder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001<B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020$H\u0003J\b\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020(H\u0016J\n\u0010)\u001a\u0004\u0018\u00010*H\u0016J\"\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020&2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0012\u00100\u001a\u00020$2\b\u00101\u001a\u0004\u0018\u00010\u001eH\u0016J/\u00102\u001a\u00020$2\u0006\u0010,\u001a\u00020&2\u000e\b\u0001\u00103\u001a\b\u0012\u0004\u0012\u00020(042\b\b\u0001\u00105\u001a\u000206H\u0016\u00a2\u0006\u0002\u00107J\b\u00108\u001a\u00020$H\u0016J\b\u00109\u001a\u00020$H\u0016J\b\u0010:\u001a\u00020$H\u0016J\b\u0010;\u001a\u00020$H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006="}, d2 = {"Lcom/fastservices/sams/modules/outletnoorder/OutletNoOrderFragment;", "Lcom/fastservices/sams/modules/base/BaseFragment;", "()V", "binding", "Lcom/fastservices/sams/databinding/FragmentOutletNoOrderBinding;", "getBinding", "()Lcom/fastservices/sams/databinding/FragmentOutletNoOrderBinding;", "setBinding", "(Lcom/fastservices/sams/databinding/FragmentOutletNoOrderBinding;)V", "filePickUtils", "Lcom/imagepicker/FilePickUtils;", "getFilePickUtils", "()Lcom/imagepicker/FilePickUtils;", "setFilePickUtils", "(Lcom/imagepicker/FilePickUtils;)V", "lifeCycleCallBackManager", "Lcom/imagepicker/LifeCycleCallBackManager;", "getLifeCycleCallBackManager", "()Lcom/imagepicker/LifeCycleCallBackManager;", "setLifeCycleCallBackManager", "(Lcom/imagepicker/LifeCycleCallBackManager;)V", "onFileChoose", "Lcom/imagepicker/FilePickUtils$OnFileChoose;", "viewModel", "Lcom/fastservices/sams/modules/outletnoorder/OutletNoOrderVM;", "getViewModel", "()Lcom/fastservices/sams/modules/outletnoorder/OutletNoOrderVM;", "setViewModel", "(Lcom/fastservices/sams/modules/outletnoorder/OutletNoOrderVM;)V", "doBinding", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "getGPSLocation", "", "getLayoutResId", "", "getTitle", "", "getVM", "Lcom/fastservices/sams/modules/base/BaseVM;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onClick", "v", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "setObservers", "setUp", "setVM", "takePicture", "Companion", "app_release"})
public final class OutletNoOrderFragment extends com.fastservices.sams.modules.base.BaseFragment {
    @org.jetbrains.annotations.NotNull()
    public com.fastservices.sams.databinding.FragmentOutletNoOrderBinding binding;
    @org.jetbrains.annotations.NotNull()
    public com.fastservices.sams.modules.outletnoorder.OutletNoOrderVM viewModel;
    private final com.imagepicker.FilePickUtils.OnFileChoose onFileChoose = null;
    @org.jetbrains.annotations.NotNull()
    public com.imagepicker.FilePickUtils filePickUtils;
    @org.jetbrains.annotations.NotNull()
    public com.imagepicker.LifeCycleCallBackManager lifeCycleCallBackManager;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARGS_OUTLET = "args_outlet";
    public static final com.fastservices.sams.modules.outletnoorder.OutletNoOrderFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.databinding.FragmentOutletNoOrderBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.databinding.FragmentOutletNoOrderBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.modules.outletnoorder.OutletNoOrderVM getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.modules.outletnoorder.OutletNoOrderVM p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View doBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.fastservices.sams.modules.base.BaseVM getVM() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTitle() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutResId() {
        return 0;
    }
    
    @java.lang.Override()
    public void setUp() {
    }
    
    @java.lang.Override()
    public void setVM() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public void setObservers() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.imagepicker.FilePickUtils getFilePickUtils() {
        return null;
    }
    
    public final void setFilePickUtils(@org.jetbrains.annotations.NotNull()
    com.imagepicker.FilePickUtils p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.imagepicker.LifeCycleCallBackManager getLifeCycleCallBackManager() {
        return null;
    }
    
    public final void setLifeCycleCallBackManager(@org.jetbrains.annotations.NotNull()
    com.imagepicker.LifeCycleCallBackManager p0) {
    }
    
    private final void takePicture() {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    private final void getGPSLocation() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    @io.reactivex.annotations.NonNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    @io.reactivex.annotations.NonNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public OutletNoOrderFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/fastservices/sams/modules/outletnoorder/OutletNoOrderFragment$Companion;", "", "()V", "ARGS_OUTLET", "", "newInstance", "Lcom/fastservices/sams/modules/outletnoorder/OutletNoOrderFragment;", "outlet", "Lcom/fastservices/sams/data/entities/Outlet;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.fastservices.sams.modules.outletnoorder.OutletNoOrderFragment newInstance(@org.jetbrains.annotations.NotNull()
        com.fastservices.sams.data.entities.Outlet outlet) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}