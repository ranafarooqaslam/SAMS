package com.fastservices.sams.data.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.fastservices.sams.data.entities.SKUGroup;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class SKUGroupDao_Impl implements SKUGroupDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfSKUGroup;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public SKUGroupDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSKUGroup = new EntityInsertionAdapter<SKUGroup>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `SKUGroup`(`skU_GROUP_ID`,`skU_GROUP_DETAIL_ID`,`skU_ID`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SKUGroup value) {
        stmt.bindLong(1, value.getSkU_GROUP_ID());
        stmt.bindLong(2, value.getSkU_GROUP_DETAIL_ID());
        stmt.bindLong(3, value.getSkU_ID());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM SKUGroup";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(List<SKUGroup> groups) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfSKUGroup.insert(groups);
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
  public List<SKUGroup> getAll(int skuId, int skuGroupId) {
    final String _sql = "SELECT * FROM SKUGroup WHERE skU_ID = ? AND skU_GROUP_ID = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, skuId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, skuGroupId);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfSkUGROUPID = _cursor.getColumnIndexOrThrow("skU_GROUP_ID");
      final int _cursorIndexOfSkUGROUPDETAILID = _cursor.getColumnIndexOrThrow("skU_GROUP_DETAIL_ID");
      final int _cursorIndexOfSkUID = _cursor.getColumnIndexOrThrow("skU_ID");
      final List<SKUGroup> _result = new ArrayList<SKUGroup>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SKUGroup _item;
        _item = new SKUGroup();
        final int _tmpSkU_GROUP_ID;
        _tmpSkU_GROUP_ID = _cursor.getInt(_cursorIndexOfSkUGROUPID);
        _item.setSkU_GROUP_ID(_tmpSkU_GROUP_ID);
        final int _tmpSkU_GROUP_DETAIL_ID;
        _tmpSkU_GROUP_DETAIL_ID = _cursor.getInt(_cursorIndexOfSkUGROUPDETAILID);
        _item.setSkU_GROUP_DETAIL_ID(_tmpSkU_GROUP_DETAIL_ID);
        final int _tmpSkU_ID;
        _tmpSkU_ID = _cursor.getInt(_cursorIndexOfSkUID);
        _item.setSkU_ID(_tmpSkU_ID);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SKUGroup> getAll() {
    final String _sql = "SELECT * FROM SKUGroup";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfSkUGROUPID = _cursor.getColumnIndexOrThrow("skU_GROUP_ID");
      final int _cursorIndexOfSkUGROUPDETAILID = _cursor.getColumnIndexOrThrow("skU_GROUP_DETAIL_ID");
      final int _cursorIndexOfSkUID = _cursor.getColumnIndexOrThrow("skU_ID");
      final List<SKUGroup> _result = new ArrayList<SKUGroup>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SKUGroup _item;
        _item = new SKUGroup();
        final int _tmpSkU_GROUP_ID;
        _tmpSkU_GROUP_ID = _cursor.getInt(_cursorIndexOfSkUGROUPID);
        _item.setSkU_GROUP_ID(_tmpSkU_GROUP_ID);
        final int _tmpSkU_GROUP_DETAIL_ID;
        _tmpSkU_GROUP_DETAIL_ID = _cursor.getInt(_cursorIndexOfSkUGROUPDETAILID);
        _item.setSkU_GROUP_DETAIL_ID(_tmpSkU_GROUP_DETAIL_ID);
        final int _tmpSkU_ID;
        _tmpSkU_ID = _cursor.getInt(_cursorIndexOfSkUID);
        _item.setSkU_ID(_tmpSkU_ID);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
