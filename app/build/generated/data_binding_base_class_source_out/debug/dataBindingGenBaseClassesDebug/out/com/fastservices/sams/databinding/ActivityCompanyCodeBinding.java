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
import com.fastservices.sams.modules.companycode.CompanyCodeVM;

public abstract class ActivityCompanyCodeBinding extends ViewDataBinding {
  @NonNull
  public final Button btnNext;

  @NonNull
  public final EditText etCompanyCode;

  @NonNull
  public final LinearLayout viewsContainer;

  @Bindable
  protected CompanyCodeVM mViewModel;

  protected ActivityCompanyCodeBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button btnNext, EditText etCompanyCode, LinearLayout viewsContainer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnNext = btnNext;
    this.etCompanyCode = etCompanyCode;
    this.viewsContainer = viewsContainer;
  }

  public abstract void setViewModel(@Nullable CompanyCodeVM viewModel);

  @Nullable
  public CompanyCodeVM getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityCompanyCodeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityCompanyCodeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityCompanyCodeBinding>inflate(inflater, com.fastservices.sams.R.layout.activity_company_code, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCompanyCodeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityCompanyCodeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityCompanyCodeBinding>inflate(inflater, com.fastservices.sams.R.layout.activity_company_code, null, false, component);
  }

  public static ActivityCompanyCodeBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityCompanyCodeBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityCompanyCodeBinding)bind(component, view, com.fastservices.sams.R.layout.activity_company_code);
  }
}
