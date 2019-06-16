package com.fastservices.sams.data.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.fastservices.sams.data.entities.Merchandise;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class MerchandiseDao_Impl implements MerchandiseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfMerchandise;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public MerchandiseDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMerchandise = new EntityInsertionAdapter<Merchandise>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Merchandise`(`OutletID`,`DocumentDate`,`Remarks`,`Image1Path1`,`Image1Path2`,`Image1Path3`,`Image1Path4`,`Image1Path5`,`Image2Path1`,`Image2Path2`,`Image2Path3`,`Image2Path4`,`Image2Path5`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Merchandise value) {
        stmt.bindLong(1, value.getOutletID());
        if (value.getDocumentDate() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDocumentDate());
        }
        if (value.getRemarks() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getRemarks());
        }
        if (value.getImage1Path1() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getImage1Path1());
        }
        if (value.getImage1Path2() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getImage1Path2());
        }
        if (value.getImage1Path3() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getImage1Path3());
        }
        if (value.getImage1Path4() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getImage1Path4());
        }
        if (value.getImage1Path5() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getImage1Path5());
        }
        if (value.getImage2Path1() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getImage2Path1());
        }
        if (value.getImage2Path2() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getImage2Path2());
        }
        if (value.getImage2Path3() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getImage2Path3());
        }
        if (value.getImage2Path4() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getImage2Path4());
        }
        if (value.getImage2Path5() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getImage2Path5());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Merchandise";
        return _query;
      }
    };
  }

  @Override
  public void insert(List<Merchandise> list) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfMerchandise.insert(list);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(Merchandise m) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfMerchandise.insert(m);
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
  public List<Merchandise> getAll() {
    final String _sql = "SELECT * FROM Merchandise";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfOutletID = _cursor.getColumnIndexOrThrow("OutletID");
      final int _cursorIndexOfDocumentDate = _cursor.getColumnIndexOrThrow("DocumentDate");
      final int _cursorIndexOfRemarks = _cursor.getColumnIndexOrThrow("Remarks");
      final int _cursorIndexOfImage1Path1 = _cursor.getColumnIndexOrThrow("Image1Path1");
      final int _cursorIndexOfImage1Path2 = _cursor.getColumnIndexOrThrow("Image1Path2");
      final int _cursorIndexOfImage1Path3 = _cursor.getColumnIndexOrThrow("Image1Path3");
      final int _cursorIndexOfImage1Path4 = _cursor.getColumnIndexOrThrow("Image1Path4");
      final int _cursorIndexOfImage1Path5 = _cursor.getColumnIndexOrThrow("Image1Path5");
      final int _cursorIndexOfImage2Path1 = _cursor.getColumnIndexOrThrow("Image2Path1");
      final int _cursorIndexOfImage2Path2 = _cursor.getColumnIndexOrThrow("Image2Path2");
      final int _cursorIndexOfImage2Path3 = _cursor.getColumnIndexOrThrow("Image2Path3");
      final int _cursorIndexOfImage2Path4 = _cursor.getColumnIndexOrThrow("Image2Path4");
      final int _cursorIndexOfImage2Path5 = _cursor.getColumnIndexOrThrow("Image2Path5");
      final List<Merchandise> _result = new ArrayList<Merchandise>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Merchandise _item;
        _item = new Merchandise();
        final int _tmpOutletID;
        _tmpOutletID = _cursor.getInt(_cursorIndexOfOutletID);
        _item.setOutletID(_tmpOutletID);
        final String _tmpDocumentDate;
        _tmpDocumentDate = _cursor.getString(_cursorIndexOfDocumentDate);
        _item.setDocumentDate(_tmpDocumentDate);
        final String _tmpRemarks;
        _tmpRemarks = _cursor.getString(_cursorIndexOfRemarks);
        _item.setRemarks(_tmpRemarks);
        final String _tmpImage1Path1;
        _tmpImage1Path1 = _cursor.getString(_cursorIndexOfImage1Path1);
        _item.setImage1Path1(_tmpImage1Path1);
        final String _tmpImage1Path2;
        _tmpImage1Path2 = _cursor.getString(_cursorIndexOfImage1Path2);
        _item.setImage1Path2(_tmpImage1Path2);
        final String _tmpImage1Path3;
        _tmpImage1Path3 = _cursor.getString(_cursorIndexOfImage1Path3);
        _item.setImage1Path3(_tmpImage1Path3);
        final String _tmpImage1Path4;
        _tmpImage1Path4 = _cursor.getString(_cursorIndexOfImage1Path4);
        _item.setImage1Path4(_tmpImage1Path4);
        final String _tmpImage1Path5;
        _tmpImage1Path5 = _cursor.getString(_cursorIndexOfImage1Path5);
        _item.setImage1Path5(_tmpImage1Path5);
        final String _tmpImage2Path1;
        _tmpImage2Path1 = _cursor.getString(_cursorIndexOfImage2Path1);
        _item.setImage2Path1(_tmpImage2Path1);
        final String _tmpImage2Path2;
        _tmpImage2Path2 = _cursor.getString(_cursorIndexOfImage2Path2);
        _item.setImage2Path2(_tmpImage2Path2);
        final String _tmpImage2Path3;
        _tmpImage2Path3 = _cursor.getString(_cursorIndexOfImage2Path3);
        _item.setImage2Path3(_tmpImage2Path3);
        final String _tmpImage2Path4;
        _tmpImage2Path4 = _cursor.getString(_cursorIndexOfImage2Path4);
        _item.setImage2Path4(_tmpImage2Path4);
        final String _tmpImage2Path5;
        _tmpImage2Path5 = _cursor.getString(_cursorIndexOfImage2Path5);
        _item.setImage2Path5(_tmpImage2Path5);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
