package com.fastservices.sams.data.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.fastservices.sams.data.entities.StockPosition;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class StockPositioningDao_Impl implements StockPositioningDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfStockPosition;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfStockPosition;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public StockPositioningDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfStockPosition = new EntityInsertionAdapter<StockPosition>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `StockPosition`(`SKU_ID`,`Quantity`,`Price`,`UnitInCase`,`SKU_NAME`,`SKU_CODE`,`STOCK_MASTER_ID`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StockPosition value) {
        if (value.getSKU_ID() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getSKU_ID());
        }
        if (value.getQuantity() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getQuantity());
        }
        stmt.bindDouble(3, value.getPrice());
        stmt.bindLong(4, value.getUnitInCase());
        if (value.getSKU_NAME() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getSKU_NAME());
        }
        if (value.getSKU_CODE() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSKU_CODE());
        }
        stmt.bindLong(7, value.getSTOCK_MASTER_ID());
      }
    };
    this.__deletionAdapterOfStockPosition = new EntityDeletionOrUpdateAdapter<StockPosition>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `StockPosition` WHERE `SKU_ID` = ? AND `STOCK_MASTER_ID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StockPosition value) {
        if (value.getSKU_ID() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getSKU_ID());
        }
        stmt.bindLong(2, value.getSTOCK_MASTER_ID());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM StockPosition";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(List<StockPosition> stock) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfStockPosition.insert(stock);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(List<StockPosition> stock) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfStockPosition.handleMultiple(stock);
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
  public List<StockPosition> getAll(int stock_master_id) {
    final String _sql = "SELECT * FROM StockPosition WHERE STOCK_MASTER_ID = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, stock_master_id);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfSKUID = _cursor.getColumnIndexOrThrow("SKU_ID");
      final int _cursorIndexOfQuantity = _cursor.getColumnIndexOrThrow("Quantity");
      final int _cursorIndexOfPrice = _cursor.getColumnIndexOrThrow("Price");
      final int _cursorIndexOfUnitInCase = _cursor.getColumnIndexOrThrow("UnitInCase");
      final int _cursorIndexOfSKUNAME = _cursor.getColumnIndexOrThrow("SKU_NAME");
      final int _cursorIndexOfSKUCODE = _cursor.getColumnIndexOrThrow("SKU_CODE");
      final int _cursorIndexOfSTOCKMASTERID = _cursor.getColumnIndexOrThrow("STOCK_MASTER_ID");
      final List<StockPosition> _result = new ArrayList<StockPosition>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final StockPosition _item;
        _item = new StockPosition();
        final String _tmpSKU_ID;
        _tmpSKU_ID = _cursor.getString(_cursorIndexOfSKUID);
        _item.setSKU_ID(_tmpSKU_ID);
        final String _tmpQuantity;
        _tmpQuantity = _cursor.getString(_cursorIndexOfQuantity);
        _item.setQuantity(_tmpQuantity);
        final double _tmpPrice;
        _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
        _item.setPrice(_tmpPrice);
        final int _tmpUnitInCase;
        _tmpUnitInCase = _cursor.getInt(_cursorIndexOfUnitInCase);
        _item.setUnitInCase(_tmpUnitInCase);
        final String _tmpSKU_NAME;
        _tmpSKU_NAME = _cursor.getString(_cursorIndexOfSKUNAME);
        _item.setSKU_NAME(_tmpSKU_NAME);
        final String _tmpSKU_CODE;
        _tmpSKU_CODE = _cursor.getString(_cursorIndexOfSKUCODE);
        _item.setSKU_CODE(_tmpSKU_CODE);
        final int _tmpSTOCK_MASTER_ID;
        _tmpSTOCK_MASTER_ID = _cursor.getInt(_cursorIndexOfSTOCKMASTERID);
        _item.setSTOCK_MASTER_ID(_tmpSTOCK_MASTER_ID);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
