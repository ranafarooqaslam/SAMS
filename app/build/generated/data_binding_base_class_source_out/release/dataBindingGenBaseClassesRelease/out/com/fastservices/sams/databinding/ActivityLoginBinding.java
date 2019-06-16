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
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.fastservices.sams.modules.login.LoginVM;

public abstract class ActivityLoginBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout bottomLayout;

  @NonNull
  public final Button btnLogin;

  @NonNull
  public final EditText etPassword;

  @NonNull
  public final EditText etUsername;

  @NonNull
  public final ImageView ivCustomBackground;

  @NonNull
  public final ImageView ivLogo;

  @NonNull
  public final LinearLayout layoutLogin;

  @Bindable
  protected LoginVM mViewModel;

  protected ActivityLoginBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout bottomLayout, Button btnLogin, EditText etPassword,
      EditText etUsername, ImageView ivCustomBackground, ImageView ivLogo,
      LinearLayout layoutLogin) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomLayout = bottomLayout;
    this.btnLogin = btnLogin;
    this.etPassword = etPassword;
    this.etUsername = etUsername;
    this.ivCustomBackground = ivCustomBackground;
    this.ivLogo = ivLogo;
    this.layoutLogin = layoutLogin;
  }

  public abstract void setViewModel(@Nullable LoginVM viewModel);

  @Nullable
  public LoginVM getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityLoginBinding>inflate(inflater, com.fastservices.sams.R.layout.activity_login, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityLoginBinding>inflate(inflater, com.fastservices.sams.R.layout.activity_login, null, false, component);
  }

  public static ActivityLoginBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityLoginBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityLoginBinding)bind(component, view, com.fastservices.sams.R.layout.activity_login);
  }
}
