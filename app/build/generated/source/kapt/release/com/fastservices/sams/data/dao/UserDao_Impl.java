package com.fastservices.sams.data.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import com.fastservices.sams.data.entities.User;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

@SuppressWarnings("unchecked")
public class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfUser;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUser = new EntityInsertionAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `USER`(`USER_ID`,`COMPANY_ID`,`DISTRIBUTOR_ID`,`ROLE_ID`,`LOGIN_ID`,`PASSWORD`,`IS_ACTIVE`,`LASTUPDATE_DATE`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        stmt.bindLong(1, value.getUSER_ID());
        stmt.bindLong(2, value.getCOMPANY_ID());
        stmt.bindLong(3, value.getDISTRIBUTOR_ID());
        stmt.bindLong(4, value.getROLE_ID());
        if (value.getLOGIN_ID() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getLOGIN_ID());
        }
        if (value.getPASSWORD() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPASSWORD());
        }
        stmt.bindLong(7, value.getIS_ACTIVE());
        if (value.getLASTUPDATE_DATE() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getLASTUPDATE_DATE());
        }
      }
    };
  }

  @Override
  public void insertUser(User user) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfUser.insert(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }
}
