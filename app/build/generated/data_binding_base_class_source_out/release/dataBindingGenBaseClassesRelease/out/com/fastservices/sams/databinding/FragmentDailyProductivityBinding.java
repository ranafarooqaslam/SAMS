package com.fastservices.sams.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fastservices.sams.modules.dailyproductivity.DPViewModel;

public abstract class FragmentDailyProductivityBinding extends ViewDataBinding {
  @NonNull
  public final TextView lblAvgSKU;

  @NonNull
  public final TextView lblAvgSKU2;

  @NonNull
  public final TextView lblNonVisitedOutlet;

  @NonNull
  public final TextView lblProductiveOutlets;

  @NonNull
  public final TextView lblScheduledOutlets;

  @NonNull
  public final TextView lblTotalNetAmount;

  @NonNull
  public final TextView lblTotalSKUs;

  @NonNull
  public final TextView lblVisitedOutlets;

  @NonNull
  public final TextView tvAvgSKU;

  @NonNull
  public final TextView tvAvgSKU2;

  @NonNull
  public final TextView tvNonVisitedOutlet;

  @NonNull
  public final TextView tvProductiveOutlets;

  @NonNull
  public final TextView tvScheduledOutlets;

  @NonNull
  public final TextView tvTotalNetAmount;

  @NonNull
  public final TextView tvTotalSKUs;

  @NonNull
  public final TextView tvVisitedOutlets;

  @Bindable
  protected DPViewModel mViewModel;

  protected FragmentDailyProductivityBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView lblAvgSKU, TextView lblAvgSKU2, TextView lblNonVisitedOutlet,
      TextView lblProductiveOutlets, TextView lblScheduledOutlets, TextView lblTotalNetAmount,
      TextView lblTotalSKUs, TextView lblVisitedOutlets, TextView tvAvgSKU, TextView tvAvgSKU2,
      TextView tvNonVisitedOutlet, TextView tvProductiveOutlets, TextView tvScheduledOutlets,
      TextView tvTotalNetAmount, TextView tvTotalSKUs, TextView tvVisitedOutlets) {
    super(_bindingComponent, _root, _localFieldCount);
    this.lblAvgSKU = lblAvgSKU;
    this.lblAvgSKU2 = lblAvgSKU2;
    this.lblNonVisitedOutlet = lblNonVisitedOutlet;
    this.lblProductiveOutlets = lblProductiveOutlets;
    this.lblScheduledOutlets = lblScheduledOutlets;
    this.lblTotalNetAmount = lblTotalNetAmount;
    this.lblTotalSKUs = lblTotalSKUs;
    this.lblVisitedOutlets = lblVisitedOutlets;
    this.tvAvgSKU = tvAvgSKU;
    this.tvAvgSKU2 = tvAvgSKU2;
    this.tvNonVisitedOutlet = tvNonVisitedOutlet;
    this.tvProductiveOutlets = tvProductiveOutlets;
    this.tvScheduledOutlets = tvScheduledOutlets;
    this.tvTotalNetAmount = tvTotalNetAmount;
    this.tvTotalSKUs = tvTotalSKUs;
    this.tvVisitedOutlets = tvVisitedOutlets;
  }

  public abstract void setViewModel(@Nullable DPViewModel viewModel);

  @Nullable
  public DPViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentDailyProductivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDailyProductivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDailyProductivityBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_daily_productivity, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDailyProductivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDailyProductivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDailyProductivityBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_daily_productivity, null, false, component);
  }

  public static FragmentDailyProductivityBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentDailyProductivityBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentDailyProductivityBinding)bind(component, view, com.fastservices.sams.R.layout.fragment_daily_productivity);
  }
}
