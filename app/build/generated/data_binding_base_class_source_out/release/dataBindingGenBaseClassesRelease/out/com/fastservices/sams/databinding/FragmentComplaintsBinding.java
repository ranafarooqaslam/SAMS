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
import com.fastservices.sams.modules.complaints.ComplaintsVM;

public abstract class FragmentComplaintsBinding extends ViewDataBinding {
  @NonNull
  public final View bottomLayout;

  @NonNull
  public final RecyclerView rvComplaintReasons;

  @NonNull
  public final TextView tvSelectedOutlet;

  @NonNull
  public final TextView tvSubmit;

  @Bindable
  protected ComplaintsVM mViewModel;

  protected FragmentComplaintsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, View bottomLayout, RecyclerView rvComplaintReasons,
      TextView tvSelectedOutlet, TextView tvSubmit) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomLayout = bottomLayout;
    this.rvComplaintReasons = rvComplaintReasons;
    this.tvSelectedOutlet = tvSelectedOutlet;
    this.tvSubmit = tvSubmit;
  }

  public abstract void setViewModel(@Nullable ComplaintsVM viewModel);

  @Nullable
  public ComplaintsVM getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentComplaintsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentComplaintsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentComplaintsBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_complaints, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentComplaintsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentComplaintsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentComplaintsBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_complaints, null, false, component);
  }

  public static FragmentComplaintsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentComplaintsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentComplaintsBinding)bind(component, view, com.fastservices.sams.R.layout.fragment_complaints);
  }
}
