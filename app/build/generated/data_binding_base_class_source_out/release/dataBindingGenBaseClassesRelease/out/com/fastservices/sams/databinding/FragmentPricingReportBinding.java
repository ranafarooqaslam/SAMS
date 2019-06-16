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
import com.fastservices.sams.modules.pricing.PricingVM;
import fr.ganfra.materialspinner.MaterialSpinner;

public abstract class FragmentPricingReportBinding extends ViewDataBinding {
  @NonNull
  public final TextView lblSKURetail;

  @NonNull
  public final TextView lblSKUTrade;

  @NonNull
  public final TextView lblSkuName;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final MaterialSpinner spCategory;

  @Bindable
  protected PricingVM mViewModel;

  protected FragmentPricingReportBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView lblSKURetail, TextView lblSKUTrade, TextView lblSkuName,
      RecyclerView recyclerView, MaterialSpinner spCategory) {
    super(_bindingComponent, _root, _localFieldCount);
    this.lblSKURetail = lblSKURetail;
    this.lblSKUTrade = lblSKUTrade;
    this.lblSkuName = lblSkuName;
    this.recyclerView = recyclerView;
    this.spCategory = spCategory;
  }

  public abstract void setViewModel(@Nullable PricingVM viewModel);

  @Nullable
  public PricingVM getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentPricingReportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentPricingReportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentPricingReportBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_pricing_report, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPricingReportBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentPricingReportBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentPricingReportBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_pricing_report, null, false, component);
  }

  public static FragmentPricingReportBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentPricingReportBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentPricingReportBinding)bind(component, view, com.fastservices.sams.R.layout.fragment_pricing_report);
  }
}
