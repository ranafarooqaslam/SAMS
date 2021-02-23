package com.fastservices.sams.data.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.fastservices.sams.data.entities.Outlet;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class OutletDao_Impl implements OutletDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfOutlet;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfOutlet;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public OutletDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOutlet = new EntityInsertionAdapter<Outlet>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Outlet`(`_id`,`outletID`,`outletName`,`ownerName`,`phoneNumber`,`storeAddress`,`landMark`,`sectionID`,`channelID`,`localityID`,`routeID`,`townID`,`subChannelID`,`promotionClass`,`closing`,`creditLimit`,`creditDays`,`isRegistered`,`sequenceNo`,`comments`,`latitude`,`longtidue`,`photoPath1`,`photoPath2`,`photoPath3`,`photoPath4`,`photoPath5`,`areaTypeId`,`lastOrderDate`,`lastOrderAmount`,`isCredit`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Outlet value) {
        stmt.bindLong(1, value.get_id());
        stmt.bindLong(2, value.getOutletID());
        if (value.getOutletName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getOutletName());
        }
        if (value.getOwnerName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getOwnerName());
        }
        if (value.getPhoneNumber() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPhoneNumber());
        }
        if (value.getStoreAddress() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getStoreAddress());
        }
        if (value.getLandMark() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getLandMark());
        }
        stmt.bindLong(8, value.getSectionID());
        stmt.bindLong(9, value.getChannelID());
        stmt.bindLong(10, value.getLocalityID());
        stmt.bindLong(11, value.getRouteID());
        stmt.bindLong(12, value.getTownID());
        stmt.bindLong(13, value.getSubChannelID());
        stmt.bindLong(14, value.getPromotionClass());
        stmt.bindDouble(15, value.getClosing());
        stmt.bindDouble(16, value.getCreditLimit());
        stmt.bindLong(17, value.getCreditDays());
        stmt.bindLong(18, value.getRegistered());
        stmt.bindLong(19, value.getSequenceNo());
        if (value.getComments() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getComments());
        }
        stmt.bindDouble(21, value.getLatitude());
        stmt.bindDouble(22, value.getLongtidue());
        if (value.getPhotoPath1() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getPhotoPath1());
        }
        if (value.getPhotoPath2() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getPhotoPath2());
        }
        if (value.getPhotoPath3() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getPhotoPath3());
        }
        if (value.getPhotoPath4() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getPhotoPath4());
        }
        if (value.getPhotoPath5() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getPhotoPath5());
        }
        stmt.bindLong(28, value.getAreaTypeId());
        if (value.getLastOrderDate() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, value.getLastOrderDate());
        }
        stmt.bindDouble(30, value.getLastOrderAmount());
        stmt.bindLong(31, value.getCredit());
      }
    };
    this.__updateAdapterOfOutlet = new EntityDeletionOrUpdateAdapter<Outlet>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Outlet` SET `_id` = ?,`outletID` = ?,`outletName` = ?,`ownerName` = ?,`phoneNumber` = ?,`storeAddress` = ?,`landMark` = ?,`sectionID` = ?,`channelID` = ?,`localityID` = ?,`routeID` = ?,`townID` = ?,`subChannelID` = ?,`promotionClass` = ?,`closing` = ?,`creditLimit` = ?,`creditDays` = ?,`isRegistered` = ?,`sequenceNo` = ?,`comments` = ?,`latitude` = ?,`longtidue` = ?,`photoPath1` = ?,`photoPath2` = ?,`photoPath3` = ?,`photoPath4` = ?,`photoPath5` = ?,`areaTypeId` = ?,`lastOrderDate` = ?,`lastOrderAmount` = ?,`isCredit` = ? WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Outlet value) {
        stmt.bindLong(1, value.get_id());
        stmt.bindLong(2, value.getOutletID());
        if (value.getOutletName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getOutletName());
        }
        if (value.getOwnerName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getOwnerName());
        }
        if (value.getPhoneNumber() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPhoneNumber());
        }
        if (value.getStoreAddress() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getStoreAddress());
        }
        if (value.getLandMark() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getLandMark());
        }
        stmt.bindLong(8, value.getSectionID());
        stmt.bindLong(9, value.getChannelID());
        stmt.bindLong(10, value.getLocalityID());
        stmt.bindLong(11, value.getRouteID());
        stmt.bindLong(12, value.getTownID());
        stmt.bindLong(13, value.getSubChannelID());
        stmt.bindLong(14, value.getPromotionClass());
        stmt.bindDouble(15, value.getClosing());
        stmt.bindDouble(16, value.getCreditLimit());
        stmt.bindLong(17, value.getCreditDays());
        stmt.bindLong(18, value.getRegistered());
        stmt.bindLong(19, value.getSequenceNo());
        if (value.getComments() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getComments());
        }
        stmt.bindDouble(21, value.getLatitude());
        stmt.bindDouble(22, value.getLongtidue());
        if (value.getPhotoPath1() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getPhotoPath1());
        }
        if (value.getPhotoPath2() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getPhotoPath2());
        }
        if (value.getPhotoPath3() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getPhotoPath3());
        }
        if (value.getPhotoPath4() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getPhotoPath4());
        }
        if (value.getPhotoPath5() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getPhotoPath5());
        }
        stmt.bindLong(28, value.getAreaTypeId());
        if (value.getLastOrderDate() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, value.getLastOrderDate());
        }
        stmt.bindDouble(30, value.getLastOrderAmount());
        stmt.bindLong(31, value.getCredit());
        stmt.bindLong(32, value.get_id());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE  FROM OUTLET";
        return _query;
      }
    };
  }

  @Override
  public void insert(List<Outlet> outlet) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfOutlet.insert(outlet);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(List<Outlet> outlet) {
    __db.beginTransaction();
    try {
      __updateAdapterOfOutlet.handleMultiple(outlet);
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
  public List<Outlet> getAll() {
    final String _sql = "SELECT * FROM OUTLET ORDER BY outletName";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("_id");
      final int _cursorIndexOfOutletID = _cursor.getColumnIndexOrThrow("outletID");
      final int _cursorIndexOfOutletName = _cursor.getColumnIndexOrThrow("outletName");
      final int _cursorIndexOfOwnerName = _cursor.getColumnIndexOrThrow("ownerName");
      final int _cursorIndexOfPhoneNumber = _cursor.getColumnIndexOrThrow("phoneNumber");
      final int _cursorIndexOfStoreAddress = _cursor.getColumnIndexOrThrow("storeAddress");
      final int _cursorIndexOfLandMark = _cursor.getColumnIndexOrThrow("landMark");
      final int _cursorIndexOfSectionID = _cursor.getColumnIndexOrThrow("sectionID");
      final int _cursorIndexOfChannelID = _cursor.getColumnIndexOrThrow("channelID");
      final int _cursorIndexOfLocalityID = _cursor.getColumnIndexOrThrow("localityID");
      final int _cursorIndexOfRouteID = _cursor.getColumnIndexOrThrow("routeID");
      final int _cursorIndexOfTownID = _cursor.getColumnIndexOrThrow("townID");
      final int _cursorIndexOfSubChannelID = _cursor.getColumnIndexOrThrow("subChannelID");
      final int _cursorIndexOfPromotionClass = _cursor.getColumnIndexOrThrow("promotionClass");
      final int _cursorIndexOfClosing = _cursor.getColumnIndexOrThrow("closing");
      final int _cursorIndexOfCreditLimit = _cursor.getColumnIndexOrThrow("creditLimit");
      final int _cursorIndexOfCreditDays = _cursor.getColumnIndexOrThrow("creditDays");
      final int _cursorIndexOfRegistered = _cursor.getColumnIndexOrThrow("isRegistered");
      final int _cursorIndexOfSequenceNo = _cursor.getColumnIndexOrThrow("sequenceNo");
      final int _cursorIndexOfComments = _cursor.getColumnIndexOrThrow("comments");
      final int _cursorIndexOfLatitude = _cursor.getColumnIndexOrThrow("latitude");
      final int _cursorIndexOfLongtidue = _cursor.getColumnIndexOrThrow("longtidue");
      final int _cursorIndexOfPhotoPath1 = _cursor.getColumnIndexOrThrow("photoPath1");
      final int _cursorIndexOfPhotoPath2 = _cursor.getColumnIndexOrThrow("photoPath2");
      final int _cursorIndexOfPhotoPath3 = _cursor.getColumnIndexOrThrow("photoPath3");
      final int _cursorIndexOfPhotoPath4 = _cursor.getColumnIndexOrThrow("photoPath4");
      final int _cursorIndexOfPhotoPath5 = _cursor.getColumnIndexOrThrow("photoPath5");
      final int _cursorIndexOfAreaTypeId = _cursor.getColumnIndexOrThrow("areaTypeId");
      final int _cursorIndexOfLastOrderDate = _cursor.getColumnIndexOrThrow("lastOrderDate");
      final int _cursorIndexOfLastOrderAmount = _cursor.getColumnIndexOrThrow("lastOrderAmount");
      final int _cursorIndexOfCredit = _cursor.getColumnIndexOrThrow("isCredit");
      final List<Outlet> _result = new ArrayList<Outlet>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Outlet _item;
        _item = new Outlet();
        final int _tmp_id;
        _tmp_id = _cursor.getInt(_cursorIndexOfId);
        _item.set_id(_tmp_id);
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
        final String _tmpStoreAddress;
        _tmpStoreAddress = _cursor.getString(_cursorIndexOfStoreAddress);
        _item.setStoreAddress(_tmpStoreAddress);
        final String _tmpLandMark;
        _tmpLandMark = _cursor.getString(_cursorIndexOfLandMark);
        _item.setLandMark(_tmpLandMark);
        final int _tmpSectionID;
        _tmpSectionID = _cursor.getInt(_cursorIndexOfSectionID);
        _item.setSectionID(_tmpSectionID);
        final int _tmpChannelID;
        _tmpChannelID = _cursor.getInt(_cursorIndexOfChannelID);
        _item.setChannelID(_tmpChannelID);
        final int _tmpLocalityID;
        _tmpLocalityID = _cursor.getInt(_cursorIndexOfLocalityID);
        _item.setLocalityID(_tmpLocalityID);
        final int _tmpRouteID;
        _tmpRouteID = _cursor.getInt(_cursorIndexOfRouteID);
        _item.setRouteID(_tmpRouteID);
        final int _tmpTownID;
        _tmpTownID = _cursor.getInt(_cursorIndexOfTownID);
        _item.setTownID(_tmpTownID);
        final int _tmpSubChannelID;
        _tmpSubChannelID = _cursor.getInt(_cursorIndexOfSubChannelID);
        _item.setSubChannelID(_tmpSubChannelID);
        final int _tmpPromotionClass;
        _tmpPromotionClass = _cursor.getInt(_cursorIndexOfPromotionClass);
        _item.setPromotionClass(_tmpPromotionClass);
        final double _tmpClosing;
        _tmpClosing = _cursor.getDouble(_cursorIndexOfClosing);
        _item.setClosing(_tmpClosing);
        final float _tmpCreditLimit;
        _tmpCreditLimit = _cursor.getFloat(_cursorIndexOfCreditLimit);
        _item.setCreditLimit(_tmpCreditLimit);
        final int _tmpCreditDays;
        _tmpCreditDays = _cursor.getInt(_cursorIndexOfCreditDays);
        _item.setCreditDays(_tmpCreditDays);
        final int _tmpRegistered;
        _tmpRegistered = _cursor.getInt(_cursorIndexOfRegistered);
        _item.setRegistered(_tmpRegistered);
        final int _tmpSequenceNo;
        _tmpSequenceNo = _cursor.getInt(_cursorIndexOfSequenceNo);
        _item.setSequenceNo(_tmpSequenceNo);
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
        final String _tmpLastOrderDate;
        _tmpLastOrderDate = _cursor.getString(_cursorIndexOfLastOrderDate);
        _item.setLastOrderDate(_tmpLastOrderDate);
        final double _tmpLastOrderAmount;
        _tmpLastOrderAmount = _cursor.getDouble(_cursorIndexOfLastOrderAmount);
        _item.setLastOrderAmount(_tmpLastOrderAmount);
        final int _tmpCredit;
        _tmpCredit = _cursor.getInt(_cursorIndexOfCredit);
        _item.setCredit(_tmpCredit);
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
    final String _sql = "SELECT COUNT(*) FROM OUTLET";
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
