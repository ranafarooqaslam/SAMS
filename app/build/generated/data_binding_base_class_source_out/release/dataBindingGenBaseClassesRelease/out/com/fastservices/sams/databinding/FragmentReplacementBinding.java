package com.fastservices.sams.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.fastservices.sams.modules.replacement.ReplacementVM;
import fr.ganfra.materialspinner.MaterialSpinner;

public abstract class FragmentReplacementBinding extends ViewDataBinding {
  @NonNull
  public final View bottomLayout;

  @NonNull
  public final View divider1;

  @NonNull
  public final View divider2;

  @NonNull
  public final View divider3;

  @NonNull
  public final LinearLayout imagesContainerInvoice;

  @NonNull
  public final LinearLayout imagesContainerStock;

  @NonNull
  public final ImageView ivCalender;

  @NonNull
  public final ImageView ivCameraInvoice;

  @NonNull
  public final ImageView ivCameraStockImage;

  @NonNull
  public final TextView lblInvoiceImage;

  @NonNull
  public final TextView lblPurchaseDate;

  @NonNull
  public final TextView lblStockImage;

  @NonNull
  public final TextView lblTotalAmount;

  @NonNull
  public final RadioGroup rgReason;

  @NonNull
  public final MaterialSpinner spReason;

  @NonNull
  public final MaterialSpinner spSKU;

  @NonNull
  public final TextInputLayout tilBatchNumber;

  @NonNull
  public final TextInputLayout tilDescription;

  @NonNull
  public final TextInputLayout tilInvoice;

  @NonNull
  public final TextInputLayout tilQuantity;

  @NonNull
  public final TextView tvPurchaseDate;

  @NonNull
  public final TextView tvSelectedOutlet;

  @NonNull
  public final TextView tvTotalAmount;

  @Bindable
  protected ReplacementVM mViewModel;

  protected FragmentReplacementBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, View bottomLayout, View divider1, View divider2, View divider3,
      LinearLayout imagesContainerInvoice, LinearLayout imagesContainerStock, ImageView ivCalender,
      ImageView ivCameraInvoice, ImageView ivCameraStockImage, TextView lblInvoiceImage,
      TextView lblPurchaseDate, TextView lblStockImage, TextView lblTotalAmount,
      RadioGroup rgReason, MaterialSpinner spReason, MaterialSpinner spSKU,
      TextInputLayout tilBatchNumber, TextInputLayout tilDescription, TextInputLayout tilInvoice,
      TextInputLayout tilQuantity, TextView tvPurchaseDate, TextView tvSelectedOutlet,
      TextView tvTotalAmount) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomLayout = bottomLayout;
    this.divider1 = divider1;
    this.divider2 = divider2;
    this.divider3 = divider3;
    this.imagesContainerInvoice = imagesContainerInvoice;
    this.imagesContainerStock = imagesContainerStock;
    this.ivCalender = ivCalender;
    this.ivCameraInvoice = ivCameraInvoice;
    this.ivCameraStockImage = ivCameraStockImage;
    this.lblInvoiceImage = lblInvoiceImage;
    this.lblPurchaseDate = lblPurchaseDate;
    this.lblStockImage = lblStockImage;
    this.lblTotalAmount = lblTotalAmount;
    this.rgReason = rgReason;
    this.spReason = spReason;
    this.spSKU = spSKU;
    this.tilBatchNumber = tilBatchNumber;
    this.tilDescription = tilDescription;
    this.tilInvoice = tilInvoice;
    this.tilQuantity = tilQuantity;
    this.tvPurchaseDate = tvPurchaseDate;
    this.tvSelectedOutlet = tvSelectedOutlet;
    this.tvTotalAmount = tvTotalAmount;
  }

  public abstract void setViewModel(@Nullable ReplacementVM viewModel);

  @Nullable
  public ReplacementVM getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentReplacementBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentReplacementBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentReplacementBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_replacement, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentReplacementBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentReplacementBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentReplacementBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_replacement, null, false, component);
  }

  public static FragmentReplacementBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentReplacementBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentReplacementBinding)bind(component, view, com.fastservices.sams.R.layout.fragment_replacement);
  }
}
