package com.fastservices.sams.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fastservices.sams.modules.dashboard.DashboardVM;

public abstract class FragmentDashboardBinding extends ViewDataBinding {
  @NonNull
  public final View bottomLayout;

  @NonNull
  public final ConstraintLayout constraintLayout2;

  @NonNull
  public final TextView tvAddOutlet;

  @NonNull
  public final TextView tvDataSync;

  @NonNull
  public final TextView tvEndMyDay;

  @NonNull
  public final TextView tvMerchendising;

  @NonNull
  public final TextView tvOutletCompaint;

  @NonNull
  public final TextView tvStartMyDay;

  @NonNull
  public final TextView tvStockPositioning;

  @NonNull
  public final TextView tvStockReturn;

  @NonNull
  public final TextView tvTakeOrder;

  @NonNull
  public final TextView tvViewReport;

  @Bindable
  protected DashboardVM mViewModel;

  protected FragmentDashboardBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, View bottomLayout, ConstraintLayout constraintLayout2,
      TextView tvAddOutlet, TextView tvDataSync, TextView tvEndMyDay, TextView tvMerchendising,
      TextView tvOutletCompaint, TextView tvStartMyDay, TextView tvStockPositioning,
      TextView tvStockReturn, TextView tvTakeOrder, TextView tvViewReport) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomLayout = bottomLayout;
    this.constraintLayout2 = constraintLayout2;
    this.tvAddOutlet = tvAddOutlet;
    this.tvDataSync = tvDataSync;
    this.tvEndMyDay = tvEndMyDay;
    this.tvMerchendising = tvMerchendising;
    this.tvOutletCompaint = tvOutletCompaint;
    this.tvStartMyDay = tvStartMyDay;
    this.tvStockPositioning = tvStockPositioning;
    this.tvStockReturn = tvStockReturn;
    this.tvTakeOrder = tvTakeOrder;
    this.tvViewReport = tvViewReport;
  }

  public abstract void setViewModel(@Nullable DashboardVM viewModel);

  @Nullable
  public DashboardVM getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDashboardBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_dashboard, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDashboardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDashboardBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_dashboard, null, false, component);
  }

  public static FragmentDashboardBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentDashboardBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentDashboardBinding)bind(component, view, com.fastservices.sams.R.layout.fragment_dashboard);
  }
}
