package com.fastservices.sams.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.fastservices.sams.modules.takeorder.OrderVM;

public abstract class FragmentSkuListBinding extends ViewDataBinding {
  @NonNull
  public final View bottomLayout;

  @NonNull
  public final TextView btnOrderSummary;

  @NonNull
  public final TextView emptyView;

  @NonNull
  public final EditText etFilter;

  @NonNull
  public final RecyclerView rvSKUs;

  @NonNull
  public final FrameLayout searchLayout;

  @NonNull
  public final TextView tvTotalPrice;

  @Bindable
  protected OrderVM mViewModel;

  protected FragmentSkuListBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, View bottomLayout, TextView btnOrderSummary, TextView emptyView,
      EditText etFilter, RecyclerView rvSKUs, FrameLayout searchLayout, TextView tvTotalPrice) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomLayout = bottomLayout;
    this.btnOrderSummary = btnOrderSummary;
    this.emptyView = emptyView;
    this.etFilter = etFilter;
    this.rvSKUs = rvSKUs;
    this.searchLayout = searchLayout;
    this.tvTotalPrice = tvTotalPrice;
  }

  public abstract void setViewModel(@Nullable OrderVM viewModel);

  @Nullable
  public OrderVM getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentSkuListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentSkuListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentSkuListBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_sku_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSkuListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentSkuListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentSkuListBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_sku_list, null, false, component);
  }

  public static FragmentSkuListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentSkuListBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentSkuListBinding)bind(component, view, com.fastservices.sams.R.layout.fragment_sku_list);
  }
}
