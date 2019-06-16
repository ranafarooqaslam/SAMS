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
import android.widget.ImageView;
import android.widget.TextView;
import com.fastservices.sams.modules.sync.SyncVM;

public abstract class FragmentSyncBinding extends ViewDataBinding {
  @NonNull
  public final View bottomLayout;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final TextView lblLastSync;

  @NonNull
  public final TextView syncDescritpion;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView tvLastSync;

  @NonNull
  public final TextView tvSync;

  @Bindable
  protected SyncVM mViewModel;

  protected FragmentSyncBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, View bottomLayout, ImageView imageView2, TextView lblLastSync,
      TextView syncDescritpion, TextView textView3, TextView tvLastSync, TextView tvSync) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomLayout = bottomLayout;
    this.imageView2 = imageView2;
    this.lblLastSync = lblLastSync;
    this.syncDescritpion = syncDescritpion;
    this.textView3 = textView3;
    this.tvLastSync = tvLastSync;
    this.tvSync = tvSync;
  }

  public abstract void setViewModel(@Nullable SyncVM viewModel);

  @Nullable
  public SyncVM getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentSyncBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentSyncBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentSyncBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_sync, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSyncBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentSyncBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentSyncBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_sync, null, false, component);
  }

  public static FragmentSyncBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentSyncBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentSyncBinding)bind(component, view, com.fastservices.sams.R.layout.fragment_sync);
  }
}
