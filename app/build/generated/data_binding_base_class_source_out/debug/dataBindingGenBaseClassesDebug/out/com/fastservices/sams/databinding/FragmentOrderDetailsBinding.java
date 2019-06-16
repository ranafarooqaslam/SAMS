package com.fastservices.sams.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.fastservices.sams.modules.takeorder.OrderVM;

public abstract class FragmentOrderDetailsBinding extends ViewDataBinding {
  @NonNull
  public final View bottomLayout;

  @NonNull
  public final TextView btnOrderSummary;

  @NonNull
  public final ConstraintLayout footer;

  @NonNull
  public final ImageView ivFooterDelete;

  @NonNull
  public final TextView lblFooterTotal;

  @NonNull
  public final TextView lblFooterTotalPrice;

  @NonNull
  public final TextView lblFooterUnitPriceCarton;

  @NonNull
  public final TextView lblFooterUnitPricesOfPieces;

  @NonNull
  public final TextView lblItemName;

  @NonNull
  public final TextView lblNumberCarton;

  @NonNull
  public final TextView lblNumberOfPieces;

  @NonNull
  public final TextView lblTotalPrice;

  @NonNull
  public final TextView lblUnitPriceCarton;

  @NonNull
  public final TextView lblUnitPricesOfPieces;

  @NonNull
  public final RecyclerView rvOrderItems;

  @NonNull
  public final TextView space;

  @NonNull
  public final TextView tvFooterCartons;

  @NonNull
  public final TextView tvFooterTotalUnit;

  @NonNull
  public final TextView tvTotalPrice;

  @Bindable
  protected OrderVM mViewModel;

  protected FragmentOrderDetailsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, View bottomLayout, TextView btnOrderSummary, ConstraintLayout footer,
      ImageView ivFooterDelete, TextView lblFooterTotal, TextView lblFooterTotalPrice,
      TextView lblFooterUnitPriceCarton, TextView lblFooterUnitPricesOfPieces, TextView lblItemName,
      TextView lblNumberCarton, TextView lblNumberOfPieces, TextView lblTotalPrice,
      TextView lblUnitPriceCarton, TextView lblUnitPricesOfPieces, RecyclerView rvOrderItems,
      TextView space, TextView tvFooterCartons, TextView tvFooterTotalUnit, TextView tvTotalPrice) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomLayout = bottomLayout;
    this.btnOrderSummary = btnOrderSummary;
    this.footer = footer;
    this.ivFooterDelete = ivFooterDelete;
    this.lblFooterTotal = lblFooterTotal;
    this.lblFooterTotalPrice = lblFooterTotalPrice;
    this.lblFooterUnitPriceCarton = lblFooterUnitPriceCarton;
    this.lblFooterUnitPricesOfPieces = lblFooterUnitPricesOfPieces;
    this.lblItemName = lblItemName;
    this.lblNumberCarton = lblNumberCarton;
    this.lblNumberOfPieces = lblNumberOfPieces;
    this.lblTotalPrice = lblTotalPrice;
    this.lblUnitPriceCarton = lblUnitPriceCarton;
    this.lblUnitPricesOfPieces = lblUnitPricesOfPieces;
    this.rvOrderItems = rvOrderItems;
    this.space = space;
    this.tvFooterCartons = tvFooterCartons;
    this.tvFooterTotalUnit = tvFooterTotalUnit;
    this.tvTotalPrice = tvTotalPrice;
  }

  public abstract void setViewModel(@Nullable OrderVM viewModel);

  @Nullable
  public OrderVM getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentOrderDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentOrderDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentOrderDetailsBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_order_details, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentOrderDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentOrderDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentOrderDetailsBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_order_details, null, false, component);
  }

  public static FragmentOrderDetailsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentOrderDetailsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentOrderDetailsBinding)bind(component, view, com.fastservices.sams.R.layout.fragment_order_details);
  }
}
