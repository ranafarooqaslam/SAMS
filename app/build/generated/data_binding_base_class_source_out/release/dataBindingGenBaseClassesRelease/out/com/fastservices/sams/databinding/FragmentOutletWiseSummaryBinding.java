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
import com.fastservices.sams.modules.outletwise.OutletWiseVM;

public abstract class FragmentOutletWiseSummaryBinding extends ViewDataBinding {
  @NonNull
  public final TextView lblNetAmount;

  @NonNull
  public final TextView lblOutletCode;

  @NonNull
  public final TextView lblOutletName;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final TextView tvTotal;

  @NonNull
  public final TextView tvTotalAmount;

  @Bindable
  protected OutletWiseVM mViewModel;

  protected FragmentOutletWiseSummaryBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView lblNetAmount, TextView lblOutletCode, TextView lblOutletName,
      RecyclerView recyclerView, TextView tvTotal, TextView tvTotalAmount) {
    super(_bindingComponent, _root, _localFieldCount);
    this.lblNetAmount = lblNetAmount;
    this.lblOutletCode = lblOutletCode;
    this.lblOutletName = lblOutletName;
    this.recyclerView = recyclerView;
    this.tvTotal = tvTotal;
    this.tvTotalAmount = tvTotalAmount;
  }

  public abstract void setViewModel(@Nullable OutletWiseVM viewModel);

  @Nullable
  public OutletWiseVM getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentOutletWiseSummaryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentOutletWiseSummaryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentOutletWiseSummaryBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_outlet_wise_summary, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentOutletWiseSummaryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentOutletWiseSummaryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentOutletWiseSummaryBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_outlet_wise_summary, null, false, component);
  }

  public static FragmentOutletWiseSummaryBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentOutletWiseSummaryBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentOutletWiseSummaryBinding)bind(component, view, com.fastservices.sams.R.layout.fragment_outlet_wise_summary);
  }
}
