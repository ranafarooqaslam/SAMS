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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fastservices.sams.modules.merchandise.MerchandisingVM;

public abstract class FragmentMerchandisingBinding extends ViewDataBinding {
  @NonNull
  public final View bottomLayout;

  @NonNull
  public final View divider1;

  @NonNull
  public final View divider2;

  @NonNull
  public final View divider3;

  @NonNull
  public final EditText etComment;

  @NonNull
  public final LinearLayout imageContainerAfter;

  @NonNull
  public final LinearLayout imageContainerBefore;

  @NonNull
  public final ImageView ivCameraAfterMerchandise;

  @NonNull
  public final ImageView ivCameraBeforeMerchandise;

  @NonNull
  public final ImageView ivFullImage;

  @NonNull
  public final TextView lblComments;

  @NonNull
  public final TextView lblInvoiceImage;

  @NonNull
  public final TextView lblStockImage;

  @NonNull
  public final TextView tvSelectedOutlet;

  @Bindable
  protected MerchandisingVM mViewModel;

  protected FragmentMerchandisingBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, View bottomLayout, View divider1, View divider2, View divider3,
      EditText etComment, LinearLayout imageContainerAfter, LinearLayout imageContainerBefore,
      ImageView ivCameraAfterMerchandise, ImageView ivCameraBeforeMerchandise,
      ImageView ivFullImage, TextView lblComments, TextView lblInvoiceImage, TextView lblStockImage,
      TextView tvSelectedOutlet) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomLayout = bottomLayout;
    this.divider1 = divider1;
    this.divider2 = divider2;
    this.divider3 = divider3;
    this.etComment = etComment;
    this.imageContainerAfter = imageContainerAfter;
    this.imageContainerBefore = imageContainerBefore;
    this.ivCameraAfterMerchandise = ivCameraAfterMerchandise;
    this.ivCameraBeforeMerchandise = ivCameraBeforeMerchandise;
    this.ivFullImage = ivFullImage;
    this.lblComments = lblComments;
    this.lblInvoiceImage = lblInvoiceImage;
    this.lblStockImage = lblStockImage;
    this.tvSelectedOutlet = tvSelectedOutlet;
  }

  public abstract void setViewModel(@Nullable MerchandisingVM viewModel);

  @Nullable
  public MerchandisingVM getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentMerchandisingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentMerchandisingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentMerchandisingBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_merchandising, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentMerchandisingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentMerchandisingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentMerchandisingBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_merchandising, null, false, component);
  }

  public static FragmentMerchandisingBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentMerchandisingBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentMerchandisingBinding)bind(component, view, com.fastservices.sams.R.layout.fragment_merchandising);
  }
}
