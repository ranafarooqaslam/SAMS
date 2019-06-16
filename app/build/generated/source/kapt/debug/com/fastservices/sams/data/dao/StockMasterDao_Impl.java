package com.fastservices.sams.data.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import com.fastservices.sams.data.entities.StockPositionMaster;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class StockMasterDao_Impl implements StockMasterDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfStockPositionMaster;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfStockPositionMaster;

  public StockMasterDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfStockPositionMaster = new EntityInsertionAdapter<StockPositionMaster>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `StockPositionMaster`(`OUTLET_ID`,`IS_SYNCED`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StockPositionMaster value) {
        stmt.bindLong(1, value.getOUTLET_ID());
        stmt.bindLong(2, value.getIS_SYNCED());
      }
    };
    this.__deletionAdapterOfStockPositionMaster = new EntityDeletionOrUpdateAdapter<StockPositionMaster>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `StockPositionMaster` WHERE `OUTLET_ID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StockPositionMaster value) {
        stmt.bindLong(1, value.getOUTLET_ID());
      }
    };
  }

  @Override
  public long insert(StockPositionMaster stockMaster) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfStockPositionMaster.insertAndReturnId(stockMaster);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(StockPositionMaster stockMaster) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfStockPositionMaster.handle(stockMaster);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<StockPositionMaster> getAllNonSync() {
    final String _sql = "SELECT * FROM StockPositionMaster WHERE IS_SYNCED = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfOUTLETID = _cursor.getColumnIndexOrThrow("OUTLET_ID");
      final int _cursorIndexOfISSYNCED = _cursor.getColumnIndexOrThrow("IS_SYNCED");
      final List<StockPositionMaster> _result = new ArrayList<StockPositionMaster>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final StockPositionMaster _item;
        final int _tmpOUTLET_ID;
        _tmpOUTLET_ID = _cursor.getInt(_cursorIndexOfOUTLETID);
        final int _tmpIS_SYNCED;
        _tmpIS_SYNCED = _cursor.getInt(_cursorIndexOfISSYNCED);
        _item = new StockPositionMaster(_tmpOUTLET_ID,_tmpIS_SYNCED);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<StockPositionMaster> getAll() {
    final String _sql = "SELECT * FROM StockPositionMaster";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfOUTLETID = _cursor.getColumnIndexOrThrow("OUTLET_ID");
      final int _cursorIndexOfISSYNCED = _cursor.getColumnIndexOrThrow("IS_SYNCED");
      final List<StockPositionMaster> _result = new ArrayList<StockPositionMaster>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final StockPositionMaster _item;
        final int _tmpOUTLET_ID;
        _tmpOUTLET_ID = _cursor.getInt(_cursorIndexOfOUTLETID);
        final int _tmpIS_SYNCED;
        _tmpIS_SYNCED = _cursor.getInt(_cursorIndexOfISSYNCED);
        _item = new StockPositionMaster(_tmpOUTLET_ID,_tmpIS_SYNCED);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
