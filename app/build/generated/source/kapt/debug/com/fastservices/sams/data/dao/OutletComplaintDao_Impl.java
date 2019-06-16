package com.fastservices.sams.data.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.fastservices.sams.data.entities.OutletComplaint;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class OutletComplaintDao_Impl implements OutletComplaintDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfOutletComplaint;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public OutletComplaintDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOutletComplaint = new EntityInsertionAdapter<OutletComplaint>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `OutletComplaint`(`_id`,`CustomerID`,`ComplaintReasonID`,`DocumentDate`,`Remarks`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OutletComplaint value) {
        stmt.bindLong(1, value.get_id());
        if (value.getCustomerID() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCustomerID());
        }
        stmt.bindLong(3, value.getComplaintReasonID());
        if (value.getDocumentDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDocumentDate());
        }
        if (value.getRemarks() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getRemarks());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Delete FROM OutletComplaint";
        return _query;
      }
    };
  }

  @Override
  public void insert(List<OutletComplaint> list) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfOutletComplaint.insert(list);
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
  public List<OutletComplaint> getAllComplaintReasons() {
    final String _sql = "SELECT * FROM OutletComplaint";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("_id");
      final int _cursorIndexOfCustomerID = _cursor.getColumnIndexOrThrow("CustomerID");
      final int _cursorIndexOfComplaintReasonID = _cursor.getColumnIndexOrThrow("ComplaintReasonID");
      final int _cursorIndexOfDocumentDate = _cursor.getColumnIndexOrThrow("DocumentDate");
      final int _cursorIndexOfRemarks = _cursor.getColumnIndexOrThrow("Remarks");
      final List<OutletComplaint> _result = new ArrayList<OutletComplaint>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final OutletComplaint _item;
        final int _tmp_id;
        _tmp_id = _cursor.getInt(_cursorIndexOfId);
        final String _tmpCustomerID;
        _tmpCustomerID = _cursor.getString(_cursorIndexOfCustomerID);
        final int _tmpComplaintReasonID;
        _tmpComplaintReasonID = _cursor.getInt(_cursorIndexOfComplaintReasonID);
        final String _tmpDocumentDate;
        _tmpDocumentDate = _cursor.getString(_cursorIndexOfDocumentDate);
        final String _tmpRemarks;
        _tmpRemarks = _cursor.getString(_cursorIndexOfRemarks);
        _item = new OutletComplaint(_tmp_id,_tmpCustomerID,_tmpComplaintReasonID,_tmpDocumentDate,_tmpRemarks);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
