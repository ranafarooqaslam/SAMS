package com.fastservices.sams.modules.takeorder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0001DB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020!H\u0003J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020#H\u0016J\n\u0010.\u001a\u0004\u0018\u00010/H\u0016J\"\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020,2\u0006\u00102\u001a\u00020,2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0012\u00105\u001a\u00020!2\b\u00106\u001a\u0004\u0018\u00010%H\u0016J\u0010\u00107\u001a\u00020!2\u0006\u00108\u001a\u000209H\u0016J/\u0010:\u001a\u00020!2\u0006\u00101\u001a\u00020,2\u000e\b\u0001\u0010;\u001a\b\u0012\u0004\u0012\u00020#0<2\b\b\u0001\u0010=\u001a\u00020>H\u0016\u00a2\u0006\u0002\u0010?J\b\u0010@\u001a\u00020!H\u0016J\b\u0010A\u001a\u00020!H\u0016J\b\u0010B\u001a\u00020!H\u0016J\b\u0010C\u001a\u00020!H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u0006E"}, d2 = {"Lcom/fastservices/sams/modules/takeorder/TakeOrderFragment;", "Lcom/fastservices/sams/modules/base/BaseFragment;", "Lcom/fastservices/sams/modules/takeorder/ClickListener;", "()V", "binding", "Lcom/fastservices/sams/databinding/FragmentTakeOrderBinding;", "getBinding", "()Lcom/fastservices/sams/databinding/FragmentTakeOrderBinding;", "setBinding", "(Lcom/fastservices/sams/databinding/FragmentTakeOrderBinding;)V", "categoriesAdapter", "Lcom/fastservices/sams/modules/takeorder/CategoryAdapter;", "filePickUtils", "Lcom/imagepicker/FilePickUtils;", "getFilePickUtils", "()Lcom/imagepicker/FilePickUtils;", "setFilePickUtils", "(Lcom/imagepicker/FilePickUtils;)V", "lifeCycleCallBackManager", "Lcom/imagepicker/LifeCycleCallBackManager;", "getLifeCycleCallBackManager", "()Lcom/imagepicker/LifeCycleCallBackManager;", "setLifeCycleCallBackManager", "(Lcom/imagepicker/LifeCycleCallBackManager;)V", "onFileChoose", "Lcom/imagepicker/FilePickUtils$OnFileChoose;", "viewModel", "Lcom/fastservices/sams/modules/takeorder/OrderVM;", "getViewModel", "()Lcom/fastservices/sams/modules/takeorder/OrderVM;", "setViewModel", "(Lcom/fastservices/sams/modules/takeorder/OrderVM;)V", "addImageViewToContainer", "", "fileUri", "", "doBinding", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "getGPSLocation", "getLayoutResId", "", "getTitle", "getVM", "Lcom/fastservices/sams/modules/base/BaseVM;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onClick", "v", "onItemClicked", "item", "Lcom/fastservices/sams/data/entities/Category;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "setObservers", "setUp", "setVM", "takePicture", "Companion", "app_debug"})
public final class TakeOrderFragment extends com.fastservices.sams.modules.base.BaseFragment implements com.fastservices.sams.modules.takeorder.ClickListener {
    @org.jetbrains.annotations.NotNull()
    public com.fastservices.sams.databinding.FragmentTakeOrderBinding binding;
    @org.jetbrains.annotations.NotNull()
    public com.fastservices.sams.modules.takeorder.OrderVM viewModel;
    private com.fastservices.sams.modules.takeorder.CategoryAdapter categoriesAdapter;
    private final com.imagepicker.FilePickUtils.OnFileChoose onFileChoose = null;
    @org.jetbrains.annotations.NotNull()
    public com.imagepicker.FilePickUtils filePickUtils;
    @org.jetbrains.annotations.NotNull()
    public com.imagepicker.LifeCycleCallBackManager lifeCycleCallBackManager;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARGS_OUTLET = "args_outlet";
    public static final com.fastservices.sams.modules.takeorder.TakeOrderFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.databinding.FragmentTakeOrderBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.databinding.FragmentTakeOrderBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.modules.takeorder.OrderVM getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.modules.takeorder.OrderVM p0) {
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
    public void setObservers() {
    }
    
    @java.lang.Override()
    public void onItemClicked(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.entities.Category item) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
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
    
    private final void addImageViewToContainer(java.lang.String fileUri) {
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
    
    public TakeOrderFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/fastservices/sams/modules/takeorder/TakeOrderFragment$Companion;", "", "()V", "ARGS_OUTLET", "", "newInstance", "Lcom/fastservices/sams/modules/takeorder/TakeOrderFragment;", "outlet", "Lcom/fastservices/sams/data/entities/Outlet;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.fastservices.sams.modules.takeorder.TakeOrderFragment newInstance(@org.jetbrains.annotations.NotNull()
        com.fastservices.sams.data.entities.Outlet outlet) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}