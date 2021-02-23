package com.fastservices.sams.data.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.fastservices.sams.data.entities.Locality;
import com.fastservices.sams.data.entities.Section;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class SectionDao_Impl implements SectionDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfSection;

  private final EntityInsertionAdapter __insertionAdapterOfLocality;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllLocality;

  public SectionDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSection = new EntityInsertionAdapter<Section>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `SECTIONS`(`sectionID`,`sectionCode`,`sectionName`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Section value) {
        stmt.bindLong(1, value.getSectionID());
        if (value.getSectionCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getSectionCode());
        }
        if (value.getSectionName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSectionName());
        }
      }
    };
    this.__insertionAdapterOfLocality = new EntityInsertionAdapter<Locality>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Locality`(`routeID`,`routeCode`,`routeName`,`sectionID`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Locality value) {
        stmt.bindLong(1, value.getRouteID());
        if (value.getRouteCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getRouteCode());
        }
        if (value.getRouteName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getRouteName());
        }
        stmt.bindLong(4, value.getSectionID());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM SECTIONS";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllLocality = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM LOCALITY";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(List<Section> sections) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfSection.insert(sections);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAllLocality(List<Locality> list) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfLocality.insert(list);
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
  public void deleteAllLocality() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllLocality.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllLocality.release(_stmt);
    }
  }

  @Override
  public List<Section> getAll() {
    final String _sql = "SELECT * FROM SECTIONS";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfSectionID = _cursor.getColumnIndexOrThrow("sectionID");
      final int _cursorIndexOfSectionCode = _cursor.getColumnIndexOrThrow("sectionCode");
      final int _cursorIndexOfSectionName = _cursor.getColumnIndexOrThrow("sectionName");
      final List<Section> _result = new ArrayList<Section>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Section _item;
        final int _tmpSectionID;
        _tmpSectionID = _cursor.getInt(_cursorIndexOfSectionID);
        final String _tmpSectionCode;
        _tmpSectionCode = _cursor.getString(_cursorIndexOfSectionCode);
        final String _tmpSectionName;
        _tmpSectionName = _cursor.getString(_cursorIndexOfSectionName);
        _item = new Section(_tmpSectionID,_tmpSectionCode,_tmpSectionName);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Locality> getAllLocality() {
    final String _sql = "SELECT * FROM LOCALITY";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfRouteID = _cursor.getColumnIndexOrThrow("routeID");
      final int _cursorIndexOfRouteCode = _cursor.getColumnIndexOrThrow("routeCode");
      final int _cursorIndexOfRouteName = _cursor.getColumnIndexOrThrow("routeName");
      final int _cursorIndexOfSectionID = _cursor.getColumnIndexOrThrow("sectionID");
      final List<Locality> _result = new ArrayList<Locality>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Locality _item;
        final int _tmpRouteID;
        _tmpRouteID = _cursor.getInt(_cursorIndexOfRouteID);
        final String _tmpRouteCode;
        _tmpRouteCode = _cursor.getString(_cursorIndexOfRouteCode);
        final String _tmpRouteName;
        _tmpRouteName = _cursor.getString(_cursorIndexOfRouteName);
        final int _tmpSectionID;
        _tmpSectionID = _cursor.getInt(_cursorIndexOfSectionID);
        _item = new Locality(_tmpRouteID,_tmpRouteCode,_tmpRouteName,_tmpSectionID);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getLocalityName(int id) {
    final String _sql = "SELECT routeName FROM LOCALITY WHERE routeID = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final Cursor _cursor = __db.query(_statement);
    try {
      final String _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getString(0);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
