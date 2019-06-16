package com.fastservices.sams.modules.merchandise;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u000bJ\u0006\u0010!\u001a\u00020\u001cR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\""}, d2 = {"Lcom/fastservices/sams/modules/merchandise/MerchandisingVM;", "Lcom/fastservices/sams/modules/base/BaseVM;", "()V", "merchandise", "Lcom/fastservices/sams/data/entities/Merchandise;", "getMerchandise", "()Lcom/fastservices/sams/data/entities/Merchandise;", "setMerchandise", "(Lcom/fastservices/sams/data/entities/Merchandise;)V", "merchandiseAdded", "Landroid/arch/lifecycle/MutableLiveData;", "", "getMerchandiseAdded", "()Landroid/arch/lifecycle/MutableLiveData;", "photosAfterMerchandise", "", "getPhotosAfterMerchandise", "()[Ljava/lang/String;", "[Ljava/lang/String;", "photosBeforeMerchandise", "getPhotosBeforeMerchandise", "selectedOutlet", "Lcom/fastservices/sams/data/entities/Outlet;", "getSelectedOutlet", "()Lcom/fastservices/sams/data/entities/Outlet;", "setSelectedOutlet", "(Lcom/fastservices/sams/data/entities/Outlet;)V", "imageTakenAfterMerchandising", "", "fileUri", "imageTakenBeforeMerchandising", "removeFileUri", "uri", "submitMerchandising", "app_release"})
public final class MerchandisingVM extends com.fastservices.sams.modules.base.BaseVM {
    @org.jetbrains.annotations.Nullable()
    private com.fastservices.sams.data.entities.Outlet selectedOutlet;
    @org.jetbrains.annotations.NotNull()
    private com.fastservices.sams.data.entities.Merchandise merchandise;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.String> merchandiseAdded = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String[] photosBeforeMerchandise = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String[] photosAfterMerchandise = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.fastservices.sams.data.entities.Outlet getSelectedOutlet() {
        return null;
    }
    
    public final void setSelectedOutlet(@org.jetbrains.annotations.Nullable()
    com.fastservices.sams.data.entities.Outlet p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.data.entities.Merchandise getMerchandise() {
        return null;
    }
    
    public final void setMerchandise(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.entities.Merchandise p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.String> getMerchandiseAdded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getPhotosBeforeMerchandise() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getPhotosAfterMerchandise() {
        return null;
    }
    
    public final void submitMerchandising() {
    }
    
    public final void imageTakenBeforeMerchandising(@org.jetbrains.annotations.Nullable()
    java.lang.String fileUri) {
    }
    
    public final void imageTakenAfterMerchandising(@org.jetbrains.annotations.Nullable()
    java.lang.String fileUri) {
    }
    
    public final void removeFileUri(@org.jetbrains.annotations.NotNull()
    java.lang.String uri) {
    }
    
    public MerchandisingVM() {
        super();
    }
}