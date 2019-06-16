package com.fastservices.sams.data.dao.promotions;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.fastservices.sams.data.entities.promotions.dtPromotion;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class PromotionDao_Impl implements PromotionDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfdtPromotion;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public PromotionDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfdtPromotion = new EntityInsertionAdapter<dtPromotion>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `dtPromotion`(`PROMOTION_ID`,`SCHEME_ID`,`DISTRIBUTOR_ID`,`CLAIMABLE`,`START_DATE`,`END_DATE`,`PROMOTION_TYPE`,`PROMOTION_SELECTION`,`IS_SCHEME`,`PROMOTION_FOR`,`USER_ID`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, dtPromotion value) {
        stmt.bindLong(1, value.getPROMOTION_ID());
        stmt.bindLong(2, value.getSCHEME_ID());
        stmt.bindLong(3, value.getDISTRIBUTOR_ID());
        stmt.bindLong(4, value.getCLAIMABLE());
        if (value.getSTART_DATE() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getSTART_DATE());
        }
        if (value.getEND_DATE() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getEND_DATE());
        }
        stmt.bindLong(7, value.getPROMOTION_TYPE());
        stmt.bindLong(8, value.getPROMOTION_SELECTION());
        final Integer _tmp;
        _tmp = value.getIS_SCHEME() == null ? null : (value.getIS_SCHEME() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, _tmp);
        }
        final Integer _tmp_1;
        _tmp_1 = value.getPROMOTION_FOR() == null ? null : (value.getPROMOTION_FOR() ? 1 : 0);
        if (_tmp_1 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, _tmp_1);
        }
        stmt.bindLong(11, value.getUSER_ID());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM dtPromotion";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(List<? extends dtPromotion> list) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfdtPromotion.insert(list);
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
  public List<dtPromotion> getAll() {
    final String _sql = "SELECT * FROM dtPromotion";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfPROMOTIONID = _cursor.getColumnIndexOrThrow("PROMOTION_ID");
      final int _cursorIndexOfSCHEMEID = _cursor.getColumnIndexOrThrow("SCHEME_ID");
      final int _cursorIndexOfDISTRIBUTORID = _cursor.getColumnIndexOrThrow("DISTRIBUTOR_ID");
      final int _cursorIndexOfCLAIMABLE = _cursor.getColumnIndexOrThrow("CLAIMABLE");
      final int _cursorIndexOfSTARTDATE = _cursor.getColumnIndexOrThrow("START_DATE");
      final int _cursorIndexOfENDDATE = _cursor.getColumnIndexOrThrow("END_DATE");
      final int _cursorIndexOfPROMOTIONTYPE = _cursor.getColumnIndexOrThrow("PROMOTION_TYPE");
      final int _cursorIndexOfPROMOTIONSELECTION = _cursor.getColumnIndexOrThrow("PROMOTION_SELECTION");
      final int _cursorIndexOfISSCHEME = _cursor.getColumnIndexOrThrow("IS_SCHEME");
      final int _cursorIndexOfPROMOTIONFOR = _cursor.getColumnIndexOrThrow("PROMOTION_FOR");
      final int _cursorIndexOfUSERID = _cursor.getColumnIndexOrThrow("USER_ID");
      final List<dtPromotion> _result = new ArrayList<dtPromotion>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final dtPromotion _item;
        _item = new dtPromotion();
        final long _tmpPROMOTION_ID;
        _tmpPROMOTION_ID = _cursor.getLong(_cursorIndexOfPROMOTIONID);
        _item.setPROMOTION_ID(_tmpPROMOTION_ID);
        final int _tmpSCHEME_ID;
        _tmpSCHEME_ID = _cursor.getInt(_cursorIndexOfSCHEMEID);
        _item.setSCHEME_ID(_tmpSCHEME_ID);
        final int _tmpDISTRIBUTOR_ID;
        _tmpDISTRIBUTOR_ID = _cursor.getInt(_cursorIndexOfDISTRIBUTORID);
        _item.setDISTRIBUTOR_ID(_tmpDISTRIBUTOR_ID);
        final int _tmpCLAIMABLE;
        _tmpCLAIMABLE = _cursor.getInt(_cursorIndexOfCLAIMABLE);
        _item.setCLAIMABLE(_tmpCLAIMABLE);
        final String _tmpSTART_DATE;
        _tmpSTART_DATE = _cursor.getString(_cursorIndexOfSTARTDATE);
        _item.setSTART_DATE(_tmpSTART_DATE);
        final String _tmpEND_DATE;
        _tmpEND_DATE = _cursor.getString(_cursorIndexOfENDDATE);
        _item.setEND_DATE(_tmpEND_DATE);
        final int _tmpPROMOTION_TYPE;
        _tmpPROMOTION_TYPE = _cursor.getInt(_cursorIndexOfPROMOTIONTYPE);
        _item.setPROMOTION_TYPE(_tmpPROMOTION_TYPE);
        final int _tmpPROMOTION_SELECTION;
        _tmpPROMOTION_SELECTION = _cursor.getInt(_cursorIndexOfPROMOTIONSELECTION);
        _item.setPROMOTION_SELECTION(_tmpPROMOTION_SELECTION);
        final Boolean _tmpIS_SCHEME;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfISSCHEME)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfISSCHEME);
        }
        _tmpIS_SCHEME = _tmp == null ? null : _tmp != 0;
        _item.setIS_SCHEME(_tmpIS_SCHEME);
        final Boolean _tmpPROMOTION_FOR;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfPROMOTIONFOR)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfPROMOTIONFOR);
        }
        _tmpPROMOTION_FOR = _tmp_1 == null ? null : _tmp_1 != 0;
        _item.setPROMOTION_FOR(_tmpPROMOTION_FOR);
        final int _tmpUSER_ID;
        _tmpUSER_ID = _cursor.getInt(_cursorIndexOfUSERID);
        _item.setUSER_ID(_tmpUSER_ID);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
