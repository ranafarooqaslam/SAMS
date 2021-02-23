package com.fastservices.sams.data.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.fastservices.sams.data.entities.OutletLocal;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class OutletLocalDao_Impl implements OutletLocalDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfOutletLocal;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public OutletLocalDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOutletLocal = new EntityInsertionAdapter<OutletLocal>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `OutletLocal`(`OutletID`,`OutletName`,`OwnerName`,`PhoneNumber`,`OutletAddress`,`LandMark`,`SectionID`,`LocalityID`,`ChannelID`,`TownID`,`SubChannelID`,`Comments`,`Latitude`,`Longtidue`,`PhotoPath1`,`PhotoPath2`,`PhotoPath3`,`PhotoPath4`,`PhotoPath5`,`AreaTypeId`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OutletLocal value) {
        stmt.bindLong(1, value.getOutletID());
        if (value.getOutletName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getOutletName());
        }
        if (value.getOwnerName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getOwnerName());
        }
        if (value.getPhoneNumber() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPhoneNumber());
        }
        if (value.getOutletAddress() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getOutletAddress());
        }
        if (value.getLandMark() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getLandMark());
        }
        stmt.bindLong(7, value.getSectionID());
        stmt.bindLong(8, value.getLocalityID());
        stmt.bindLong(9, value.getChannelID());
        stmt.bindLong(10, value.getTownID());
        stmt.bindLong(11, value.getSubChannelID());
        if (value.getComments() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getComments());
        }
        stmt.bindDouble(13, value.getLatitude());
        stmt.bindDouble(14, value.getLongtidue());
        if (value.getPhotoPath1() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getPhotoPath1());
        }
        if (value.getPhotoPath2() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getPhotoPath2());
        }
        if (value.getPhotoPath3() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getPhotoPath3());
        }
        if (value.getPhotoPath4() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getPhotoPath4());
        }
        if (value.getPhotoPath5() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getPhotoPath5());
        }
        stmt.bindLong(20, value.getAreaTypeId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE  FROM OUTLETLOCAL";
        return _query;
      }
    };
  }

  @Override
  public void insert(OutletLocal outlet) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfOutletLocal.insert(outlet);
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
  public List<OutletLocal> getAll() {
    final String _sql = "SELECT * FROM OUTLETLOCAL";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfOutletID = _cursor.getColumnIndexOrThrow("OutletID");
      final int _cursorIndexOfOutletName = _cursor.getColumnIndexOrThrow("OutletName");
      final int _cursorIndexOfOwnerName = _cursor.getColumnIndexOrThrow("OwnerName");
      final int _cursorIndexOfPhoneNumber = _cursor.getColumnIndexOrThrow("PhoneNumber");
      final int _cursorIndexOfOutletAddress = _cursor.getColumnIndexOrThrow("OutletAddress");
      final int _cursorIndexOfLandMark = _cursor.getColumnIndexOrThrow("LandMark");
      final int _cursorIndexOfSectionID = _cursor.getColumnIndexOrThrow("SectionID");
      final int _cursorIndexOfLocalityID = _cursor.getColumnIndexOrThrow("LocalityID");
      final int _cursorIndexOfChannelID = _cursor.getColumnIndexOrThrow("ChannelID");
      final int _cursorIndexOfTownID = _cursor.getColumnIndexOrThrow("TownID");
      final int _cursorIndexOfSubChannelID = _cursor.getColumnIndexOrThrow("SubChannelID");
      final int _cursorIndexOfComments = _cursor.getColumnIndexOrThrow("Comments");
      final int _cursorIndexOfLatitude = _cursor.getColumnIndexOrThrow("Latitude");
      final int _cursorIndexOfLongtidue = _cursor.getColumnIndexOrThrow("Longtidue");
      final int _cursorIndexOfPhotoPath1 = _cursor.getColumnIndexOrThrow("PhotoPath1");
      final int _cursorIndexOfPhotoPath2 = _cursor.getColumnIndexOrThrow("PhotoPath2");
      final int _cursorIndexOfPhotoPath3 = _cursor.getColumnIndexOrThrow("PhotoPath3");
      final int _cursorIndexOfPhotoPath4 = _cursor.getColumnIndexOrThrow("PhotoPath4");
      final int _cursorIndexOfPhotoPath5 = _cursor.getColumnIndexOrThrow("PhotoPath5");
      final int _cursorIndexOfAreaTypeId = _cursor.getColumnIndexOrThrow("AreaTypeId");
      final List<OutletLocal> _result = new ArrayList<OutletLocal>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final OutletLocal _item;
        _item = new OutletLocal();
        final int _tmpOutletID;
        _tmpOutletID = _cursor.getInt(_cursorIndexOfOutletID);
        _item.setOutletID(_tmpOutletID);
        final String _tmpOutletName;
        _tmpOutletName = _cursor.getString(_cursorIndexOfOutletName);
        _item.setOutletName(_tmpOutletName);
        final String _tmpOwnerName;
        _tmpOwnerName = _cursor.getString(_cursorIndexOfOwnerName);
        _item.setOwnerName(_tmpOwnerName);
        final String _tmpPhoneNumber;
        _tmpPhoneNumber = _cursor.getString(_cursorIndexOfPhoneNumber);
        _item.setPhoneNumber(_tmpPhoneNumber);
        final String _tmpOutletAddress;
        _tmpOutletAddress = _cursor.getString(_cursorIndexOfOutletAddress);
        _item.setOutletAddress(_tmpOutletAddress);
        final String _tmpLandMark;
        _tmpLandMark = _cursor.getString(_cursorIndexOfLandMark);
        _item.setLandMark(_tmpLandMark);
        final int _tmpSectionID;
        _tmpSectionID = _cursor.getInt(_cursorIndexOfSectionID);
        _item.setSectionID(_tmpSectionID);
        final int _tmpLocalityID;
        _tmpLocalityID = _cursor.getInt(_cursorIndexOfLocalityID);
        _item.setLocalityID(_tmpLocalityID);
        final int _tmpChannelID;
        _tmpChannelID = _cursor.getInt(_cursorIndexOfChannelID);
        _item.setChannelID(_tmpChannelID);
        final int _tmpTownID;
        _tmpTownID = _cursor.getInt(_cursorIndexOfTownID);
        _item.setTownID(_tmpTownID);
        final int _tmpSubChannelID;
        _tmpSubChannelID = _cursor.getInt(_cursorIndexOfSubChannelID);
        _item.setSubChannelID(_tmpSubChannelID);
        final String _tmpComments;
        _tmpComments = _cursor.getString(_cursorIndexOfComments);
        _item.setComments(_tmpComments);
        final double _tmpLatitude;
        _tmpLatitude = _cursor.getDouble(_cursorIndexOfLatitude);
        _item.setLatitude(_tmpLatitude);
        final double _tmpLongtidue;
        _tmpLongtidue = _cursor.getDouble(_cursorIndexOfLongtidue);
        _item.setLongtidue(_tmpLongtidue);
        final String _tmpPhotoPath1;
        _tmpPhotoPath1 = _cursor.getString(_cursorIndexOfPhotoPath1);
        _item.setPhotoPath1(_tmpPhotoPath1);
        final String _tmpPhotoPath2;
        _tmpPhotoPath2 = _cursor.getString(_cursorIndexOfPhotoPath2);
        _item.setPhotoPath2(_tmpPhotoPath2);
        final String _tmpPhotoPath3;
        _tmpPhotoPath3 = _cursor.getString(_cursorIndexOfPhotoPath3);
        _item.setPhotoPath3(_tmpPhotoPath3);
        final String _tmpPhotoPath4;
        _tmpPhotoPath4 = _cursor.getString(_cursorIndexOfPhotoPath4);
        _item.setPhotoPath4(_tmpPhotoPath4);
        final String _tmpPhotoPath5;
        _tmpPhotoPath5 = _cursor.getString(_cursorIndexOfPhotoPath5);
        _item.setPhotoPath5(_tmpPhotoPath5);
        final int _tmpAreaTypeId;
        _tmpAreaTypeId = _cursor.getInt(_cursorIndexOfAreaTypeId);
        _item.setAreaTypeId(_tmpAreaTypeId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
