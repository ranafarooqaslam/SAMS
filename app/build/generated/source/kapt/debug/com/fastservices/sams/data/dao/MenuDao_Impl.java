package com.fastservices.sams.data.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import com.fastservices.sams.data.entities.Menu;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class MenuDao_Impl implements MenuDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfMenu;

  public MenuDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMenu = new EntityInsertionAdapter<Menu>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `MENU`(`androidMenuID`,`menuName`,`isActive`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Menu value) {
        stmt.bindLong(1, value.getAndroidMenuID());
        if (value.getMenuName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMenuName());
        }
        final int _tmp;
        _tmp = value.isActive() ? 1 : 0;
        stmt.bindLong(3, _tmp);
      }
    };
  }

  @Override
  public void insertAll(List<Menu> items) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfMenu.insert(items);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Menu> getAllItems() {
    final String _sql = "SELECT * FROM MENU ORDER BY androidMenuID";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfAndroidMenuID = _cursor.getColumnIndexOrThrow("androidMenuID");
      final int _cursorIndexOfMenuName = _cursor.getColumnIndexOrThrow("menuName");
      final int _cursorIndexOfIsActive = _cursor.getColumnIndexOrThrow("isActive");
      final List<Menu> _result = new ArrayList<Menu>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Menu _item;
        final int _tmpAndroidMenuID;
        _tmpAndroidMenuID = _cursor.getInt(_cursorIndexOfAndroidMenuID);
        final String _tmpMenuName;
        _tmpMenuName = _cursor.getString(_cursorIndexOfMenuName);
        final boolean _tmpIsActive;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsActive);
        _tmpIsActive = _tmp != 0;
        _item = new Menu(_tmpAndroidMenuID,_tmpMenuName,_tmpIsActive);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
