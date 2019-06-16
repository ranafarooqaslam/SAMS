package com.fastservices.sams.data.dao.promotions;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.fastservices.sams.data.entities.promotions.dtBasketMaster;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class BasketMasterDao_Impl implements BasketMasterDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfdtBasketMaster;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public BasketMasterDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfdtBasketMaster = new EntityInsertionAdapter<dtBasketMaster>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `dtBasketMaster`(`BASKET_ID`,`PROMOTION_ID`,`SCHEME_ID`,`DISTRIBUTOR_ID`,`IS_BASKET`,`IS_AND`,`IS_MULTIPLE`,`BASKET_ON`,`BASKET_SELECTION`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, dtBasketMaster value) {
        stmt.bindLong(1, value.getBASKET_ID());
        stmt.bindLong(2, value.getPROMOTION_ID());
        stmt.bindLong(3, value.getSCHEME_ID());
        stmt.bindLong(4, value.getDISTRIBUTOR_ID());
        final Integer _tmp;
        _tmp = value.getIS_BASKET() == null ? null : (value.getIS_BASKET() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, _tmp);
        }
        stmt.bindLong(6, value.getIS_AND());
        final Integer _tmp_1;
        _tmp_1 = value.getIS_MULTIPLE() == null ? null : (value.getIS_MULTIPLE() ? 1 : 0);
        if (_tmp_1 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, _tmp_1);
        }
        stmt.bindLong(8, value.getBASKET_ON());
        stmt.bindLong(9, value.getBASKET_SELECTION());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM dtBasketMaster";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(List<? extends dtBasketMaster> list) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfdtBasketMaster.insert(list);
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
  public List<dtBasketMaster> getAll(long promotion_id) {
    final String _sql = "SELECT * FROM dtBasketMaster WHERE PROMOTION_ID = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, promotion_id);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfBASKETID = _cursor.getColumnIndexOrThrow("BASKET_ID");
      final int _cursorIndexOfPROMOTIONID = _cursor.getColumnIndexOrThrow("PROMOTION_ID");
      final int _cursorIndexOfSCHEMEID = _cursor.getColumnIndexOrThrow("SCHEME_ID");
      final int _cursorIndexOfDISTRIBUTORID = _cursor.getColumnIndexOrThrow("DISTRIBUTOR_ID");
      final int _cursorIndexOfISBASKET = _cursor.getColumnIndexOrThrow("IS_BASKET");
      final int _cursorIndexOfISAND = _cursor.getColumnIndexOrThrow("IS_AND");
      final int _cursorIndexOfISMULTIPLE = _cursor.getColumnIndexOrThrow("IS_MULTIPLE");
      final int _cursorIndexOfBASKETON = _cursor.getColumnIndexOrThrow("BASKET_ON");
      final int _cursorIndexOfBASKETSELECTION = _cursor.getColumnIndexOrThrow("BASKET_SELECTION");
      final List<dtBasketMaster> _result = new ArrayList<dtBasketMaster>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final dtBasketMaster _item;
        _item = new dtBasketMaster();
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
        final Boolean _tmpIS_BASKET;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfISBASKET)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfISBASKET);
        }
        _tmpIS_BASKET = _tmp == null ? null : _tmp != 0;
        _item.setIS_BASKET(_tmpIS_BASKET);
        final int _tmpIS_AND;
        _tmpIS_AND = _cursor.getInt(_cursorIndexOfISAND);
        _item.setIS_AND(_tmpIS_AND);
        final Boolean _tmpIS_MULTIPLE;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfISMULTIPLE)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfISMULTIPLE);
        }
        _tmpIS_MULTIPLE = _tmp_1 == null ? null : _tmp_1 != 0;
        _item.setIS_MULTIPLE(_tmpIS_MULTIPLE);
        final int _tmpBASKET_ON;
        _tmpBASKET_ON = _cursor.getInt(_cursorIndexOfBASKETON);
        _item.setBASKET_ON(_tmpBASKET_ON);
        final int _tmpBASKET_SELECTION;
        _tmpBASKET_SELECTION = _cursor.getInt(_cursorIndexOfBASKETSELECTION);
        _item.setBASKET_SELECTION(_tmpBASKET_SELECTION);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
