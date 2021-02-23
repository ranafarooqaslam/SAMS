package com.fastservices.sams.data.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.fastservices.sams.data.entities.SKU;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class SKUDao_Impl implements SKUDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfSKU;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public SKUDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSKU = new EntityInsertionAdapter<SKU>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `SKU`(`SKU_ID`,`SKU_CODE`,`SKU_NAME`,`GST_ON`,`TRADE_PRICE`,`GST_RATE`,`UNITS_IN_CASE`,`BRAND_ID`,`WEIGHT`,`DISTRIBUTOR_PRICE`,`RETAIL_PRICE`,`EXTR_Tax`,`SEQUENCE_NUMBER`,`UOM_DESC`,`CATEGORY_ID`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SKU value) {
        stmt.bindLong(1, value.getSKU_ID());
        if (value.getSKU_CODE() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getSKU_CODE());
        }
        if (value.getSKU_NAME() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSKU_NAME());
        }
        if (value.getGST_ON() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getGST_ON());
        }
        stmt.bindDouble(5, value.getTRADE_PRICE());
        stmt.bindDouble(6, value.getGST_RATE());
        stmt.bindLong(7, value.getUNITS_IN_CASE());
        stmt.bindLong(8, value.getBRAND_ID());
        stmt.bindDouble(9, value.getWEIGHT());
        stmt.bindDouble(10, value.getDISTRIBUTOR_PRICE());
        stmt.bindDouble(11, value.getRETAIL_PRICE());
        stmt.bindDouble(12, value.getEXTR_Tax());
        stmt.bindLong(13, value.getSEQUENCE_NUMBER());
        if (value.getUOM_DESC() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getUOM_DESC());
        }
        stmt.bindLong(15, value.getCATEGORY_ID());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM SKU";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(List<SKU> sections) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfSKU.insert(sections);
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
  public List<SKU> getAll() {
    final String _sql = "SELECT * FROM SKU ORDER BY SKU_NAME";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfSKUID = _cursor.getColumnIndexOrThrow("SKU_ID");
      final int _cursorIndexOfSKUCODE = _cursor.getColumnIndexOrThrow("SKU_CODE");
      final int _cursorIndexOfSKUNAME = _cursor.getColumnIndexOrThrow("SKU_NAME");
      final int _cursorIndexOfGSTON = _cursor.getColumnIndexOrThrow("GST_ON");
      final int _cursorIndexOfTRADEPRICE = _cursor.getColumnIndexOrThrow("TRADE_PRICE");
      final int _cursorIndexOfGSTRATE = _cursor.getColumnIndexOrThrow("GST_RATE");
      final int _cursorIndexOfUNITSINCASE = _cursor.getColumnIndexOrThrow("UNITS_IN_CASE");
      final int _cursorIndexOfBRANDID = _cursor.getColumnIndexOrThrow("BRAND_ID");
      final int _cursorIndexOfWEIGHT = _cursor.getColumnIndexOrThrow("WEIGHT");
      final int _cursorIndexOfDISTRIBUTORPRICE = _cursor.getColumnIndexOrThrow("DISTRIBUTOR_PRICE");
      final int _cursorIndexOfRETAILPRICE = _cursor.getColumnIndexOrThrow("RETAIL_PRICE");
      final int _cursorIndexOfEXTRTax = _cursor.getColumnIndexOrThrow("EXTR_Tax");
      final int _cursorIndexOfSEQUENCENUMBER = _cursor.getColumnIndexOrThrow("SEQUENCE_NUMBER");
      final int _cursorIndexOfUOMDESC = _cursor.getColumnIndexOrThrow("UOM_DESC");
      final int _cursorIndexOfCATEGORYID = _cursor.getColumnIndexOrThrow("CATEGORY_ID");
      final List<SKU> _result = new ArrayList<SKU>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SKU _item;
        _item = new SKU();
        final int _tmpSKU_ID;
        _tmpSKU_ID = _cursor.getInt(_cursorIndexOfSKUID);
        _item.setSKU_ID(_tmpSKU_ID);
        final String _tmpSKU_CODE;
        _tmpSKU_CODE = _cursor.getString(_cursorIndexOfSKUCODE);
        _item.setSKU_CODE(_tmpSKU_CODE);
        final String _tmpSKU_NAME;
        _tmpSKU_NAME = _cursor.getString(_cursorIndexOfSKUNAME);
        _item.setSKU_NAME(_tmpSKU_NAME);
        final String _tmpGST_ON;
        _tmpGST_ON = _cursor.getString(_cursorIndexOfGSTON);
        _item.setGST_ON(_tmpGST_ON);
        final double _tmpTRADE_PRICE;
        _tmpTRADE_PRICE = _cursor.getDouble(_cursorIndexOfTRADEPRICE);
        _item.setTRADE_PRICE(_tmpTRADE_PRICE);
        final double _tmpGST_RATE;
        _tmpGST_RATE = _cursor.getDouble(_cursorIndexOfGSTRATE);
        _item.setGST_RATE(_tmpGST_RATE);
        final int _tmpUNITS_IN_CASE;
        _tmpUNITS_IN_CASE = _cursor.getInt(_cursorIndexOfUNITSINCASE);
        _item.setUNITS_IN_CASE(_tmpUNITS_IN_CASE);
        final int _tmpBRAND_ID;
        _tmpBRAND_ID = _cursor.getInt(_cursorIndexOfBRANDID);
        _item.setBRAND_ID(_tmpBRAND_ID);
        final double _tmpWEIGHT;
        _tmpWEIGHT = _cursor.getDouble(_cursorIndexOfWEIGHT);
        _item.setWEIGHT(_tmpWEIGHT);
        final double _tmpDISTRIBUTOR_PRICE;
        _tmpDISTRIBUTOR_PRICE = _cursor.getDouble(_cursorIndexOfDISTRIBUTORPRICE);
        _item.setDISTRIBUTOR_PRICE(_tmpDISTRIBUTOR_PRICE);
        final double _tmpRETAIL_PRICE;
        _tmpRETAIL_PRICE = _cursor.getDouble(_cursorIndexOfRETAILPRICE);
        _item.setRETAIL_PRICE(_tmpRETAIL_PRICE);
        final float _tmpEXTR_Tax;
        _tmpEXTR_Tax = _cursor.getFloat(_cursorIndexOfEXTRTax);
        _item.setEXTR_Tax(_tmpEXTR_Tax);
        final int _tmpSEQUENCE_NUMBER;
        _tmpSEQUENCE_NUMBER = _cursor.getInt(_cursorIndexOfSEQUENCENUMBER);
        _item.setSEQUENCE_NUMBER(_tmpSEQUENCE_NUMBER);
        final String _tmpUOM_DESC;
        _tmpUOM_DESC = _cursor.getString(_cursorIndexOfUOMDESC);
        _item.setUOM_DESC(_tmpUOM_DESC);
        final int _tmpCATEGORY_ID;
        _tmpCATEGORY_ID = _cursor.getInt(_cursorIndexOfCATEGORYID);
        _item.setCATEGORY_ID(_tmpCATEGORY_ID);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SKU> getAll(int skuId) {
    final String _sql = "SELECT * FROM SKU WHERE SKU_ID = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, skuId);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfSKUID = _cursor.getColumnIndexOrThrow("SKU_ID");
      final int _cursorIndexOfSKUCODE = _cursor.getColumnIndexOrThrow("SKU_CODE");
      final int _cursorIndexOfSKUNAME = _cursor.getColumnIndexOrThrow("SKU_NAME");
      final int _cursorIndexOfGSTON = _cursor.getColumnIndexOrThrow("GST_ON");
      final int _cursorIndexOfTRADEPRICE = _cursor.getColumnIndexOrThrow("TRADE_PRICE");
      final int _cursorIndexOfGSTRATE = _cursor.getColumnIndexOrThrow("GST_RATE");
      final int _cursorIndexOfUNITSINCASE = _cursor.getColumnIndexOrThrow("UNITS_IN_CASE");
      final int _cursorIndexOfBRANDID = _cursor.getColumnIndexOrThrow("BRAND_ID");
      final int _cursorIndexOfWEIGHT = _cursor.getColumnIndexOrThrow("WEIGHT");
      final int _cursorIndexOfDISTRIBUTORPRICE = _cursor.getColumnIndexOrThrow("DISTRIBUTOR_PRICE");
      final int _cursorIndexOfRETAILPRICE = _cursor.getColumnIndexOrThrow("RETAIL_PRICE");
      final int _cursorIndexOfEXTRTax = _cursor.getColumnIndexOrThrow("EXTR_Tax");
      final int _cursorIndexOfSEQUENCENUMBER = _cursor.getColumnIndexOrThrow("SEQUENCE_NUMBER");
      final int _cursorIndexOfUOMDESC = _cursor.getColumnIndexOrThrow("UOM_DESC");
      final int _cursorIndexOfCATEGORYID = _cursor.getColumnIndexOrThrow("CATEGORY_ID");
      final List<SKU> _result = new ArrayList<SKU>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SKU _item;
        _item = new SKU();
        final int _tmpSKU_ID;
        _tmpSKU_ID = _cursor.getInt(_cursorIndexOfSKUID);
        _item.setSKU_ID(_tmpSKU_ID);
        final String _tmpSKU_CODE;
        _tmpSKU_CODE = _cursor.getString(_cursorIndexOfSKUCODE);
        _item.setSKU_CODE(_tmpSKU_CODE);
        final String _tmpSKU_NAME;
        _tmpSKU_NAME = _cursor.getString(_cursorIndexOfSKUNAME);
        _item.setSKU_NAME(_tmpSKU_NAME);
        final String _tmpGST_ON;
        _tmpGST_ON = _cursor.getString(_cursorIndexOfGSTON);
        _item.setGST_ON(_tmpGST_ON);
        final double _tmpTRADE_PRICE;
        _tmpTRADE_PRICE = _cursor.getDouble(_cursorIndexOfTRADEPRICE);
        _item.setTRADE_PRICE(_tmpTRADE_PRICE);
        final double _tmpGST_RATE;
        _tmpGST_RATE = _cursor.getDouble(_cursorIndexOfGSTRATE);
        _item.setGST_RATE(_tmpGST_RATE);
        final int _tmpUNITS_IN_CASE;
        _tmpUNITS_IN_CASE = _cursor.getInt(_cursorIndexOfUNITSINCASE);
        _item.setUNITS_IN_CASE(_tmpUNITS_IN_CASE);
        final int _tmpBRAND_ID;
        _tmpBRAND_ID = _cursor.getInt(_cursorIndexOfBRANDID);
        _item.setBRAND_ID(_tmpBRAND_ID);
        final double _tmpWEIGHT;
        _tmpWEIGHT = _cursor.getDouble(_cursorIndexOfWEIGHT);
        _item.setWEIGHT(_tmpWEIGHT);
        final double _tmpDISTRIBUTOR_PRICE;
        _tmpDISTRIBUTOR_PRICE = _cursor.getDouble(_cursorIndexOfDISTRIBUTORPRICE);
        _item.setDISTRIBUTOR_PRICE(_tmpDISTRIBUTOR_PRICE);
        final double _tmpRETAIL_PRICE;
        _tmpRETAIL_PRICE = _cursor.getDouble(_cursorIndexOfRETAILPRICE);
        _item.setRETAIL_PRICE(_tmpRETAIL_PRICE);
        final float _tmpEXTR_Tax;
        _tmpEXTR_Tax = _cursor.getFloat(_cursorIndexOfEXTRTax);
        _item.setEXTR_Tax(_tmpEXTR_Tax);
        final int _tmpSEQUENCE_NUMBER;
        _tmpSEQUENCE_NUMBER = _cursor.getInt(_cursorIndexOfSEQUENCENUMBER);
        _item.setSEQUENCE_NUMBER(_tmpSEQUENCE_NUMBER);
        final String _tmpUOM_DESC;
        _tmpUOM_DESC = _cursor.getString(_cursorIndexOfUOMDESC);
        _item.setUOM_DESC(_tmpUOM_DESC);
        final int _tmpCATEGORY_ID;
        _tmpCATEGORY_ID = _cursor.getInt(_cursorIndexOfCATEGORYID);
        _item.setCATEGORY_ID(_tmpCATEGORY_ID);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SKU> getAllForCategory(int catId) {
    final String _sql = "SELECT * FROM SKU WHERE CATEGORY_ID = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, catId);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfSKUID = _cursor.getColumnIndexOrThrow("SKU_ID");
      final int _cursorIndexOfSKUCODE = _cursor.getColumnIndexOrThrow("SKU_CODE");
      final int _cursorIndexOfSKUNAME = _cursor.getColumnIndexOrThrow("SKU_NAME");
      final int _cursorIndexOfGSTON = _cursor.getColumnIndexOrThrow("GST_ON");
      final int _cursorIndexOfTRADEPRICE = _cursor.getColumnIndexOrThrow("TRADE_PRICE");
      final int _cursorIndexOfGSTRATE = _cursor.getColumnIndexOrThrow("GST_RATE");
      final int _cursorIndexOfUNITSINCASE = _cursor.getColumnIndexOrThrow("UNITS_IN_CASE");
      final int _cursorIndexOfBRANDID = _cursor.getColumnIndexOrThrow("BRAND_ID");
      final int _cursorIndexOfWEIGHT = _cursor.getColumnIndexOrThrow("WEIGHT");
      final int _cursorIndexOfDISTRIBUTORPRICE = _cursor.getColumnIndexOrThrow("DISTRIBUTOR_PRICE");
      final int _cursorIndexOfRETAILPRICE = _cursor.getColumnIndexOrThrow("RETAIL_PRICE");
      final int _cursorIndexOfEXTRTax = _cursor.getColumnIndexOrThrow("EXTR_Tax");
      final int _cursorIndexOfSEQUENCENUMBER = _cursor.getColumnIndexOrThrow("SEQUENCE_NUMBER");
      final int _cursorIndexOfUOMDESC = _cursor.getColumnIndexOrThrow("UOM_DESC");
      final int _cursorIndexOfCATEGORYID = _cursor.getColumnIndexOrThrow("CATEGORY_ID");
      final List<SKU> _result = new ArrayList<SKU>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SKU _item;
        _item = new SKU();
        final int _tmpSKU_ID;
        _tmpSKU_ID = _cursor.getInt(_cursorIndexOfSKUID);
        _item.setSKU_ID(_tmpSKU_ID);
        final String _tmpSKU_CODE;
        _tmpSKU_CODE = _cursor.getString(_cursorIndexOfSKUCODE);
        _item.setSKU_CODE(_tmpSKU_CODE);
        final String _tmpSKU_NAME;
        _tmpSKU_NAME = _cursor.getString(_cursorIndexOfSKUNAME);
        _item.setSKU_NAME(_tmpSKU_NAME);
        final String _tmpGST_ON;
        _tmpGST_ON = _cursor.getString(_cursorIndexOfGSTON);
        _item.setGST_ON(_tmpGST_ON);
        final double _tmpTRADE_PRICE;
        _tmpTRADE_PRICE = _cursor.getDouble(_cursorIndexOfTRADEPRICE);
        _item.setTRADE_PRICE(_tmpTRADE_PRICE);
        final double _tmpGST_RATE;
        _tmpGST_RATE = _cursor.getDouble(_cursorIndexOfGSTRATE);
        _item.setGST_RATE(_tmpGST_RATE);
        final int _tmpUNITS_IN_CASE;
        _tmpUNITS_IN_CASE = _cursor.getInt(_cursorIndexOfUNITSINCASE);
        _item.setUNITS_IN_CASE(_tmpUNITS_IN_CASE);
        final int _tmpBRAND_ID;
        _tmpBRAND_ID = _cursor.getInt(_cursorIndexOfBRANDID);
        _item.setBRAND_ID(_tmpBRAND_ID);
        final double _tmpWEIGHT;
        _tmpWEIGHT = _cursor.getDouble(_cursorIndexOfWEIGHT);
        _item.setWEIGHT(_tmpWEIGHT);
        final double _tmpDISTRIBUTOR_PRICE;
        _tmpDISTRIBUTOR_PRICE = _cursor.getDouble(_cursorIndexOfDISTRIBUTORPRICE);
        _item.setDISTRIBUTOR_PRICE(_tmpDISTRIBUTOR_PRICE);
        final double _tmpRETAIL_PRICE;
        _tmpRETAIL_PRICE = _cursor.getDouble(_cursorIndexOfRETAILPRICE);
        _item.setRETAIL_PRICE(_tmpRETAIL_PRICE);
        final float _tmpEXTR_Tax;
        _tmpEXTR_Tax = _cursor.getFloat(_cursorIndexOfEXTRTax);
        _item.setEXTR_Tax(_tmpEXTR_Tax);
        final int _tmpSEQUENCE_NUMBER;
        _tmpSEQUENCE_NUMBER = _cursor.getInt(_cursorIndexOfSEQUENCENUMBER);
        _item.setSEQUENCE_NUMBER(_tmpSEQUENCE_NUMBER);
        final String _tmpUOM_DESC;
        _tmpUOM_DESC = _cursor.getString(_cursorIndexOfUOMDESC);
        _item.setUOM_DESC(_tmpUOM_DESC);
        final int _tmpCATEGORY_ID;
        _tmpCATEGORY_ID = _cursor.getInt(_cursorIndexOfCATEGORYID);
        _item.setCATEGORY_ID(_tmpCATEGORY_ID);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
