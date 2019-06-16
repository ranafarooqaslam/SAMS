package com.fastservices.sams.data.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.fastservices.sams.data.entities.Replacement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class ReplacementDao_Impl implements ReplacementDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfReplacement;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfReplacement;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public ReplacementDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfReplacement = new EntityInsertionAdapter<Replacement>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Replacement`(`_id`,`outletId`,`ReplacementTypeID`,`SKUID`,`Price`,`InvoiceNo`,`InvoiceDate`,`Description`,`StockImage1`,`StockImage2`,`StockImage3`,`StockImage4`,`StockImage5`,`InvoiceImage1`,`InvoiceImage2`,`InvoiceImage3`,`InvoiceImage4`,`InvoiceImage5`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Replacement value) {
        stmt.bindLong(1, value.get_id());
        if (value.getOutletId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getOutletId());
        }
        if (value.getReplacementTypeID() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getReplacementTypeID());
        }
        if (value.getSKUID() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSKUID());
        }
        if (value.getPrice() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPrice());
        }
        if (value.getInvoiceNo() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getInvoiceNo());
        }
        if (value.getInvoiceDate() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getInvoiceDate());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getDescription());
        }
        if (value.getStockImage1() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getStockImage1());
        }
        if (value.getStockImage2() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getStockImage2());
        }
        if (value.getStockImage3() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getStockImage3());
        }
        if (value.getStockImage4() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getStockImage4());
        }
        if (value.getStockImage5() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getStockImage5());
        }
        if (value.getInvoiceImage1() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getInvoiceImage1());
        }
        if (value.getInvoiceImage2() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getInvoiceImage2());
        }
        if (value.getInvoiceImage3() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getInvoiceImage3());
        }
        if (value.getInvoiceImage4() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getInvoiceImage4());
        }
        if (value.getInvoiceImage5() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getInvoiceImage5());
        }
      }
    };
    this.__deletionAdapterOfReplacement = new EntityDeletionOrUpdateAdapter<Replacement>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Replacement` WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Replacement value) {
        stmt.bindLong(1, value.get_id());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Replacement";
        return _query;
      }
    };
  }

  @Override
  public long insert(Replacement replacement) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfReplacement.insertAndReturnId(replacement);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(Replacement replacement) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfReplacement.handle(replacement);
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
  public List<Replacement> getAll() {
    final String _sql = "SELECT * FROM Replacement";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("_id");
      final int _cursorIndexOfOutletId = _cursor.getColumnIndexOrThrow("outletId");
      final int _cursorIndexOfReplacementTypeID = _cursor.getColumnIndexOrThrow("ReplacementTypeID");
      final int _cursorIndexOfSKUID = _cursor.getColumnIndexOrThrow("SKUID");
      final int _cursorIndexOfPrice = _cursor.getColumnIndexOrThrow("Price");
      final int _cursorIndexOfInvoiceNo = _cursor.getColumnIndexOrThrow("InvoiceNo");
      final int _cursorIndexOfInvoiceDate = _cursor.getColumnIndexOrThrow("InvoiceDate");
      final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("Description");
      final int _cursorIndexOfStockImage1 = _cursor.getColumnIndexOrThrow("StockImage1");
      final int _cursorIndexOfStockImage2 = _cursor.getColumnIndexOrThrow("StockImage2");
      final int _cursorIndexOfStockImage3 = _cursor.getColumnIndexOrThrow("StockImage3");
      final int _cursorIndexOfStockImage4 = _cursor.getColumnIndexOrThrow("StockImage4");
      final int _cursorIndexOfStockImage5 = _cursor.getColumnIndexOrThrow("StockImage5");
      final int _cursorIndexOfInvoiceImage1 = _cursor.getColumnIndexOrThrow("InvoiceImage1");
      final int _cursorIndexOfInvoiceImage2 = _cursor.getColumnIndexOrThrow("InvoiceImage2");
      final int _cursorIndexOfInvoiceImage3 = _cursor.getColumnIndexOrThrow("InvoiceImage3");
      final int _cursorIndexOfInvoiceImage4 = _cursor.getColumnIndexOrThrow("InvoiceImage4");
      final int _cursorIndexOfInvoiceImage5 = _cursor.getColumnIndexOrThrow("InvoiceImage5");
      final List<Replacement> _result = new ArrayList<Replacement>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Replacement _item;
        final int _tmp_id;
        _tmp_id = _cursor.getInt(_cursorIndexOfId);
        final String _tmpOutletId;
        _tmpOutletId = _cursor.getString(_cursorIndexOfOutletId);
        final String _tmpReplacementTypeID;
        _tmpReplacementTypeID = _cursor.getString(_cursorIndexOfReplacementTypeID);
        final String _tmpSKUID;
        _tmpSKUID = _cursor.getString(_cursorIndexOfSKUID);
        final String _tmpPrice;
        _tmpPrice = _cursor.getString(_cursorIndexOfPrice);
        final String _tmpInvoiceNo;
        _tmpInvoiceNo = _cursor.getString(_cursorIndexOfInvoiceNo);
        final String _tmpInvoiceDate;
        _tmpInvoiceDate = _cursor.getString(_cursorIndexOfInvoiceDate);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final String _tmpStockImage1;
        _tmpStockImage1 = _cursor.getString(_cursorIndexOfStockImage1);
        final String _tmpStockImage2;
        _tmpStockImage2 = _cursor.getString(_cursorIndexOfStockImage2);
        final String _tmpStockImage3;
        _tmpStockImage3 = _cursor.getString(_cursorIndexOfStockImage3);
        final String _tmpStockImage4;
        _tmpStockImage4 = _cursor.getString(_cursorIndexOfStockImage4);
        final String _tmpStockImage5;
        _tmpStockImage5 = _cursor.getString(_cursorIndexOfStockImage5);
        final String _tmpInvoiceImage1;
        _tmpInvoiceImage1 = _cursor.getString(_cursorIndexOfInvoiceImage1);
        final String _tmpInvoiceImage2;
        _tmpInvoiceImage2 = _cursor.getString(_cursorIndexOfInvoiceImage2);
        final String _tmpInvoiceImage3;
        _tmpInvoiceImage3 = _cursor.getString(_cursorIndexOfInvoiceImage3);
        final String _tmpInvoiceImage4;
        _tmpInvoiceImage4 = _cursor.getString(_cursorIndexOfInvoiceImage4);
        final String _tmpInvoiceImage5;
        _tmpInvoiceImage5 = _cursor.getString(_cursorIndexOfInvoiceImage5);
        _item = new Replacement(_tmp_id,_tmpOutletId,_tmpReplacementTypeID,_tmpSKUID,_tmpPrice,_tmpInvoiceNo,_tmpInvoiceDate,_tmpDescription,_tmpStockImage1,_tmpStockImage2,_tmpStockImage3,_tmpStockImage4,_tmpStockImage5,_tmpInvoiceImage1,_tmpInvoiceImage2,_tmpInvoiceImage3,_tmpInvoiceImage4,_tmpInvoiceImage5);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
