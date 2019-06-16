package com.fastservices.sams;

import android.databinding.DataBinderMapper;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.fastservices.sams.databinding.ActivityCompanyCodeBindingImpl;
import com.fastservices.sams.databinding.ActivityLoginBindingImpl;
import com.fastservices.sams.databinding.FragmentAddOutletBindingImpl;
import com.fastservices.sams.databinding.FragmentComplaintsBindingImpl;
import com.fastservices.sams.databinding.FragmentDailyProductivityBindingImpl;
import com.fastservices.sams.databinding.FragmentDashboardBindingImpl;
import com.fastservices.sams.databinding.FragmentMerchandisingBindingImpl;
import com.fastservices.sams.databinding.FragmentOrderDetailsBindingImpl;
import com.fastservices.sams.databinding.FragmentOrderSummaryBindingImpl;
import com.fastservices.sams.databinding.FragmentOutletBindingImpl;
import com.fastservices.sams.databinding.FragmentOutletNoOrderBindingImpl;
import com.fastservices.sams.databinding.FragmentOutletWiseSummaryBindingImpl;
import com.fastservices.sams.databinding.FragmentPricingReportBindingImpl;
import com.fastservices.sams.databinding.FragmentReplacementBindingImpl;
import com.fastservices.sams.databinding.FragmentSkuListBindingImpl;
import com.fastservices.sams.databinding.FragmentSkuWiseSummaryBindingImpl;
import com.fastservices.sams.databinding.FragmentStockPositionBindingImpl;
import com.fastservices.sams.databinding.FragmentSyncBindingImpl;
import com.fastservices.sams.databinding.FragmentTakeOrderBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYCOMPANYCODE = 1;

  private static final int LAYOUT_ACTIVITYLOGIN = 2;

  private static final int LAYOUT_FRAGMENTADDOUTLET = 3;

  private static final int LAYOUT_FRAGMENTCOMPLAINTS = 4;

  private static final int LAYOUT_FRAGMENTDAILYPRODUCTIVITY = 5;

  private static final int LAYOUT_FRAGMENTDASHBOARD = 6;

  private static final int LAYOUT_FRAGMENTMERCHANDISING = 7;

  private static final int LAYOUT_FRAGMENTORDERDETAILS = 8;

  private static final int LAYOUT_FRAGMENTORDERSUMMARY = 9;

  private static final int LAYOUT_FRAGMENTOUTLET = 10;

  private static final int LAYOUT_FRAGMENTOUTLETNOORDER = 11;

  private static final int LAYOUT_FRAGMENTOUTLETWISESUMMARY = 12;

  private static final int LAYOUT_FRAGMENTPRICINGREPORT = 13;

  private static final int LAYOUT_FRAGMENTREPLACEMENT = 14;

  private static final int LAYOUT_FRAGMENTSKULIST = 15;

  private static final int LAYOUT_FRAGMENTSKUWISESUMMARY = 16;

  private static final int LAYOUT_FRAGMENTSTOCKPOSITION = 17;

  private static final int LAYOUT_FRAGMENTSYNC = 18;

  private static final int LAYOUT_FRAGMENTTAKEORDER = 19;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(19);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fastservices.sams.R.layout.activity_company_code, LAYOUT_ACTIVITYCOMPANYCODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fastservices.sams.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fastservices.sams.R.layout.fragment_add_outlet, LAYOUT_FRAGMENTADDOUTLET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fastservices.sams.R.layout.fragment_complaints, LAYOUT_FRAGMENTCOMPLAINTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fastservices.sams.R.layout.fragment_daily_productivity, LAYOUT_FRAGMENTDAILYPRODUCTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fastservices.sams.R.layout.fragment_dashboard, LAYOUT_FRAGMENTDASHBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fastservices.sams.R.layout.fragment_merchandising, LAYOUT_FRAGMENTMERCHANDISING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fastservices.sams.R.layout.fragment_order_details, LAYOUT_FRAGMENTORDERDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fastservices.sams.R.layout.fragment_order_summary, LAYOUT_FRAGMENTORDERSUMMARY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fastservices.sams.R.layout.fragment_outlet, LAYOUT_FRAGMENTOUTLET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fastservices.sams.R.layout.fragment_outlet_no_order, LAYOUT_FRAGMENTOUTLETNOORDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fastservices.sams.R.layout.fragment_outlet_wise_summary, LAYOUT_FRAGMENTOUTLETWISESUMMARY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fastservices.sams.R.layout.fragment_pricing_report, LAYOUT_FRAGMENTPRICINGREPORT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fastservices.sams.R.layout.fragment_replacement, LAYOUT_FRAGMENTREPLACEMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fastservices.sams.R.layout.fragment_sku_list, LAYOUT_FRAGMENTSKULIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fastservices.sams.R.layout.fragment_sku_wise_summary, LAYOUT_FRAGMENTSKUWISESUMMARY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fastservices.sams.R.layout.fragment_stock_position, LAYOUT_FRAGMENTSTOCKPOSITION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fastservices.sams.R.layout.fragment_sync, LAYOUT_FRAGMENTSYNC);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fastservices.sams.R.layout.fragment_take_order, LAYOUT_FRAGMENTTAKEORDER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYCOMPANYCODE: {
          if ("layout/activity_company_code_0".equals(tag)) {
            return new ActivityCompanyCodeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_company_code is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTADDOUTLET: {
          if ("layout/fragment_add_outlet_0".equals(tag)) {
            return new FragmentAddOutletBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_add_outlet is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCOMPLAINTS: {
          if ("layout/fragment_complaints_0".equals(tag)) {
            return new FragmentComplaintsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_complaints is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDAILYPRODUCTIVITY: {
          if ("layout/fragment_daily_productivity_0".equals(tag)) {
            return new FragmentDailyProductivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_daily_productivity is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDASHBOARD: {
          if ("layout/fragment_dashboard_0".equals(tag)) {
            return new FragmentDashboardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_dashboard is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMERCHANDISING: {
          if ("layout/fragment_merchandising_0".equals(tag)) {
            return new FragmentMerchandisingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_merchandising is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTORDERDETAILS: {
          if ("layout/fragment_order_details_0".equals(tag)) {
            return new FragmentOrderDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_order_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTORDERSUMMARY: {
          if ("layout/fragment_order_summary_0".equals(tag)) {
            return new FragmentOrderSummaryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_order_summary is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTOUTLET: {
          if ("layout/fragment_outlet_0".equals(tag)) {
            return new FragmentOutletBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_outlet is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTOUTLETNOORDER: {
          if ("layout/fragment_outlet_no_order_0".equals(tag)) {
            return new FragmentOutletNoOrderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_outlet_no_order is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTOUTLETWISESUMMARY: {
          if ("layout/fragment_outlet_wise_summary_0".equals(tag)) {
            return new FragmentOutletWiseSummaryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_outlet_wise_summary is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRICINGREPORT: {
          if ("layout/fragment_pricing_report_0".equals(tag)) {
            return new FragmentPricingReportBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_pricing_report is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREPLACEMENT: {
          if ("layout/fragment_replacement_0".equals(tag)) {
            return new FragmentReplacementBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_replacement is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSKULIST: {
          if ("layout/fragment_sku_list_0".equals(tag)) {
            return new FragmentSkuListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_sku_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSKUWISESUMMARY: {
          if ("layout/fragment_sku_wise_summary_0".equals(tag)) {
            return new FragmentSkuWiseSummaryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_sku_wise_summary is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSTOCKPOSITION: {
          if ("layout/fragment_stock_position_0".equals(tag)) {
            return new FragmentStockPositionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_stock_position is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSYNC: {
          if ("layout/fragment_sync_0".equals(tag)) {
            return new FragmentSyncBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_sync is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTAKEORDER: {
          if ("layout/fragment_take_order_0".equals(tag)) {
            return new FragmentTakeOrderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_take_order is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new com.android.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(19);

    static {
      sKeys.put("layout/activity_company_code_0", com.fastservices.sams.R.layout.activity_company_code);
      sKeys.put("layout/activity_login_0", com.fastservices.sams.R.layout.activity_login);
      sKeys.put("layout/fragment_add_outlet_0", com.fastservices.sams.R.layout.fragment_add_outlet);
      sKeys.put("layout/fragment_complaints_0", com.fastservices.sams.R.layout.fragment_complaints);
      sKeys.put("layout/fragment_daily_productivity_0", com.fastservices.sams.R.layout.fragment_daily_productivity);
      sKeys.put("layout/fragment_dashboard_0", com.fastservices.sams.R.layout.fragment_dashboard);
      sKeys.put("layout/fragment_merchandising_0", com.fastservices.sams.R.layout.fragment_merchandising);
      sKeys.put("layout/fragment_order_details_0", com.fastservices.sams.R.layout.fragment_order_details);
      sKeys.put("layout/fragment_order_summary_0", com.fastservices.sams.R.layout.fragment_order_summary);
      sKeys.put("layout/fragment_outlet_0", com.fastservices.sams.R.layout.fragment_outlet);
      sKeys.put("layout/fragment_outlet_no_order_0", com.fastservices.sams.R.layout.fragment_outlet_no_order);
      sKeys.put("layout/fragment_outlet_wise_summary_0", com.fastservices.sams.R.layout.fragment_outlet_wise_summary);
      sKeys.put("layout/fragment_pricing_report_0", com.fastservices.sams.R.layout.fragment_pricing_report);
      sKeys.put("layout/fragment_replacement_0", com.fastservices.sams.R.layout.fragment_replacement);
      sKeys.put("layout/fragment_sku_list_0", com.fastservices.sams.R.layout.fragment_sku_list);
      sKeys.put("layout/fragment_sku_wise_summary_0", com.fastservices.sams.R.layout.fragment_sku_wise_summary);
      sKeys.put("layout/fragment_stock_position_0", com.fastservices.sams.R.layout.fragment_stock_position);
      sKeys.put("layout/fragment_sync_0", com.fastservices.sams.R.layout.fragment_sync);
      sKeys.put("layout/fragment_take_order_0", com.fastservices.sams.R.layout.fragment_take_order);
    }
  }
}
