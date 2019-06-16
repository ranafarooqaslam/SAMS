package com.fastservices.sams.data.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.fastservices.sams.data.entities.Category;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class SKUCategoryDao_Impl implements SKUCategoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfCategory;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public SKUCategoryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCategory = new EntityInsertionAdapter<Category>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `CATEGORY`(`SKU_HIE_ID`,`SKU_HIE_NAME`,`PARENT_SKU_HIE_ID`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Category value) {
        stmt.bindLong(1, value.getSKU_HIE_ID());
        if (value.getSKU_HIE_NAME() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getSKU_HIE_NAME());
        }
        stmt.bindLong(3, value.getPARENT_SKU_HIE_ID());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM CATEGORY";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(List<Category> sections) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfCategory.insert(sections);
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
  public List<Category> getAll() {
    final String _sql = "SELECT * FROM CATEGORY";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfSKUHIEID = _cursor.getColumnIndexOrThrow("SKU_HIE_ID");
      final int _cursorIndexOfSKUHIENAME = _cursor.getColumnIndexOrThrow("SKU_HIE_NAME");
      final int _cursorIndexOfPARENTSKUHIEID = _cursor.getColumnIndexOrThrow("PARENT_SKU_HIE_ID");
      final List<Category> _result = new ArrayList<Category>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Category _item;
        final int _tmpSKU_HIE_ID;
        _tmpSKU_HIE_ID = _cursor.getInt(_cursorIndexOfSKUHIEID);
        final String _tmpSKU_HIE_NAME;
        _tmpSKU_HIE_NAME = _cursor.getString(_cursorIndexOfSKUHIENAME);
        final int _tmpPARENT_SKU_HIE_ID;
        _tmpPARENT_SKU_HIE_ID = _cursor.getInt(_cursorIndexOfPARENTSKUHIEID);
        _item = new Category(_tmpSKU_HIE_ID,_tmpSKU_HIE_NAME,_tmpPARENT_SKU_HIE_ID);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
