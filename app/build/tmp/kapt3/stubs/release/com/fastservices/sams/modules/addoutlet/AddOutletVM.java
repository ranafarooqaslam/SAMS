package com.fastservices.sams.modules.addoutlet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\fJ\u000e\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\fJ\u0006\u0010$\u001a\u00020 J\u0006\u0010%\u001a\u00020 J\u0006\u0010&\u001a\u00020 R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000e\u00a8\u0006("}, d2 = {"Lcom/fastservices/sams/modules/addoutlet/AddOutletVM;", "Lcom/fastservices/sams/modules/base/BaseVM;", "()V", "channels", "Ljava/util/ArrayList;", "Lcom/fastservices/sams/data/entities/Channel;", "getChannels", "()Ljava/util/ArrayList;", "setChannels", "(Ljava/util/ArrayList;)V", "dataLoaded", "Landroid/arch/lifecycle/MutableLiveData;", "", "getDataLoaded", "()Landroid/arch/lifecycle/MutableLiveData;", "outlet", "Lcom/fastservices/sams/data/entities/OutletLocal;", "getOutlet", "()Lcom/fastservices/sams/data/entities/OutletLocal;", "setOutlet", "(Lcom/fastservices/sams/data/entities/OutletLocal;)V", "sections", "Lcom/fastservices/sams/data/entities/Section;", "getSections", "subChannels", "Lcom/fastservices/sams/data/entities/SubChannel;", "getSubChannels", "setSubChannels", "submit", "", "getSubmit", "imageTaken", "", "fileUri", "removeFileUri", "uri", "ruralSelected", "submitRequest", "urbanSelected", "Companion", "app_release"})
public final class AddOutletVM extends com.fastservices.sams.modules.base.BaseVM {
    @org.jetbrains.annotations.NotNull()
    private com.fastservices.sams.data.entities.OutletLocal outlet;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.fastservices.sams.data.entities.Channel> channels;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.fastservices.sams.data.entities.SubChannel> subChannels;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> submit = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.String> dataLoaded = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.fastservices.sams.data.entities.Section> sections = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANNELS = "channels";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SECTIONS = "sections";
    public static final com.fastservices.sams.modules.addoutlet.AddOutletVM.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.data.entities.OutletLocal getOutlet() {
        return null;
    }
    
    public final void setOutlet(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.entities.OutletLocal p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.fastservices.sams.data.entities.Channel> getChannels() {
        return null;
    }
    
    public final void setChannels(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.fastservices.sams.data.entities.Channel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.fastservices.sams.data.entities.SubChannel> getSubChannels() {
        return null;
    }
    
    public final void setSubChannels(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.fastservices.sams.data.entities.SubChannel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getSubmit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.String> getDataLoaded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.fastservices.sams.data.entities.Section> getSections() {
        return null;
    }
    
    public final void submitRequest() {
    }
    
    public final void urbanSelected() {
    }
    
    public final void ruralSelected() {
    }
    
    public final void imageTaken(@org.jetbrains.annotations.Nullable()
    java.lang.String fileUri) {
    }
    
    public final void removeFileUri(@org.jetbrains.annotations.NotNull()
    java.lang.String uri) {
    }
    
    public AddOutletVM() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/fastservices/sams/modules/addoutlet/AddOutletVM$Companion;", "", "()V", "CHANNELS", "", "SECTIONS", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}