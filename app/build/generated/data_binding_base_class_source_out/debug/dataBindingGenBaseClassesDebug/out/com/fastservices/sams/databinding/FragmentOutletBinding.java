package com.fastservices.sams.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fastservices.sams.modules.outlet.OutletsVM;

public abstract class FragmentOutletBinding extends ViewDataBinding {
  @NonNull
  public final View bottomLayout;

  @NonNull
  public final TextView btnSection;

  @NonNull
  public final EditText etFilter;

  @NonNull
  public final ImageView ivGridView;

  @NonNull
  public final ImageView ivListView;

  @NonNull
  public final RecyclerView rvOutlets;

  @NonNull
  public final LinearLayout searchLayout;

  @NonNull
  public final View separator;

  @NonNull
  public final CardView topLayout;

  @Bindable
  protected OutletsVM mViewModel;

  protected FragmentOutletBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, View bottomLayout, TextView btnSection, EditText etFilter,
      ImageView ivGridView, ImageView ivListView, RecyclerView rvOutlets, LinearLayout searchLayout,
      View separator, CardView topLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomLayout = bottomLayout;
    this.btnSection = btnSection;
    this.etFilter = etFilter;
    this.ivGridView = ivGridView;
    this.ivListView = ivListView;
    this.rvOutlets = rvOutlets;
    this.searchLayout = searchLayout;
    this.separator = separator;
    this.topLayout = topLayout;
  }

  public abstract void setViewModel(@Nullable OutletsVM viewModel);

  @Nullable
  public OutletsVM getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentOutletBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentOutletBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentOutletBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_outlet, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentOutletBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentOutletBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentOutletBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_outlet, null, false, component);
  }

  public static FragmentOutletBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentOutletBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentOutletBinding)bind(component, view, com.fastservices.sams.R.layout.fragment_outlet);
  }
}
