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
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.fastservices.sams.modules.takeorder.OrderVM;

public abstract class FragmentOrderSummaryBinding extends ViewDataBinding {
  @NonNull
  public final View bottomLayout;

  @NonNull
  public final Button btnBack;

  @NonNull
  public final Button btnCancel;

  @NonNull
  public final TextView btnOrderComplete;

  @NonNull
  public final EditText etRemarks;

  @NonNull
  public final TextView lblCompanyDiscount;

  @NonNull
  public final TextView lblDistDiscount;

  @NonNull
  public final TextView lblFreeSKUs;

  @NonNull
  public final TextView lblGST;

  @NonNull
  public final TextView lblGrossAmount;

  @NonNull
  public final TextView lblNetAmount;

  @NonNull
  public final TextView lblRemarks;

  @NonNull
  public final TextView lblTradeOffer;

  @NonNull
  public final LinearLayout llFreeSkusContainer;

  @NonNull
  public final RadioButton radioCash;

  @NonNull
  public final RadioButton radioCredit;

  @NonNull
  public final RadioGroup radioGroup;

  @NonNull
  public final TextView tvCompanyDiscount;

  @NonNull
  public final TextView tvDistDiscount;

  @NonNull
  public final TextView tvGST;

  @NonNull
  public final TextView tvGrossAmount;

  @NonNull
  public final TextView tvNetAmount;

  @NonNull
  public final TextView tvTradeOffer;

  @Bindable
  protected OrderVM mViewModel;

  protected FragmentOrderSummaryBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, View bottomLayout, Button btnBack, Button btnCancel,
      TextView btnOrderComplete, EditText etRemarks, TextView lblCompanyDiscount,
      TextView lblDistDiscount, TextView lblFreeSKUs, TextView lblGST, TextView lblGrossAmount,
      TextView lblNetAmount, TextView lblRemarks, TextView lblTradeOffer,
      LinearLayout llFreeSkusContainer, RadioButton radioCash, RadioButton radioCredit,
      RadioGroup radioGroup, TextView tvCompanyDiscount, TextView tvDistDiscount, TextView tvGST,
      TextView tvGrossAmount, TextView tvNetAmount, TextView tvTradeOffer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomLayout = bottomLayout;
    this.btnBack = btnBack;
    this.btnCancel = btnCancel;
    this.btnOrderComplete = btnOrderComplete;
    this.etRemarks = etRemarks;
    this.lblCompanyDiscount = lblCompanyDiscount;
    this.lblDistDiscount = lblDistDiscount;
    this.lblFreeSKUs = lblFreeSKUs;
    this.lblGST = lblGST;
    this.lblGrossAmount = lblGrossAmount;
    this.lblNetAmount = lblNetAmount;
    this.lblRemarks = lblRemarks;
    this.lblTradeOffer = lblTradeOffer;
    this.llFreeSkusContainer = llFreeSkusContainer;
    this.radioCash = radioCash;
    this.radioCredit = radioCredit;
    this.radioGroup = radioGroup;
    this.tvCompanyDiscount = tvCompanyDiscount;
    this.tvDistDiscount = tvDistDiscount;
    this.tvGST = tvGST;
    this.tvGrossAmount = tvGrossAmount;
    this.tvNetAmount = tvNetAmount;
    this.tvTradeOffer = tvTradeOffer;
  }

  public abstract void setViewModel(@Nullable OrderVM viewModel);

  @Nullable
  public OrderVM getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentOrderSummaryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentOrderSummaryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentOrderSummaryBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_order_summary, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentOrderSummaryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentOrderSummaryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentOrderSummaryBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_order_summary, null, false, component);
  }

  public static FragmentOrderSummaryBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentOrderSummaryBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentOrderSummaryBinding)bind(component, view, com.fastservices.sams.R.layout.fragment_order_summary);
  }
}
