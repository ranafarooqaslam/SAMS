package com.fastservices.sams.modules.skulist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\"\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010 \u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\"\u001a\u00020\u001bH\u0016J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u001bH\u0016J\b\u0010\'\u001a\u00020\u001bH\u0016J\b\u0010(\u001a\u00020\u001bH\u0016J\b\u0010)\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006+"}, d2 = {"Lcom/fastservices/sams/modules/skulist/SkuListFragment;", "Lcom/fastservices/sams/modules/base/BaseFragment;", "Lcom/fastservices/sams/modules/skulist/ClickListener;", "()V", "activityViewModel", "Lcom/fastservices/sams/modules/takeorder/OrderVM;", "adapter", "Lcom/fastservices/sams/modules/skulist/SkuAdapter;", "binding", "Lcom/fastservices/sams/databinding/FragmentSkuListBinding;", "getBinding", "()Lcom/fastservices/sams/databinding/FragmentSkuListBinding;", "setBinding", "(Lcom/fastservices/sams/databinding/FragmentSkuListBinding;)V", "doBinding", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "getLayoutResId", "", "getTitle", "", "getVM", "Lcom/fastservices/sams/modules/base/BaseVM;", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onClick", "v", "onDetach", "onItemClicked", "item", "Lcom/fastservices/sams/data/entities/SKU;", "onPause", "setObservers", "setUp", "setVM", "Companion", "app_release"})
public final class SkuListFragment extends com.fastservices.sams.modules.base.BaseFragment implements com.fastservices.sams.modules.skulist.ClickListener {
    @org.jetbrains.annotations.NotNull()
    public com.fastservices.sams.databinding.FragmentSkuListBinding binding;
    private com.fastservices.sams.modules.skulist.SkuAdapter adapter;
    private com.fastservices.sams.modules.takeorder.OrderVM activityViewModel;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARGS_CATEGORY = "args_categoruy";
    public static final com.fastservices.sams.modules.skulist.SkuListFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.databinding.FragmentSkuListBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.databinding.FragmentSkuListBinding p0) {
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
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onItemClicked(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.entities.SKU item) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    public SkuListFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/fastservices/sams/modules/skulist/SkuListFragment$Companion;", "", "()V", "ARGS_CATEGORY", "", "newInstance", "Lcom/fastservices/sams/modules/skulist/SkuListFragment;", "category", "Lcom/fastservices/sams/data/entities/Category;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.fastservices.sams.modules.skulist.SkuListFragment newInstance(@org.jetbrains.annotations.NotNull()
        com.fastservices.sams.data.entities.Category category) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}