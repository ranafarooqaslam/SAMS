package com.fastservices.sams.data.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.fastservices.sams.data.entities.OrderDetailFreeSKU;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class OrderDetailFreeSKUDao_Impl implements OrderDetailFreeSKUDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfOrderDetailFreeSKU;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfOrderDetailFreeSKU;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public OrderDetailFreeSKUDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOrderDetailFreeSKU = new EntityInsertionAdapter<OrderDetailFreeSKU>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `SALE_ORDER_PROMOTION`(`SALE_ORDER_PROMOTION_ID`,`DISTRIBUTOR_ID`,`SALE_ORDER_ID`,`SCHEME_ID`,`PROMOTION_ID`,`BASKET_ID`,`BASKET_DETAIL_ID`,`PROMOTION_OFFER_ID`,`SKU_ID`,`QUANTITY`,`UNIT_PRICE`,`AMOUNT`,`GST_RATE`,`GST_AMOUNT`,`TST_AMOUNT`,`SED_AMOUNT`,`master_Sku_Id`,`EXTRA_TAX`,`QUANTITY_TO`,`QUANTITY_AD`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OrderDetailFreeSKU value) {
        stmt.bindLong(1, value.getSALE_ORDER_PROMOTION_ID());
        stmt.bindLong(2, value.getDISTRIBUTOR_ID());
        stmt.bindLong(3, value.getSALE_ORDER_ID());
        stmt.bindLong(4, value.getSCHEME_ID());
        stmt.bindLong(5, value.getPROMOTION_ID());
        stmt.bindLong(6, value.getBASKET_ID());
        stmt.bindLong(7, value.getBASKET_DETAIL_ID());
        stmt.bindLong(8, value.getPROMOTION_OFFER_ID());
        stmt.bindLong(9, value.getSKU_ID());
        stmt.bindLong(10, value.getQUANTITY());
        stmt.bindDouble(11, value.getUNIT_PRICE());
        stmt.bindDouble(12, value.getAMOUNT());
        stmt.bindDouble(13, value.getGST_RATE());
        stmt.bindDouble(14, value.getGST_AMOUNT());
        stmt.bindDouble(15, value.getTST_AMOUNT());
        stmt.bindDouble(16, value.getSED_AMOUNT());
        stmt.bindLong(17, value.getMaster_Sku_Id());
        stmt.bindDouble(18, value.getEXTRA_TAX());
        stmt.bindLong(19, value.getQUANTITY_TO());
        stmt.bindLong(20, value.getQUANTITY_AD());
      }
    };
    this.__deletionAdapterOfOrderDetailFreeSKU = new EntityDeletionOrUpdateAdapter<OrderDetailFreeSKU>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `SALE_ORDER_PROMOTION` WHERE `SALE_ORDER_PROMOTION_ID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OrderDetailFreeSKU value) {
        stmt.bindLong(1, value.getSALE_ORDER_PROMOTION_ID());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM SALE_ORDER_PROMOTION";
        return _query;
      }
    };
  }

  @Override
  public void insert(OrderDetailFreeSKU orderDetailFreeSKU) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfOrderDetailFreeSKU.insert(orderDetailFreeSKU);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(List<OrderDetailFreeSKU> orderDetailsFreeSkU) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfOrderDetailFreeSKU.handleMultiple(orderDetailsFreeSkU);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public List<OrderDetailFreeSKU> getAllFreeSKUByMasterId(int orderMasterId) {
    final String _sql = "SELECT * FROM SALE_ORDER_PROMOTION WHERE SALE_ORDER_ID = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, orderMasterId);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfSALEORDERPROMOTIONID = _cursor.getColumnIndexOrThrow("SALE_ORDER_PROMOTION_ID");
      final int _cursorIndexOfDISTRIBUTORID = _cursor.getColumnIndexOrThrow("DISTRIBUTOR_ID");
      final int _cursorIndexOfSALEORDERID = _cursor.getColumnIndexOrThrow("SALE_ORDER_ID");
      final int _cursorIndexOfSCHEMEID = _cursor.getColumnIndexOrThrow("SCHEME_ID");
      final int _cursorIndexOfPROMOTIONID = _cursor.getColumnIndexOrThrow("PROMOTION_ID");
      final int _cursorIndexOfBASKETID = _cursor.getColumnIndexOrThrow("BASKET_ID");
      final int _cursorIndexOfBASKETDETAILID = _cursor.getColumnIndexOrThrow("BASKET_DETAIL_ID");
      final int _cursorIndexOfPROMOTIONOFFERID = _cursor.getColumnIndexOrThrow("PROMOTION_OFFER_ID");
      final int _cursorIndexOfSKUID = _cursor.getColumnIndexOrThrow("SKU_ID");
      final int _cursorIndexOfQUANTITY = _cursor.getColumnIndexOrThrow("QUANTITY");
      final int _cursorIndexOfUNITPRICE = _cursor.getColumnIndexOrThrow("UNIT_PRICE");
      final int _cursorIndexOfAMOUNT = _cursor.getColumnIndexOrThrow("AMOUNT");
      final int _cursorIndexOfGSTRATE = _cursor.getColumnIndexOrThrow("GST_RATE");
      final int _cursorIndexOfGSTAMOUNT = _cursor.getColumnIndexOrThrow("GST_AMOUNT");
      final int _cursorIndexOfTSTAMOUNT = _cursor.getColumnIndexOrThrow("TST_AMOUNT");
      final int _cursorIndexOfSEDAMOUNT = _cursor.getColumnIndexOrThrow("SED_AMOUNT");
      final int _cursorIndexOfMasterSkuId = _cursor.getColumnIndexOrThrow("master_Sku_Id");
      final int _cursorIndexOfEXTRATAX = _cursor.getColumnIndexOrThrow("EXTRA_TAX");
      final int _cursorIndexOfQUANTITYTO = _cursor.getColumnIndexOrThrow("QUANTITY_TO");
      final int _cursorIndexOfQUANTITYAD = _cursor.getColumnIndexOrThrow("QUANTITY_AD");
      final List<OrderDetailFreeSKU> _result = new ArrayList<OrderDetailFreeSKU>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final OrderDetailFreeSKU _item;
        final int _tmpSALE_ORDER_PROMOTION_ID;
        _tmpSALE_ORDER_PROMOTION_ID = _cursor.getInt(_cursorIndexOfSALEORDERPROMOTIONID);
        final int _tmpDISTRIBUTOR_ID;
        _tmpDISTRIBUTOR_ID = _cursor.getInt(_cursorIndexOfDISTRIBUTORID);
        final int _tmpSALE_ORDER_ID;
        _tmpSALE_ORDER_ID = _cursor.getInt(_cursorIndexOfSALEORDERID);
        final int _tmpSCHEME_ID;
        _tmpSCHEME_ID = _cursor.getInt(_cursorIndexOfSCHEMEID);
        final long _tmpPROMOTION_ID;
        _tmpPROMOTION_ID = _cursor.getLong(_cursorIndexOfPROMOTIONID);
        final long _tmpBASKET_ID;
        _tmpBASKET_ID = _cursor.getLong(_cursorIndexOfBASKETID);
        final long _tmpBASKET_DETAIL_ID;
        _tmpBASKET_DETAIL_ID = _cursor.getLong(_cursorIndexOfBASKETDETAILID);
        final long _tmpPROMOTION_OFFER_ID;
        _tmpPROMOTION_OFFER_ID = _cursor.getLong(_cursorIndexOfPROMOTIONOFFERID);
        final int _tmpSKU_ID;
        _tmpSKU_ID = _cursor.getInt(_cursorIndexOfSKUID);
        final int _tmpQUANTITY;
        _tmpQUANTITY = _cursor.getInt(_cursorIndexOfQUANTITY);
        final double _tmpUNIT_PRICE;
        _tmpUNIT_PRICE = _cursor.getDouble(_cursorIndexOfUNITPRICE);
        final double _tmpAMOUNT;
        _tmpAMOUNT = _cursor.getDouble(_cursorIndexOfAMOUNT);
        final double _tmpGST_RATE;
        _tmpGST_RATE = _cursor.getDouble(_cursorIndexOfGSTRATE);
        final double _tmpGST_AMOUNT;
        _tmpGST_AMOUNT = _cursor.getDouble(_cursorIndexOfGSTAMOUNT);
        final double _tmpTST_AMOUNT;
        _tmpTST_AMOUNT = _cursor.getDouble(_cursorIndexOfTSTAMOUNT);
        final double _tmpSED_AMOUNT;
        _tmpSED_AMOUNT = _cursor.getDouble(_cursorIndexOfSEDAMOUNT);
        final int _tmpMaster_Sku_Id;
        _tmpMaster_Sku_Id = _cursor.getInt(_cursorIndexOfMasterSkuId);
        final double _tmpEXTRA_TAX;
        _tmpEXTRA_TAX = _cursor.getDouble(_cursorIndexOfEXTRATAX);
        final int _tmpQUANTITY_TO;
        _tmpQUANTITY_TO = _cursor.getInt(_cursorIndexOfQUANTITYTO);
        final int _tmpQUANTITY_AD;
        _tmpQUANTITY_AD = _cursor.getInt(_cursorIndexOfQUANTITYAD);
        _item = new OrderDetailFreeSKU(_tmpSALE_ORDER_PROMOTION_ID,_tmpDISTRIBUTOR_ID,_tmpSALE_ORDER_ID,_tmpSCHEME_ID,_tmpPROMOTION_ID,_tmpBASKET_ID,_tmpBASKET_DETAIL_ID,_tmpPROMOTION_OFFER_ID,_tmpSKU_ID,_tmpQUANTITY,_tmpUNIT_PRICE,_tmpAMOUNT,_tmpGST_RATE,_tmpGST_AMOUNT,_tmpTST_AMOUNT,_tmpSED_AMOUNT,_tmpMaster_Sku_Id,_tmpEXTRA_TAX,_tmpQUANTITY_TO,_tmpQUANTITY_AD);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<OrderDetailFreeSKU> getAll() {
    final String _sql = "SELECT * FROM SALE_ORDER_PROMOTION";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfSALEORDERPROMOTIONID = _cursor.getColumnIndexOrThrow("SALE_ORDER_PROMOTION_ID");
      final int _cursorIndexOfDISTRIBUTORID = _cursor.getColumnIndexOrThrow("DISTRIBUTOR_ID");
      final int _cursorIndexOfSALEORDERID = _cursor.getColumnIndexOrThrow("SALE_ORDER_ID");
      final int _cursorIndexOfSCHEMEID = _cursor.getColumnIndexOrThrow("SCHEME_ID");
      final int _cursorIndexOfPROMOTIONID = _cursor.getColumnIndexOrThrow("PROMOTION_ID");
      final int _cursorIndexOfBASKETID = _cursor.getColumnIndexOrThrow("BASKET_ID");
      final int _cursorIndexOfBASKETDETAILID = _cursor.getColumnIndexOrThrow("BASKET_DETAIL_ID");
      final int _cursorIndexOfPROMOTIONOFFERID = _cursor.getColumnIndexOrThrow("PROMOTION_OFFER_ID");
      final int _cursorIndexOfSKUID = _cursor.getColumnIndexOrThrow("SKU_ID");
      final int _cursorIndexOfQUANTITY = _cursor.getColumnIndexOrThrow("QUANTITY");
      final int _cursorIndexOfUNITPRICE = _cursor.getColumnIndexOrThrow("UNIT_PRICE");
      final int _cursorIndexOfAMOUNT = _cursor.getColumnIndexOrThrow("AMOUNT");
      final int _cursorIndexOfGSTRATE = _cursor.getColumnIndexOrThrow("GST_RATE");
      final int _cursorIndexOfGSTAMOUNT = _cursor.getColumnIndexOrThrow("GST_AMOUNT");
      final int _cursorIndexOfTSTAMOUNT = _cursor.getColumnIndexOrThrow("TST_AMOUNT");
      final int _cursorIndexOfSEDAMOUNT = _cursor.getColumnIndexOrThrow("SED_AMOUNT");
      final int _cursorIndexOfMasterSkuId = _cursor.getColumnIndexOrThrow("master_Sku_Id");
      final int _cursorIndexOfEXTRATAX = _cursor.getColumnIndexOrThrow("EXTRA_TAX");
      final int _cursorIndexOfQUANTITYTO = _cursor.getColumnIndexOrThrow("QUANTITY_TO");
      final int _cursorIndexOfQUANTITYAD = _cursor.getColumnIndexOrThrow("QUANTITY_AD");
      final List<OrderDetailFreeSKU> _result = new ArrayList<OrderDetailFreeSKU>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final OrderDetailFreeSKU _item;
        final int _tmpSALE_ORDER_PROMOTION_ID;
        _tmpSALE_ORDER_PROMOTION_ID = _cursor.getInt(_cursorIndexOfSALEORDERPROMOTIONID);
        final int _tmpDISTRIBUTOR_ID;
        _tmpDISTRIBUTOR_ID = _cursor.getInt(_cursorIndexOfDISTRIBUTORID);
        final int _tmpSALE_ORDER_ID;
        _tmpSALE_ORDER_ID = _cursor.getInt(_cursorIndexOfSALEORDERID);
        final int _tmpSCHEME_ID;
        _tmpSCHEME_ID = _cursor.getInt(_cursorIndexOfSCHEMEID);
        final long _tmpPROMOTION_ID;
        _tmpPROMOTION_ID = _cursor.getLong(_cursorIndexOfPROMOTIONID);
        final long _tmpBASKET_ID;
        _tmpBASKET_ID = _cursor.getLong(_cursorIndexOfBASKETID);
        final long _tmpBASKET_DETAIL_ID;
        _tmpBASKET_DETAIL_ID = _cursor.getLong(_cursorIndexOfBASKETDETAILID);
        final long _tmpPROMOTION_OFFER_ID;
        _tmpPROMOTION_OFFER_ID = _cursor.getLong(_cursorIndexOfPROMOTIONOFFERID);
        final int _tmpSKU_ID;
        _tmpSKU_ID = _cursor.getInt(_cursorIndexOfSKUID);
        final int _tmpQUANTITY;
        _tmpQUANTITY = _cursor.getInt(_cursorIndexOfQUANTITY);
        final double _tmpUNIT_PRICE;
        _tmpUNIT_PRICE = _cursor.getDouble(_cursorIndexOfUNITPRICE);
        final double _tmpAMOUNT;
        _tmpAMOUNT = _cursor.getDouble(_cursorIndexOfAMOUNT);
        final double _tmpGST_RATE;
        _tmpGST_RATE = _cursor.getDouble(_cursorIndexOfGSTRATE);
        final double _tmpGST_AMOUNT;
        _tmpGST_AMOUNT = _cursor.getDouble(_cursorIndexOfGSTAMOUNT);
        final double _tmpTST_AMOUNT;
        _tmpTST_AMOUNT = _cursor.getDouble(_cursorIndexOfTSTAMOUNT);
        final double _tmpSED_AMOUNT;
        _tmpSED_AMOUNT = _cursor.getDouble(_cursorIndexOfSEDAMOUNT);
        final int _tmpMaster_Sku_Id;
        _tmpMaster_Sku_Id = _cursor.getInt(_cursorIndexOfMasterSkuId);
        final double _tmpEXTRA_TAX;
        _tmpEXTRA_TAX = _cursor.getDouble(_cursorIndexOfEXTRATAX);
        final int _tmpQUANTITY_TO;
        _tmpQUANTITY_TO = _cursor.getInt(_cursorIndexOfQUANTITYTO);
        final int _tmpQUANTITY_AD;
        _tmpQUANTITY_AD = _cursor.getInt(_cursorIndexOfQUANTITYAD);
        _item = new OrderDetailFreeSKU(_tmpSALE_ORDER_PROMOTION_ID,_tmpDISTRIBUTOR_ID,_tmpSALE_ORDER_ID,_tmpSCHEME_ID,_tmpPROMOTION_ID,_tmpBASKET_ID,_tmpBASKET_DETAIL_ID,_tmpPROMOTION_OFFER_ID,_tmpSKU_ID,_tmpQUANTITY,_tmpUNIT_PRICE,_tmpAMOUNT,_tmpGST_RATE,_tmpGST_AMOUNT,_tmpTST_AMOUNT,_tmpSED_AMOUNT,_tmpMaster_Sku_Id,_tmpEXTRA_TAX,_tmpQUANTITY_TO,_tmpQUANTITY_AD);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
