package com.fastservices.sams.data.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.fastservices.sams.data.entities.NoOrderItem;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class NoOrderDao_Impl implements NoOrderDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfNoOrderItem;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public NoOrderDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNoOrderItem = new EntityInsertionAdapter<NoOrderItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `NoOrderItem`(`OutletID`,`SectionID`,`DocumentDate`,`ReasonID`,`TimeIn`,`TimeOut`,`Comments`,`latitude`,`longitude`,`photoPath1`,`photoPath2`,`photoPath3`,`photoPath4`,`photoPath5`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NoOrderItem value) {
        stmt.bindLong(1, value.getOutletID());
        if (value.getSectionID() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getSectionID());
        }
        if (value.getDocumentDate() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDocumentDate());
        }
        if (value.getReasonID() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getReasonID());
        }
        if (value.getTimeIn() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTimeIn());
        }
        if (value.getTimeOut() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTimeOut());
        }
        if (value.getComments() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getComments());
        }
        stmt.bindDouble(8, value.getLatitude());
        stmt.bindDouble(9, value.getLongitude());
        if (value.getPhotoPath1() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getPhotoPath1());
        }
        if (value.getPhotoPath2() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getPhotoPath2());
        }
        if (value.getPhotoPath3() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getPhotoPath3());
        }
        if (value.getPhotoPath4() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getPhotoPath4());
        }
        if (value.getPhotoPath5() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getPhotoPath5());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM NoOrderItem";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(List<NoOrderItem> list) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfNoOrderItem.insert(list);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(NoOrderItem item) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfNoOrderItem.insert(item);
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
  public List<NoOrderItem> getAll() {
    final String _sql = "SELECT * FROM NoOrderItem";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfOutletID = _cursor.getColumnIndexOrThrow("OutletID");
      final int _cursorIndexOfSectionID = _cursor.getColumnIndexOrThrow("SectionID");
      final int _cursorIndexOfDocumentDate = _cursor.getColumnIndexOrThrow("DocumentDate");
      final int _cursorIndexOfReasonID = _cursor.getColumnIndexOrThrow("ReasonID");
      final int _cursorIndexOfTimeIn = _cursor.getColumnIndexOrThrow("TimeIn");
      final int _cursorIndexOfTimeOut = _cursor.getColumnIndexOrThrow("TimeOut");
      final int _cursorIndexOfComments = _cursor.getColumnIndexOrThrow("Comments");
      final int _cursorIndexOfLatitude = _cursor.getColumnIndexOrThrow("latitude");
      final int _cursorIndexOfLongitude = _cursor.getColumnIndexOrThrow("longitude");
      final int _cursorIndexOfPhotoPath1 = _cursor.getColumnIndexOrThrow("photoPath1");
      final int _cursorIndexOfPhotoPath2 = _cursor.getColumnIndexOrThrow("photoPath2");
      final int _cursorIndexOfPhotoPath3 = _cursor.getColumnIndexOrThrow("photoPath3");
      final int _cursorIndexOfPhotoPath4 = _cursor.getColumnIndexOrThrow("photoPath4");
      final int _cursorIndexOfPhotoPath5 = _cursor.getColumnIndexOrThrow("photoPath5");
      final List<NoOrderItem> _result = new ArrayList<NoOrderItem>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final NoOrderItem _item;
        final int _tmpOutletID;
        _tmpOutletID = _cursor.getInt(_cursorIndexOfOutletID);
        final String _tmpSectionID;
        _tmpSectionID = _cursor.getString(_cursorIndexOfSectionID);
        final String _tmpDocumentDate;
        _tmpDocumentDate = _cursor.getString(_cursorIndexOfDocumentDate);
        final String _tmpReasonID;
        _tmpReasonID = _cursor.getString(_cursorIndexOfReasonID);
        final String _tmpTimeIn;
        _tmpTimeIn = _cursor.getString(_cursorIndexOfTimeIn);
        final String _tmpTimeOut;
        _tmpTimeOut = _cursor.getString(_cursorIndexOfTimeOut);
        final String _tmpComments;
        _tmpComments = _cursor.getString(_cursorIndexOfComments);
        final double _tmpLatitude;
        _tmpLatitude = _cursor.getDouble(_cursorIndexOfLatitude);
        final double _tmpLongitude;
        _tmpLongitude = _cursor.getDouble(_cursorIndexOfLongitude);
        final String _tmpPhotoPath1;
        _tmpPhotoPath1 = _cursor.getString(_cursorIndexOfPhotoPath1);
        final String _tmpPhotoPath2;
        _tmpPhotoPath2 = _cursor.getString(_cursorIndexOfPhotoPath2);
        final String _tmpPhotoPath3;
        _tmpPhotoPath3 = _cursor.getString(_cursorIndexOfPhotoPath3);
        final String _tmpPhotoPath4;
        _tmpPhotoPath4 = _cursor.getString(_cursorIndexOfPhotoPath4);
        final String _tmpPhotoPath5;
        _tmpPhotoPath5 = _cursor.getString(_cursorIndexOfPhotoPath5);
        _item = new NoOrderItem(_tmpOutletID,_tmpSectionID,_tmpDocumentDate,_tmpReasonID,_tmpTimeIn,_tmpTimeOut,_tmpComments,_tmpLatitude,_tmpLongitude,_tmpPhotoPath1,_tmpPhotoPath2,_tmpPhotoPath3,_tmpPhotoPath4,_tmpPhotoPath5);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Integer> getAllOutletIDs() {
    final String _sql = "SELECT OutletID FROM NoOrderItem";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final List<Integer> _result = new ArrayList<Integer>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Integer _item;
        if (_cursor.isNull(0)) {
          _item = null;
        } else {
          _item = _cursor.getInt(0);
        }
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int countAll() {
    final String _sql = "SELECT COUNT(*) FROM NoOrderItem";
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
}
