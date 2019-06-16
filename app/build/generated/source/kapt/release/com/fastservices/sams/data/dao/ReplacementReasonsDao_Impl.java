package com.fastservices.sams.data.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.fastservices.sams.data.entities.ReplacementReason;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class ReplacementReasonsDao_Impl implements ReplacementReasonsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfReplacementReason;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public ReplacementReasonsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfReplacementReason = new EntityInsertionAdapter<ReplacementReason>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ReplacementReason`(`replacementReasonID`,`replacementReason`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ReplacementReason value) {
        stmt.bindLong(1, value.getReplacementReasonID());
        if (value.getReplacementReason() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getReplacementReason());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM ReplacementReason";
        return _query;
      }
    };
  }

  @Override
  public void insert(List<ReplacementReason> list) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfReplacementReason.insert(list);
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
  public List<ReplacementReason> getAllReasons() {
    final String _sql = "SELECT * FROM ReplacementReason";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfReplacementReasonID = _cursor.getColumnIndexOrThrow("replacementReasonID");
      final int _cursorIndexOfReplacementReason = _cursor.getColumnIndexOrThrow("replacementReason");
      final List<ReplacementReason> _result = new ArrayList<ReplacementReason>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ReplacementReason _item;
        final int _tmpReplacementReasonID;
        _tmpReplacementReasonID = _cursor.getInt(_cursorIndexOfReplacementReasonID);
        final String _tmpReplacementReason;
        _tmpReplacementReason = _cursor.getString(_cursorIndexOfReplacementReason);
        _item = new ReplacementReason(_tmpReplacementReasonID,_tmpReplacementReason);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
