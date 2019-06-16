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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fastservices.sams.modules.outletnoorder.OutletNoOrderVM;
import com.whygraphics.multilineradiogroup.MultiLineRadioGroup;

public abstract class FragmentOutletNoOrderBinding extends ViewDataBinding {
  @NonNull
  public final View bottomLayout;

  @NonNull
  public final TextView btnSubmit;

  @NonNull
  public final Button btnTakeGPS;

  @NonNull
  public final ConstraintLayout detailsLayout;

  @NonNull
  public final View divider;

  @NonNull
  public final View divider2;

  @NonNull
  public final EditText etRemarks;

  @NonNull
  public final LinearLayout imagesContainer;

  @NonNull
  public final ImageView ivCamera;

  @NonNull
  public final ImageView ivCollapse;

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
  public final TextView lblReason;

  @NonNull
  public final TextView lblStoreAddress;

  @NonNull
  public final TextView lblStoreName;

  @NonNull
  public final TextView lblStoreType;

  @NonNull
  public final MultiLineRadioGroup multiLineRadioGroup;

  @NonNull
  public final TextView textView2;

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
  protected OutletNoOrderVM mViewModel;

  protected FragmentOutletNoOrderBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, View bottomLayout, TextView btnSubmit, Button btnTakeGPS,
      ConstraintLayout detailsLayout, View divider, View divider2, EditText etRemarks,
      LinearLayout imagesContainer, ImageView ivCamera, ImageView ivCollapse, ImageView ivStore,
      TextView lblClosingBalance, TextView lblContactNumber, TextView lblLastOrderAmount,
      TextView lblLastOrderDate, TextView lblOwnerName, TextView lblPicture, TextView lblReason,
      TextView lblStoreAddress, TextView lblStoreName, TextView lblStoreType,
      MultiLineRadioGroup multiLineRadioGroup, TextView textView2, TextView tvClosingBalance,
      TextView tvContactNumber, TextView tvLastOrderAmount, TextView tvLastOrderDate,
      TextView tvMapLink, TextView tvOwnerName, TextView tvStoreAddress, TextView tvStoreName,
      TextView tvStoreType) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomLayout = bottomLayout;
    this.btnSubmit = btnSubmit;
    this.btnTakeGPS = btnTakeGPS;
    this.detailsLayout = detailsLayout;
    this.divider = divider;
    this.divider2 = divider2;
    this.etRemarks = etRemarks;
    this.imagesContainer = imagesContainer;
    this.ivCamera = ivCamera;
    this.ivCollapse = ivCollapse;
    this.ivStore = ivStore;
    this.lblClosingBalance = lblClosingBalance;
    this.lblContactNumber = lblContactNumber;
    this.lblLastOrderAmount = lblLastOrderAmount;
    this.lblLastOrderDate = lblLastOrderDate;
    this.lblOwnerName = lblOwnerName;
    this.lblPicture = lblPicture;
    this.lblReason = lblReason;
    this.lblStoreAddress = lblStoreAddress;
    this.lblStoreName = lblStoreName;
    this.lblStoreType = lblStoreType;
    this.multiLineRadioGroup = multiLineRadioGroup;
    this.textView2 = textView2;
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

  public abstract void setViewModel(@Nullable OutletNoOrderVM viewModel);

  @Nullable
  public OutletNoOrderVM getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentOutletNoOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentOutletNoOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentOutletNoOrderBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_outlet_no_order, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentOutletNoOrderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentOutletNoOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentOutletNoOrderBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_outlet_no_order, null, false, component);
  }

  public static FragmentOutletNoOrderBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentOutletNoOrderBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentOutletNoOrderBinding)bind(component, view, com.fastservices.sams.R.layout.fragment_outlet_no_order);
  }
}
