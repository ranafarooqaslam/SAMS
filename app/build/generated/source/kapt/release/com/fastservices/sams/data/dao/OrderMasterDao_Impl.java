package com.fastservices.sams.data.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.fastservices.sams.data.entities.OrderMaster;
import com.fastservices.sams.data.models.OutletWiseSummaryModel;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class OrderMasterDao_Impl implements OrderMasterDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfOrderMaster;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfOrderMaster;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfOrderMaster;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public OrderMasterDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOrderMaster = new EntityInsertionAdapter<OrderMaster>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ORDER_MASTER`(`SALE_ORDER_ID`,`DISTRIBUTOR_ID`,`PRINCIPAL_ID`,`SOLD_TO`,`TOWN_ID`,`AREA_ID`,`DOCUMENT_DATE`,`TOTAL_AMOUNT`,`EXTRA_DISCOUNT_AMOUNT`,`STANDARD_DISCOUNT_AMOUNT`,`GST_AMOUNT`,`TOTAL_NET_AMOUNT`,`SCHEME_AMOUNT`,`TST_AMOUNT`,`SED_AMOUNT`,`REMARKS`,`EXTRA_TAX`,`STANDARD_DISCOUNT_BY_VALUE`,`STANDARD_DISCOUNT_PER_VALUE`,`SED_AMOUNT_BY_VALUE`,`SED_AMOUNT_PER_VALUE`,`STANDARD_DISCOUNT_BY_VALUE_TO`,`STANDARD_DISCOUNT_BY_VALUE_AD`,`STANDARD_DISCOUNT_PER_VALUE_TO`,`STANDARD_DISCOUNT_PER_VALUE_AD`,`SED_AMOUNT_BY_VALUE_TO`,`SED_AMOUNT_BY_VALUE_AD`,`SED_AMOUNT_PER_VALUE_TO`,`SED_AMOUNT_PER_VALUE_AD`,`TIME_IN`,`TIME_OUT`,`OUTLET_ID`,`LATITUDE`,`LONGITUDE`,`PHOTO_PATH1`,`PHOTO_PATH2`,`PHOTO_PATH3`,`PHOTO_PATH4`,`PHOTO_PATH5`,`ORDER_PAYMENT_TYPE`,`IS_SYNCED`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OrderMaster value) {
        stmt.bindLong(1, value.getSALE_ORDER_ID());
        stmt.bindLong(2, value.getDISTRIBUTOR_ID());
        stmt.bindLong(3, value.getPRINCIPAL_ID());
        stmt.bindLong(4, value.getSOLD_TO());
        stmt.bindLong(5, value.getTOWN_ID());
        stmt.bindLong(6, value.getAREA_ID());
        if (value.getDOCUMENT_DATE() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDOCUMENT_DATE());
        }
        stmt.bindDouble(8, value.getTOTAL_AMOUNT());
        stmt.bindDouble(9, value.getEXTRA_DISCOUNT_AMOUNT());
        stmt.bindDouble(10, value.getSTANDARD_DISCOUNT_AMOUNT());
        stmt.bindDouble(11, value.getGST_AMOUNT());
        stmt.bindDouble(12, value.getTOTAL_NET_AMOUNT());
        stmt.bindDouble(13, value.getSCHEME_AMOUNT());
        stmt.bindDouble(14, value.getTST_AMOUNT());
        stmt.bindDouble(15, value.getSED_AMOUNT());
        if (value.getREMARKS() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getREMARKS());
        }
        stmt.bindDouble(17, value.getEXTRA_TAX());
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
        if (value.getTIME_IN() == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.getTIME_IN());
        }
        if (value.getTIME_OUT() == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.getTIME_OUT());
        }
        stmt.bindLong(32, value.getOUTLET_ID());
        stmt.bindDouble(33, value.getLATITUDE());
        stmt.bindDouble(34, value.getLONGITUDE());
        if (value.getPHOTO_PATH1() == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindString(35, value.getPHOTO_PATH1());
        }
        if (value.getPHOTO_PATH2() == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindString(36, value.getPHOTO_PATH2());
        }
        if (value.getPHOTO_PATH3() == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindString(37, value.getPHOTO_PATH3());
        }
        if (value.getPHOTO_PATH4() == null) {
          stmt.bindNull(38);
        } else {
          stmt.bindString(38, value.getPHOTO_PATH4());
        }
        if (value.getPHOTO_PATH5() == null) {
          stmt.bindNull(39);
        } else {
          stmt.bindString(39, value.getPHOTO_PATH5());
        }
        stmt.bindLong(40, value.getORDER_PAYMENT_TYPE());
        stmt.bindLong(41, value.getIS_SYNCED());
      }
    };
    this.__deletionAdapterOfOrderMaster = new EntityDeletionOrUpdateAdapter<OrderMaster>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `ORDER_MASTER` WHERE `SALE_ORDER_ID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OrderMaster value) {
        stmt.bindLong(1, value.getSALE_ORDER_ID());
      }
    };
    this.__updateAdapterOfOrderMaster = new EntityDeletionOrUpdateAdapter<OrderMaster>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `ORDER_MASTER` SET `SALE_ORDER_ID` = ?,`DISTRIBUTOR_ID` = ?,`PRINCIPAL_ID` = ?,`SOLD_TO` = ?,`TOWN_ID` = ?,`AREA_ID` = ?,`DOCUMENT_DATE` = ?,`TOTAL_AMOUNT` = ?,`EXTRA_DISCOUNT_AMOUNT` = ?,`STANDARD_DISCOUNT_AMOUNT` = ?,`GST_AMOUNT` = ?,`TOTAL_NET_AMOUNT` = ?,`SCHEME_AMOUNT` = ?,`TST_AMOUNT` = ?,`SED_AMOUNT` = ?,`REMARKS` = ?,`EXTRA_TAX` = ?,`STANDARD_DISCOUNT_BY_VALUE` = ?,`STANDARD_DISCOUNT_PER_VALUE` = ?,`SED_AMOUNT_BY_VALUE` = ?,`SED_AMOUNT_PER_VALUE` = ?,`STANDARD_DISCOUNT_BY_VALUE_TO` = ?,`STANDARD_DISCOUNT_BY_VALUE_AD` = ?,`STANDARD_DISCOUNT_PER_VALUE_TO` = ?,`STANDARD_DISCOUNT_PER_VALUE_AD` = ?,`SED_AMOUNT_BY_VALUE_TO` = ?,`SED_AMOUNT_BY_VALUE_AD` = ?,`SED_AMOUNT_PER_VALUE_TO` = ?,`SED_AMOUNT_PER_VALUE_AD` = ?,`TIME_IN` = ?,`TIME_OUT` = ?,`OUTLET_ID` = ?,`LATITUDE` = ?,`LONGITUDE` = ?,`PHOTO_PATH1` = ?,`PHOTO_PATH2` = ?,`PHOTO_PATH3` = ?,`PHOTO_PATH4` = ?,`PHOTO_PATH5` = ?,`ORDER_PAYMENT_TYPE` = ?,`IS_SYNCED` = ? WHERE `SALE_ORDER_ID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OrderMaster value) {
        stmt.bindLong(1, value.getSALE_ORDER_ID());
        stmt.bindLong(2, value.getDISTRIBUTOR_ID());
        stmt.bindLong(3, value.getPRINCIPAL_ID());
        stmt.bindLong(4, value.getSOLD_TO());
        stmt.bindLong(5, value.getTOWN_ID());
        stmt.bindLong(6, value.getAREA_ID());
        if (value.getDOCUMENT_DATE() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDOCUMENT_DATE());
        }
        stmt.bindDouble(8, value.getTOTAL_AMOUNT());
        stmt.bindDouble(9, value.getEXTRA_DISCOUNT_AMOUNT());
        stmt.bindDouble(10, value.getSTANDARD_DISCOUNT_AMOUNT());
        stmt.bindDouble(11, value.getGST_AMOUNT());
        stmt.bindDouble(12, value.getTOTAL_NET_AMOUNT());
        stmt.bindDouble(13, value.getSCHEME_AMOUNT());
        stmt.bindDouble(14, value.getTST_AMOUNT());
        stmt.bindDouble(15, value.getSED_AMOUNT());
        if (value.getREMARKS() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getREMARKS());
        }
        stmt.bindDouble(17, value.getEXTRA_TAX());
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
        if (value.getTIME_IN() == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.getTIME_IN());
        }
        if (value.getTIME_OUT() == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.getTIME_OUT());
        }
        stmt.bindLong(32, value.getOUTLET_ID());
        stmt.bindDouble(33, value.getLATITUDE());
        stmt.bindDouble(34, value.getLONGITUDE());
        if (value.getPHOTO_PATH1() == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindString(35, value.getPHOTO_PATH1());
        }
        if (value.getPHOTO_PATH2() == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindString(36, value.getPHOTO_PATH2());
        }
        if (value.getPHOTO_PATH3() == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindString(37, value.getPHOTO_PATH3());
        }
        if (value.getPHOTO_PATH4() == null) {
          stmt.bindNull(38);
        } else {
          stmt.bindString(38, value.getPHOTO_PATH4());
        }
        if (value.getPHOTO_PATH5() == null) {
          stmt.bindNull(39);
        } else {
          stmt.bindString(39, value.getPHOTO_PATH5());
        }
        stmt.bindLong(40, value.getORDER_PAYMENT_TYPE());
        stmt.bindLong(41, value.getIS_SYNCED());
        stmt.bindLong(42, value.getSALE_ORDER_ID());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM ORDER_MASTER";
        return _query;
      }
    };
  }

  @Override
  public long insert(OrderMaster orderMaster) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfOrderMaster.insertAndReturnId(orderMaster);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(OrderMaster it) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfOrderMaster.handle(it);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(OrderMaster orderMaster) {
    __db.beginTransaction();
    try {
      __updateAdapterOfOrderMaster.handle(orderMaster);
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
  public List<OrderMaster> getAllNonSync() {
    final String _sql = "SELECT * FROM ORDER_MASTER WHERE IS_SYNCED = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfSALEORDERID = _cursor.getColumnIndexOrThrow("SALE_ORDER_ID");
      final int _cursorIndexOfDISTRIBUTORID = _cursor.getColumnIndexOrThrow("DISTRIBUTOR_ID");
      final int _cursorIndexOfPRINCIPALID = _cursor.getColumnIndexOrThrow("PRINCIPAL_ID");
      final int _cursorIndexOfSOLDTO = _cursor.getColumnIndexOrThrow("SOLD_TO");
      final int _cursorIndexOfTOWNID = _cursor.getColumnIndexOrThrow("TOWN_ID");
      final int _cursorIndexOfAREAID = _cursor.getColumnIndexOrThrow("AREA_ID");
      final int _cursorIndexOfDOCUMENTDATE = _cursor.getColumnIndexOrThrow("DOCUMENT_DATE");
      final int _cursorIndexOfTOTALAMOUNT = _cursor.getColumnIndexOrThrow("TOTAL_AMOUNT");
      final int _cursorIndexOfEXTRADISCOUNTAMOUNT = _cursor.getColumnIndexOrThrow("EXTRA_DISCOUNT_AMOUNT");
      final int _cursorIndexOfSTANDARDDISCOUNTAMOUNT = _cursor.getColumnIndexOrThrow("STANDARD_DISCOUNT_AMOUNT");
      final int _cursorIndexOfGSTAMOUNT = _cursor.getColumnIndexOrThrow("GST_AMOUNT");
      final int _cursorIndexOfTOTALNETAMOUNT = _cursor.getColumnIndexOrThrow("TOTAL_NET_AMOUNT");
      final int _cursorIndexOfSCHEMEAMOUNT = _cursor.getColumnIndexOrThrow("SCHEME_AMOUNT");
      final int _cursorIndexOfTSTAMOUNT = _cursor.getColumnIndexOrThrow("TST_AMOUNT");
      final int _cursorIndexOfSEDAMOUNT = _cursor.getColumnIndexOrThrow("SED_AMOUNT");
      final int _cursorIndexOfREMARKS = _cursor.getColumnIndexOrThrow("REMARKS");
      final int _cursorIndexOfEXTRATAX = _cursor.getColumnIndexOrThrow("EXTRA_TAX");
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
      final int _cursorIndexOfTIMEIN = _cursor.getColumnIndexOrThrow("TIME_IN");
      final int _cursorIndexOfTIMEOUT = _cursor.getColumnIndexOrThrow("TIME_OUT");
      final int _cursorIndexOfOUTLETID = _cursor.getColumnIndexOrThrow("OUTLET_ID");
      final int _cursorIndexOfLATITUDE = _cursor.getColumnIndexOrThrow("LATITUDE");
      final int _cursorIndexOfLONGITUDE = _cursor.getColumnIndexOrThrow("LONGITUDE");
      final int _cursorIndexOfPHOTOPATH1 = _cursor.getColumnIndexOrThrow("PHOTO_PATH1");
      final int _cursorIndexOfPHOTOPATH2 = _cursor.getColumnIndexOrThrow("PHOTO_PATH2");
      final int _cursorIndexOfPHOTOPATH3 = _cursor.getColumnIndexOrThrow("PHOTO_PATH3");
      final int _cursorIndexOfPHOTOPATH4 = _cursor.getColumnIndexOrThrow("PHOTO_PATH4");
      final int _cursorIndexOfPHOTOPATH5 = _cursor.getColumnIndexOrThrow("PHOTO_PATH5");
      final int _cursorIndexOfORDERPAYMENTTYPE = _cursor.getColumnIndexOrThrow("ORDER_PAYMENT_TYPE");
      final int _cursorIndexOfISSYNCED = _cursor.getColumnIndexOrThrow("IS_SYNCED");
      final List<OrderMaster> _result = new ArrayList<OrderMaster>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final OrderMaster _item;
        final int _tmpSALE_ORDER_ID;
        _tmpSALE_ORDER_ID = _cursor.getInt(_cursorIndexOfSALEORDERID);
        final int _tmpDISTRIBUTOR_ID;
        _tmpDISTRIBUTOR_ID = _cursor.getInt(_cursorIndexOfDISTRIBUTORID);
        final int _tmpPRINCIPAL_ID;
        _tmpPRINCIPAL_ID = _cursor.getInt(_cursorIndexOfPRINCIPALID);
        final int _tmpSOLD_TO;
        _tmpSOLD_TO = _cursor.getInt(_cursorIndexOfSOLDTO);
        final int _tmpTOWN_ID;
        _tmpTOWN_ID = _cursor.getInt(_cursorIndexOfTOWNID);
        final int _tmpAREA_ID;
        _tmpAREA_ID = _cursor.getInt(_cursorIndexOfAREAID);
        final String _tmpDOCUMENT_DATE;
        _tmpDOCUMENT_DATE = _cursor.getString(_cursorIndexOfDOCUMENTDATE);
        final double _tmpTOTAL_AMOUNT;
        _tmpTOTAL_AMOUNT = _cursor.getDouble(_cursorIndexOfTOTALAMOUNT);
        final double _tmpEXTRA_DISCOUNT_AMOUNT;
        _tmpEXTRA_DISCOUNT_AMOUNT = _cursor.getDouble(_cursorIndexOfEXTRADISCOUNTAMOUNT);
        final double _tmpSTANDARD_DISCOUNT_AMOUNT;
        _tmpSTANDARD_DISCOUNT_AMOUNT = _cursor.getDouble(_cursorIndexOfSTANDARDDISCOUNTAMOUNT);
        final double _tmpGST_AMOUNT;
        _tmpGST_AMOUNT = _cursor.getDouble(_cursorIndexOfGSTAMOUNT);
        final double _tmpTOTAL_NET_AMOUNT;
        _tmpTOTAL_NET_AMOUNT = _cursor.getDouble(_cursorIndexOfTOTALNETAMOUNT);
        final double _tmpSCHEME_AMOUNT;
        _tmpSCHEME_AMOUNT = _cursor.getDouble(_cursorIndexOfSCHEMEAMOUNT);
        final double _tmpTST_AMOUNT;
        _tmpTST_AMOUNT = _cursor.getDouble(_cursorIndexOfTSTAMOUNT);
        final double _tmpSED_AMOUNT;
        _tmpSED_AMOUNT = _cursor.getDouble(_cursorIndexOfSEDAMOUNT);
        final String _tmpREMARKS;
        _tmpREMARKS = _cursor.getString(_cursorIndexOfREMARKS);
        final double _tmpEXTRA_TAX;
        _tmpEXTRA_TAX = _cursor.getDouble(_cursorIndexOfEXTRATAX);
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
        final String _tmpTIME_IN;
        _tmpTIME_IN = _cursor.getString(_cursorIndexOfTIMEIN);
        final String _tmpTIME_OUT;
        _tmpTIME_OUT = _cursor.getString(_cursorIndexOfTIMEOUT);
        final int _tmpOUTLET_ID;
        _tmpOUTLET_ID = _cursor.getInt(_cursorIndexOfOUTLETID);
        final double _tmpLATITUDE;
        _tmpLATITUDE = _cursor.getDouble(_cursorIndexOfLATITUDE);
        final double _tmpLONGITUDE;
        _tmpLONGITUDE = _cursor.getDouble(_cursorIndexOfLONGITUDE);
        final String _tmpPHOTO_PATH1;
        _tmpPHOTO_PATH1 = _cursor.getString(_cursorIndexOfPHOTOPATH1);
        final String _tmpPHOTO_PATH2;
        _tmpPHOTO_PATH2 = _cursor.getString(_cursorIndexOfPHOTOPATH2);
        final String _tmpPHOTO_PATH3;
        _tmpPHOTO_PATH3 = _cursor.getString(_cursorIndexOfPHOTOPATH3);
        final String _tmpPHOTO_PATH4;
        _tmpPHOTO_PATH4 = _cursor.getString(_cursorIndexOfPHOTOPATH4);
        final String _tmpPHOTO_PATH5;
        _tmpPHOTO_PATH5 = _cursor.getString(_cursorIndexOfPHOTOPATH5);
        final int _tmpORDER_PAYMENT_TYPE;
        _tmpORDER_PAYMENT_TYPE = _cursor.getInt(_cursorIndexOfORDERPAYMENTTYPE);
        final int _tmpIS_SYNCED;
        _tmpIS_SYNCED = _cursor.getInt(_cursorIndexOfISSYNCED);
        _item = new OrderMaster(_tmpSALE_ORDER_ID,_tmpDISTRIBUTOR_ID,_tmpPRINCIPAL_ID,_tmpSOLD_TO,_tmpTOWN_ID,_tmpAREA_ID,_tmpDOCUMENT_DATE,_tmpTOTAL_AMOUNT,_tmpEXTRA_DISCOUNT_AMOUNT,_tmpSTANDARD_DISCOUNT_AMOUNT,_tmpGST_AMOUNT,_tmpTOTAL_NET_AMOUNT,_tmpSCHEME_AMOUNT,_tmpTST_AMOUNT,_tmpSED_AMOUNT,_tmpREMARKS,_tmpEXTRA_TAX,_tmpSTANDARD_DISCOUNT_BY_VALUE,_tmpSTANDARD_DISCOUNT_PER_VALUE,_tmpSED_AMOUNT_BY_VALUE,_tmpSED_AMOUNT_PER_VALUE,_tmpSTANDARD_DISCOUNT_BY_VALUE_TO,_tmpSTANDARD_DISCOUNT_BY_VALUE_AD,_tmpSTANDARD_DISCOUNT_PER_VALUE_TO,_tmpSTANDARD_DISCOUNT_PER_VALUE_AD,_tmpSED_AMOUNT_BY_VALUE_TO,_tmpSED_AMOUNT_BY_VALUE_AD,_tmpSED_AMOUNT_PER_VALUE_TO,_tmpSED_AMOUNT_PER_VALUE_AD,_tmpTIME_IN,_tmpTIME_OUT,_tmpOUTLET_ID,_tmpLATITUDE,_tmpLONGITUDE,_tmpPHOTO_PATH1,_tmpPHOTO_PATH2,_tmpPHOTO_PATH3,_tmpPHOTO_PATH4,_tmpPHOTO_PATH5,_tmpORDER_PAYMENT_TYPE,_tmpIS_SYNCED);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<OrderMaster> getAll() {
    final String _sql = "SELECT * FROM ORDER_MASTER";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfSALEORDERID = _cursor.getColumnIndexOrThrow("SALE_ORDER_ID");
      final int _cursorIndexOfDISTRIBUTORID = _cursor.getColumnIndexOrThrow("DISTRIBUTOR_ID");
      final int _cursorIndexOfPRINCIPALID = _cursor.getColumnIndexOrThrow("PRINCIPAL_ID");
      final int _cursorIndexOfSOLDTO = _cursor.getColumnIndexOrThrow("SOLD_TO");
      final int _cursorIndexOfTOWNID = _cursor.getColumnIndexOrThrow("TOWN_ID");
      final int _cursorIndexOfAREAID = _cursor.getColumnIndexOrThrow("AREA_ID");
      final int _cursorIndexOfDOCUMENTDATE = _cursor.getColumnIndexOrThrow("DOCUMENT_DATE");
      final int _cursorIndexOfTOTALAMOUNT = _cursor.getColumnIndexOrThrow("TOTAL_AMOUNT");
      final int _cursorIndexOfEXTRADISCOUNTAMOUNT = _cursor.getColumnIndexOrThrow("EXTRA_DISCOUNT_AMOUNT");
      final int _cursorIndexOfSTANDARDDISCOUNTAMOUNT = _cursor.getColumnIndexOrThrow("STANDARD_DISCOUNT_AMOUNT");
      final int _cursorIndexOfGSTAMOUNT = _cursor.getColumnIndexOrThrow("GST_AMOUNT");
      final int _cursorIndexOfTOTALNETAMOUNT = _cursor.getColumnIndexOrThrow("TOTAL_NET_AMOUNT");
      final int _cursorIndexOfSCHEMEAMOUNT = _cursor.getColumnIndexOrThrow("SCHEME_AMOUNT");
      final int _cursorIndexOfTSTAMOUNT = _cursor.getColumnIndexOrThrow("TST_AMOUNT");
      final int _cursorIndexOfSEDAMOUNT = _cursor.getColumnIndexOrThrow("SED_AMOUNT");
      final int _cursorIndexOfREMARKS = _cursor.getColumnIndexOrThrow("REMARKS");
      final int _cursorIndexOfEXTRATAX = _cursor.getColumnIndexOrThrow("EXTRA_TAX");
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
      final int _cursorIndexOfTIMEIN = _cursor.getColumnIndexOrThrow("TIME_IN");
      final int _cursorIndexOfTIMEOUT = _cursor.getColumnIndexOrThrow("TIME_OUT");
      final int _cursorIndexOfOUTLETID = _cursor.getColumnIndexOrThrow("OUTLET_ID");
      final int _cursorIndexOfLATITUDE = _cursor.getColumnIndexOrThrow("LATITUDE");
      final int _cursorIndexOfLONGITUDE = _cursor.getColumnIndexOrThrow("LONGITUDE");
      final int _cursorIndexOfPHOTOPATH1 = _cursor.getColumnIndexOrThrow("PHOTO_PATH1");
      final int _cursorIndexOfPHOTOPATH2 = _cursor.getColumnIndexOrThrow("PHOTO_PATH2");
      final int _cursorIndexOfPHOTOPATH3 = _cursor.getColumnIndexOrThrow("PHOTO_PATH3");
      final int _cursorIndexOfPHOTOPATH4 = _cursor.getColumnIndexOrThrow("PHOTO_PATH4");
      final int _cursorIndexOfPHOTOPATH5 = _cursor.getColumnIndexOrThrow("PHOTO_PATH5");
      final int _cursorIndexOfORDERPAYMENTTYPE = _cursor.getColumnIndexOrThrow("ORDER_PAYMENT_TYPE");
      final int _cursorIndexOfISSYNCED = _cursor.getColumnIndexOrThrow("IS_SYNCED");
      final List<OrderMaster> _result = new ArrayList<OrderMaster>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final OrderMaster _item;
        final int _tmpSALE_ORDER_ID;
        _tmpSALE_ORDER_ID = _cursor.getInt(_cursorIndexOfSALEORDERID);
        final int _tmpDISTRIBUTOR_ID;
        _tmpDISTRIBUTOR_ID = _cursor.getInt(_cursorIndexOfDISTRIBUTORID);
        final int _tmpPRINCIPAL_ID;
        _tmpPRINCIPAL_ID = _cursor.getInt(_cursorIndexOfPRINCIPALID);
        final int _tmpSOLD_TO;
        _tmpSOLD_TO = _cursor.getInt(_cursorIndexOfSOLDTO);
        final int _tmpTOWN_ID;
        _tmpTOWN_ID = _cursor.getInt(_cursorIndexOfTOWNID);
        final int _tmpAREA_ID;
        _tmpAREA_ID = _cursor.getInt(_cursorIndexOfAREAID);
        final String _tmpDOCUMENT_DATE;
        _tmpDOCUMENT_DATE = _cursor.getString(_cursorIndexOfDOCUMENTDATE);
        final double _tmpTOTAL_AMOUNT;
        _tmpTOTAL_AMOUNT = _cursor.getDouble(_cursorIndexOfTOTALAMOUNT);
        final double _tmpEXTRA_DISCOUNT_AMOUNT;
        _tmpEXTRA_DISCOUNT_AMOUNT = _cursor.getDouble(_cursorIndexOfEXTRADISCOUNTAMOUNT);
        final double _tmpSTANDARD_DISCOUNT_AMOUNT;
        _tmpSTANDARD_DISCOUNT_AMOUNT = _cursor.getDouble(_cursorIndexOfSTANDARDDISCOUNTAMOUNT);
        final double _tmpGST_AMOUNT;
        _tmpGST_AMOUNT = _cursor.getDouble(_cursorIndexOfGSTAMOUNT);
        final double _tmpTOTAL_NET_AMOUNT;
        _tmpTOTAL_NET_AMOUNT = _cursor.getDouble(_cursorIndexOfTOTALNETAMOUNT);
        final double _tmpSCHEME_AMOUNT;
        _tmpSCHEME_AMOUNT = _cursor.getDouble(_cursorIndexOfSCHEMEAMOUNT);
        final double _tmpTST_AMOUNT;
        _tmpTST_AMOUNT = _cursor.getDouble(_cursorIndexOfTSTAMOUNT);
        final double _tmpSED_AMOUNT;
        _tmpSED_AMOUNT = _cursor.getDouble(_cursorIndexOfSEDAMOUNT);
        final String _tmpREMARKS;
        _tmpREMARKS = _cursor.getString(_cursorIndexOfREMARKS);
        final double _tmpEXTRA_TAX;
        _tmpEXTRA_TAX = _cursor.getDouble(_cursorIndexOfEXTRATAX);
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
        final String _tmpTIME_IN;
        _tmpTIME_IN = _cursor.getString(_cursorIndexOfTIMEIN);
        final String _tmpTIME_OUT;
        _tmpTIME_OUT = _cursor.getString(_cursorIndexOfTIMEOUT);
        final int _tmpOUTLET_ID;
        _tmpOUTLET_ID = _cursor.getInt(_cursorIndexOfOUTLETID);
        final double _tmpLATITUDE;
        _tmpLATITUDE = _cursor.getDouble(_cursorIndexOfLATITUDE);
        final double _tmpLONGITUDE;
        _tmpLONGITUDE = _cursor.getDouble(_cursorIndexOfLONGITUDE);
        final String _tmpPHOTO_PATH1;
        _tmpPHOTO_PATH1 = _cursor.getString(_cursorIndexOfPHOTOPATH1);
        final String _tmpPHOTO_PATH2;
        _tmpPHOTO_PATH2 = _cursor.getString(_cursorIndexOfPHOTOPATH2);
        final String _tmpPHOTO_PATH3;
        _tmpPHOTO_PATH3 = _cursor.getString(_cursorIndexOfPHOTOPATH3);
        final String _tmpPHOTO_PATH4;
        _tmpPHOTO_PATH4 = _cursor.getString(_cursorIndexOfPHOTOPATH4);
        final String _tmpPHOTO_PATH5;
        _tmpPHOTO_PATH5 = _cursor.getString(_cursorIndexOfPHOTOPATH5);
        final int _tmpORDER_PAYMENT_TYPE;
        _tmpORDER_PAYMENT_TYPE = _cursor.getInt(_cursorIndexOfORDERPAYMENTTYPE);
        final int _tmpIS_SYNCED;
        _tmpIS_SYNCED = _cursor.getInt(_cursorIndexOfISSYNCED);
        _item = new OrderMaster(_tmpSALE_ORDER_ID,_tmpDISTRIBUTOR_ID,_tmpPRINCIPAL_ID,_tmpSOLD_TO,_tmpTOWN_ID,_tmpAREA_ID,_tmpDOCUMENT_DATE,_tmpTOTAL_AMOUNT,_tmpEXTRA_DISCOUNT_AMOUNT,_tmpSTANDARD_DISCOUNT_AMOUNT,_tmpGST_AMOUNT,_tmpTOTAL_NET_AMOUNT,_tmpSCHEME_AMOUNT,_tmpTST_AMOUNT,_tmpSED_AMOUNT,_tmpREMARKS,_tmpEXTRA_TAX,_tmpSTANDARD_DISCOUNT_BY_VALUE,_tmpSTANDARD_DISCOUNT_PER_VALUE,_tmpSED_AMOUNT_BY_VALUE,_tmpSED_AMOUNT_PER_VALUE,_tmpSTANDARD_DISCOUNT_BY_VALUE_TO,_tmpSTANDARD_DISCOUNT_BY_VALUE_AD,_tmpSTANDARD_DISCOUNT_PER_VALUE_TO,_tmpSTANDARD_DISCOUNT_PER_VALUE_AD,_tmpSED_AMOUNT_BY_VALUE_TO,_tmpSED_AMOUNT_BY_VALUE_AD,_tmpSED_AMOUNT_PER_VALUE_TO,_tmpSED_AMOUNT_PER_VALUE_AD,_tmpTIME_IN,_tmpTIME_OUT,_tmpOUTLET_ID,_tmpLATITUDE,_tmpLONGITUDE,_tmpPHOTO_PATH1,_tmpPHOTO_PATH2,_tmpPHOTO_PATH3,_tmpPHOTO_PATH4,_tmpPHOTO_PATH5,_tmpORDER_PAYMENT_TYPE,_tmpIS_SYNCED);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int outletsHaveOrder() {
    final String _sql = "SELECT COUNT(*) FROM ORDER_MASTER";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
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
  public double totalNetAmount() {
    final String _sql = "SELECT SUM(TOTAL_NET_AMOUNT) FROM ORDER_MASTER";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final double _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getDouble(0);
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
  public List<OutletWiseSummaryModel> getOutletwiseSummary() {
    final String _sql = "SELECT OM.SOLD_TO AS OUTLET_CODE, O.outletName AS OUTLET_NAME, OM.TOTAL_NET_AMOUNT AS NET_AMOUNT FROM ORDER_MASTER OM INNER JOIN OUTLET O ON OM.SOLD_TO = O.outletID";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfOUTLETCODE = _cursor.getColumnIndexOrThrow("OUTLET_CODE");
      final int _cursorIndexOfOUTLETNAME = _cursor.getColumnIndexOrThrow("OUTLET_NAME");
      final int _cursorIndexOfNETAMOUNT = _cursor.getColumnIndexOrThrow("NET_AMOUNT");
      final List<OutletWiseSummaryModel> _result = new ArrayList<OutletWiseSummaryModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final OutletWiseSummaryModel _item;
        final int _tmpOUTLET_CODE;
        _tmpOUTLET_CODE = _cursor.getInt(_cursorIndexOfOUTLETCODE);
        final String _tmpOUTLET_NAME;
        _tmpOUTLET_NAME = _cursor.getString(_cursorIndexOfOUTLETNAME);
        final double _tmpNET_AMOUNT;
        _tmpNET_AMOUNT = _cursor.getDouble(_cursorIndexOfNETAMOUNT);
        _item = new OutletWiseSummaryModel(_tmpOUTLET_CODE,_tmpOUTLET_NAME,_tmpNET_AMOUNT);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
