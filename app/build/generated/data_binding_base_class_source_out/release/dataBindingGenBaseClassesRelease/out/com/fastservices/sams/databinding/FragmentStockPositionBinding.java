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
import com.fastservices.sams.modules.stockpositioning.StockPositioningVM;

public abstract class FragmentStockPositionBinding extends ViewDataBinding {
  @NonNull
  public final View bottomLayout;

  @NonNull
  public final TextView btnSubmit;

  @NonNull
  public final TextView lblItemName;

  @NonNull
  public final TextView lblNumberOfPieces;

  @NonNull
  public final TextView listEmptyLabel;

  @NonNull
  public final RecyclerView rvStockPositioning;

  @NonNull
  public final TextView tvSelectedOutlet;

  @Bindable
  protected StockPositioningVM mViewModel;

  protected FragmentStockPositionBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, View bottomLayout, TextView btnSubmit, TextView lblItemName,
      TextView lblNumberOfPieces, TextView listEmptyLabel, RecyclerView rvStockPositioning,
      TextView tvSelectedOutlet) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomLayout = bottomLayout;
    this.btnSubmit = btnSubmit;
    this.lblItemName = lblItemName;
    this.lblNumberOfPieces = lblNumberOfPieces;
    this.listEmptyLabel = listEmptyLabel;
    this.rvStockPositioning = rvStockPositioning;
    this.tvSelectedOutlet = tvSelectedOutlet;
  }

  public abstract void setViewModel(@Nullable StockPositioningVM viewModel);

  @Nullable
  public StockPositioningVM getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentStockPositionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentStockPositionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentStockPositionBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_stock_position, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentStockPositionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentStockPositionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentStockPositionBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_stock_position, null, false, component);
  }

  public static FragmentStockPositionBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentStockPositionBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentStockPositionBinding)bind(component, view, com.fastservices.sams.R.layout.fragment_stock_position);
  }
}
