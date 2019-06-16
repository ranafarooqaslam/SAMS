package com.fastservices.sams.modules.outlet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 +2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0018H\u0016J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0018H\u0016J&\u0010#\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u001eH\u0016J\b\u0010\'\u001a\u00020\u001eH\u0002J\b\u0010(\u001a\u00020\u001eH\u0016J\b\u0010)\u001a\u00020\u001eH\u0016J\b\u0010*\u001a\u00020\u001eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/fastservices/sams/modules/outlet/OutletFragment;", "Lcom/fastservices/sams/modules/base/BaseFragment;", "Lcom/fastservices/sams/modules/outlet/ClickListener;", "Landroid/view/View$OnClickListener;", "()V", "binding", "Lcom/fastservices/sams/databinding/FragmentOutletBinding;", "outletsAdapter", "Lcom/fastservices/sams/modules/outlet/OutletsAdapter;", "getOutletsAdapter", "()Lcom/fastservices/sams/modules/outlet/OutletsAdapter;", "setOutletsAdapter", "(Lcom/fastservices/sams/modules/outlet/OutletsAdapter;)V", "sectionPopup", "Landroid/widget/PopupMenu;", "viewModel", "Lcom/fastservices/sams/modules/outlet/OutletsVM;", "doBinding", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "getLayoutResId", "", "getTitle", "", "getVM", "Lcom/fastservices/sams/modules/base/BaseVM;", "onClick", "", "v", "onClickItem", "position", "onClickedUnOrderAtPosition", "onCreateView", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "populateSectionSpinner", "setObservers", "setUp", "setVM", "Companion", "app_debug"})
public class OutletFragment extends com.fastservices.sams.modules.base.BaseFragment implements com.fastservices.sams.modules.outlet.ClickListener, android.view.View.OnClickListener {
    @org.jetbrains.annotations.Nullable()
    private com.fastservices.sams.modules.outlet.OutletsAdapter outletsAdapter;
    private com.fastservices.sams.modules.outlet.OutletsVM viewModel;
    private com.fastservices.sams.databinding.FragmentOutletBinding binding;
    private android.widget.PopupMenu sectionPopup;
    public static final com.fastservices.sams.modules.outlet.OutletFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.fastservices.sams.modules.outlet.OutletsAdapter getOutletsAdapter() {
        return null;
    }
    
    public final void setOutletsAdapter(@org.jetbrains.annotations.Nullable()
    com.fastservices.sams.modules.outlet.OutletsAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
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
    public void onResume() {
    }
    
    @java.lang.Override()
    public void setObservers() {
    }
    
    private final void populateSectionSpinner() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public void onClickedUnOrderAtPosition(int position) {
    }
    
    @java.lang.Override()
    public void onClickItem(int position) {
    }
    
    public OutletFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/fastservices/sams/modules/outlet/OutletFragment$Companion;", "", "()V", "newInstance", "Lcom/fastservices/sams/modules/outlet/OutletFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.fastservices.sams.modules.outlet.OutletFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}