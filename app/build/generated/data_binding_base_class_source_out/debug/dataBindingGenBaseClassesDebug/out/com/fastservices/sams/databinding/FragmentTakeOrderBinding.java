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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fastservices.sams.modules.takeorder.OrderVM;

public abstract class FragmentTakeOrderBinding extends ViewDataBinding {
  @NonNull
  public final View bottomLayout;

  @NonNull
  public final Button btnTakeGPS;

  @NonNull
  public final ConstraintLayout detailsLayout;

  @NonNull
  public final View divider;

  @NonNull
  public final View divider2;

  @NonNull
  public final TextView emptyView;

  @NonNull
  public final EditText etFilter;

  @NonNull
  public final LinearLayout imagesContainer;

  @NonNull
  public final ImageView ivCamera;

  @NonNull
  public final ImageView ivCollapse;

  @NonNull
  public final ImageView ivSorting;

  @NonNull
  public final ImageView ivStore;

  @NonNull
  public final TextView lblClosingBalance;

  @NonNull
  public final TextView lblContactNumber;

  @NonNull
  public final TextView lblLastOrderAmount;

  @NonNull
  public final TextView lblLastOrderDate;

  @NonNull
  public final TextView lblOwnerName;

  @NonNull
  public final TextView lblPicture;

  @NonNull
  public final TextView lblStoreAddress;

  @NonNull
  public final TextView lblStoreName;

  @NonNull
  public final TextView lblStoreType;

  @NonNull
  public final RecyclerView rvCategories;

  @NonNull
  public final LinearLayout searchLayout;

  @NonNull
  public final TextView tvClosingBalance;

  @NonNull
  public final TextView tvContactNumber;

  @NonNull
  public final TextView tvLastOrderAmount;

  @NonNull
  public final TextView tvLastOrderDate;

  @NonNull
  public final TextView tvMapLink;

  @NonNull
  public final TextView tvOwnerName;

  @NonNull
  public final TextView tvStoreAddress;

  @NonNull
  public final TextView tvStoreName;

  @NonNull
  public final TextView tvStoreType;

  @Bindable
  protected OrderVM mViewModel;

  protected FragmentTakeOrderBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, View bottomLayout, Button btnTakeGPS, ConstraintLayout detailsLayout,
      View divider, View divider2, TextView emptyView, EditText etFilter,
      LinearLayout imagesContainer, ImageView ivCamera, ImageView ivCollapse, ImageView ivSorting,
      ImageView ivStore, TextView lblClosingBalance, TextView lblContactNumber,
      TextView lblLastOrderAmount, TextView lblLastOrderDate, TextView lblOwnerName,
      TextView lblPicture, TextView lblStoreAddress, TextView lblStoreName, TextView lblStoreType,
      RecyclerView rvCategories, LinearLayout searchLayout, TextView tvClosingBalance,
      TextView tvContactNumber, TextView tvLastOrderAmount, TextView tvLastOrderDate,
      TextView tvMapLink, TextView tvOwnerName, TextView tvStoreAddress, TextView tvStoreName,
      TextView tvStoreType) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomLayout = bottomLayout;
    this.btnTakeGPS = btnTakeGPS;
    this.detailsLayout = detailsLayout;
    this.divider = divider;
    this.divider2 = divider2;
    this.emptyView = emptyView;
    this.etFilter = etFilter;
    this.imagesContainer = imagesContainer;
    this.ivCamera = ivCamera;
    this.ivCollapse = ivCollapse;
    this.ivSorting = ivSorting;
    this.ivStore = ivStore;
    this.lblClosingBalance = lblClosingBalance;
    this.lblContactNumber = lblContactNumber;
    this.lblLastOrderAmount = lblLastOrderAmount;
    this.lblLastOrderDate = lblLastOrderDate;
    this.lblOwnerName = lblOwnerName;
    this.lblPicture = lblPicture;
    this.lblStoreAddress = lblStoreAddress;
    this.lblStoreName = lblStoreName;
    this.lblStoreType = lblStoreType;
    this.rvCategories = rvCategories;
    this.searchLayout = searchLayout;
    this.tvClosingBalance = tvClosingBalance;
    this.tvContactNumber = tvContactNumber;
    this.tvLastOrderAmount = tvLastOrderAmount;
    this.tvLastOrderDate = tvLastOrderDate;
    this.tvMapLink = tvMapLink;
    this.tvOwnerName = tvOwnerName;
    this.tvStoreAddress = tvStoreAddress;
    this.tvStoreName = tvStoreName;
    this.tvStoreType = tvStoreType;
  }

  public abstract void setViewModel(@Nullable OrderVM viewModel);

  @Nullable
  public OrderVM getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentTakeOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentTakeOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentTakeOrderBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_take_order, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentTakeOrderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentTakeOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentTakeOrderBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_take_order, null, false, component);
  }

  public static FragmentTakeOrderBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentTakeOrderBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentTakeOrderBinding)bind(component, view, com.fastservices.sams.R.layout.fragment_take_order);
  }
}
