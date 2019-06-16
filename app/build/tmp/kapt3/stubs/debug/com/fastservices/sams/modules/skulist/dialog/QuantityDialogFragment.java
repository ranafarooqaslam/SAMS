package com.fastservices.sams.modules.skulist.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010\u001c2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0006\u0010\'\u001a\u00020\u001aR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\t\u00a8\u0006)"}, d2 = {"Lcom/fastservices/sams/modules/skulist/dialog/QuantityDialogFragment;", "Landroid/support/v4/app/DialogFragment;", "Landroid/view/View$OnClickListener;", "()V", "cartons", "", "getCartons", "()I", "setCartons", "(I)V", "initialCartons", "getInitialCartons", "setInitialCartons", "initialUnits", "getInitialUnits", "setInitialUnits", "item", "Lcom/fastservices/sams/data/entities/SKU;", "getItem", "()Lcom/fastservices/sams/data/entities/SKU;", "setItem", "(Lcom/fastservices/sams/data/entities/SKU;)V", "units", "getUnits", "setUnits", "onClick", "", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "saveCounts", "Companion", "app_debug"})
public final class QuantityDialogFragment extends android.support.v4.app.DialogFragment implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    public com.fastservices.sams.data.entities.SKU item;
    private int units;
    private int cartons;
    private int initialUnits;
    private int initialCartons;
    public static final int RESULT_DATA_CHANGED = 4;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SKU = "extra_sku_item";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_UNITS = "ex_units";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_CARTONS = "ex_cartons";
    public static final com.fastservices.sams.modules.skulist.dialog.QuantityDialogFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.data.entities.SKU getItem() {
        return null;
    }
    
    public final void setItem(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.entities.SKU p0) {
    }
    
    public final int getUnits() {
        return 0;
    }
    
    public final void setUnits(int p0) {
    }
    
    public final int getCartons() {
        return 0;
    }
    
    public final void setCartons(int p0) {
    }
    
    public final int getInitialUnits() {
        return 0;
    }
    
    public final void setInitialUnits(int p0) {
    }
    
    public final int getInitialCartons() {
        return 0;
    }
    
    public final void setInitialCartons(int p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
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
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    public final void saveCounts() {
    }
    
    public QuantityDialogFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/fastservices/sams/modules/skulist/dialog/QuantityDialogFragment$Companion;", "", "()V", "EXTRA_CARTONS", "", "EXTRA_SKU", "EXTRA_UNITS", "RESULT_DATA_CHANGED", "", "newInstance", "Lcom/fastservices/sams/modules/skulist/dialog/QuantityDialogFragment;", "item", "Lcom/fastservices/sams/data/entities/SKU;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.fastservices.sams.modules.skulist.dialog.QuantityDialogFragment newInstance(@org.jetbrains.annotations.NotNull()
        com.fastservices.sams.data.entities.SKU item) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}