package com.fastservices.sams.modules.complaints;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0017"}, d2 = {"Lcom/fastservices/sams/modules/complaints/ComplaintsVM;", "Lcom/fastservices/sams/modules/base/BaseVM;", "()V", "complaintStatus", "Landroid/arch/lifecycle/MutableLiveData;", "", "getComplaintStatus", "()Landroid/arch/lifecycle/MutableLiveData;", "reasons", "Ljava/util/ArrayList;", "Lcom/fastservices/sams/data/entities/ComplaintReason;", "getReasons", "()Ljava/util/ArrayList;", "reasonsLoaded", "getReasonsLoaded", "selectedOutlet", "Lcom/fastservices/sams/data/entities/Outlet;", "getSelectedOutlet", "()Lcom/fastservices/sams/data/entities/Outlet;", "setSelectedOutlet", "(Lcom/fastservices/sams/data/entities/Outlet;)V", "submitComplaint", "", "app_debug"})
public final class ComplaintsVM extends com.fastservices.sams.modules.base.BaseVM {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.fastservices.sams.data.entities.ComplaintReason> reasons = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> reasonsLoaded = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> complaintStatus = null;
    @org.jetbrains.annotations.Nullable()
    private com.fastservices.sams.data.entities.Outlet selectedOutlet;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.fastservices.sams.data.entities.ComplaintReason> getReasons() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getReasonsLoaded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getComplaintStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fastservices.sams.data.entities.Outlet getSelectedOutlet() {
        return null;
    }
    
    public final void setSelectedOutlet(@org.jetbrains.annotations.Nullable()
    com.fastservices.sams.data.entities.Outlet p0) {
    }
    
    public final void submitComplaint() {
    }
    
    public ComplaintsVM() {
        super();
    }
}