package com.fastservices.sams.data.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.fastservices.sams.data.entities.NoOrderReason;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class NoOrderReasonDao_Impl implements NoOrderReasonDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfNoOrderReason;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public NoOrderReasonDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNoOrderReason = new EntityInsertionAdapter<NoOrderReason>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `NoOrderReason`(`unOrderReasonID`,`unOrderReason`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NoOrderReason value) {
        stmt.bindLong(1, value.getUnOrderReasonID());
        if (value.getUnOrderReason() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUnOrderReason());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM NoOrderReason";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(List<NoOrderReason> list) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfNoOrderReason.insert(list);
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
  public List<NoOrderReason> getAllReasons() {
    final String _sql = "SELECT * FROM NoOrderReason";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfUnOrderReasonID = _cursor.getColumnIndexOrThrow("unOrderReasonID");
      final int _cursorIndexOfUnOrderReason = _cursor.getColumnIndexOrThrow("unOrderReason");
      final List<NoOrderReason> _result = new ArrayList<NoOrderReason>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final NoOrderReason _item;
        final int _tmpUnOrderReasonID;
        _tmpUnOrderReasonID = _cursor.getInt(_cursorIndexOfUnOrderReasonID);
        final String _tmpUnOrderReason;
        _tmpUnOrderReason = _cursor.getString(_cursorIndexOfUnOrderReason);
        _item = new NoOrderReason(_tmpUnOrderReasonID,_tmpUnOrderReason);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
