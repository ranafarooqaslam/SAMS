package com.fastservices.sams.data.dao.promotions;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.fastservices.sams.data.entities.promotions.dtBasketDetail;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class BasketDetailDao_Impl implements BasketDetailDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfdtBasketDetail;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public BasketDetailDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfdtBasketDetail = new EntityInsertionAdapter<dtBasketDetail>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `dtBasketDetail`(`BASKET_DETAIL_ID`,`BASKET_ID`,`PROMOTION_ID`,`SCHEME_ID`,`DISTRIBUTOR_ID`,`MIN_VAL`,`MAX_VAL`,`MULTIPLE_OF`,`SKU_ID`,`SKU_GROUP_ID`,`UOM_ID`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, dtBasketDetail value) {
        stmt.bindLong(1, value.getBASKET_DETAIL_ID());
        stmt.bindLong(2, value.getBASKET_ID());
        stmt.bindLong(3, value.getPROMOTION_ID());
        stmt.bindLong(4, value.getSCHEME_ID());
        stmt.bindLong(5, value.getDISTRIBUTOR_ID());
        if (value.getMIN_VAL() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindDouble(6, value.getMIN_VAL());
        }
        if (value.getMAX_VAL() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindDouble(7, value.getMAX_VAL());
        }
        stmt.bindLong(8, value.getMULTIPLE_OF());
        stmt.bindLong(9, value.getSKU_ID());
        stmt.bindLong(10, value.getSKU_GROUP_ID());
        stmt.bindLong(11, value.getUOM_ID());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM dtBasketDetail";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(List<? extends dtBasketDetail> list) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfdtBasketDetail.insert(list);
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
  public List<dtBasketDetail> getAll(long basket_id) {
    final String _sql = "SELECT * FROM dtBasketDetail WHERE BASKET_ID = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, basket_id);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfBASKETDETAILID = _cursor.getColumnIndexOrThrow("BASKET_DETAIL_ID");
      final int _cursorIndexOfBASKETID = _cursor.getColumnIndexOrThrow("BASKET_ID");
      final int _cursorIndexOfPROMOTIONID = _cursor.getColumnIndexOrThrow("PROMOTION_ID");
      final int _cursorIndexOfSCHEMEID = _cursor.getColumnIndexOrThrow("SCHEME_ID");
      final int _cursorIndexOfDISTRIBUTORID = _cursor.getColumnIndexOrThrow("DISTRIBUTOR_ID");
      final int _cursorIndexOfMINVAL = _cursor.getColumnIndexOrThrow("MIN_VAL");
      final int _cursorIndexOfMAXVAL = _cursor.getColumnIndexOrThrow("MAX_VAL");
      final int _cursorIndexOfMULTIPLEOF = _cursor.getColumnIndexOrThrow("MULTIPLE_OF");
      final int _cursorIndexOfSKUID = _cursor.getColumnIndexOrThrow("SKU_ID");
      final int _cursorIndexOfSKUGROUPID = _cursor.getColumnIndexOrThrow("SKU_GROUP_ID");
      final int _cursorIndexOfUOMID = _cursor.getColumnIndexOrThrow("UOM_ID");
      final List<dtBasketDetail> _result = new ArrayList<dtBasketDetail>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final dtBasketDetail _item;
        _item = new dtBasketDetail();
        final long _tmpBASKET_DETAIL_ID;
        _tmpBASKET_DETAIL_ID = _cursor.getLong(_cursorIndexOfBASKETDETAILID);
        _item.setBASKET_DETAIL_ID(_tmpBASKET_DETAIL_ID);
        final long _tmpBASKET_ID;
        _tmpBASKET_ID = _cursor.getLong(_cursorIndexOfBASKETID);
        _item.setBASKET_ID(_tmpBASKET_ID);
        final long _tmpPROMOTION_ID;
        _tmpPROMOTION_ID = _cursor.getLong(_cursorIndexOfPROMOTIONID);
        _item.setPROMOTION_ID(_tmpPROMOTION_ID);
        final int _tmpSCHEME_ID;
        _tmpSCHEME_ID = _cursor.getInt(_cursorIndexOfSCHEMEID);
        _item.setSCHEME_ID(_tmpSCHEME_ID);
        final int _tmpDISTRIBUTOR_ID;
        _tmpDISTRIBUTOR_ID = _cursor.getInt(_cursorIndexOfDISTRIBUTORID);
        _item.setDISTRIBUTOR_ID(_tmpDISTRIBUTOR_ID);
        final Double _tmpMIN_VAL;
        if (_cursor.isNull(_cursorIndexOfMINVAL)) {
          _tmpMIN_VAL = null;
        } else {
          _tmpMIN_VAL = _cursor.getDouble(_cursorIndexOfMINVAL);
        }
        _item.setMIN_VAL(_tmpMIN_VAL);
        final Double _tmpMAX_VAL;
        if (_cursor.isNull(_cursorIndexOfMAXVAL)) {
          _tmpMAX_VAL = null;
        } else {
          _tmpMAX_VAL = _cursor.getDouble(_cursorIndexOfMAXVAL);
        }
        _item.setMAX_VAL(_tmpMAX_VAL);
        final int _tmpMULTIPLE_OF;
        _tmpMULTIPLE_OF = _cursor.getInt(_cursorIndexOfMULTIPLEOF);
        _item.setMULTIPLE_OF(_tmpMULTIPLE_OF);
        final int _tmpSKU_ID;
        _tmpSKU_ID = _cursor.getInt(_cursorIndexOfSKUID);
        _item.setSKU_ID(_tmpSKU_ID);
        final int _tmpSKU_GROUP_ID;
        _tmpSKU_GROUP_ID = _cursor.getInt(_cursorIndexOfSKUGROUPID);
        _item.setSKU_GROUP_ID(_tmpSKU_GROUP_ID);
        final int _tmpUOM_ID;
        _tmpUOM_ID = _cursor.getInt(_cursorIndexOfUOMID);
        _item.setUOM_ID(_tmpUOM_ID);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
