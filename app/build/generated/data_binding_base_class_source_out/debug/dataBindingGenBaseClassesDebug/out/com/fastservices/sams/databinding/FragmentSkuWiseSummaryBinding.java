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
import android.widget.TextView;
import com.fastservices.sams.modules.skuwise.SKUWiseVM;

public abstract class FragmentSkuWiseSummaryBinding extends ViewDataBinding {
  @NonNull
  public final TextView lblSKUAmount;

  @NonNull
  public final TextView lblSKUQty;

  @NonNull
  public final TextView lblSkuName;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final TextView tvTotal;

  @NonNull
  public final TextView tvTotalAmount;

  @NonNull
  public final TextView tvTotalQty;

  @Bindable
  protected SKUWiseVM mViewModel;

  protected FragmentSkuWiseSummaryBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView lblSKUAmount, TextView lblSKUQty, TextView lblSkuName,
      RecyclerView recyclerView, TextView tvTotal, TextView tvTotalAmount, TextView tvTotalQty) {
    super(_bindingComponent, _root, _localFieldCount);
    this.lblSKUAmount = lblSKUAmount;
    this.lblSKUQty = lblSKUQty;
    this.lblSkuName = lblSkuName;
    this.recyclerView = recyclerView;
    this.tvTotal = tvTotal;
    this.tvTotalAmount = tvTotalAmount;
    this.tvTotalQty = tvTotalQty;
  }

  public abstract void setViewModel(@Nullable SKUWiseVM viewModel);

  @Nullable
  public SKUWiseVM getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentSkuWiseSummaryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentSkuWiseSummaryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentSkuWiseSummaryBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_sku_wise_summary, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSkuWiseSummaryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentSkuWiseSummaryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentSkuWiseSummaryBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_sku_wise_summary, null, false, component);
  }

  public static FragmentSkuWiseSummaryBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentSkuWiseSummaryBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentSkuWiseSummaryBinding)bind(component, view, com.fastservices.sams.R.layout.fragment_sku_wise_summary);
  }
}
