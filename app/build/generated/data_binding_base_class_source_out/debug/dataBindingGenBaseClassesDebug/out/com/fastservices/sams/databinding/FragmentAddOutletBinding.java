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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.fastservices.sams.modules.addoutlet.AddOutletVM;
import fr.ganfra.materialspinner.MaterialSpinner;

public abstract class FragmentAddOutletBinding extends ViewDataBinding {
  @NonNull
  public final View bottomLayout;

  @NonNull
  public final Button btnTakeGPS;

  @NonNull
  public final EditText etComment;

  @NonNull
  public final LinearLayout imagesContainer;

  @NonNull
  public final ImageView ivCamera;

  @NonNull
  public final TextView lblArea;

  @NonNull
  public final TextView lblComments;

  @NonNull
  public final TextView lblPicture;

  @NonNull
  public final RadioGroup rgArea;

  @NonNull
  public final RelativeLayout rootLayout;

  @NonNull
  public final ScrollView scrollView;

  @NonNull
  public final MaterialSpinner spChannel;

  @NonNull
  public final MaterialSpinner spSector;

  @NonNull
  public final MaterialSpinner spSubchannel;

  @NonNull
  public final TextInputLayout tilLandMark;

  @NonNull
  public final TextInputLayout tilOwnerName;

  @NonNull
  public final TextInputLayout tilPhoneNumber;

  @NonNull
  public final TextInputLayout tilStoreAddress;

  @NonNull
  public final TextInputLayout tilStoreName;

  @NonNull
  public final TextView tvMapLink;

  @NonNull
  public final TextView tvSubmit;

  @Bindable
  protected AddOutletVM mViewModel;

  protected FragmentAddOutletBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, View bottomLayout, Button btnTakeGPS, EditText etComment,
      LinearLayout imagesContainer, ImageView ivCamera, TextView lblArea, TextView lblComments,
      TextView lblPicture, RadioGroup rgArea, RelativeLayout rootLayout, ScrollView scrollView,
      MaterialSpinner spChannel, MaterialSpinner spSector, MaterialSpinner spSubchannel,
      TextInputLayout tilLandMark, TextInputLayout tilOwnerName, TextInputLayout tilPhoneNumber,
      TextInputLayout tilStoreAddress, TextInputLayout tilStoreName, TextView tvMapLink,
      TextView tvSubmit) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bottomLayout = bottomLayout;
    this.btnTakeGPS = btnTakeGPS;
    this.etComment = etComment;
    this.imagesContainer = imagesContainer;
    this.ivCamera = ivCamera;
    this.lblArea = lblArea;
    this.lblComments = lblComments;
    this.lblPicture = lblPicture;
    this.rgArea = rgArea;
    this.rootLayout = rootLayout;
    this.scrollView = scrollView;
    this.spChannel = spChannel;
    this.spSector = spSector;
    this.spSubchannel = spSubchannel;
    this.tilLandMark = tilLandMark;
    this.tilOwnerName = tilOwnerName;
    this.tilPhoneNumber = tilPhoneNumber;
    this.tilStoreAddress = tilStoreAddress;
    this.tilStoreName = tilStoreName;
    this.tvMapLink = tvMapLink;
    this.tvSubmit = tvSubmit;
  }

  public abstract void setViewModel(@Nullable AddOutletVM viewModel);

  @Nullable
  public AddOutletVM getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentAddOutletBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentAddOutletBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentAddOutletBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_add_outlet, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentAddOutletBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentAddOutletBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentAddOutletBinding>inflate(inflater, com.fastservices.sams.R.layout.fragment_add_outlet, null, false, component);
  }

  public static FragmentAddOutletBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentAddOutletBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentAddOutletBinding)bind(component, view, com.fastservices.sams.R.layout.fragment_add_outlet);
  }
}
