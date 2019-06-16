package com.fastservices.sams.data.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.fastservices.sams.data.entities.OrderDetail;
import com.fastservices.sams.data.models.SKUWiseSummaryModel;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class OrderDetailDao_Impl implements OrderDetailDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfOrderDetail;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfOrderDetail;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public OrderDetailDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOrderDetail = new EntityInsertionAdapter<OrderDetail>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ORDER_DETAIL`(`ORDER_DETAIL_ID`,`DISTRIBUTOR_ID`,`SALE_ORDER_ID`,`SKU_ID`,`QUANTITY_UNIT`,`UNIT_PRICE`,`GST_RATE`,`AMOUNT`,`STANDARD_DISCOUNT`,`EXTRA_DISCOUNT`,`GST_AMOUNT`,`NET_AMOUNT`,`TST_AMOUNT`,`SED_AMOUNT`,`UNITS_IN_CASE`,`EXTRA_TAX`,`GST_PRICE`,`STANDARD_DISCOUNT_BY_VALUE`,`STANDARD_DISCOUNT_PER_VALUE`,`SED_AMOUNT_BY_VALUE`,`SED_AMOUNT_PER_VALUE`,`STANDARD_DISCOUNT_BY_VALUE_TO`,`STANDARD_DISCOUNT_BY_VALUE_AD`,`STANDARD_DISCOUNT_PER_VALUE_TO`,`STANDARD_DISCOUNT_PER_VALUE_AD`,`SED_AMOUNT_BY_VALUE_TO`,`SED_AMOUNT_BY_VALUE_AD`,`SED_AMOUNT_PER_VALUE_TO`,`SED_AMOUNT_PER_VALUE_AD`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OrderDetail value) {
        stmt.bindLong(1, value.getORDER_DETAIL_ID());
        stmt.bindLong(2, value.getDISTRIBUTOR_ID());
        stmt.bindLong(3, value.getSALE_ORDER_ID());
        stmt.bindLong(4, value.getSKU_ID());
        stmt.bindLong(5, value.getQUANTITY_UNIT());
        stmt.bindDouble(6, value.getUNIT_PRICE());
        stmt.bindDouble(7, value.getGST_RATE());
        stmt.bindDouble(8, value.getAMOUNT());
        stmt.bindDouble(9, value.getSTANDARD_DISCOUNT());
        stmt.bindDouble(10, value.getEXTRA_DISCOUNT());
        stmt.bindDouble(11, value.getGST_AMOUNT());
        stmt.bindDouble(12, value.getNET_AMOUNT());
        stmt.bindDouble(13, value.getTST_AMOUNT());
        stmt.bindDouble(14, value.getSED_AMOUNT());
        stmt.bindLong(15, value.getUNITS_IN_CASE());
        stmt.bindDouble(16, value.getEXTRA_TAX());
        stmt.bindDouble(17, value.getGST_PRICE());
        stmt.bindDouble(18, value.getSTANDARD_DISCOUNT_BY_VALUE());
        stmt.bindDouble(19, value.getSTANDARD_DISCOUNT_PER_VALUE());
        stmt.bindDouble(20, value.getSED_AMOUNT_BY_VALUE());
        stmt.bindDouble(21, value.getSED_AMOUNT_PER_VALUE());
        stmt.bindDouble(22, value.getSTANDARD_DISCOUNT_BY_VALUE_TO());
        stmt.bindDouble(23, value.getSTANDARD_DISCOUNT_BY_VALUE_AD());
        stmt.bindDouble(24, value.getSTANDARD_DISCOUNT_PER_VALUE_TO());
        stmt.bindDouble(25, value.getSTANDARD_DISCOUNT_PER_VALUE_AD());
        stmt.bindDouble(26, value.getSED_AMOUNT_BY_VALUE_TO());
        stmt.bindDouble(27, value.getSED_AMOUNT_BY_VALUE_AD());
        stmt.bindDouble(28, value.getSED_AMOUNT_PER_VALUE_TO());
        stmt.bindDouble(29, value.getSED_AMOUNT_PER_VALUE_AD());
      }
    };
    this.__deletionAdapterOfOrderDetail = new EntityDeletionOrUpdateAdapter<OrderDetail>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `ORDER_DETAIL` WHERE `ORDER_DETAIL_ID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OrderDetail value) {
        stmt.bindLong(1, value.getORDER_DETAIL_ID());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM ORDER_DETAIL";
        return _query;
      }
    };
  }

  @Override
  public void insert(OrderDetail orderDetail) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfOrderDetail.insert(orderDetail);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(List<OrderDetail> orderDetails) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfOrderDetail.handleMultiple(orderDetails);
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
  public List<OrderDetail> getAllOdersByMasterId(int orderMasterId) {
    final String _sql = "SELECT * FROM ORDER_DETAIL WHERE SALE_ORDER_ID = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, orderMasterId);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfORDERDETAILID = _cursor.getColumnIndexOrThrow("ORDER_DETAIL_ID");
      final int _cursorIndexOfDISTRIBUTORID = _cursor.getColumnIndexOrThrow("DISTRIBUTOR_ID");
      final int _cursorIndexOfSALEORDERID = _cursor.getColumnIndexOrThrow("SALE_ORDER_ID");
      final int _cursorIndexOfSKUID = _cursor.getColumnIndexOrThrow("SKU_ID");
      final int _cursorIndexOfQUANTITYUNIT = _cursor.getColumnIndexOrThrow("QUANTITY_UNIT");
      final int _cursorIndexOfUNITPRICE = _cursor.getColumnIndexOrThrow("UNIT_PRICE");
      final int _cursorIndexOfGSTRATE = _cursor.getColumnIndexOrThrow("GST_RATE");
      final int _cursorIndexOfAMOUNT = _cursor.getColumnIndexOrThrow("AMOUNT");
      final int _cursorIndexOfSTANDARDDISCOUNT = _cursor.getColumnIndexOrThrow("STANDARD_DISCOUNT");
      final int _cursorIndexOfEXTRADISCOUNT = _cursor.getColumnIndexOrThrow("EXTRA_DISCOUNT");
      final int _cursorIndexOfGSTAMOUNT = _cursor.getColumnIndexOrThrow("GST_AMOUNT");
      final int _cursorIndexOfNETAMOUNT = _cursor.getColumnIndexOrThrow("NET_AMOUNT");
      final int _cursorIndexOfTSTAMOUNT = _cursor.getColumnIndexOrThrow("TST_AMOUNT");
      final int _cursorIndexOfSEDAMOUNT = _cursor.getColumnIndexOrThrow("SED_AMOUNT");
      final int _cursorIndexOfUNITSINCASE = _cursor.getColumnIndexOrThrow("UNITS_IN_CASE");
      final int _cursorIndexOfEXTRATAX = _cursor.getColumnIndexOrThrow("EXTRA_TAX");
      final int _cursorIndexOfGSTPRICE = _cursor.getColumnIndexOrThrow("GST_PRICE");
      final int _cursorIndexOfSTANDARDDISCOUNTBYVALUE = _cursor.getColumnIndexOrThrow("STANDARD_DISCOUNT_BY_VALUE");
      final int _cursorIndexOfSTANDARDDISCOUNTPERVALUE = _cursor.getColumnIndexOrThrow("STANDARD_DISCOUNT_PER_VALUE");
      final int _cursorIndexOfSEDAMOUNTBYVALUE = _cursor.getColumnIndexOrThrow("SED_AMOUNT_BY_VALUE");
      final int _cursorIndexOfSEDAMOUNTPERVALUE = _cursor.getColumnIndexOrThrow("SED_AMOUNT_PER_VALUE");
      final int _cursorIndexOfSTANDARDDISCOUNTBYVALUETO = _cursor.getColumnIndexOrThrow("STANDARD_DISCOUNT_BY_VALUE_TO");
      final int _cursorIndexOfSTANDARDDISCOUNTBYVALUEAD = _cursor.getColumnIndexOrThrow("STANDARD_DISCOUNT_BY_VALUE_AD");
      final int _cursorIndexOfSTANDARDDISCOUNTPERVALUETO = _cursor.getColumnIndexOrThrow("STANDARD_DISCOUNT_PER_VALUE_TO");
      final int _cursorIndexOfSTANDARDDISCOUNTPERVALUEAD = _cursor.getColumnIndexOrThrow("STANDARD_DISCOUNT_PER_VALUE_AD");
      final int _cursorIndexOfSEDAMOUNTBYVALUETO = _cursor.getColumnIndexOrThrow("SED_AMOUNT_BY_VALUE_TO");
      final int _cursorIndexOfSEDAMOUNTBYVALUEAD = _cursor.getColumnIndexOrThrow("SED_AMOUNT_BY_VALUE_AD");
      final int _cursorIndexOfSEDAMOUNTPERVALUETO = _cursor.getColumnIndexOrThrow("SED_AMOUNT_PER_VALUE_TO");
      final int _cursorIndexOfSEDAMOUNTPERVALUEAD = _cursor.getColumnIndexOrThrow("SED_AMOUNT_PER_VALUE_AD");
      final List<OrderDetail> _result = new ArrayList<OrderDetail>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final OrderDetail _item;
        final int _tmpORDER_DETAIL_ID;
        _tmpORDER_DETAIL_ID = _cursor.getInt(_cursorIndexOfORDERDETAILID);
        final int _tmpDISTRIBUTOR_ID;
        _tmpDISTRIBUTOR_ID = _cursor.getInt(_cursorIndexOfDISTRIBUTORID);
        final int _tmpSALE_ORDER_ID;
        _tmpSALE_ORDER_ID = _cursor.getInt(_cursorIndexOfSALEORDERID);
        final int _tmpSKU_ID;
        _tmpSKU_ID = _cursor.getInt(_cursorIndexOfSKUID);
        final int _tmpQUANTITY_UNIT;
        _tmpQUANTITY_UNIT = _cursor.getInt(_cursorIndexOfQUANTITYUNIT);
        final double _tmpUNIT_PRICE;
        _tmpUNIT_PRICE = _cursor.getDouble(_cursorIndexOfUNITPRICE);
        final double _tmpGST_RATE;
        _tmpGST_RATE = _cursor.getDouble(_cursorIndexOfGSTRATE);
        final double _tmpAMOUNT;
        _tmpAMOUNT = _cursor.getDouble(_cursorIndexOfAMOUNT);
        final double _tmpSTANDARD_DISCOUNT;
        _tmpSTANDARD_DISCOUNT = _cursor.getDouble(_cursorIndexOfSTANDARDDISCOUNT);
        final double _tmpEXTRA_DISCOUNT;
        _tmpEXTRA_DISCOUNT = _cursor.getDouble(_cursorIndexOfEXTRADISCOUNT);
        final double _tmpGST_AMOUNT;
        _tmpGST_AMOUNT = _cursor.getDouble(_cursorIndexOfGSTAMOUNT);
        final double _tmpNET_AMOUNT;
        _tmpNET_AMOUNT = _cursor.getDouble(_cursorIndexOfNETAMOUNT);
        final double _tmpTST_AMOUNT;
        _tmpTST_AMOUNT = _cursor.getDouble(_cursorIndexOfTSTAMOUNT);
        final double _tmpSED_AMOUNT;
        _tmpSED_AMOUNT = _cursor.getDouble(_cursorIndexOfSEDAMOUNT);
        final int _tmpUNITS_IN_CASE;
        _tmpUNITS_IN_CASE = _cursor.getInt(_cursorIndexOfUNITSINCASE);
        final double _tmpEXTRA_TAX;
        _tmpEXTRA_TAX = _cursor.getDouble(_cursorIndexOfEXTRATAX);
        final double _tmpGST_PRICE;
        _tmpGST_PRICE = _cursor.getDouble(_cursorIndexOfGSTPRICE);
        final double _tmpSTANDARD_DISCOUNT_BY_VALUE;
        _tmpSTANDARD_DISCOUNT_BY_VALUE = _cursor.getDouble(_cursorIndexOfSTANDARDDISCOUNTBYVALUE);
        final double _tmpSTANDARD_DISCOUNT_PER_VALUE;
        _tmpSTANDARD_DISCOUNT_PER_VALUE = _cursor.getDouble(_cursorIndexOfSTANDARDDISCOUNTPERVALUE);
        final double _tmpSED_AMOUNT_BY_VALUE;
        _tmpSED_AMOUNT_BY_VALUE = _cursor.getDouble(_cursorIndexOfSEDAMOUNTBYVALUE);
        final double _tmpSED_AMOUNT_PER_VALUE;
        _tmpSED_AMOUNT_PER_VALUE = _cursor.getDouble(_cursorIndexOfSEDAMOUNTPERVALUE);
        final double _tmpSTANDARD_DISCOUNT_BY_VALUE_TO;
        _tmpSTANDARD_DISCOUNT_BY_VALUE_TO = _cursor.getDouble(_cursorIndexOfSTANDARDDISCOUNTBYVALUETO);
        final double _tmpSTANDARD_DISCOUNT_BY_VALUE_AD;
        _tmpSTANDARD_DISCOUNT_BY_VALUE_AD = _cursor.getDouble(_cursorIndexOfSTANDARDDISCOUNTBYVALUEAD);
        final double _tmpSTANDARD_DISCOUNT_PER_VALUE_TO;
        _tmpSTANDARD_DISCOUNT_PER_VALUE_TO = _cursor.getDouble(_cursorIndexOfSTANDARDDISCOUNTPERVALUETO);
        final double _tmpSTANDARD_DISCOUNT_PER_VALUE_AD;
        _tmpSTANDARD_DISCOUNT_PER_VALUE_AD = _cursor.getDouble(_cursorIndexOfSTANDARDDISCOUNTPERVALUEAD);
        final double _tmpSED_AMOUNT_BY_VALUE_TO;
        _tmpSED_AMOUNT_BY_VALUE_TO = _cursor.getDouble(_cursorIndexOfSEDAMOUNTBYVALUETO);
        final double _tmpSED_AMOUNT_BY_VALUE_AD;
        _tmpSED_AMOUNT_BY_VALUE_AD = _cursor.getDouble(_cursorIndexOfSEDAMOUNTBYVALUEAD);
        final double _tmpSED_AMOUNT_PER_VALUE_TO;
        _tmpSED_AMOUNT_PER_VALUE_TO = _cursor.getDouble(_cursorIndexOfSEDAMOUNTPERVALUETO);
        final double _tmpSED_AMOUNT_PER_VALUE_AD;
        _tmpSED_AMOUNT_PER_VALUE_AD = _cursor.getDouble(_cursorIndexOfSEDAMOUNTPERVALUEAD);
        _item = new OrderDetail(_tmpORDER_DETAIL_ID,_tmpDISTRIBUTOR_ID,_tmpSALE_ORDER_ID,_tmpSKU_ID,_tmpQUANTITY_UNIT,_tmpUNIT_PRICE,_tmpGST_RATE,_tmpAMOUNT,_tmpSTANDARD_DISCOUNT,_tmpEXTRA_DISCOUNT,_tmpGST_AMOUNT,_tmpNET_AMOUNT,_tmpTST_AMOUNT,_tmpSED_AMOUNT,_tmpUNITS_IN_CASE,_tmpEXTRA_TAX,_tmpGST_PRICE,_tmpSTANDARD_DISCOUNT_BY_VALUE,_tmpSTANDARD_DISCOUNT_PER_VALUE,_tmpSED_AMOUNT_BY_VALUE,_tmpSED_AMOUNT_PER_VALUE,_tmpSTANDARD_DISCOUNT_BY_VALUE_TO,_tmpSTANDARD_DISCOUNT_BY_VALUE_AD,_tmpSTANDARD_DISCOUNT_PER_VALUE_TO,_tmpSTANDARD_DISCOUNT_PER_VALUE_AD,_tmpSED_AMOUNT_BY_VALUE_TO,_tmpSED_AMOUNT_BY_VALUE_AD,_tmpSED_AMOUNT_PER_VALUE_TO,_tmpSED_AMOUNT_PER_VALUE_AD);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<OrderDetail> getAll() {
    final String _sql = "SELECT * FROM ORDER_DETAIL";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfORDERDETAILID = _cursor.getColumnIndexOrThrow("ORDER_DETAIL_ID");
      final int _cursorIndexOfDISTRIBUTORID = _cursor.getColumnIndexOrThrow("DISTRIBUTOR_ID");
      final int _cursorIndexOfSALEORDERID = _cursor.getColumnIndexOrThrow("SALE_ORDER_ID");
      final int _cursorIndexOfSKUID = _cursor.getColumnIndexOrThrow("SKU_ID");
      final int _cursorIndexOfQUANTITYUNIT = _cursor.getColumnIndexOrThrow("QUANTITY_UNIT");
      final int _cursorIndexOfUNITPRICE = _cursor.getColumnIndexOrThrow("UNIT_PRICE");
      final int _cursorIndexOfGSTRATE = _cursor.getColumnIndexOrThrow("GST_RATE");
      final int _cursorIndexOfAMOUNT = _cursor.getColumnIndexOrThrow("AMOUNT");
      final int _cursorIndexOfSTANDARDDISCOUNT = _cursor.getColumnIndexOrThrow("STANDARD_DISCOUNT");
      final int _cursorIndexOfEXTRADISCOUNT = _cursor.getColumnIndexOrThrow("EXTRA_DISCOUNT");
      final int _cursorIndexOfGSTAMOUNT = _cursor.getColumnIndexOrThrow("GST_AMOUNT");
      final int _cursorIndexOfNETAMOUNT = _cursor.getColumnIndexOrThrow("NET_AMOUNT");
      final int _cursorIndexOfTSTAMOUNT = _cursor.getColumnIndexOrThrow("TST_AMOUNT");
      final int _cursorIndexOfSEDAMOUNT = _cursor.getColumnIndexOrThrow("SED_AMOUNT");
      final int _cursorIndexOfUNITSINCASE = _cursor.getColumnIndexOrThrow("UNITS_IN_CASE");
      final int _cursorIndexOfEXTRATAX = _cursor.getColumnIndexOrThrow("EXTRA_TAX");
      final int _cursorIndexOfGSTPRICE = _cursor.getColumnIndexOrThrow("GST_PRICE");
      final int _cursorIndexOfSTANDARDDISCOUNTBYVALUE = _cursor.getColumnIndexOrThrow("STANDARD_DISCOUNT_BY_VALUE");
      final int _cursorIndexOfSTANDARDDISCOUNTPERVALUE = _cursor.getColumnIndexOrThrow("STANDARD_DISCOUNT_PER_VALUE");
      final int _cursorIndexOfSEDAMOUNTBYVALUE = _cursor.getColumnIndexOrThrow("SED_AMOUNT_BY_VALUE");
      final int _cursorIndexOfSEDAMOUNTPERVALUE = _cursor.getColumnIndexOrThrow("SED_AMOUNT_PER_VALUE");
      final int _cursorIndexOfSTANDARDDISCOUNTBYVALUETO = _cursor.getColumnIndexOrThrow("STANDARD_DISCOUNT_BY_VALUE_TO");
      final int _cursorIndexOfSTANDARDDISCOUNTBYVALUEAD = _cursor.getColumnIndexOrThrow("STANDARD_DISCOUNT_BY_VALUE_AD");
      final int _cursorIndexOfSTANDARDDISCOUNTPERVALUETO = _cursor.getColumnIndexOrThrow("STANDARD_DISCOUNT_PER_VALUE_TO");
      final int _cursorIndexOfSTANDARDDISCOUNTPERVALUEAD = _cursor.getColumnIndexOrThrow("STANDARD_DISCOUNT_PER_VALUE_AD");
      final int _cursorIndexOfSEDAMOUNTBYVALUETO = _cursor.getColumnIndexOrThrow("SED_AMOUNT_BY_VALUE_TO");
      final int _cursorIndexOfSEDAMOUNTBYVALUEAD = _cursor.getColumnIndexOrThrow("SED_AMOUNT_BY_VALUE_AD");
      final int _cursorIndexOfSEDAMOUNTPERVALUETO = _cursor.getColumnIndexOrThrow("SED_AMOUNT_PER_VALUE_TO");
      final int _cursorIndexOfSEDAMOUNTPERVALUEAD = _cursor.getColumnIndexOrThrow("SED_AMOUNT_PER_VALUE_AD");
      final List<OrderDetail> _result = new ArrayList<OrderDetail>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final OrderDetail _item;
        final int _tmpORDER_DETAIL_ID;
        _tmpORDER_DETAIL_ID = _cursor.getInt(_cursorIndexOfORDERDETAILID);
        final int _tmpDISTRIBUTOR_ID;
        _tmpDISTRIBUTOR_ID = _cursor.getInt(_cursorIndexOfDISTRIBUTORID);
        final int _tmpSALE_ORDER_ID;
        _tmpSALE_ORDER_ID = _cursor.getInt(_cursorIndexOfSALEORDERID);
        final int _tmpSKU_ID;
        _tmpSKU_ID = _cursor.getInt(_cursorIndexOfSKUID);
        final int _tmpQUANTITY_UNIT;
        _tmpQUANTITY_UNIT = _cursor.getInt(_cursorIndexOfQUANTITYUNIT);
        final double _tmpUNIT_PRICE;
        _tmpUNIT_PRICE = _cursor.getDouble(_cursorIndexOfUNITPRICE);
        final double _tmpGST_RATE;
        _tmpGST_RATE = _cursor.getDouble(_cursorIndexOfGSTRATE);
        final double _tmpAMOUNT;
        _tmpAMOUNT = _cursor.getDouble(_cursorIndexOfAMOUNT);
        final double _tmpSTANDARD_DISCOUNT;
        _tmpSTANDARD_DISCOUNT = _cursor.getDouble(_cursorIndexOfSTANDARDDISCOUNT);
        final double _tmpEXTRA_DISCOUNT;
        _tmpEXTRA_DISCOUNT = _cursor.getDouble(_cursorIndexOfEXTRADISCOUNT);
        final double _tmpGST_AMOUNT;
        _tmpGST_AMOUNT = _cursor.getDouble(_cursorIndexOfGSTAMOUNT);
        final double _tmpNET_AMOUNT;
        _tmpNET_AMOUNT = _cursor.getDouble(_cursorIndexOfNETAMOUNT);
        final double _tmpTST_AMOUNT;
        _tmpTST_AMOUNT = _cursor.getDouble(_cursorIndexOfTSTAMOUNT);
        final double _tmpSED_AMOUNT;
        _tmpSED_AMOUNT = _cursor.getDouble(_cursorIndexOfSEDAMOUNT);
        final int _tmpUNITS_IN_CASE;
        _tmpUNITS_IN_CASE = _cursor.getInt(_cursorIndexOfUNITSINCASE);
        final double _tmpEXTRA_TAX;
        _tmpEXTRA_TAX = _cursor.getDouble(_cursorIndexOfEXTRATAX);
        final double _tmpGST_PRICE;
        _tmpGST_PRICE = _cursor.getDouble(_cursorIndexOfGSTPRICE);
        final double _tmpSTANDARD_DISCOUNT_BY_VALUE;
        _tmpSTANDARD_DISCOUNT_BY_VALUE = _cursor.getDouble(_cursorIndexOfSTANDARDDISCOUNTBYVALUE);
        final double _tmpSTANDARD_DISCOUNT_PER_VALUE;
        _tmpSTANDARD_DISCOUNT_PER_VALUE = _cursor.getDouble(_cursorIndexOfSTANDARDDISCOUNTPERVALUE);
        final double _tmpSED_AMOUNT_BY_VALUE;
        _tmpSED_AMOUNT_BY_VALUE = _cursor.getDouble(_cursorIndexOfSEDAMOUNTBYVALUE);
        final double _tmpSED_AMOUNT_PER_VALUE;
        _tmpSED_AMOUNT_PER_VALUE = _cursor.getDouble(_cursorIndexOfSEDAMOUNTPERVALUE);
        final double _tmpSTANDARD_DISCOUNT_BY_VALUE_TO;
        _tmpSTANDARD_DISCOUNT_BY_VALUE_TO = _cursor.getDouble(_cursorIndexOfSTANDARDDISCOUNTBYVALUETO);
        final double _tmpSTANDARD_DISCOUNT_BY_VALUE_AD;
        _tmpSTANDARD_DISCOUNT_BY_VALUE_AD = _cursor.getDouble(_cursorIndexOfSTANDARDDISCOUNTBYVALUEAD);
        final double _tmpSTANDARD_DISCOUNT_PER_VALUE_TO;
        _tmpSTANDARD_DISCOUNT_PER_VALUE_TO = _cursor.getDouble(_cursorIndexOfSTANDARDDISCOUNTPERVALUETO);
        final double _tmpSTANDARD_DISCOUNT_PER_VALUE_AD;
        _tmpSTANDARD_DISCOUNT_PER_VALUE_AD = _cursor.getDouble(_cursorIndexOfSTANDARDDISCOUNTPERVALUEAD);
        final double _tmpSED_AMOUNT_BY_VALUE_TO;
        _tmpSED_AMOUNT_BY_VALUE_TO = _cursor.getDouble(_cursorIndexOfSEDAMOUNTBYVALUETO);
        final double _tmpSED_AMOUNT_BY_VALUE_AD;
        _tmpSED_AMOUNT_BY_VALUE_AD = _cursor.getDouble(_cursorIndexOfSEDAMOUNTBYVALUEAD);
        final double _tmpSED_AMOUNT_PER_VALUE_TO;
        _tmpSED_AMOUNT_PER_VALUE_TO = _cursor.getDouble(_cursorIndexOfSEDAMOUNTPERVALUETO);
        final double _tmpSED_AMOUNT_PER_VALUE_AD;
        _tmpSED_AMOUNT_PER_VALUE_AD = _cursor.getDouble(_cursorIndexOfSEDAMOUNTPERVALUEAD);
        _item = new OrderDetail(_tmpORDER_DETAIL_ID,_tmpDISTRIBUTOR_ID,_tmpSALE_ORDER_ID,_tmpSKU_ID,_tmpQUANTITY_UNIT,_tmpUNIT_PRICE,_tmpGST_RATE,_tmpAMOUNT,_tmpSTANDARD_DISCOUNT,_tmpEXTRA_DISCOUNT,_tmpGST_AMOUNT,_tmpNET_AMOUNT,_tmpTST_AMOUNT,_tmpSED_AMOUNT,_tmpUNITS_IN_CASE,_tmpEXTRA_TAX,_tmpGST_PRICE,_tmpSTANDARD_DISCOUNT_BY_VALUE,_tmpSTANDARD_DISCOUNT_PER_VALUE,_tmpSED_AMOUNT_BY_VALUE,_tmpSED_AMOUNT_PER_VALUE,_tmpSTANDARD_DISCOUNT_BY_VALUE_TO,_tmpSTANDARD_DISCOUNT_BY_VALUE_AD,_tmpSTANDARD_DISCOUNT_PER_VALUE_TO,_tmpSTANDARD_DISCOUNT_PER_VALUE_AD,_tmpSED_AMOUNT_BY_VALUE_TO,_tmpSED_AMOUNT_BY_VALUE_AD,_tmpSED_AMOUNT_PER_VALUE_TO,_tmpSED_AMOUNT_PER_VALUE_AD);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public long totalQuantity() {
    final String _sql = "SELECT SUM(QUANTITY_UNIT) FROM ORDER_DETAIL";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final long _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getLong(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SKUWiseSummaryModel> getSKUwiseSummary() {
    final String _sql = "SELECT S.SKU_NAME,SUM(OD.QUANTITY_UNIT) AS QUANTITY_UNIT ,SUM(OD.NET_AMOUNT) AS NET_AMOUNT FROM ORDER_DETAIL OD INNER JOIN SKU S ON S.SKU_ID = OD.SKU_ID GROUP BY OD.SKU_ID";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfSKUNAME = _cursor.getColumnIndexOrThrow("SKU_NAME");
      final int _cursorIndexOfQUANTITYUNIT = _cursor.getColumnIndexOrThrow("QUANTITY_UNIT");
      final int _cursorIndexOfNETAMOUNT = _cursor.getColumnIndexOrThrow("NET_AMOUNT");
      final List<SKUWiseSummaryModel> _result = new ArrayList<SKUWiseSummaryModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SKUWiseSummaryModel _item;
        final String _tmpSKU_NAME;
        _tmpSKU_NAME = _cursor.getString(_cursorIndexOfSKUNAME);
        final int _tmpQUANTITY_UNIT;
        _tmpQUANTITY_UNIT = _cursor.getInt(_cursorIndexOfQUANTITYUNIT);
        final double _tmpNET_AMOUNT;
        _tmpNET_AMOUNT = _cursor.getDouble(_cursorIndexOfNETAMOUNT);
        _item = new SKUWiseSummaryModel(_tmpSKU_NAME,_tmpQUANTITY_UNIT,_tmpNET_AMOUNT);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
