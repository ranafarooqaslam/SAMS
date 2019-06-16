package com.fastservices.sams.modules.addoutlet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001;B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0003J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0005H\u0016J\n\u0010%\u001a\u0004\u0018\u00010&H\u0016J\"\u0010\'\u001a\u00020!2\u0006\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020#2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0012\u0010,\u001a\u00020!2\b\u0010-\u001a\u0004\u0018\u00010\u001bH\u0016J/\u0010.\u001a\u00020!2\u0006\u0010(\u001a\u00020#2\u000e\b\u0001\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0005002\b\b\u0001\u00101\u001a\u000202H\u0016\u00a2\u0006\u0002\u00103J\b\u00104\u001a\u00020!H\u0002J\b\u00105\u001a\u00020!H\u0002J\u0006\u00106\u001a\u00020!J\b\u00107\u001a\u00020!H\u0016J\b\u00108\u001a\u00020!H\u0016J\b\u00109\u001a\u00020!H\u0016J\b\u0010:\u001a\u00020!H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lcom/fastservices/sams/modules/addoutlet/AddOutletFragment;", "Lcom/fastservices/sams/modules/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "binding", "Lcom/fastservices/sams/databinding/FragmentAddOutletBinding;", "filePickUtils", "Lcom/imagepicker/FilePickUtils;", "getFilePickUtils", "()Lcom/imagepicker/FilePickUtils;", "setFilePickUtils", "(Lcom/imagepicker/FilePickUtils;)V", "lifeCycleCallBackManager", "Lcom/imagepicker/LifeCycleCallBackManager;", "getLifeCycleCallBackManager", "()Lcom/imagepicker/LifeCycleCallBackManager;", "setLifeCycleCallBackManager", "(Lcom/imagepicker/LifeCycleCallBackManager;)V", "onFileChoose", "Lcom/imagepicker/FilePickUtils$OnFileChoose;", "viewModel", "Lcom/fastservices/sams/modules/addoutlet/AddOutletVM;", "doBinding", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "getGPSLocation", "", "getLayoutResId", "", "getTitle", "getVM", "Lcom/fastservices/sams/modules/base/BaseVM;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onClick", "v", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "populateChannel", "populateSections", "populateSubChannels", "setObservers", "setUp", "setVM", "takePicture", "Companion", "app_debug"})
public final class AddOutletFragment extends com.fastservices.sams.modules.base.BaseFragment implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "AddOutletFragment";
    private com.fastservices.sams.modules.addoutlet.AddOutletVM viewModel;
    private com.fastservices.sams.databinding.FragmentAddOutletBinding binding;
    private final com.imagepicker.FilePickUtils.OnFileChoose onFileChoose = null;
    @org.jetbrains.annotations.NotNull()
    public com.imagepicker.FilePickUtils filePickUtils;
    @org.jetbrains.annotations.NotNull()
    public com.imagepicker.LifeCycleCallBackManager lifeCycleCallBackManager;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MAPS_API_KEY = "AIzaSyDaZG2HhTFBIrjJxsrVipT4f466uvJNGFE";
    public static final com.fastservices.sams.modules.addoutlet.AddOutletFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View doBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
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
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.fastservices.sams.modules.base.BaseVM getVM() {
        return null;
    }
    
    @java.lang.Override()
    public void setVM() {
    }
    
    @java.lang.Override()
    public void setObservers() {
    }
    
    private final void populateChannel() {
    }
    
    private final void populateSections() {
    }
    
    public final void populateSubChannels() {
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
    
    public AddOutletFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/fastservices/sams/modules/addoutlet/AddOutletFragment$Companion;", "", "()V", "MAPS_API_KEY", "", "newInstance", "Lcom/fastservices/sams/modules/addoutlet/AddOutletFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.fastservices.sams.modules.addoutlet.AddOutletFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}