package com.fastservices.sams.data.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.fastservices.sams.data.entities.Channel;
import com.fastservices.sams.data.entities.SubChannel;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class ChannelDao_Impl implements ChannelDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfChannel;

  private final EntityInsertionAdapter __insertionAdapterOfSubChannel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllChannel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllSubChannel;

  public ChannelDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfChannel = new EntityInsertionAdapter<Channel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `CHANNEL`(`id`,`code`,`name`,`status`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Channel value) {
        stmt.bindLong(1, value.getId());
        if (value.getCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCode());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        final int _tmp;
        _tmp = value.getStatus() ? 1 : 0;
        stmt.bindLong(4, _tmp);
      }
    };
    this.__insertionAdapterOfSubChannel = new EntityInsertionAdapter<SubChannel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `SUBCHANNEL`(`id`,`code`,`name`,`parentID`,`status`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SubChannel value) {
        stmt.bindLong(1, value.getId());
        if (value.getCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCode());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        stmt.bindLong(4, value.getParentID());
        final int _tmp;
        _tmp = value.getStatus() ? 1 : 0;
        stmt.bindLong(5, _tmp);
      }
    };
    this.__preparedStmtOfDeleteAllChannel = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM CHANNEL";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllSubChannel = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM SUBCHANNEL";
        return _query;
      }
    };
  }

  @Override
  public void insertAllChannel(List<Channel> list) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfChannel.insert(list);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAllSubChannel(List<SubChannel> list) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfSubChannel.insert(list);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllChannel() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllChannel.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllChannel.release(_stmt);
    }
  }

  @Override
  public void deleteAllSubChannel() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllSubChannel.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllSubChannel.release(_stmt);
    }
  }

  @Override
  public List<Channel> getAllChannel() {
    final String _sql = "SELECT * FROM CHANNEL";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfCode = _cursor.getColumnIndexOrThrow("code");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfStatus = _cursor.getColumnIndexOrThrow("status");
      final List<Channel> _result = new ArrayList<Channel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Channel _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpCode;
        _tmpCode = _cursor.getString(_cursorIndexOfCode);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final boolean _tmpStatus;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfStatus);
        _tmpStatus = _tmp != 0;
        _item = new Channel(_tmpId,_tmpCode,_tmpName,_tmpStatus);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SubChannel> getAllSubChannel() {
    final String _sql = "SELECT * FROM SUBCHANNEL";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfCode = _cursor.getColumnIndexOrThrow("code");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfParentID = _cursor.getColumnIndexOrThrow("parentID");
      final int _cursorIndexOfStatus = _cursor.getColumnIndexOrThrow("status");
      final List<SubChannel> _result = new ArrayList<SubChannel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SubChannel _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpCode;
        _tmpCode = _cursor.getString(_cursorIndexOfCode);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final int _tmpParentID;
        _tmpParentID = _cursor.getInt(_cursorIndexOfParentID);
        final boolean _tmpStatus;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfStatus);
        _tmpStatus = _tmp != 0;
        _item = new SubChannel(_tmpId,_tmpCode,_tmpName,_tmpParentID,_tmpStatus);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getSubChannelName(int id) {
    final String _sql = "SELECT name FROM SUBCHANNEL WHERE id = ? LIMIT 1";
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
