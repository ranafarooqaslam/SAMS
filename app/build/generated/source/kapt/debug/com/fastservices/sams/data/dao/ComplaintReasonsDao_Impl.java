package com.fastservices.sams.data.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.fastservices.sams.data.entities.ComplaintReason;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class ComplaintReasonsDao_Impl implements ComplaintReasonsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfComplaintReason;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public ComplaintReasonsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfComplaintReason = new EntityInsertionAdapter<ComplaintReason>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ComplaintReason`(`complaintReasonID`,`complaintReason`,`check`,`remarks`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ComplaintReason value) {
        stmt.bindLong(1, value.getComplaintReasonID());
        if (value.getComplaintReason() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getComplaintReason());
        }
        final int _tmp;
        _tmp = value.getCheck() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        if (value.getRemarks() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getRemarks());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM ComplaintReason";
        return _query;
      }
    };
  }

  @Override
  public void insert(List<ComplaintReason> list) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfComplaintReason.insert(list);
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
  public List<ComplaintReason> getAllComplaintReasons() {
    final String _sql = "SELECT * FROM ComplaintReason";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfComplaintReasonID = _cursor.getColumnIndexOrThrow("complaintReasonID");
      final int _cursorIndexOfComplaintReason = _cursor.getColumnIndexOrThrow("complaintReason");
      final int _cursorIndexOfCheck = _cursor.getColumnIndexOrThrow("check");
      final int _cursorIndexOfRemarks = _cursor.getColumnIndexOrThrow("remarks");
      final List<ComplaintReason> _result = new ArrayList<ComplaintReason>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ComplaintReason _item;
        final int _tmpComplaintReasonID;
        _tmpComplaintReasonID = _cursor.getInt(_cursorIndexOfComplaintReasonID);
        final String _tmpComplaintReason;
        _tmpComplaintReason = _cursor.getString(_cursorIndexOfComplaintReason);
        final boolean _tmpCheck;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfCheck);
        _tmpCheck = _tmp != 0;
        final String _tmpRemarks;
        _tmpRemarks = _cursor.getString(_cursorIndexOfRemarks);
        _item = new ComplaintReason(_tmpComplaintReasonID,_tmpComplaintReason,_tmpCheck,_tmpRemarks);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
