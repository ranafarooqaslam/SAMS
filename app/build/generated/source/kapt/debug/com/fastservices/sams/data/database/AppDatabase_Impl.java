package com.fastservices.sams.data.database;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import com.fastservices.sams.data.dao.ChannelDao;
import com.fastservices.sams.data.dao.ChannelDao_Impl;
import com.fastservices.sams.data.dao.ComplaintReasonsDao;
import com.fastservices.sams.data.dao.ComplaintReasonsDao_Impl;
import com.fastservices.sams.data.dao.MenuDao;
import com.fastservices.sams.data.dao.MenuDao_Impl;
import com.fastservices.sams.data.dao.MerchandiseDao;
import com.fastservices.sams.data.dao.MerchandiseDao_Impl;
import com.fastservices.sams.data.dao.NoOrderDao;
import com.fastservices.sams.data.dao.NoOrderDao_Impl;
import com.fastservices.sams.data.dao.NoOrderReasonDao;
import com.fastservices.sams.data.dao.NoOrderReasonDao_Impl;
import com.fastservices.sams.data.dao.OrderDetailDao;
import com.fastservices.sams.data.dao.OrderDetailDao_Impl;
import com.fastservices.sams.data.dao.OrderDetailFreeSKUDao;
import com.fastservices.sams.data.dao.OrderDetailFreeSKUDao_Impl;
import com.fastservices.sams.data.dao.OrderMasterDao;
import com.fastservices.sams.data.dao.OrderMasterDao_Impl;
import com.fastservices.sams.data.dao.OutletComplaintDao;
import com.fastservices.sams.data.dao.OutletComplaintDao_Impl;
import com.fastservices.sams.data.dao.OutletDao;
import com.fastservices.sams.data.dao.OutletDao_Impl;
import com.fastservices.sams.data.dao.OutletLocalDao;
import com.fastservices.sams.data.dao.OutletLocalDao_Impl;
import com.fastservices.sams.data.dao.ReplacementDao;
import com.fastservices.sams.data.dao.ReplacementDao_Impl;
import com.fastservices.sams.data.dao.ReplacementReasonsDao;
import com.fastservices.sams.data.dao.ReplacementReasonsDao_Impl;
import com.fastservices.sams.data.dao.SKUCategoryDao;
import com.fastservices.sams.data.dao.SKUCategoryDao_Impl;
import com.fastservices.sams.data.dao.SKUDao;
import com.fastservices.sams.data.dao.SKUDao_Impl;
import com.fastservices.sams.data.dao.SKUGroupDao;
import com.fastservices.sams.data.dao.SKUGroupDao_Impl;
import com.fastservices.sams.data.dao.SectionDao;
import com.fastservices.sams.data.dao.SectionDao_Impl;
import com.fastservices.sams.data.dao.StockMasterDao;
import com.fastservices.sams.data.dao.StockMasterDao_Impl;
import com.fastservices.sams.data.dao.StockPositioningDao;
import com.fastservices.sams.data.dao.StockPositioningDao_Impl;
import com.fastservices.sams.data.dao.UserDao;
import com.fastservices.sams.data.dao.UserDao_Impl;
import com.fastservices.sams.data.dao.promotions.BasketDetailDao;
import com.fastservices.sams.data.dao.promotions.BasketDetailDao_Impl;
import com.fastservices.sams.data.dao.promotions.BasketMasterDao;
import com.fastservices.sams.data.dao.promotions.BasketMasterDao_Impl;
import com.fastservices.sams.data.dao.promotions.PromotionCustomerDao;
import com.fastservices.sams.data.dao.promotions.PromotionCustomerDao_Impl;
import com.fastservices.sams.data.dao.promotions.PromotionDao;
import com.fastservices.sams.data.dao.promotions.PromotionDao_Impl;
import com.fastservices.sams.data.dao.promotions.PromotionOfferDao;
import com.fastservices.sams.data.dao.promotions.PromotionOfferDao_Impl;
import com.fastservices.sams.data.dao.promotions.PromotionValueDao;
import com.fastservices.sams.data.dao.promotions.PromotionValueDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public class AppDatabase_Impl extends AppDatabase {
  private volatile OutletDao _outletDao;

  private volatile OutletLocalDao _outletLocalDao;

  private volatile UserDao _userDao;

  private volatile MenuDao _menuDao;

  private volatile SectionDao _sectionDao;

  private volatile ChannelDao _channelDao;

  private volatile MerchandiseDao _merchandiseDao;

  private volatile ComplaintReasonsDao _complaintReasonsDao;

  private volatile ReplacementReasonsDao _replacementReasonsDao;

  private volatile OutletComplaintDao _outletComplaintDao;

  private volatile SKUCategoryDao _sKUCategoryDao;

  private volatile SKUDao _sKUDao;

  private volatile NoOrderReasonDao _noOrderReasonDao;

  private volatile NoOrderDao _noOrderDao;

  private volatile OrderMasterDao _orderMasterDao;

  private volatile OrderDetailDao _orderDetailDao;

  private volatile OrderDetailFreeSKUDao _orderDetailFreeSKUDao;

  private volatile StockMasterDao _stockMasterDao;

  private volatile StockPositioningDao _stockPositioningDao;

  private volatile ReplacementDao _replacementDao;

  private volatile PromotionDao _promotionDao;

  private volatile PromotionValueDao _promotionValueDao;

  private volatile PromotionCustomerDao _promotionCustomerDao;

  private volatile BasketMasterDao _basketMasterDao;

  private volatile BasketDetailDao _basketDetailDao;

  private volatile PromotionOfferDao _promotionOfferDao;

  private volatile SKUGroupDao _sKUGroupDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `BRAND` (`SKU_HIE_ID` INTEGER NOT NULL, `PARENT_SKU_HIE_ID` INTEGER NOT NULL, `SKU_HIE_NAME` TEXT NOT NULL, PRIMARY KEY(`SKU_HIE_ID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `CATEGORY` (`SKU_HIE_ID` INTEGER NOT NULL, `SKU_HIE_NAME` TEXT NOT NULL, `PARENT_SKU_HIE_ID` INTEGER NOT NULL, PRIMARY KEY(`SKU_HIE_ID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `CUSTOMER_ORDER_STATUS` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `CUSTOMER_ID` INTEGER NOT NULL, `AREA_ID` INTEGER NOT NULL, `DOCUMENT_DATE` INTEGER NOT NULL, `STATUS_ID` INTEGER NOT NULL, `TIME_IN` INTEGER NOT NULL, `TIME_OUT` INTEGER NOT NULL, `IS_SYNCED` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `CUSTOMER_UNORDERED_STATUS` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `CUSTOMER_UNORDERED_STATUS_ID` INTEGER, `STATUS` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `DISTRIBUTOR_AREA` (`AREA_ID` INTEGER NOT NULL, `AREA_CODE` TEXT NOT NULL, `AREA_NAME` TEXT NOT NULL, PRIMARY KEY(`AREA_ID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ORDER_DETAIL` (`ORDER_DETAIL_ID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `DISTRIBUTOR_ID` INTEGER NOT NULL, `SALE_ORDER_ID` INTEGER NOT NULL, `SKU_ID` INTEGER NOT NULL, `QUANTITY_UNIT` INTEGER NOT NULL, `UNIT_PRICE` REAL NOT NULL, `GST_RATE` REAL NOT NULL, `AMOUNT` REAL NOT NULL, `STANDARD_DISCOUNT` REAL NOT NULL, `EXTRA_DISCOUNT` REAL NOT NULL, `GST_AMOUNT` REAL NOT NULL, `NET_AMOUNT` REAL NOT NULL, `TST_AMOUNT` REAL NOT NULL, `SED_AMOUNT` REAL NOT NULL, `UNITS_IN_CASE` INTEGER NOT NULL, `EXTRA_TAX` REAL NOT NULL, `GST_PRICE` REAL NOT NULL, `STANDARD_DISCOUNT_BY_VALUE` REAL NOT NULL, `STANDARD_DISCOUNT_PER_VALUE` REAL NOT NULL, `SED_AMOUNT_BY_VALUE` REAL NOT NULL, `SED_AMOUNT_PER_VALUE` REAL NOT NULL, `STANDARD_DISCOUNT_BY_VALUE_TO` REAL NOT NULL, `STANDARD_DISCOUNT_BY_VALUE_AD` REAL NOT NULL, `STANDARD_DISCOUNT_PER_VALUE_TO` REAL NOT NULL, `STANDARD_DISCOUNT_PER_VALUE_AD` REAL NOT NULL, `SED_AMOUNT_BY_VALUE_TO` REAL NOT NULL, `SED_AMOUNT_BY_VALUE_AD` REAL NOT NULL, `SED_AMOUNT_PER_VALUE_TO` REAL NOT NULL, `SED_AMOUNT_PER_VALUE_AD` REAL NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `SALE_ORDER_PROMOTION` (`SALE_ORDER_PROMOTION_ID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `DISTRIBUTOR_ID` INTEGER NOT NULL, `SALE_ORDER_ID` INTEGER NOT NULL, `SCHEME_ID` INTEGER NOT NULL, `PROMOTION_ID` INTEGER NOT NULL, `BASKET_ID` INTEGER NOT NULL, `BASKET_DETAIL_ID` INTEGER NOT NULL, `PROMOTION_OFFER_ID` INTEGER NOT NULL, `SKU_ID` INTEGER NOT NULL, `QUANTITY` INTEGER NOT NULL, `UNIT_PRICE` REAL NOT NULL, `AMOUNT` REAL NOT NULL, `GST_RATE` REAL NOT NULL, `GST_AMOUNT` REAL NOT NULL, `TST_AMOUNT` REAL NOT NULL, `SED_AMOUNT` REAL NOT NULL, `master_Sku_Id` INTEGER NOT NULL, `EXTRA_TAX` REAL NOT NULL, `QUANTITY_TO` INTEGER NOT NULL, `QUANTITY_AD` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ORDER_MASTER` (`SALE_ORDER_ID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `DISTRIBUTOR_ID` INTEGER NOT NULL, `PRINCIPAL_ID` INTEGER NOT NULL, `SOLD_TO` INTEGER NOT NULL, `TOWN_ID` INTEGER NOT NULL, `AREA_ID` INTEGER NOT NULL, `DOCUMENT_DATE` TEXT NOT NULL, `TOTAL_AMOUNT` REAL NOT NULL, `EXTRA_DISCOUNT_AMOUNT` REAL NOT NULL, `STANDARD_DISCOUNT_AMOUNT` REAL NOT NULL, `GST_AMOUNT` REAL NOT NULL, `TOTAL_NET_AMOUNT` REAL NOT NULL, `SCHEME_AMOUNT` REAL NOT NULL, `TST_AMOUNT` REAL NOT NULL, `SED_AMOUNT` REAL NOT NULL, `REMARKS` TEXT NOT NULL, `EXTRA_TAX` REAL NOT NULL, `STANDARD_DISCOUNT_BY_VALUE` REAL NOT NULL, `STANDARD_DISCOUNT_PER_VALUE` REAL NOT NULL, `SED_AMOUNT_BY_VALUE` REAL NOT NULL, `SED_AMOUNT_PER_VALUE` REAL NOT NULL, `STANDARD_DISCOUNT_BY_VALUE_TO` REAL NOT NULL, `STANDARD_DISCOUNT_BY_VALUE_AD` REAL NOT NULL, `STANDARD_DISCOUNT_PER_VALUE_TO` REAL NOT NULL, `STANDARD_DISCOUNT_PER_VALUE_AD` REAL NOT NULL, `SED_AMOUNT_BY_VALUE_TO` REAL NOT NULL, `SED_AMOUNT_BY_VALUE_AD` REAL NOT NULL, `SED_AMOUNT_PER_VALUE_TO` REAL NOT NULL, `SED_AMOUNT_PER_VALUE_AD` REAL NOT NULL, `TIME_IN` TEXT NOT NULL, `TIME_OUT` TEXT NOT NULL, `OUTLET_ID` INTEGER NOT NULL, `LATITUDE` REAL NOT NULL, `LONGITUDE` REAL NOT NULL, `PHOTO_PATH1` TEXT NOT NULL, `PHOTO_PATH2` TEXT NOT NULL, `PHOTO_PATH3` TEXT NOT NULL, `PHOTO_PATH4` TEXT NOT NULL, `PHOTO_PATH5` TEXT NOT NULL, `ORDER_PAYMENT_TYPE` INTEGER NOT NULL, `IS_SYNCED` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `SKU` (`SKU_ID` INTEGER NOT NULL, `SKU_CODE` TEXT NOT NULL, `SKU_NAME` TEXT NOT NULL, `GST_ON` TEXT NOT NULL, `TRADE_PRICE` REAL NOT NULL, `GST_RATE` REAL NOT NULL, `UNITS_IN_CASE` INTEGER NOT NULL, `BRAND_ID` INTEGER NOT NULL, `WEIGHT` INTEGER NOT NULL, `DISTRIBUTOR_PRICE` REAL NOT NULL, `RETAIL_PRICE` REAL NOT NULL, `EXTR_Tax` REAL NOT NULL, `SEQUENCE_NUMBER` INTEGER NOT NULL, `UOM_DESC` TEXT NOT NULL, `CATEGORY_ID` INTEGER NOT NULL, PRIMARY KEY(`SKU_ID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `USER` (`USER_ID` INTEGER NOT NULL, `COMPANY_ID` INTEGER NOT NULL, `DISTRIBUTOR_ID` INTEGER NOT NULL, `ROLE_ID` INTEGER NOT NULL, `LOGIN_ID` TEXT NOT NULL, `PASSWORD` TEXT NOT NULL, `IS_ACTIVE` INTEGER NOT NULL, `LASTUPDATE_DATE` TEXT, PRIMARY KEY(`USER_ID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Outlet` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `outletID` INTEGER NOT NULL, `outletName` TEXT NOT NULL, `ownerName` TEXT NOT NULL, `phoneNumber` TEXT NOT NULL, `storeAddress` TEXT NOT NULL, `landMark` TEXT NOT NULL, `sectionID` INTEGER NOT NULL, `channelID` INTEGER NOT NULL, `routeID` INTEGER NOT NULL, `townID` INTEGER NOT NULL, `subChannelID` INTEGER NOT NULL, `promotionClass` INTEGER NOT NULL, `closing` REAL NOT NULL, `creditLimit` REAL NOT NULL, `creditDays` INTEGER NOT NULL, `isRegistered` INTEGER NOT NULL, `sequenceNo` INTEGER NOT NULL, `comments` TEXT NOT NULL, `latitude` REAL NOT NULL, `longtidue` REAL NOT NULL, `photoPath1` TEXT NOT NULL, `photoPath2` TEXT NOT NULL, `photoPath3` TEXT NOT NULL, `photoPath4` TEXT NOT NULL, `photoPath5` TEXT NOT NULL, `areaTypeId` INTEGER NOT NULL, `lastOrderDate` TEXT NOT NULL, `lastOrderAmount` REAL NOT NULL, `isCredit` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `OutletLocal` (`OutletID` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `OutletName` TEXT NOT NULL, `OwnerName` TEXT NOT NULL, `PhoneNumber` TEXT NOT NULL, `OutletAddress` TEXT NOT NULL, `LandMark` TEXT NOT NULL, `SectionID` INTEGER NOT NULL, `ChannelID` INTEGER NOT NULL, `TownID` INTEGER NOT NULL, `SubChannelID` INTEGER NOT NULL, `Comments` TEXT NOT NULL, `Latitude` REAL NOT NULL, `Longtidue` REAL NOT NULL, `PhotoPath1` TEXT NOT NULL, `PhotoPath2` TEXT NOT NULL, `PhotoPath3` TEXT NOT NULL, `PhotoPath4` TEXT NOT NULL, `PhotoPath5` TEXT NOT NULL, `AreaTypeId` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `MENU` (`androidMenuID` INTEGER NOT NULL, `menuName` TEXT NOT NULL, `isActive` INTEGER NOT NULL, PRIMARY KEY(`androidMenuID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `SECTIONS` (`sectionID` INTEGER NOT NULL, `sectionCode` TEXT, `sectionName` TEXT, PRIMARY KEY(`sectionID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `CHANNEL` (`id` INTEGER NOT NULL, `code` TEXT NOT NULL, `name` TEXT NOT NULL, `status` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `SUBCHANNEL` (`id` INTEGER NOT NULL, `code` TEXT NOT NULL, `name` TEXT NOT NULL, `parentID` INTEGER NOT NULL, `status` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Merchandise` (`OutletID` INTEGER NOT NULL, `DocumentDate` TEXT, `Remarks` TEXT, `Image1Path1` TEXT, `Image1Path2` TEXT, `Image1Path3` TEXT, `Image1Path4` TEXT, `Image1Path5` TEXT, `Image2Path1` TEXT, `Image2Path2` TEXT, `Image2Path3` TEXT, `Image2Path4` TEXT, `Image2Path5` TEXT, PRIMARY KEY(`OutletID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ComplaintReason` (`complaintReasonID` INTEGER NOT NULL, `complaintReason` TEXT NOT NULL, `check` INTEGER NOT NULL, `remarks` TEXT, PRIMARY KEY(`complaintReasonID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ReplacementReason` (`replacementReasonID` INTEGER NOT NULL, `replacementReason` TEXT NOT NULL, PRIMARY KEY(`replacementReasonID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `OutletComplaint` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `CustomerID` TEXT NOT NULL, `ComplaintReasonID` INTEGER NOT NULL, `DocumentDate` TEXT NOT NULL, `Remarks` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `NoOrderReason` (`unOrderReasonID` INTEGER NOT NULL, `unOrderReason` TEXT NOT NULL, PRIMARY KEY(`unOrderReasonID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `NoOrderItem` (`OutletID` INTEGER NOT NULL, `SectionID` TEXT NOT NULL, `DocumentDate` TEXT NOT NULL, `ReasonID` TEXT NOT NULL, `TimeIn` TEXT NOT NULL, `TimeOut` TEXT NOT NULL, `Comments` TEXT NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `photoPath1` TEXT NOT NULL, `photoPath2` TEXT NOT NULL, `photoPath3` TEXT NOT NULL, `photoPath4` TEXT NOT NULL, `photoPath5` TEXT NOT NULL, PRIMARY KEY(`OutletID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `SKUGroup` (`skU_GROUP_ID` INTEGER NOT NULL, `skU_GROUP_DETAIL_ID` INTEGER NOT NULL, `skU_ID` INTEGER NOT NULL, PRIMARY KEY(`skU_GROUP_DETAIL_ID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `dtBasketDetail` (`BASKET_DETAIL_ID` INTEGER NOT NULL, `BASKET_ID` INTEGER NOT NULL, `PROMOTION_ID` INTEGER NOT NULL, `SCHEME_ID` INTEGER NOT NULL, `DISTRIBUTOR_ID` INTEGER NOT NULL, `MIN_VAL` REAL, `MAX_VAL` REAL, `MULTIPLE_OF` INTEGER NOT NULL, `SKU_ID` INTEGER NOT NULL, `SKU_GROUP_ID` INTEGER NOT NULL, `UOM_ID` INTEGER NOT NULL, PRIMARY KEY(`BASKET_DETAIL_ID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `dtBasketMaster` (`BASKET_ID` INTEGER NOT NULL, `PROMOTION_ID` INTEGER NOT NULL, `SCHEME_ID` INTEGER NOT NULL, `DISTRIBUTOR_ID` INTEGER NOT NULL, `IS_BASKET` INTEGER, `IS_AND` INTEGER NOT NULL, `IS_MULTIPLE` INTEGER, `BASKET_ON` INTEGER NOT NULL, `BASKET_SELECTION` INTEGER NOT NULL, PRIMARY KEY(`BASKET_ID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `dtFreeSKUDetail` (`Master_SKU_ID` INTEGER NOT NULL, `SKU_ID` INTEGER NOT NULL, `SKU_Code` TEXT, `SKU_Name` TEXT, `UNIT_PRICE` REAL NOT NULL, `QUANTITY` INTEGER NOT NULL, `Quantity_TO` INTEGER NOT NULL, `Quantity_AD` INTEGER NOT NULL, `AMOUNT` REAL NOT NULL, `GST_RATE` REAL NOT NULL, `GST_AMOUNT` REAL NOT NULL, `TST_AMOUNT` REAL NOT NULL, `PROMOTION_ID` INTEGER NOT NULL, `BASKET_ID` INTEGER NOT NULL, `BASKET_DETAIL_ID` INTEGER NOT NULL, `PROMOTION_OFFER_ID` INTEGER NOT NULL, `Group_Id` INTEGER NOT NULL, `Extra_tax` REAL NOT NULL, `GST_Price` REAL NOT NULL, `WEIGHT` REAL NOT NULL, `UOM_DESC` TEXT, PRIMARY KEY(`SKU_ID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `dtPromotion` (`PROMOTION_ID` INTEGER NOT NULL, `SCHEME_ID` INTEGER NOT NULL, `DISTRIBUTOR_ID` INTEGER NOT NULL, `CLAIMABLE` INTEGER NOT NULL, `START_DATE` TEXT, `END_DATE` TEXT, `PROMOTION_TYPE` INTEGER NOT NULL, `PROMOTION_SELECTION` INTEGER NOT NULL, `IS_SCHEME` INTEGER, `PROMOTION_FOR` INTEGER, `USER_ID` INTEGER NOT NULL, PRIMARY KEY(`PROMOTION_ID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `dtPromotionCustomerType` (`PROMOTION_CUSTOMER_TYPE_ID` INTEGER NOT NULL, `SCHEME_ID` INTEGER NOT NULL, `PROMOTION_ID` INTEGER NOT NULL, `DISTRIBUTOR_ID` INTEGER NOT NULL, `CUSTOMER_TYPE_ID` INTEGER NOT NULL, PRIMARY KEY(`PROMOTION_CUSTOMER_TYPE_ID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `dtPromotionOffer` (`PROMOTION_OFFER_ID` INTEGER NOT NULL, `BASKET_ID` INTEGER NOT NULL, `PROMOTION_ID` INTEGER NOT NULL, `SCHEME_ID` INTEGER NOT NULL, `DISTRIBUTOR_ID` INTEGER NOT NULL, `BASKET_DETAIL_ID` INTEGER NOT NULL, `QUANTITY` INTEGER NOT NULL, `OFFER_VALUE` REAL, `DISCOUNT` REAL NOT NULL, `IS_AND` INTEGER NOT NULL, `SKU_ID` INTEGER NOT NULL, `UOM_ID` INTEGER NOT NULL, `OFFER_VALUE_TYPE` INTEGER NOT NULL, `DISCOUNT_TYPE` INTEGER NOT NULL, `SKUOfferTypeID` INTEGER NOT NULL, `CLAIMABLE` INTEGER NOT NULL, `FreeSKUID` INTEGER NOT NULL, `Group_ID` INTEGER NOT NULL, PRIMARY KEY(`PROMOTION_OFFER_ID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `dtPromotionValueClass` (`PROMOTION_VOLUMECLASS_ID` INTEGER NOT NULL, `SCHEME_ID` INTEGER NOT NULL, `PROMOTION_ID` INTEGER NOT NULL, `DISTRIBUTOR_ID` INTEGER NOT NULL, `CUSTOMER_VOLUMECLASS_ID` INTEGER NOT NULL, PRIMARY KEY(`PROMOTION_VOLUMECLASS_ID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `StockPosition` (`SKU_ID` TEXT NOT NULL, `Quantity` TEXT NOT NULL, `Price` REAL NOT NULL, `UnitInCase` INTEGER NOT NULL, `SKU_NAME` TEXT NOT NULL, `SKU_CODE` TEXT NOT NULL, `STOCK_MASTER_ID` INTEGER NOT NULL, PRIMARY KEY(`SKU_ID`, `STOCK_MASTER_ID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `StockPositionMaster` (`OUTLET_ID` INTEGER NOT NULL, `IS_SYNCED` INTEGER NOT NULL, PRIMARY KEY(`OUTLET_ID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Replacement` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `outletId` TEXT NOT NULL, `ReplacementTypeID` TEXT NOT NULL, `SKUID` TEXT NOT NULL, `Price` TEXT NOT NULL, `InvoiceNo` TEXT NOT NULL, `InvoiceDate` TEXT NOT NULL, `Description` TEXT NOT NULL, `StockImage1` TEXT NOT NULL, `StockImage2` TEXT NOT NULL, `StockImage3` TEXT NOT NULL, `StockImage4` TEXT NOT NULL, `StockImage5` TEXT NOT NULL, `InvoiceImage1` TEXT NOT NULL, `InvoiceImage2` TEXT NOT NULL, `InvoiceImage3` TEXT NOT NULL, `InvoiceImage4` TEXT NOT NULL, `InvoiceImage5` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"8078a3f433445f898e614ffa9e8d8482\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `BRAND`");
        _db.execSQL("DROP TABLE IF EXISTS `CATEGORY`");
        _db.execSQL("DROP TABLE IF EXISTS `CUSTOMER_ORDER_STATUS`");
        _db.execSQL("DROP TABLE IF EXISTS `CUSTOMER_UNORDERED_STATUS`");
        _db.execSQL("DROP TABLE IF EXISTS `DISTRIBUTOR_AREA`");
        _db.execSQL("DROP TABLE IF EXISTS `ORDER_DETAIL`");
        _db.execSQL("DROP TABLE IF EXISTS `SALE_ORDER_PROMOTION`");
        _db.execSQL("DROP TABLE IF EXISTS `ORDER_MASTER`");
        _db.execSQL("DROP TABLE IF EXISTS `SKU`");
        _db.execSQL("DROP TABLE IF EXISTS `USER`");
        _db.execSQL("DROP TABLE IF EXISTS `Outlet`");
        _db.execSQL("DROP TABLE IF EXISTS `OutletLocal`");
        _db.execSQL("DROP TABLE IF EXISTS `MENU`");
        _db.execSQL("DROP TABLE IF EXISTS `SECTIONS`");
        _db.execSQL("DROP TABLE IF EXISTS `CHANNEL`");
        _db.execSQL("DROP TABLE IF EXISTS `SUBCHANNEL`");
        _db.execSQL("DROP TABLE IF EXISTS `Merchandise`");
        _db.execSQL("DROP TABLE IF EXISTS `ComplaintReason`");
        _db.execSQL("DROP TABLE IF EXISTS `ReplacementReason`");
        _db.execSQL("DROP TABLE IF EXISTS `OutletComplaint`");
        _db.execSQL("DROP TABLE IF EXISTS `NoOrderReason`");
        _db.execSQL("DROP TABLE IF EXISTS `NoOrderItem`");
        _db.execSQL("DROP TABLE IF EXISTS `SKUGroup`");
        _db.execSQL("DROP TABLE IF EXISTS `dtBasketDetail`");
        _db.execSQL("DROP TABLE IF EXISTS `dtBasketMaster`");
        _db.execSQL("DROP TABLE IF EXISTS `dtFreeSKUDetail`");
        _db.execSQL("DROP TABLE IF EXISTS `dtPromotion`");
        _db.execSQL("DROP TABLE IF EXISTS `dtPromotionCustomerType`");
        _db.execSQL("DROP TABLE IF EXISTS `dtPromotionOffer`");
        _db.execSQL("DROP TABLE IF EXISTS `dtPromotionValueClass`");
        _db.execSQL("DROP TABLE IF EXISTS `StockPosition`");
        _db.execSQL("DROP TABLE IF EXISTS `StockPositionMaster`");
        _db.execSQL("DROP TABLE IF EXISTS `Replacement`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsBRAND = new HashMap<String, TableInfo.Column>(3);
        _columnsBRAND.put("SKU_HIE_ID", new TableInfo.Column("SKU_HIE_ID", "INTEGER", true, 1));
        _columnsBRAND.put("PARENT_SKU_HIE_ID", new TableInfo.Column("PARENT_SKU_HIE_ID", "INTEGER", true, 0));
        _columnsBRAND.put("SKU_HIE_NAME", new TableInfo.Column("SKU_HIE_NAME", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBRAND = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBRAND = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBRAND = new TableInfo("BRAND", _columnsBRAND, _foreignKeysBRAND, _indicesBRAND);
        final TableInfo _existingBRAND = TableInfo.read(_db, "BRAND");
        if (! _infoBRAND.equals(_existingBRAND)) {
          throw new IllegalStateException("Migration didn't properly handle BRAND(com.fastservices.sams.data.entities.Brand).\n"
                  + " Expected:\n" + _infoBRAND + "\n"
                  + " Found:\n" + _existingBRAND);
        }
        final HashMap<String, TableInfo.Column> _columnsCATEGORY = new HashMap<String, TableInfo.Column>(3);
        _columnsCATEGORY.put("SKU_HIE_ID", new TableInfo.Column("SKU_HIE_ID", "INTEGER", true, 1));
        _columnsCATEGORY.put("SKU_HIE_NAME", new TableInfo.Column("SKU_HIE_NAME", "TEXT", true, 0));
        _columnsCATEGORY.put("PARENT_SKU_HIE_ID", new TableInfo.Column("PARENT_SKU_HIE_ID", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCATEGORY = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCATEGORY = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCATEGORY = new TableInfo("CATEGORY", _columnsCATEGORY, _foreignKeysCATEGORY, _indicesCATEGORY);
        final TableInfo _existingCATEGORY = TableInfo.read(_db, "CATEGORY");
        if (! _infoCATEGORY.equals(_existingCATEGORY)) {
          throw new IllegalStateException("Migration didn't properly handle CATEGORY(com.fastservices.sams.data.entities.Category).\n"
                  + " Expected:\n" + _infoCATEGORY + "\n"
                  + " Found:\n" + _existingCATEGORY);
        }
        final HashMap<String, TableInfo.Column> _columnsCUSTOMERORDERSTATUS = new HashMap<String, TableInfo.Column>(8);
        _columnsCUSTOMERORDERSTATUS.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsCUSTOMERORDERSTATUS.put("CUSTOMER_ID", new TableInfo.Column("CUSTOMER_ID", "INTEGER", true, 0));
        _columnsCUSTOMERORDERSTATUS.put("AREA_ID", new TableInfo.Column("AREA_ID", "INTEGER", true, 0));
        _columnsCUSTOMERORDERSTATUS.put("DOCUMENT_DATE", new TableInfo.Column("DOCUMENT_DATE", "INTEGER", true, 0));
        _columnsCUSTOMERORDERSTATUS.put("STATUS_ID", new TableInfo.Column("STATUS_ID", "INTEGER", true, 0));
        _columnsCUSTOMERORDERSTATUS.put("TIME_IN", new TableInfo.Column("TIME_IN", "INTEGER", true, 0));
        _columnsCUSTOMERORDERSTATUS.put("TIME_OUT", new TableInfo.Column("TIME_OUT", "INTEGER", true, 0));
        _columnsCUSTOMERORDERSTATUS.put("IS_SYNCED", new TableInfo.Column("IS_SYNCED", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCUSTOMERORDERSTATUS = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCUSTOMERORDERSTATUS = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCUSTOMERORDERSTATUS = new TableInfo("CUSTOMER_ORDER_STATUS", _columnsCUSTOMERORDERSTATUS, _foreignKeysCUSTOMERORDERSTATUS, _indicesCUSTOMERORDERSTATUS);
        final TableInfo _existingCUSTOMERORDERSTATUS = TableInfo.read(_db, "CUSTOMER_ORDER_STATUS");
        if (! _infoCUSTOMERORDERSTATUS.equals(_existingCUSTOMERORDERSTATUS)) {
          throw new IllegalStateException("Migration didn't properly handle CUSTOMER_ORDER_STATUS(com.fastservices.sams.data.entities.CustomerOrderStatus).\n"
                  + " Expected:\n" + _infoCUSTOMERORDERSTATUS + "\n"
                  + " Found:\n" + _existingCUSTOMERORDERSTATUS);
        }
        final HashMap<String, TableInfo.Column> _columnsCUSTOMERUNORDEREDSTATUS = new HashMap<String, TableInfo.Column>(3);
        _columnsCUSTOMERUNORDEREDSTATUS.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsCUSTOMERUNORDEREDSTATUS.put("CUSTOMER_UNORDERED_STATUS_ID", new TableInfo.Column("CUSTOMER_UNORDERED_STATUS_ID", "INTEGER", false, 0));
        _columnsCUSTOMERUNORDEREDSTATUS.put("STATUS", new TableInfo.Column("STATUS", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCUSTOMERUNORDEREDSTATUS = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCUSTOMERUNORDEREDSTATUS = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCUSTOMERUNORDEREDSTATUS = new TableInfo("CUSTOMER_UNORDERED_STATUS", _columnsCUSTOMERUNORDEREDSTATUS, _foreignKeysCUSTOMERUNORDEREDSTATUS, _indicesCUSTOMERUNORDEREDSTATUS);
        final TableInfo _existingCUSTOMERUNORDEREDSTATUS = TableInfo.read(_db, "CUSTOMER_UNORDERED_STATUS");
        if (! _infoCUSTOMERUNORDEREDSTATUS.equals(_existingCUSTOMERUNORDEREDSTATUS)) {
          throw new IllegalStateException("Migration didn't properly handle CUSTOMER_UNORDERED_STATUS(com.fastservices.sams.data.entities.CustomerUnorderedStatus).\n"
                  + " Expected:\n" + _infoCUSTOMERUNORDEREDSTATUS + "\n"
                  + " Found:\n" + _existingCUSTOMERUNORDEREDSTATUS);
        }
        final HashMap<String, TableInfo.Column> _columnsDISTRIBUTORAREA = new HashMap<String, TableInfo.Column>(3);
        _columnsDISTRIBUTORAREA.put("AREA_ID", new TableInfo.Column("AREA_ID", "INTEGER", true, 1));
        _columnsDISTRIBUTORAREA.put("AREA_CODE", new TableInfo.Column("AREA_CODE", "TEXT", true, 0));
        _columnsDISTRIBUTORAREA.put("AREA_NAME", new TableInfo.Column("AREA_NAME", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDISTRIBUTORAREA = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDISTRIBUTORAREA = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDISTRIBUTORAREA = new TableInfo("DISTRIBUTOR_AREA", _columnsDISTRIBUTORAREA, _foreignKeysDISTRIBUTORAREA, _indicesDISTRIBUTORAREA);
        final TableInfo _existingDISTRIBUTORAREA = TableInfo.read(_db, "DISTRIBUTOR_AREA");
        if (! _infoDISTRIBUTORAREA.equals(_existingDISTRIBUTORAREA)) {
          throw new IllegalStateException("Migration didn't properly handle DISTRIBUTOR_AREA(com.fastservices.sams.data.entities.DistributorArea).\n"
                  + " Expected:\n" + _infoDISTRIBUTORAREA + "\n"
                  + " Found:\n" + _existingDISTRIBUTORAREA);
        }
        final HashMap<String, TableInfo.Column> _columnsORDERDETAIL = new HashMap<String, TableInfo.Column>(29);
        _columnsORDERDETAIL.put("ORDER_DETAIL_ID", new TableInfo.Column("ORDER_DETAIL_ID", "INTEGER", true, 1));
        _columnsORDERDETAIL.put("DISTRIBUTOR_ID", new TableInfo.Column("DISTRIBUTOR_ID", "INTEGER", true, 0));
        _columnsORDERDETAIL.put("SALE_ORDER_ID", new TableInfo.Column("SALE_ORDER_ID", "INTEGER", true, 0));
        _columnsORDERDETAIL.put("SKU_ID", new TableInfo.Column("SKU_ID", "INTEGER", true, 0));
        _columnsORDERDETAIL.put("QUANTITY_UNIT", new TableInfo.Column("QUANTITY_UNIT", "INTEGER", true, 0));
        _columnsORDERDETAIL.put("UNIT_PRICE", new TableInfo.Column("UNIT_PRICE", "REAL", true, 0));
        _columnsORDERDETAIL.put("GST_RATE", new TableInfo.Column("GST_RATE", "REAL", true, 0));
        _columnsORDERDETAIL.put("AMOUNT", new TableInfo.Column("AMOUNT", "REAL", true, 0));
        _columnsORDERDETAIL.put("STANDARD_DISCOUNT", new TableInfo.Column("STANDARD_DISCOUNT", "REAL", true, 0));
        _columnsORDERDETAIL.put("EXTRA_DISCOUNT", new TableInfo.Column("EXTRA_DISCOUNT", "REAL", true, 0));
        _columnsORDERDETAIL.put("GST_AMOUNT", new TableInfo.Column("GST_AMOUNT", "REAL", true, 0));
        _columnsORDERDETAIL.put("NET_AMOUNT", new TableInfo.Column("NET_AMOUNT", "REAL", true, 0));
        _columnsORDERDETAIL.put("TST_AMOUNT", new TableInfo.Column("TST_AMOUNT", "REAL", true, 0));
        _columnsORDERDETAIL.put("SED_AMOUNT", new TableInfo.Column("SED_AMOUNT", "REAL", true, 0));
        _columnsORDERDETAIL.put("UNITS_IN_CASE", new TableInfo.Column("UNITS_IN_CASE", "INTEGER", true, 0));
        _columnsORDERDETAIL.put("EXTRA_TAX", new TableInfo.Column("EXTRA_TAX", "REAL", true, 0));
        _columnsORDERDETAIL.put("GST_PRICE", new TableInfo.Column("GST_PRICE", "REAL", true, 0));
        _columnsORDERDETAIL.put("STANDARD_DISCOUNT_BY_VALUE", new TableInfo.Column("STANDARD_DISCOUNT_BY_VALUE", "REAL", true, 0));
        _columnsORDERDETAIL.put("STANDARD_DISCOUNT_PER_VALUE", new TableInfo.Column("STANDARD_DISCOUNT_PER_VALUE", "REAL", true, 0));
        _columnsORDERDETAIL.put("SED_AMOUNT_BY_VALUE", new TableInfo.Column("SED_AMOUNT_BY_VALUE", "REAL", true, 0));
        _columnsORDERDETAIL.put("SED_AMOUNT_PER_VALUE", new TableInfo.Column("SED_AMOUNT_PER_VALUE", "REAL", true, 0));
        _columnsORDERDETAIL.put("STANDARD_DISCOUNT_BY_VALUE_TO", new TableInfo.Column("STANDARD_DISCOUNT_BY_VALUE_TO", "REAL", true, 0));
        _columnsORDERDETAIL.put("STANDARD_DISCOUNT_BY_VALUE_AD", new TableInfo.Column("STANDARD_DISCOUNT_BY_VALUE_AD", "REAL", true, 0));
        _columnsORDERDETAIL.put("STANDARD_DISCOUNT_PER_VALUE_TO", new TableInfo.Column("STANDARD_DISCOUNT_PER_VALUE_TO", "REAL", true, 0));
        _columnsORDERDETAIL.put("STANDARD_DISCOUNT_PER_VALUE_AD", new TableInfo.Column("STANDARD_DISCOUNT_PER_VALUE_AD", "REAL", true, 0));
        _columnsORDERDETAIL.put("SED_AMOUNT_BY_VALUE_TO", new TableInfo.Column("SED_AMOUNT_BY_VALUE_TO", "REAL", true, 0));
        _columnsORDERDETAIL.put("SED_AMOUNT_BY_VALUE_AD", new TableInfo.Column("SED_AMOUNT_BY_VALUE_AD", "REAL", true, 0));
        _columnsORDERDETAIL.put("SED_AMOUNT_PER_VALUE_TO", new TableInfo.Column("SED_AMOUNT_PER_VALUE_TO", "REAL", true, 0));
        _columnsORDERDETAIL.put("SED_AMOUNT_PER_VALUE_AD", new TableInfo.Column("SED_AMOUNT_PER_VALUE_AD", "REAL", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysORDERDETAIL = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesORDERDETAIL = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoORDERDETAIL = new TableInfo("ORDER_DETAIL", _columnsORDERDETAIL, _foreignKeysORDERDETAIL, _indicesORDERDETAIL);
        final TableInfo _existingORDERDETAIL = TableInfo.read(_db, "ORDER_DETAIL");
        if (! _infoORDERDETAIL.equals(_existingORDERDETAIL)) {
          throw new IllegalStateException("Migration didn't properly handle ORDER_DETAIL(com.fastservices.sams.data.entities.OrderDetail).\n"
                  + " Expected:\n" + _infoORDERDETAIL + "\n"
                  + " Found:\n" + _existingORDERDETAIL);
        }
        final HashMap<String, TableInfo.Column> _columnsSALEORDERPROMOTION = new HashMap<String, TableInfo.Column>(20);
        _columnsSALEORDERPROMOTION.put("SALE_ORDER_PROMOTION_ID", new TableInfo.Column("SALE_ORDER_PROMOTION_ID", "INTEGER", true, 1));
        _columnsSALEORDERPROMOTION.put("DISTRIBUTOR_ID", new TableInfo.Column("DISTRIBUTOR_ID", "INTEGER", true, 0));
        _columnsSALEORDERPROMOTION.put("SALE_ORDER_ID", new TableInfo.Column("SALE_ORDER_ID", "INTEGER", true, 0));
        _columnsSALEORDERPROMOTION.put("SCHEME_ID", new TableInfo.Column("SCHEME_ID", "INTEGER", true, 0));
        _columnsSALEORDERPROMOTION.put("PROMOTION_ID", new TableInfo.Column("PROMOTION_ID", "INTEGER", true, 0));
        _columnsSALEORDERPROMOTION.put("BASKET_ID", new TableInfo.Column("BASKET_ID", "INTEGER", true, 0));
        _columnsSALEORDERPROMOTION.put("BASKET_DETAIL_ID", new TableInfo.Column("BASKET_DETAIL_ID", "INTEGER", true, 0));
        _columnsSALEORDERPROMOTION.put("PROMOTION_OFFER_ID", new TableInfo.Column("PROMOTION_OFFER_ID", "INTEGER", true, 0));
        _columnsSALEORDERPROMOTION.put("SKU_ID", new TableInfo.Column("SKU_ID", "INTEGER", true, 0));
        _columnsSALEORDERPROMOTION.put("QUANTITY", new TableInfo.Column("QUANTITY", "INTEGER", true, 0));
        _columnsSALEORDERPROMOTION.put("UNIT_PRICE", new TableInfo.Column("UNIT_PRICE", "REAL", true, 0));
        _columnsSALEORDERPROMOTION.put("AMOUNT", new TableInfo.Column("AMOUNT", "REAL", true, 0));
        _columnsSALEORDERPROMOTION.put("GST_RATE", new TableInfo.Column("GST_RATE", "REAL", true, 0));
        _columnsSALEORDERPROMOTION.put("GST_AMOUNT", new TableInfo.Column("GST_AMOUNT", "REAL", true, 0));
        _columnsSALEORDERPROMOTION.put("TST_AMOUNT", new TableInfo.Column("TST_AMOUNT", "REAL", true, 0));
        _columnsSALEORDERPROMOTION.put("SED_AMOUNT", new TableInfo.Column("SED_AMOUNT", "REAL", true, 0));
        _columnsSALEORDERPROMOTION.put("master_Sku_Id", new TableInfo.Column("master_Sku_Id", "INTEGER", true, 0));
        _columnsSALEORDERPROMOTION.put("EXTRA_TAX", new TableInfo.Column("EXTRA_TAX", "REAL", true, 0));
        _columnsSALEORDERPROMOTION.put("QUANTITY_TO", new TableInfo.Column("QUANTITY_TO", "INTEGER", true, 0));
        _columnsSALEORDERPROMOTION.put("QUANTITY_AD", new TableInfo.Column("QUANTITY_AD", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSALEORDERPROMOTION = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSALEORDERPROMOTION = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSALEORDERPROMOTION = new TableInfo("SALE_ORDER_PROMOTION", _columnsSALEORDERPROMOTION, _foreignKeysSALEORDERPROMOTION, _indicesSALEORDERPROMOTION);
        final TableInfo _existingSALEORDERPROMOTION = TableInfo.read(_db, "SALE_ORDER_PROMOTION");
        if (! _infoSALEORDERPROMOTION.equals(_existingSALEORDERPROMOTION)) {
          throw new IllegalStateException("Migration didn't properly handle SALE_ORDER_PROMOTION(com.fastservices.sams.data.entities.OrderDetailFreeSKU).\n"
                  + " Expected:\n" + _infoSALEORDERPROMOTION + "\n"
                  + " Found:\n" + _existingSALEORDERPROMOTION);
        }
        final HashMap<String, TableInfo.Column> _columnsORDERMASTER = new HashMap<String, TableInfo.Column>(41);
        _columnsORDERMASTER.put("SALE_ORDER_ID", new TableInfo.Column("SALE_ORDER_ID", "INTEGER", true, 1));
        _columnsORDERMASTER.put("DISTRIBUTOR_ID", new TableInfo.Column("DISTRIBUTOR_ID", "INTEGER", true, 0));
        _columnsORDERMASTER.put("PRINCIPAL_ID", new TableInfo.Column("PRINCIPAL_ID", "INTEGER", true, 0));
        _columnsORDERMASTER.put("SOLD_TO", new TableInfo.Column("SOLD_TO", "INTEGER", true, 0));
        _columnsORDERMASTER.put("TOWN_ID", new TableInfo.Column("TOWN_ID", "INTEGER", true, 0));
        _columnsORDERMASTER.put("AREA_ID", new TableInfo.Column("AREA_ID", "INTEGER", true, 0));
        _columnsORDERMASTER.put("DOCUMENT_DATE", new TableInfo.Column("DOCUMENT_DATE", "TEXT", true, 0));
        _columnsORDERMASTER.put("TOTAL_AMOUNT", new TableInfo.Column("TOTAL_AMOUNT", "REAL", true, 0));
        _columnsORDERMASTER.put("EXTRA_DISCOUNT_AMOUNT", new TableInfo.Column("EXTRA_DISCOUNT_AMOUNT", "REAL", true, 0));
        _columnsORDERMASTER.put("STANDARD_DISCOUNT_AMOUNT", new TableInfo.Column("STANDARD_DISCOUNT_AMOUNT", "REAL", true, 0));
        _columnsORDERMASTER.put("GST_AMOUNT", new TableInfo.Column("GST_AMOUNT", "REAL", true, 0));
        _columnsORDERMASTER.put("TOTAL_NET_AMOUNT", new TableInfo.Column("TOTAL_NET_AMOUNT", "REAL", true, 0));
        _columnsORDERMASTER.put("SCHEME_AMOUNT", new TableInfo.Column("SCHEME_AMOUNT", "REAL", true, 0));
        _columnsORDERMASTER.put("TST_AMOUNT", new TableInfo.Column("TST_AMOUNT", "REAL", true, 0));
        _columnsORDERMASTER.put("SED_AMOUNT", new TableInfo.Column("SED_AMOUNT", "REAL", true, 0));
        _columnsORDERMASTER.put("REMARKS", new TableInfo.Column("REMARKS", "TEXT", true, 0));
        _columnsORDERMASTER.put("EXTRA_TAX", new TableInfo.Column("EXTRA_TAX", "REAL", true, 0));
        _columnsORDERMASTER.put("STANDARD_DISCOUNT_BY_VALUE", new TableInfo.Column("STANDARD_DISCOUNT_BY_VALUE", "REAL", true, 0));
        _columnsORDERMASTER.put("STANDARD_DISCOUNT_PER_VALUE", new TableInfo.Column("STANDARD_DISCOUNT_PER_VALUE", "REAL", true, 0));
        _columnsORDERMASTER.put("SED_AMOUNT_BY_VALUE", new TableInfo.Column("SED_AMOUNT_BY_VALUE", "REAL", true, 0));
        _columnsORDERMASTER.put("SED_AMOUNT_PER_VALUE", new TableInfo.Column("SED_AMOUNT_PER_VALUE", "REAL", true, 0));
        _columnsORDERMASTER.put("STANDARD_DISCOUNT_BY_VALUE_TO", new TableInfo.Column("STANDARD_DISCOUNT_BY_VALUE_TO", "REAL", true, 0));
        _columnsORDERMASTER.put("STANDARD_DISCOUNT_BY_VALUE_AD", new TableInfo.Column("STANDARD_DISCOUNT_BY_VALUE_AD", "REAL", true, 0));
        _columnsORDERMASTER.put("STANDARD_DISCOUNT_PER_VALUE_TO", new TableInfo.Column("STANDARD_DISCOUNT_PER_VALUE_TO", "REAL", true, 0));
        _columnsORDERMASTER.put("STANDARD_DISCOUNT_PER_VALUE_AD", new TableInfo.Column("STANDARD_DISCOUNT_PER_VALUE_AD", "REAL", true, 0));
        _columnsORDERMASTER.put("SED_AMOUNT_BY_VALUE_TO", new TableInfo.Column("SED_AMOUNT_BY_VALUE_TO", "REAL", true, 0));
        _columnsORDERMASTER.put("SED_AMOUNT_BY_VALUE_AD", new TableInfo.Column("SED_AMOUNT_BY_VALUE_AD", "REAL", true, 0));
        _columnsORDERMASTER.put("SED_AMOUNT_PER_VALUE_TO", new TableInfo.Column("SED_AMOUNT_PER_VALUE_TO", "REAL", true, 0));
        _columnsORDERMASTER.put("SED_AMOUNT_PER_VALUE_AD", new TableInfo.Column("SED_AMOUNT_PER_VALUE_AD", "REAL", true, 0));
        _columnsORDERMASTER.put("TIME_IN", new TableInfo.Column("TIME_IN", "TEXT", true, 0));
        _columnsORDERMASTER.put("TIME_OUT", new TableInfo.Column("TIME_OUT", "TEXT", true, 0));
        _columnsORDERMASTER.put("OUTLET_ID", new TableInfo.Column("OUTLET_ID", "INTEGER", true, 0));
        _columnsORDERMASTER.put("LATITUDE", new TableInfo.Column("LATITUDE", "REAL", true, 0));
        _columnsORDERMASTER.put("LONGITUDE", new TableInfo.Column("LONGITUDE", "REAL", true, 0));
        _columnsORDERMASTER.put("PHOTO_PATH1", new TableInfo.Column("PHOTO_PATH1", "TEXT", true, 0));
        _columnsORDERMASTER.put("PHOTO_PATH2", new TableInfo.Column("PHOTO_PATH2", "TEXT", true, 0));
        _columnsORDERMASTER.put("PHOTO_PATH3", new TableInfo.Column("PHOTO_PATH3", "TEXT", true, 0));
        _columnsORDERMASTER.put("PHOTO_PATH4", new TableInfo.Column("PHOTO_PATH4", "TEXT", true, 0));
        _columnsORDERMASTER.put("PHOTO_PATH5", new TableInfo.Column("PHOTO_PATH5", "TEXT", true, 0));
        _columnsORDERMASTER.put("ORDER_PAYMENT_TYPE", new TableInfo.Column("ORDER_PAYMENT_TYPE", "INTEGER", true, 0));
        _columnsORDERMASTER.put("IS_SYNCED", new TableInfo.Column("IS_SYNCED", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysORDERMASTER = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesORDERMASTER = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoORDERMASTER = new TableInfo("ORDER_MASTER", _columnsORDERMASTER, _foreignKeysORDERMASTER, _indicesORDERMASTER);
        final TableInfo _existingORDERMASTER = TableInfo.read(_db, "ORDER_MASTER");
        if (! _infoORDERMASTER.equals(_existingORDERMASTER)) {
          throw new IllegalStateException("Migration didn't properly handle ORDER_MASTER(com.fastservices.sams.data.entities.OrderMaster).\n"
                  + " Expected:\n" + _infoORDERMASTER + "\n"
                  + " Found:\n" + _existingORDERMASTER);
        }
        final HashMap<String, TableInfo.Column> _columnsSKU = new HashMap<String, TableInfo.Column>(15);
        _columnsSKU.put("SKU_ID", new TableInfo.Column("SKU_ID", "INTEGER", true, 1));
        _columnsSKU.put("SKU_CODE", new TableInfo.Column("SKU_CODE", "TEXT", true, 0));
        _columnsSKU.put("SKU_NAME", new TableInfo.Column("SKU_NAME", "TEXT", true, 0));
        _columnsSKU.put("GST_ON", new TableInfo.Column("GST_ON", "TEXT", true, 0));
        _columnsSKU.put("TRADE_PRICE", new TableInfo.Column("TRADE_PRICE", "REAL", true, 0));
        _columnsSKU.put("GST_RATE", new TableInfo.Column("GST_RATE", "REAL", true, 0));
        _columnsSKU.put("UNITS_IN_CASE", new TableInfo.Column("UNITS_IN_CASE", "INTEGER", true, 0));
        _columnsSKU.put("BRAND_ID", new TableInfo.Column("BRAND_ID", "INTEGER", true, 0));
        _columnsSKU.put("WEIGHT", new TableInfo.Column("WEIGHT", "INTEGER", true, 0));
        _columnsSKU.put("DISTRIBUTOR_PRICE", new TableInfo.Column("DISTRIBUTOR_PRICE", "REAL", true, 0));
        _columnsSKU.put("RETAIL_PRICE", new TableInfo.Column("RETAIL_PRICE", "REAL", true, 0));
        _columnsSKU.put("EXTR_Tax", new TableInfo.Column("EXTR_Tax", "REAL", true, 0));
        _columnsSKU.put("SEQUENCE_NUMBER", new TableInfo.Column("SEQUENCE_NUMBER", "INTEGER", true, 0));
        _columnsSKU.put("UOM_DESC", new TableInfo.Column("UOM_DESC", "TEXT", true, 0));
        _columnsSKU.put("CATEGORY_ID", new TableInfo.Column("CATEGORY_ID", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSKU = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSKU = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSKU = new TableInfo("SKU", _columnsSKU, _foreignKeysSKU, _indicesSKU);
        final TableInfo _existingSKU = TableInfo.read(_db, "SKU");
        if (! _infoSKU.equals(_existingSKU)) {
          throw new IllegalStateException("Migration didn't properly handle SKU(com.fastservices.sams.data.entities.SKU).\n"
                  + " Expected:\n" + _infoSKU + "\n"
                  + " Found:\n" + _existingSKU);
        }
        final HashMap<String, TableInfo.Column> _columnsUSER = new HashMap<String, TableInfo.Column>(8);
        _columnsUSER.put("USER_ID", new TableInfo.Column("USER_ID", "INTEGER", true, 1));
        _columnsUSER.put("COMPANY_ID", new TableInfo.Column("COMPANY_ID", "INTEGER", true, 0));
        _columnsUSER.put("DISTRIBUTOR_ID", new TableInfo.Column("DISTRIBUTOR_ID", "INTEGER", true, 0));
        _columnsUSER.put("ROLE_ID", new TableInfo.Column("ROLE_ID", "INTEGER", true, 0));
        _columnsUSER.put("LOGIN_ID", new TableInfo.Column("LOGIN_ID", "TEXT", true, 0));
        _columnsUSER.put("PASSWORD", new TableInfo.Column("PASSWORD", "TEXT", true, 0));
        _columnsUSER.put("IS_ACTIVE", new TableInfo.Column("IS_ACTIVE", "INTEGER", true, 0));
        _columnsUSER.put("LASTUPDATE_DATE", new TableInfo.Column("LASTUPDATE_DATE", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUSER = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUSER = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUSER = new TableInfo("USER", _columnsUSER, _foreignKeysUSER, _indicesUSER);
        final TableInfo _existingUSER = TableInfo.read(_db, "USER");
        if (! _infoUSER.equals(_existingUSER)) {
          throw new IllegalStateException("Migration didn't properly handle USER(com.fastservices.sams.data.entities.User).\n"
                  + " Expected:\n" + _infoUSER + "\n"
                  + " Found:\n" + _existingUSER);
        }
        final HashMap<String, TableInfo.Column> _columnsOutlet = new HashMap<String, TableInfo.Column>(30);
        _columnsOutlet.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1));
        _columnsOutlet.put("outletID", new TableInfo.Column("outletID", "INTEGER", true, 0));
        _columnsOutlet.put("outletName", new TableInfo.Column("outletName", "TEXT", true, 0));
        _columnsOutlet.put("ownerName", new TableInfo.Column("ownerName", "TEXT", true, 0));
        _columnsOutlet.put("phoneNumber", new TableInfo.Column("phoneNumber", "TEXT", true, 0));
        _columnsOutlet.put("storeAddress", new TableInfo.Column("storeAddress", "TEXT", true, 0));
        _columnsOutlet.put("landMark", new TableInfo.Column("landMark", "TEXT", true, 0));
        _columnsOutlet.put("sectionID", new TableInfo.Column("sectionID", "INTEGER", true, 0));
        _columnsOutlet.put("channelID", new TableInfo.Column("channelID", "INTEGER", true, 0));
        _columnsOutlet.put("routeID", new TableInfo.Column("routeID", "INTEGER", true, 0));
        _columnsOutlet.put("townID", new TableInfo.Column("townID", "INTEGER", true, 0));
        _columnsOutlet.put("subChannelID", new TableInfo.Column("subChannelID", "INTEGER", true, 0));
        _columnsOutlet.put("promotionClass", new TableInfo.Column("promotionClass", "INTEGER", true, 0));
        _columnsOutlet.put("closing", new TableInfo.Column("closing", "REAL", true, 0));
        _columnsOutlet.put("creditLimit", new TableInfo.Column("creditLimit", "REAL", true, 0));
        _columnsOutlet.put("creditDays", new TableInfo.Column("creditDays", "INTEGER", true, 0));
        _columnsOutlet.put("isRegistered", new TableInfo.Column("isRegistered", "INTEGER", true, 0));
        _columnsOutlet.put("sequenceNo", new TableInfo.Column("sequenceNo", "INTEGER", true, 0));
        _columnsOutlet.put("comments", new TableInfo.Column("comments", "TEXT", true, 0));
        _columnsOutlet.put("latitude", new TableInfo.Column("latitude", "REAL", true, 0));
        _columnsOutlet.put("longtidue", new TableInfo.Column("longtidue", "REAL", true, 0));
        _columnsOutlet.put("photoPath1", new TableInfo.Column("photoPath1", "TEXT", true, 0));
        _columnsOutlet.put("photoPath2", new TableInfo.Column("photoPath2", "TEXT", true, 0));
        _columnsOutlet.put("photoPath3", new TableInfo.Column("photoPath3", "TEXT", true, 0));
        _columnsOutlet.put("photoPath4", new TableInfo.Column("photoPath4", "TEXT", true, 0));
        _columnsOutlet.put("photoPath5", new TableInfo.Column("photoPath5", "TEXT", true, 0));
        _columnsOutlet.put("areaTypeId", new TableInfo.Column("areaTypeId", "INTEGER", true, 0));
        _columnsOutlet.put("lastOrderDate", new TableInfo.Column("lastOrderDate", "TEXT", true, 0));
        _columnsOutlet.put("lastOrderAmount", new TableInfo.Column("lastOrderAmount", "REAL", true, 0));
        _columnsOutlet.put("isCredit", new TableInfo.Column("isCredit", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOutlet = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesOutlet = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOutlet = new TableInfo("Outlet", _columnsOutlet, _foreignKeysOutlet, _indicesOutlet);
        final TableInfo _existingOutlet = TableInfo.read(_db, "Outlet");
        if (! _infoOutlet.equals(_existingOutlet)) {
          throw new IllegalStateException("Migration didn't properly handle Outlet(com.fastservices.sams.data.entities.Outlet).\n"
                  + " Expected:\n" + _infoOutlet + "\n"
                  + " Found:\n" + _existingOutlet);
        }
        final HashMap<String, TableInfo.Column> _columnsOutletLocal = new HashMap<String, TableInfo.Column>(19);
        _columnsOutletLocal.put("OutletID", new TableInfo.Column("OutletID", "INTEGER", true, 1));
        _columnsOutletLocal.put("OutletName", new TableInfo.Column("OutletName", "TEXT", true, 0));
        _columnsOutletLocal.put("OwnerName", new TableInfo.Column("OwnerName", "TEXT", true, 0));
        _columnsOutletLocal.put("PhoneNumber", new TableInfo.Column("PhoneNumber", "TEXT", true, 0));
        _columnsOutletLocal.put("OutletAddress", new TableInfo.Column("OutletAddress", "TEXT", true, 0));
        _columnsOutletLocal.put("LandMark", new TableInfo.Column("LandMark", "TEXT", true, 0));
        _columnsOutletLocal.put("SectionID", new TableInfo.Column("SectionID", "INTEGER", true, 0));
        _columnsOutletLocal.put("ChannelID", new TableInfo.Column("ChannelID", "INTEGER", true, 0));
        _columnsOutletLocal.put("TownID", new TableInfo.Column("TownID", "INTEGER", true, 0));
        _columnsOutletLocal.put("SubChannelID", new TableInfo.Column("SubChannelID", "INTEGER", true, 0));
        _columnsOutletLocal.put("Comments", new TableInfo.Column("Comments", "TEXT", true, 0));
        _columnsOutletLocal.put("Latitude", new TableInfo.Column("Latitude", "REAL", true, 0));
        _columnsOutletLocal.put("Longtidue", new TableInfo.Column("Longtidue", "REAL", true, 0));
        _columnsOutletLocal.put("PhotoPath1", new TableInfo.Column("PhotoPath1", "TEXT", true, 0));
        _columnsOutletLocal.put("PhotoPath2", new TableInfo.Column("PhotoPath2", "TEXT", true, 0));
        _columnsOutletLocal.put("PhotoPath3", new TableInfo.Column("PhotoPath3", "TEXT", true, 0));
        _columnsOutletLocal.put("PhotoPath4", new TableInfo.Column("PhotoPath4", "TEXT", true, 0));
        _columnsOutletLocal.put("PhotoPath5", new TableInfo.Column("PhotoPath5", "TEXT", true, 0));
        _columnsOutletLocal.put("AreaTypeId", new TableInfo.Column("AreaTypeId", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOutletLocal = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesOutletLocal = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOutletLocal = new TableInfo("OutletLocal", _columnsOutletLocal, _foreignKeysOutletLocal, _indicesOutletLocal);
        final TableInfo _existingOutletLocal = TableInfo.read(_db, "OutletLocal");
        if (! _infoOutletLocal.equals(_existingOutletLocal)) {
          throw new IllegalStateException("Migration didn't properly handle OutletLocal(com.fastservices.sams.data.entities.OutletLocal).\n"
                  + " Expected:\n" + _infoOutletLocal + "\n"
                  + " Found:\n" + _existingOutletLocal);
        }
        final HashMap<String, TableInfo.Column> _columnsMENU = new HashMap<String, TableInfo.Column>(3);
        _columnsMENU.put("androidMenuID", new TableInfo.Column("androidMenuID", "INTEGER", true, 1));
        _columnsMENU.put("menuName", new TableInfo.Column("menuName", "TEXT", true, 0));
        _columnsMENU.put("isActive", new TableInfo.Column("isActive", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMENU = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMENU = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMENU = new TableInfo("MENU", _columnsMENU, _foreignKeysMENU, _indicesMENU);
        final TableInfo _existingMENU = TableInfo.read(_db, "MENU");
        if (! _infoMENU.equals(_existingMENU)) {
          throw new IllegalStateException("Migration didn't properly handle MENU(com.fastservices.sams.data.entities.Menu).\n"
                  + " Expected:\n" + _infoMENU + "\n"
                  + " Found:\n" + _existingMENU);
        }
        final HashMap<String, TableInfo.Column> _columnsSECTIONS = new HashMap<String, TableInfo.Column>(3);
        _columnsSECTIONS.put("sectionID", new TableInfo.Column("sectionID", "INTEGER", true, 1));
        _columnsSECTIONS.put("sectionCode", new TableInfo.Column("sectionCode", "TEXT", false, 0));
        _columnsSECTIONS.put("sectionName", new TableInfo.Column("sectionName", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSECTIONS = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSECTIONS = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSECTIONS = new TableInfo("SECTIONS", _columnsSECTIONS, _foreignKeysSECTIONS, _indicesSECTIONS);
        final TableInfo _existingSECTIONS = TableInfo.read(_db, "SECTIONS");
        if (! _infoSECTIONS.equals(_existingSECTIONS)) {
          throw new IllegalStateException("Migration didn't properly handle SECTIONS(com.fastservices.sams.data.entities.Section).\n"
                  + " Expected:\n" + _infoSECTIONS + "\n"
                  + " Found:\n" + _existingSECTIONS);
        }
        final HashMap<String, TableInfo.Column> _columnsCHANNEL = new HashMap<String, TableInfo.Column>(4);
        _columnsCHANNEL.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsCHANNEL.put("code", new TableInfo.Column("code", "TEXT", true, 0));
        _columnsCHANNEL.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsCHANNEL.put("status", new TableInfo.Column("status", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCHANNEL = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCHANNEL = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCHANNEL = new TableInfo("CHANNEL", _columnsCHANNEL, _foreignKeysCHANNEL, _indicesCHANNEL);
        final TableInfo _existingCHANNEL = TableInfo.read(_db, "CHANNEL");
        if (! _infoCHANNEL.equals(_existingCHANNEL)) {
          throw new IllegalStateException("Migration didn't properly handle CHANNEL(com.fastservices.sams.data.entities.Channel).\n"
                  + " Expected:\n" + _infoCHANNEL + "\n"
                  + " Found:\n" + _existingCHANNEL);
        }
        final HashMap<String, TableInfo.Column> _columnsSUBCHANNEL = new HashMap<String, TableInfo.Column>(5);
        _columnsSUBCHANNEL.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsSUBCHANNEL.put("code", new TableInfo.Column("code", "TEXT", true, 0));
        _columnsSUBCHANNEL.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsSUBCHANNEL.put("parentID", new TableInfo.Column("parentID", "INTEGER", true, 0));
        _columnsSUBCHANNEL.put("status", new TableInfo.Column("status", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSUBCHANNEL = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSUBCHANNEL = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSUBCHANNEL = new TableInfo("SUBCHANNEL", _columnsSUBCHANNEL, _foreignKeysSUBCHANNEL, _indicesSUBCHANNEL);
        final TableInfo _existingSUBCHANNEL = TableInfo.read(_db, "SUBCHANNEL");
        if (! _infoSUBCHANNEL.equals(_existingSUBCHANNEL)) {
          throw new IllegalStateException("Migration didn't properly handle SUBCHANNEL(com.fastservices.sams.data.entities.SubChannel).\n"
                  + " Expected:\n" + _infoSUBCHANNEL + "\n"
                  + " Found:\n" + _existingSUBCHANNEL);
        }
        final HashMap<String, TableInfo.Column> _columnsMerchandise = new HashMap<String, TableInfo.Column>(13);
        _columnsMerchandise.put("OutletID", new TableInfo.Column("OutletID", "INTEGER", true, 1));
        _columnsMerchandise.put("DocumentDate", new TableInfo.Column("DocumentDate", "TEXT", false, 0));
        _columnsMerchandise.put("Remarks", new TableInfo.Column("Remarks", "TEXT", false, 0));
        _columnsMerchandise.put("Image1Path1", new TableInfo.Column("Image1Path1", "TEXT", false, 0));
        _columnsMerchandise.put("Image1Path2", new TableInfo.Column("Image1Path2", "TEXT", false, 0));
        _columnsMerchandise.put("Image1Path3", new TableInfo.Column("Image1Path3", "TEXT", false, 0));
        _columnsMerchandise.put("Image1Path4", new TableInfo.Column("Image1Path4", "TEXT", false, 0));
        _columnsMerchandise.put("Image1Path5", new TableInfo.Column("Image1Path5", "TEXT", false, 0));
        _columnsMerchandise.put("Image2Path1", new TableInfo.Column("Image2Path1", "TEXT", false, 0));
        _columnsMerchandise.put("Image2Path2", new TableInfo.Column("Image2Path2", "TEXT", false, 0));
        _columnsMerchandise.put("Image2Path3", new TableInfo.Column("Image2Path3", "TEXT", false, 0));
        _columnsMerchandise.put("Image2Path4", new TableInfo.Column("Image2Path4", "TEXT", false, 0));
        _columnsMerchandise.put("Image2Path5", new TableInfo.Column("Image2Path5", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMerchandise = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMerchandise = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMerchandise = new TableInfo("Merchandise", _columnsMerchandise, _foreignKeysMerchandise, _indicesMerchandise);
        final TableInfo _existingMerchandise = TableInfo.read(_db, "Merchandise");
        if (! _infoMerchandise.equals(_existingMerchandise)) {
          throw new IllegalStateException("Migration didn't properly handle Merchandise(com.fastservices.sams.data.entities.Merchandise).\n"
                  + " Expected:\n" + _infoMerchandise + "\n"
                  + " Found:\n" + _existingMerchandise);
        }
        final HashMap<String, TableInfo.Column> _columnsComplaintReason = new HashMap<String, TableInfo.Column>(4);
        _columnsComplaintReason.put("complaintReasonID", new TableInfo.Column("complaintReasonID", "INTEGER", true, 1));
        _columnsComplaintReason.put("complaintReason", new TableInfo.Column("complaintReason", "TEXT", true, 0));
        _columnsComplaintReason.put("check", new TableInfo.Column("check", "INTEGER", true, 0));
        _columnsComplaintReason.put("remarks", new TableInfo.Column("remarks", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysComplaintReason = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesComplaintReason = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoComplaintReason = new TableInfo("ComplaintReason", _columnsComplaintReason, _foreignKeysComplaintReason, _indicesComplaintReason);
        final TableInfo _existingComplaintReason = TableInfo.read(_db, "ComplaintReason");
        if (! _infoComplaintReason.equals(_existingComplaintReason)) {
          throw new IllegalStateException("Migration didn't properly handle ComplaintReason(com.fastservices.sams.data.entities.ComplaintReason).\n"
                  + " Expected:\n" + _infoComplaintReason + "\n"
                  + " Found:\n" + _existingComplaintReason);
        }
        final HashMap<String, TableInfo.Column> _columnsReplacementReason = new HashMap<String, TableInfo.Column>(2);
        _columnsReplacementReason.put("replacementReasonID", new TableInfo.Column("replacementReasonID", "INTEGER", true, 1));
        _columnsReplacementReason.put("replacementReason", new TableInfo.Column("replacementReason", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysReplacementReason = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesReplacementReason = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoReplacementReason = new TableInfo("ReplacementReason", _columnsReplacementReason, _foreignKeysReplacementReason, _indicesReplacementReason);
        final TableInfo _existingReplacementReason = TableInfo.read(_db, "ReplacementReason");
        if (! _infoReplacementReason.equals(_existingReplacementReason)) {
          throw new IllegalStateException("Migration didn't properly handle ReplacementReason(com.fastservices.sams.data.entities.ReplacementReason).\n"
                  + " Expected:\n" + _infoReplacementReason + "\n"
                  + " Found:\n" + _existingReplacementReason);
        }
        final HashMap<String, TableInfo.Column> _columnsOutletComplaint = new HashMap<String, TableInfo.Column>(5);
        _columnsOutletComplaint.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1));
        _columnsOutletComplaint.put("CustomerID", new TableInfo.Column("CustomerID", "TEXT", true, 0));
        _columnsOutletComplaint.put("ComplaintReasonID", new TableInfo.Column("ComplaintReasonID", "INTEGER", true, 0));
        _columnsOutletComplaint.put("DocumentDate", new TableInfo.Column("DocumentDate", "TEXT", true, 0));
        _columnsOutletComplaint.put("Remarks", new TableInfo.Column("Remarks", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOutletComplaint = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesOutletComplaint = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOutletComplaint = new TableInfo("OutletComplaint", _columnsOutletComplaint, _foreignKeysOutletComplaint, _indicesOutletComplaint);
        final TableInfo _existingOutletComplaint = TableInfo.read(_db, "OutletComplaint");
        if (! _infoOutletComplaint.equals(_existingOutletComplaint)) {
          throw new IllegalStateException("Migration didn't properly handle OutletComplaint(com.fastservices.sams.data.entities.OutletComplaint).\n"
                  + " Expected:\n" + _infoOutletComplaint + "\n"
                  + " Found:\n" + _existingOutletComplaint);
        }
        final HashMap<String, TableInfo.Column> _columnsNoOrderReason = new HashMap<String, TableInfo.Column>(2);
        _columnsNoOrderReason.put("unOrderReasonID", new TableInfo.Column("unOrderReasonID", "INTEGER", true, 1));
        _columnsNoOrderReason.put("unOrderReason", new TableInfo.Column("unOrderReason", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysNoOrderReason = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesNoOrderReason = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoNoOrderReason = new TableInfo("NoOrderReason", _columnsNoOrderReason, _foreignKeysNoOrderReason, _indicesNoOrderReason);
        final TableInfo _existingNoOrderReason = TableInfo.read(_db, "NoOrderReason");
        if (! _infoNoOrderReason.equals(_existingNoOrderReason)) {
          throw new IllegalStateException("Migration didn't properly handle NoOrderReason(com.fastservices.sams.data.entities.NoOrderReason).\n"
                  + " Expected:\n" + _infoNoOrderReason + "\n"
                  + " Found:\n" + _existingNoOrderReason);
        }
        final HashMap<String, TableInfo.Column> _columnsNoOrderItem = new HashMap<String, TableInfo.Column>(14);
        _columnsNoOrderItem.put("OutletID", new TableInfo.Column("OutletID", "INTEGER", true, 1));
        _columnsNoOrderItem.put("SectionID", new TableInfo.Column("SectionID", "TEXT", true, 0));
        _columnsNoOrderItem.put("DocumentDate", new TableInfo.Column("DocumentDate", "TEXT", true, 0));
        _columnsNoOrderItem.put("ReasonID", new TableInfo.Column("ReasonID", "TEXT", true, 0));
        _columnsNoOrderItem.put("TimeIn", new TableInfo.Column("TimeIn", "TEXT", true, 0));
        _columnsNoOrderItem.put("TimeOut", new TableInfo.Column("TimeOut", "TEXT", true, 0));
        _columnsNoOrderItem.put("Comments", new TableInfo.Column("Comments", "TEXT", true, 0));
        _columnsNoOrderItem.put("latitude", new TableInfo.Column("latitude", "REAL", true, 0));
        _columnsNoOrderItem.put("longitude", new TableInfo.Column("longitude", "REAL", true, 0));
        _columnsNoOrderItem.put("photoPath1", new TableInfo.Column("photoPath1", "TEXT", true, 0));
        _columnsNoOrderItem.put("photoPath2", new TableInfo.Column("photoPath2", "TEXT", true, 0));
        _columnsNoOrderItem.put("photoPath3", new TableInfo.Column("photoPath3", "TEXT", true, 0));
        _columnsNoOrderItem.put("photoPath4", new TableInfo.Column("photoPath4", "TEXT", true, 0));
        _columnsNoOrderItem.put("photoPath5", new TableInfo.Column("photoPath5", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysNoOrderItem = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesNoOrderItem = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoNoOrderItem = new TableInfo("NoOrderItem", _columnsNoOrderItem, _foreignKeysNoOrderItem, _indicesNoOrderItem);
        final TableInfo _existingNoOrderItem = TableInfo.read(_db, "NoOrderItem");
        if (! _infoNoOrderItem.equals(_existingNoOrderItem)) {
          throw new IllegalStateException("Migration didn't properly handle NoOrderItem(com.fastservices.sams.data.entities.NoOrderItem).\n"
                  + " Expected:\n" + _infoNoOrderItem + "\n"
                  + " Found:\n" + _existingNoOrderItem);
        }
        final HashMap<String, TableInfo.Column> _columnsSKUGroup = new HashMap<String, TableInfo.Column>(3);
        _columnsSKUGroup.put("skU_GROUP_ID", new TableInfo.Column("skU_GROUP_ID", "INTEGER", true, 0));
        _columnsSKUGroup.put("skU_GROUP_DETAIL_ID", new TableInfo.Column("skU_GROUP_DETAIL_ID", "INTEGER", true, 1));
        _columnsSKUGroup.put("skU_ID", new TableInfo.Column("skU_ID", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSKUGroup = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSKUGroup = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSKUGroup = new TableInfo("SKUGroup", _columnsSKUGroup, _foreignKeysSKUGroup, _indicesSKUGroup);
        final TableInfo _existingSKUGroup = TableInfo.read(_db, "SKUGroup");
        if (! _infoSKUGroup.equals(_existingSKUGroup)) {
          throw new IllegalStateException("Migration didn't properly handle SKUGroup(com.fastservices.sams.data.entities.SKUGroup).\n"
                  + " Expected:\n" + _infoSKUGroup + "\n"
                  + " Found:\n" + _existingSKUGroup);
        }
        final HashMap<String, TableInfo.Column> _columnsDtBasketDetail = new HashMap<String, TableInfo.Column>(11);
        _columnsDtBasketDetail.put("BASKET_DETAIL_ID", new TableInfo.Column("BASKET_DETAIL_ID", "INTEGER", true, 1));
        _columnsDtBasketDetail.put("BASKET_ID", new TableInfo.Column("BASKET_ID", "INTEGER", true, 0));
        _columnsDtBasketDetail.put("PROMOTION_ID", new TableInfo.Column("PROMOTION_ID", "INTEGER", true, 0));
        _columnsDtBasketDetail.put("SCHEME_ID", new TableInfo.Column("SCHEME_ID", "INTEGER", true, 0));
        _columnsDtBasketDetail.put("DISTRIBUTOR_ID", new TableInfo.Column("DISTRIBUTOR_ID", "INTEGER", true, 0));
        _columnsDtBasketDetail.put("MIN_VAL", new TableInfo.Column("MIN_VAL", "REAL", false, 0));
        _columnsDtBasketDetail.put("MAX_VAL", new TableInfo.Column("MAX_VAL", "REAL", false, 0));
        _columnsDtBasketDetail.put("MULTIPLE_OF", new TableInfo.Column("MULTIPLE_OF", "INTEGER", true, 0));
        _columnsDtBasketDetail.put("SKU_ID", new TableInfo.Column("SKU_ID", "INTEGER", true, 0));
        _columnsDtBasketDetail.put("SKU_GROUP_ID", new TableInfo.Column("SKU_GROUP_ID", "INTEGER", true, 0));
        _columnsDtBasketDetail.put("UOM_ID", new TableInfo.Column("UOM_ID", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDtBasketDetail = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDtBasketDetail = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDtBasketDetail = new TableInfo("dtBasketDetail", _columnsDtBasketDetail, _foreignKeysDtBasketDetail, _indicesDtBasketDetail);
        final TableInfo _existingDtBasketDetail = TableInfo.read(_db, "dtBasketDetail");
        if (! _infoDtBasketDetail.equals(_existingDtBasketDetail)) {
          throw new IllegalStateException("Migration didn't properly handle dtBasketDetail(com.fastservices.sams.data.entities.promotions.dtBasketDetail).\n"
                  + " Expected:\n" + _infoDtBasketDetail + "\n"
                  + " Found:\n" + _existingDtBasketDetail);
        }
        final HashMap<String, TableInfo.Column> _columnsDtBasketMaster = new HashMap<String, TableInfo.Column>(9);
        _columnsDtBasketMaster.put("BASKET_ID", new TableInfo.Column("BASKET_ID", "INTEGER", true, 1));
        _columnsDtBasketMaster.put("PROMOTION_ID", new TableInfo.Column("PROMOTION_ID", "INTEGER", true, 0));
        _columnsDtBasketMaster.put("SCHEME_ID", new TableInfo.Column("SCHEME_ID", "INTEGER", true, 0));
        _columnsDtBasketMaster.put("DISTRIBUTOR_ID", new TableInfo.Column("DISTRIBUTOR_ID", "INTEGER", true, 0));
        _columnsDtBasketMaster.put("IS_BASKET", new TableInfo.Column("IS_BASKET", "INTEGER", false, 0));
        _columnsDtBasketMaster.put("IS_AND", new TableInfo.Column("IS_AND", "INTEGER", true, 0));
        _columnsDtBasketMaster.put("IS_MULTIPLE", new TableInfo.Column("IS_MULTIPLE", "INTEGER", false, 0));
        _columnsDtBasketMaster.put("BASKET_ON", new TableInfo.Column("BASKET_ON", "INTEGER", true, 0));
        _columnsDtBasketMaster.put("BASKET_SELECTION", new TableInfo.Column("BASKET_SELECTION", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDtBasketMaster = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDtBasketMaster = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDtBasketMaster = new TableInfo("dtBasketMaster", _columnsDtBasketMaster, _foreignKeysDtBasketMaster, _indicesDtBasketMaster);
        final TableInfo _existingDtBasketMaster = TableInfo.read(_db, "dtBasketMaster");
        if (! _infoDtBasketMaster.equals(_existingDtBasketMaster)) {
          throw new IllegalStateException("Migration didn't properly handle dtBasketMaster(com.fastservices.sams.data.entities.promotions.dtBasketMaster).\n"
                  + " Expected:\n" + _infoDtBasketMaster + "\n"
                  + " Found:\n" + _existingDtBasketMaster);
        }
        final HashMap<String, TableInfo.Column> _columnsDtFreeSKUDetail = new HashMap<String, TableInfo.Column>(21);
        _columnsDtFreeSKUDetail.put("Master_SKU_ID", new TableInfo.Column("Master_SKU_ID", "INTEGER", true, 0));
        _columnsDtFreeSKUDetail.put("SKU_ID", new TableInfo.Column("SKU_ID", "INTEGER", true, 1));
        _columnsDtFreeSKUDetail.put("SKU_Code", new TableInfo.Column("SKU_Code", "TEXT", false, 0));
        _columnsDtFreeSKUDetail.put("SKU_Name", new TableInfo.Column("SKU_Name", "TEXT", false, 0));
        _columnsDtFreeSKUDetail.put("UNIT_PRICE", new TableInfo.Column("UNIT_PRICE", "REAL", true, 0));
        _columnsDtFreeSKUDetail.put("QUANTITY", new TableInfo.Column("QUANTITY", "INTEGER", true, 0));
        _columnsDtFreeSKUDetail.put("Quantity_TO", new TableInfo.Column("Quantity_TO", "INTEGER", true, 0));
        _columnsDtFreeSKUDetail.put("Quantity_AD", new TableInfo.Column("Quantity_AD", "INTEGER", true, 0));
        _columnsDtFreeSKUDetail.put("AMOUNT", new TableInfo.Column("AMOUNT", "REAL", true, 0));
        _columnsDtFreeSKUDetail.put("GST_RATE", new TableInfo.Column("GST_RATE", "REAL", true, 0));
        _columnsDtFreeSKUDetail.put("GST_AMOUNT", new TableInfo.Column("GST_AMOUNT", "REAL", true, 0));
        _columnsDtFreeSKUDetail.put("TST_AMOUNT", new TableInfo.Column("TST_AMOUNT", "REAL", true, 0));
        _columnsDtFreeSKUDetail.put("PROMOTION_ID", new TableInfo.Column("PROMOTION_ID", "INTEGER", true, 0));
        _columnsDtFreeSKUDetail.put("BASKET_ID", new TableInfo.Column("BASKET_ID", "INTEGER", true, 0));
        _columnsDtFreeSKUDetail.put("BASKET_DETAIL_ID", new TableInfo.Column("BASKET_DETAIL_ID", "INTEGER", true, 0));
        _columnsDtFreeSKUDetail.put("PROMOTION_OFFER_ID", new TableInfo.Column("PROMOTION_OFFER_ID", "INTEGER", true, 0));
        _columnsDtFreeSKUDetail.put("Group_Id", new TableInfo.Column("Group_Id", "INTEGER", true, 0));
        _columnsDtFreeSKUDetail.put("Extra_tax", new TableInfo.Column("Extra_tax", "REAL", true, 0));
        _columnsDtFreeSKUDetail.put("GST_Price", new TableInfo.Column("GST_Price", "REAL", true, 0));
        _columnsDtFreeSKUDetail.put("WEIGHT", new TableInfo.Column("WEIGHT", "REAL", true, 0));
        _columnsDtFreeSKUDetail.put("UOM_DESC", new TableInfo.Column("UOM_DESC", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDtFreeSKUDetail = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDtFreeSKUDetail = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDtFreeSKUDetail = new TableInfo("dtFreeSKUDetail", _columnsDtFreeSKUDetail, _foreignKeysDtFreeSKUDetail, _indicesDtFreeSKUDetail);
        final TableInfo _existingDtFreeSKUDetail = TableInfo.read(_db, "dtFreeSKUDetail");
        if (! _infoDtFreeSKUDetail.equals(_existingDtFreeSKUDetail)) {
          throw new IllegalStateException("Migration didn't properly handle dtFreeSKUDetail(com.fastservices.sams.data.entities.promotions.dtFreeSKUDetail).\n"
                  + " Expected:\n" + _infoDtFreeSKUDetail + "\n"
                  + " Found:\n" + _existingDtFreeSKUDetail);
        }
        final HashMap<String, TableInfo.Column> _columnsDtPromotion = new HashMap<String, TableInfo.Column>(11);
        _columnsDtPromotion.put("PROMOTION_ID", new TableInfo.Column("PROMOTION_ID", "INTEGER", true, 1));
        _columnsDtPromotion.put("SCHEME_ID", new TableInfo.Column("SCHEME_ID", "INTEGER", true, 0));
        _columnsDtPromotion.put("DISTRIBUTOR_ID", new TableInfo.Column("DISTRIBUTOR_ID", "INTEGER", true, 0));
        _columnsDtPromotion.put("CLAIMABLE", new TableInfo.Column("CLAIMABLE", "INTEGER", true, 0));
        _columnsDtPromotion.put("START_DATE", new TableInfo.Column("START_DATE", "TEXT", false, 0));
        _columnsDtPromotion.put("END_DATE", new TableInfo.Column("END_DATE", "TEXT", false, 0));
        _columnsDtPromotion.put("PROMOTION_TYPE", new TableInfo.Column("PROMOTION_TYPE", "INTEGER", true, 0));
        _columnsDtPromotion.put("PROMOTION_SELECTION", new TableInfo.Column("PROMOTION_SELECTION", "INTEGER", true, 0));
        _columnsDtPromotion.put("IS_SCHEME", new TableInfo.Column("IS_SCHEME", "INTEGER", false, 0));
        _columnsDtPromotion.put("PROMOTION_FOR", new TableInfo.Column("PROMOTION_FOR", "INTEGER", false, 0));
        _columnsDtPromotion.put("USER_ID", new TableInfo.Column("USER_ID", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDtPromotion = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDtPromotion = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDtPromotion = new TableInfo("dtPromotion", _columnsDtPromotion, _foreignKeysDtPromotion, _indicesDtPromotion);
        final TableInfo _existingDtPromotion = TableInfo.read(_db, "dtPromotion");
        if (! _infoDtPromotion.equals(_existingDtPromotion)) {
          throw new IllegalStateException("Migration didn't properly handle dtPromotion(com.fastservices.sams.data.entities.promotions.dtPromotion).\n"
                  + " Expected:\n" + _infoDtPromotion + "\n"
                  + " Found:\n" + _existingDtPromotion);
        }
        final HashMap<String, TableInfo.Column> _columnsDtPromotionCustomerType = new HashMap<String, TableInfo.Column>(5);
        _columnsDtPromotionCustomerType.put("PROMOTION_CUSTOMER_TYPE_ID", new TableInfo.Column("PROMOTION_CUSTOMER_TYPE_ID", "INTEGER", true, 1));
        _columnsDtPromotionCustomerType.put("SCHEME_ID", new TableInfo.Column("SCHEME_ID", "INTEGER", true, 0));
        _columnsDtPromotionCustomerType.put("PROMOTION_ID", new TableInfo.Column("PROMOTION_ID", "INTEGER", true, 0));
        _columnsDtPromotionCustomerType.put("DISTRIBUTOR_ID", new TableInfo.Column("DISTRIBUTOR_ID", "INTEGER", true, 0));
        _columnsDtPromotionCustomerType.put("CUSTOMER_TYPE_ID", new TableInfo.Column("CUSTOMER_TYPE_ID", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDtPromotionCustomerType = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDtPromotionCustomerType = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDtPromotionCustomerType = new TableInfo("dtPromotionCustomerType", _columnsDtPromotionCustomerType, _foreignKeysDtPromotionCustomerType, _indicesDtPromotionCustomerType);
        final TableInfo _existingDtPromotionCustomerType = TableInfo.read(_db, "dtPromotionCustomerType");
        if (! _infoDtPromotionCustomerType.equals(_existingDtPromotionCustomerType)) {
          throw new IllegalStateException("Migration didn't properly handle dtPromotionCustomerType(com.fastservices.sams.data.entities.promotions.dtPromotionCustomerType).\n"
                  + " Expected:\n" + _infoDtPromotionCustomerType + "\n"
                  + " Found:\n" + _existingDtPromotionCustomerType);
        }
        final HashMap<String, TableInfo.Column> _columnsDtPromotionOffer = new HashMap<String, TableInfo.Column>(18);
        _columnsDtPromotionOffer.put("PROMOTION_OFFER_ID", new TableInfo.Column("PROMOTION_OFFER_ID", "INTEGER", true, 1));
        _columnsDtPromotionOffer.put("BASKET_ID", new TableInfo.Column("BASKET_ID", "INTEGER", true, 0));
        _columnsDtPromotionOffer.put("PROMOTION_ID", new TableInfo.Column("PROMOTION_ID", "INTEGER", true, 0));
        _columnsDtPromotionOffer.put("SCHEME_ID", new TableInfo.Column("SCHEME_ID", "INTEGER", true, 0));
        _columnsDtPromotionOffer.put("DISTRIBUTOR_ID", new TableInfo.Column("DISTRIBUTOR_ID", "INTEGER", true, 0));
        _columnsDtPromotionOffer.put("BASKET_DETAIL_ID", new TableInfo.Column("BASKET_DETAIL_ID", "INTEGER", true, 0));
        _columnsDtPromotionOffer.put("QUANTITY", new TableInfo.Column("QUANTITY", "INTEGER", true, 0));
        _columnsDtPromotionOffer.put("OFFER_VALUE", new TableInfo.Column("OFFER_VALUE", "REAL", false, 0));
        _columnsDtPromotionOffer.put("DISCOUNT", new TableInfo.Column("DISCOUNT", "REAL", true, 0));
        _columnsDtPromotionOffer.put("IS_AND", new TableInfo.Column("IS_AND", "INTEGER", true, 0));
        _columnsDtPromotionOffer.put("SKU_ID", new TableInfo.Column("SKU_ID", "INTEGER", true, 0));
        _columnsDtPromotionOffer.put("UOM_ID", new TableInfo.Column("UOM_ID", "INTEGER", true, 0));
        _columnsDtPromotionOffer.put("OFFER_VALUE_TYPE", new TableInfo.Column("OFFER_VALUE_TYPE", "INTEGER", true, 0));
        _columnsDtPromotionOffer.put("DISCOUNT_TYPE", new TableInfo.Column("DISCOUNT_TYPE", "INTEGER", true, 0));
        _columnsDtPromotionOffer.put("SKUOfferTypeID", new TableInfo.Column("SKUOfferTypeID", "INTEGER", true, 0));
        _columnsDtPromotionOffer.put("CLAIMABLE", new TableInfo.Column("CLAIMABLE", "INTEGER", true, 0));
        _columnsDtPromotionOffer.put("FreeSKUID", new TableInfo.Column("FreeSKUID", "INTEGER", true, 0));
        _columnsDtPromotionOffer.put("Group_ID", new TableInfo.Column("Group_ID", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDtPromotionOffer = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDtPromotionOffer = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDtPromotionOffer = new TableInfo("dtPromotionOffer", _columnsDtPromotionOffer, _foreignKeysDtPromotionOffer, _indicesDtPromotionOffer);
        final TableInfo _existingDtPromotionOffer = TableInfo.read(_db, "dtPromotionOffer");
        if (! _infoDtPromotionOffer.equals(_existingDtPromotionOffer)) {
          throw new IllegalStateException("Migration didn't properly handle dtPromotionOffer(com.fastservices.sams.data.entities.promotions.dtPromotionOffer).\n"
                  + " Expected:\n" + _infoDtPromotionOffer + "\n"
                  + " Found:\n" + _existingDtPromotionOffer);
        }
        final HashMap<String, TableInfo.Column> _columnsDtPromotionValueClass = new HashMap<String, TableInfo.Column>(5);
        _columnsDtPromotionValueClass.put("PROMOTION_VOLUMECLASS_ID", new TableInfo.Column("PROMOTION_VOLUMECLASS_ID", "INTEGER", true, 1));
        _columnsDtPromotionValueClass.put("SCHEME_ID", new TableInfo.Column("SCHEME_ID", "INTEGER", true, 0));
        _columnsDtPromotionValueClass.put("PROMOTION_ID", new TableInfo.Column("PROMOTION_ID", "INTEGER", true, 0));
        _columnsDtPromotionValueClass.put("DISTRIBUTOR_ID", new TableInfo.Column("DISTRIBUTOR_ID", "INTEGER", true, 0));
        _columnsDtPromotionValueClass.put("CUSTOMER_VOLUMECLASS_ID", new TableInfo.Column("CUSTOMER_VOLUMECLASS_ID", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDtPromotionValueClass = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDtPromotionValueClass = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDtPromotionValueClass = new TableInfo("dtPromotionValueClass", _columnsDtPromotionValueClass, _foreignKeysDtPromotionValueClass, _indicesDtPromotionValueClass);
        final TableInfo _existingDtPromotionValueClass = TableInfo.read(_db, "dtPromotionValueClass");
        if (! _infoDtPromotionValueClass.equals(_existingDtPromotionValueClass)) {
          throw new IllegalStateException("Migration didn't properly handle dtPromotionValueClass(com.fastservices.sams.data.entities.promotions.dtPromotionValueClass).\n"
                  + " Expected:\n" + _infoDtPromotionValueClass + "\n"
                  + " Found:\n" + _existingDtPromotionValueClass);
        }
        final HashMap<String, TableInfo.Column> _columnsStockPosition = new HashMap<String, TableInfo.Column>(7);
        _columnsStockPosition.put("SKU_ID", new TableInfo.Column("SKU_ID", "TEXT", true, 1));
        _columnsStockPosition.put("Quantity", new TableInfo.Column("Quantity", "TEXT", true, 0));
        _columnsStockPosition.put("Price", new TableInfo.Column("Price", "REAL", true, 0));
        _columnsStockPosition.put("UnitInCase", new TableInfo.Column("UnitInCase", "INTEGER", true, 0));
        _columnsStockPosition.put("SKU_NAME", new TableInfo.Column("SKU_NAME", "TEXT", true, 0));
        _columnsStockPosition.put("SKU_CODE", new TableInfo.Column("SKU_CODE", "TEXT", true, 0));
        _columnsStockPosition.put("STOCK_MASTER_ID", new TableInfo.Column("STOCK_MASTER_ID", "INTEGER", true, 2));
        final HashSet<TableInfo.ForeignKey> _foreignKeysStockPosition = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesStockPosition = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoStockPosition = new TableInfo("StockPosition", _columnsStockPosition, _foreignKeysStockPosition, _indicesStockPosition);
        final TableInfo _existingStockPosition = TableInfo.read(_db, "StockPosition");
        if (! _infoStockPosition.equals(_existingStockPosition)) {
          throw new IllegalStateException("Migration didn't properly handle StockPosition(com.fastservices.sams.data.entities.StockPosition).\n"
                  + " Expected:\n" + _infoStockPosition + "\n"
                  + " Found:\n" + _existingStockPosition);
        }
        final HashMap<String, TableInfo.Column> _columnsStockPositionMaster = new HashMap<String, TableInfo.Column>(2);
        _columnsStockPositionMaster.put("OUTLET_ID", new TableInfo.Column("OUTLET_ID", "INTEGER", true, 1));
        _columnsStockPositionMaster.put("IS_SYNCED", new TableInfo.Column("IS_SYNCED", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysStockPositionMaster = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesStockPositionMaster = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoStockPositionMaster = new TableInfo("StockPositionMaster", _columnsStockPositionMaster, _foreignKeysStockPositionMaster, _indicesStockPositionMaster);
        final TableInfo _existingStockPositionMaster = TableInfo.read(_db, "StockPositionMaster");
        if (! _infoStockPositionMaster.equals(_existingStockPositionMaster)) {
          throw new IllegalStateException("Migration didn't properly handle StockPositionMaster(com.fastservices.sams.data.entities.StockPositionMaster).\n"
                  + " Expected:\n" + _infoStockPositionMaster + "\n"
                  + " Found:\n" + _existingStockPositionMaster);
        }
        final HashMap<String, TableInfo.Column> _columnsReplacement = new HashMap<String, TableInfo.Column>(18);
        _columnsReplacement.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1));
        _columnsReplacement.put("outletId", new TableInfo.Column("outletId", "TEXT", true, 0));
        _columnsReplacement.put("ReplacementTypeID", new TableInfo.Column("ReplacementTypeID", "TEXT", true, 0));
        _columnsReplacement.put("SKUID", new TableInfo.Column("SKUID", "TEXT", true, 0));
        _columnsReplacement.put("Price", new TableInfo.Column("Price", "TEXT", true, 0));
        _columnsReplacement.put("InvoiceNo", new TableInfo.Column("InvoiceNo", "TEXT", true, 0));
        _columnsReplacement.put("InvoiceDate", new TableInfo.Column("InvoiceDate", "TEXT", true, 0));
        _columnsReplacement.put("Description", new TableInfo.Column("Description", "TEXT", true, 0));
        _columnsReplacement.put("StockImage1", new TableInfo.Column("StockImage1", "TEXT", true, 0));
        _columnsReplacement.put("StockImage2", new TableInfo.Column("StockImage2", "TEXT", true, 0));
        _columnsReplacement.put("StockImage3", new TableInfo.Column("StockImage3", "TEXT", true, 0));
        _columnsReplacement.put("StockImage4", new TableInfo.Column("StockImage4", "TEXT", true, 0));
        _columnsReplacement.put("StockImage5", new TableInfo.Column("StockImage5", "TEXT", true, 0));
        _columnsReplacement.put("InvoiceImage1", new TableInfo.Column("InvoiceImage1", "TEXT", true, 0));
        _columnsReplacement.put("InvoiceImage2", new TableInfo.Column("InvoiceImage2", "TEXT", true, 0));
        _columnsReplacement.put("InvoiceImage3", new TableInfo.Column("InvoiceImage3", "TEXT", true, 0));
        _columnsReplacement.put("InvoiceImage4", new TableInfo.Column("InvoiceImage4", "TEXT", true, 0));
        _columnsReplacement.put("InvoiceImage5", new TableInfo.Column("InvoiceImage5", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysReplacement = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesReplacement = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoReplacement = new TableInfo("Replacement", _columnsReplacement, _foreignKeysReplacement, _indicesReplacement);
        final TableInfo _existingReplacement = TableInfo.read(_db, "Replacement");
        if (! _infoReplacement.equals(_existingReplacement)) {
          throw new IllegalStateException("Migration didn't properly handle Replacement(com.fastservices.sams.data.entities.Replacement).\n"
                  + " Expected:\n" + _infoReplacement + "\n"
                  + " Found:\n" + _existingReplacement);
        }
      }
    }, "8078a3f433445f898e614ffa9e8d8482", "0150bdfd46dc8accf65045a46c26f6fb");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "BRAND","CATEGORY","CUSTOMER_ORDER_STATUS","CUSTOMER_UNORDERED_STATUS","DISTRIBUTOR_AREA","ORDER_DETAIL","SALE_ORDER_PROMOTION","ORDER_MASTER","SKU","USER","Outlet","OutletLocal","MENU","SECTIONS","CHANNEL","SUBCHANNEL","Merchandise","ComplaintReason","ReplacementReason","OutletComplaint","NoOrderReason","NoOrderItem","SKUGroup","dtBasketDetail","dtBasketMaster","dtFreeSKUDetail","dtPromotion","dtPromotionCustomerType","dtPromotionOffer","dtPromotionValueClass","StockPosition","StockPositionMaster","Replacement");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `BRAND`");
      _db.execSQL("DELETE FROM `CATEGORY`");
      _db.execSQL("DELETE FROM `CUSTOMER_ORDER_STATUS`");
      _db.execSQL("DELETE FROM `CUSTOMER_UNORDERED_STATUS`");
      _db.execSQL("DELETE FROM `DISTRIBUTOR_AREA`");
      _db.execSQL("DELETE FROM `ORDER_DETAIL`");
      _db.execSQL("DELETE FROM `SALE_ORDER_PROMOTION`");
      _db.execSQL("DELETE FROM `ORDER_MASTER`");
      _db.execSQL("DELETE FROM `SKU`");
      _db.execSQL("DELETE FROM `USER`");
      _db.execSQL("DELETE FROM `Outlet`");
      _db.execSQL("DELETE FROM `OutletLocal`");
      _db.execSQL("DELETE FROM `MENU`");
      _db.execSQL("DELETE FROM `SECTIONS`");
      _db.execSQL("DELETE FROM `CHANNEL`");
      _db.execSQL("DELETE FROM `SUBCHANNEL`");
      _db.execSQL("DELETE FROM `Merchandise`");
      _db.execSQL("DELETE FROM `ComplaintReason`");
      _db.execSQL("DELETE FROM `ReplacementReason`");
      _db.execSQL("DELETE FROM `OutletComplaint`");
      _db.execSQL("DELETE FROM `NoOrderReason`");
      _db.execSQL("DELETE FROM `NoOrderItem`");
      _db.execSQL("DELETE FROM `SKUGroup`");
      _db.execSQL("DELETE FROM `dtBasketDetail`");
      _db.execSQL("DELETE FROM `dtBasketMaster`");
      _db.execSQL("DELETE FROM `dtFreeSKUDetail`");
      _db.execSQL("DELETE FROM `dtPromotion`");
      _db.execSQL("DELETE FROM `dtPromotionCustomerType`");
      _db.execSQL("DELETE FROM `dtPromotionOffer`");
      _db.execSQL("DELETE FROM `dtPromotionValueClass`");
      _db.execSQL("DELETE FROM `StockPosition`");
      _db.execSQL("DELETE FROM `StockPositionMaster`");
      _db.execSQL("DELETE FROM `Replacement`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public OutletDao outletDao() {
    if (_outletDao != null) {
      return _outletDao;
    } else {
      synchronized(this) {
        if(_outletDao == null) {
          _outletDao = new OutletDao_Impl(this);
        }
        return _outletDao;
      }
    }
  }

  @Override
  public OutletLocalDao outletLocalDao() {
    if (_outletLocalDao != null) {
      return _outletLocalDao;
    } else {
      synchronized(this) {
        if(_outletLocalDao == null) {
          _outletLocalDao = new OutletLocalDao_Impl(this);
        }
        return _outletLocalDao;
      }
    }
  }

  @Override
  public UserDao userDao() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }

  @Override
  public MenuDao menuDao() {
    if (_menuDao != null) {
      return _menuDao;
    } else {
      synchronized(this) {
        if(_menuDao == null) {
          _menuDao = new MenuDao_Impl(this);
        }
        return _menuDao;
      }
    }
  }

  @Override
  public SectionDao sectionDao() {
    if (_sectionDao != null) {
      return _sectionDao;
    } else {
      synchronized(this) {
        if(_sectionDao == null) {
          _sectionDao = new SectionDao_Impl(this);
        }
        return _sectionDao;
      }
    }
  }

  @Override
  public ChannelDao channelDao() {
    if (_channelDao != null) {
      return _channelDao;
    } else {
      synchronized(this) {
        if(_channelDao == null) {
          _channelDao = new ChannelDao_Impl(this);
        }
        return _channelDao;
      }
    }
  }

  @Override
  public MerchandiseDao merchandiseDao() {
    if (_merchandiseDao != null) {
      return _merchandiseDao;
    } else {
      synchronized(this) {
        if(_merchandiseDao == null) {
          _merchandiseDao = new MerchandiseDao_Impl(this);
        }
        return _merchandiseDao;
      }
    }
  }

  @Override
  public ComplaintReasonsDao complaintReasonDao() {
    if (_complaintReasonsDao != null) {
      return _complaintReasonsDao;
    } else {
      synchronized(this) {
        if(_complaintReasonsDao == null) {
          _complaintReasonsDao = new ComplaintReasonsDao_Impl(this);
        }
        return _complaintReasonsDao;
      }
    }
  }

  @Override
  public ReplacementReasonsDao replacementReasonDao() {
    if (_replacementReasonsDao != null) {
      return _replacementReasonsDao;
    } else {
      synchronized(this) {
        if(_replacementReasonsDao == null) {
          _replacementReasonsDao = new ReplacementReasonsDao_Impl(this);
        }
        return _replacementReasonsDao;
      }
    }
  }

  @Override
  public OutletComplaintDao outletComplaintsDao() {
    if (_outletComplaintDao != null) {
      return _outletComplaintDao;
    } else {
      synchronized(this) {
        if(_outletComplaintDao == null) {
          _outletComplaintDao = new OutletComplaintDao_Impl(this);
        }
        return _outletComplaintDao;
      }
    }
  }

  @Override
  public SKUCategoryDao skuCategoryDao() {
    if (_sKUCategoryDao != null) {
      return _sKUCategoryDao;
    } else {
      synchronized(this) {
        if(_sKUCategoryDao == null) {
          _sKUCategoryDao = new SKUCategoryDao_Impl(this);
        }
        return _sKUCategoryDao;
      }
    }
  }

  @Override
  public SKUDao SKUDao() {
    if (_sKUDao != null) {
      return _sKUDao;
    } else {
      synchronized(this) {
        if(_sKUDao == null) {
          _sKUDao = new SKUDao_Impl(this);
        }
        return _sKUDao;
      }
    }
  }

  @Override
  public NoOrderReasonDao noOrderReasonDao() {
    if (_noOrderReasonDao != null) {
      return _noOrderReasonDao;
    } else {
      synchronized(this) {
        if(_noOrderReasonDao == null) {
          _noOrderReasonDao = new NoOrderReasonDao_Impl(this);
        }
        return _noOrderReasonDao;
      }
    }
  }

  @Override
  public NoOrderDao noOrderDao() {
    if (_noOrderDao != null) {
      return _noOrderDao;
    } else {
      synchronized(this) {
        if(_noOrderDao == null) {
          _noOrderDao = new NoOrderDao_Impl(this);
        }
        return _noOrderDao;
      }
    }
  }

  @Override
  public OrderMasterDao orderMasterDao() {
    if (_orderMasterDao != null) {
      return _orderMasterDao;
    } else {
      synchronized(this) {
        if(_orderMasterDao == null) {
          _orderMasterDao = new OrderMasterDao_Impl(this);
        }
        return _orderMasterDao;
      }
    }
  }

  @Override
  public OrderDetailDao orderDetailDao() {
    if (_orderDetailDao != null) {
      return _orderDetailDao;
    } else {
      synchronized(this) {
        if(_orderDetailDao == null) {
          _orderDetailDao = new OrderDetailDao_Impl(this);
        }
        return _orderDetailDao;
      }
    }
  }

  @Override
  public OrderDetailFreeSKUDao orderDetailFreeSkusDao() {
    if (_orderDetailFreeSKUDao != null) {
      return _orderDetailFreeSKUDao;
    } else {
      synchronized(this) {
        if(_orderDetailFreeSKUDao == null) {
          _orderDetailFreeSKUDao = new OrderDetailFreeSKUDao_Impl(this);
        }
        return _orderDetailFreeSKUDao;
      }
    }
  }

  @Override
  public StockMasterDao stockPositioningMasterDao() {
    if (_stockMasterDao != null) {
      return _stockMasterDao;
    } else {
      synchronized(this) {
        if(_stockMasterDao == null) {
          _stockMasterDao = new StockMasterDao_Impl(this);
        }
        return _stockMasterDao;
      }
    }
  }

  @Override
  public StockPositioningDao stockPostioningDao() {
    if (_stockPositioningDao != null) {
      return _stockPositioningDao;
    } else {
      synchronized(this) {
        if(_stockPositioningDao == null) {
          _stockPositioningDao = new StockPositioningDao_Impl(this);
        }
        return _stockPositioningDao;
      }
    }
  }

  @Override
  public ReplacementDao replacementDao() {
    if (_replacementDao != null) {
      return _replacementDao;
    } else {
      synchronized(this) {
        if(_replacementDao == null) {
          _replacementDao = new ReplacementDao_Impl(this);
        }
        return _replacementDao;
      }
    }
  }

  @Override
  public PromotionDao promotionDao() {
    if (_promotionDao != null) {
      return _promotionDao;
    } else {
      synchronized(this) {
        if(_promotionDao == null) {
          _promotionDao = new PromotionDao_Impl(this);
        }
        return _promotionDao;
      }
    }
  }

  @Override
  public PromotionValueDao promotionValueDao() {
    if (_promotionValueDao != null) {
      return _promotionValueDao;
    } else {
      synchronized(this) {
        if(_promotionValueDao == null) {
          _promotionValueDao = new PromotionValueDao_Impl(this);
        }
        return _promotionValueDao;
      }
    }
  }

  @Override
  public PromotionCustomerDao promotionCustomerDao() {
    if (_promotionCustomerDao != null) {
      return _promotionCustomerDao;
    } else {
      synchronized(this) {
        if(_promotionCustomerDao == null) {
          _promotionCustomerDao = new PromotionCustomerDao_Impl(this);
        }
        return _promotionCustomerDao;
      }
    }
  }

  @Override
  public BasketMasterDao basketMasterDao() {
    if (_basketMasterDao != null) {
      return _basketMasterDao;
    } else {
      synchronized(this) {
        if(_basketMasterDao == null) {
          _basketMasterDao = new BasketMasterDao_Impl(this);
        }
        return _basketMasterDao;
      }
    }
  }

  @Override
  public BasketDetailDao basketDetailDao() {
    if (_basketDetailDao != null) {
      return _basketDetailDao;
    } else {
      synchronized(this) {
        if(_basketDetailDao == null) {
          _basketDetailDao = new BasketDetailDao_Impl(this);
        }
        return _basketDetailDao;
      }
    }
  }

  @Override
  public PromotionOfferDao promotionOfferDao() {
    if (_promotionOfferDao != null) {
      return _promotionOfferDao;
    } else {
      synchronized(this) {
        if(_promotionOfferDao == null) {
          _promotionOfferDao = new PromotionOfferDao_Impl(this);
        }
        return _promotionOfferDao;
      }
    }
  }

  @Override
  public SKUGroupDao skuGroupDao() {
    if (_sKUGroupDao != null) {
      return _sKUGroupDao;
    } else {
      synchronized(this) {
        if(_sKUGroupDao == null) {
          _sKUGroupDao = new SKUGroupDao_Impl(this);
        }
        return _sKUGroupDao;
      }
    }
  }
}
