package com.fastservices.sams.data.dao.promotions;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.fastservices.sams.data.entities.promotions.dtPromotionOffer;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class PromotionOfferDao_Impl implements PromotionOfferDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfdtPromotionOffer;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public PromotionOfferDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfdtPromotionOffer = new EntityInsertionAdapter<dtPromotionOffer>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `dtPromotionOffer`(`PROMOTION_OFFER_ID`,`BASKET_ID`,`PROMOTION_ID`,`SCHEME_ID`,`DISTRIBUTOR_ID`,`BASKET_DETAIL_ID`,`QUANTITY`,`OFFER_VALUE`,`DISCOUNT`,`IS_AND`,`SKU_ID`,`UOM_ID`,`OFFER_VALUE_TYPE`,`DISCOUNT_TYPE`,`SKUOfferTypeID`,`CLAIMABLE`,`FreeSKUID`,`Group_ID`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, dtPromotionOffer value) {
        stmt.bindLong(1, value.getPROMOTION_OFFER_ID());
        stmt.bindLong(2, value.getBASKET_ID());
        stmt.bindLong(3, value.getPROMOTION_ID());
        stmt.bindLong(4, value.getSCHEME_ID());
        stmt.bindLong(5, value.getDISTRIBUTOR_ID());
        stmt.bindLong(6, value.getBASKET_DETAIL_ID());
        stmt.bindLong(7, value.getQUANTITY());
        if (value.getOFFER_VALUE() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindDouble(8, value.getOFFER_VALUE());
        }
        stmt.bindDouble(9, value.getDISCOUNT());
        stmt.bindLong(10, value.getIS_AND());
        stmt.bindLong(11, value.getSKU_ID());
        stmt.bindLong(12, value.getUOM_ID());
        stmt.bindLong(13, value.getOFFER_VALUE_TYPE());
        stmt.bindLong(14, value.getDISCOUNT_TYPE());
        stmt.bindLong(15, value.getSKUOfferTypeID());
        stmt.bindLong(16, value.getCLAIMABLE());
        stmt.bindLong(17, value.FreeSKUID);
        stmt.bindLong(18, value.getGroup_ID());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM dtPromotionOffer";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(List<? extends dtPromotionOffer> promotionoffers) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfdtPromotionOffer.insert(promotionoffers);
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
  public List<dtPromotionOffer> getAll(long backet_detail_id) {
    final String _sql = "SELECT * FROM dtPromotionOffer WHERE BASKET_DETAIL_ID = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, backet_detail_id);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfPROMOTIONOFFERID = _cursor.getColumnIndexOrThrow("PROMOTION_OFFER_ID");
      final int _cursorIndexOfBASKETID = _cursor.getColumnIndexOrThrow("BASKET_ID");
      final int _cursorIndexOfPROMOTIONID = _cursor.getColumnIndexOrThrow("PROMOTION_ID");
      final int _cursorIndexOfSCHEMEID = _cursor.getColumnIndexOrThrow("SCHEME_ID");
      final int _cursorIndexOfDISTRIBUTORID = _cursor.getColumnIndexOrThrow("DISTRIBUTOR_ID");
      final int _cursorIndexOfBASKETDETAILID = _cursor.getColumnIndexOrThrow("BASKET_DETAIL_ID");
      final int _cursorIndexOfQUANTITY = _cursor.getColumnIndexOrThrow("QUANTITY");
      final int _cursorIndexOfOFFERVALUE = _cursor.getColumnIndexOrThrow("OFFER_VALUE");
      final int _cursorIndexOfDISCOUNT = _cursor.getColumnIndexOrThrow("DISCOUNT");
      final int _cursorIndexOfISAND = _cursor.getColumnIndexOrThrow("IS_AND");
      final int _cursorIndexOfSKUID = _cursor.getColumnIndexOrThrow("SKU_ID");
      final int _cursorIndexOfUOMID = _cursor.getColumnIndexOrThrow("UOM_ID");
      final int _cursorIndexOfOFFERVALUETYPE = _cursor.getColumnIndexOrThrow("OFFER_VALUE_TYPE");
      final int _cursorIndexOfDISCOUNTTYPE = _cursor.getColumnIndexOrThrow("DISCOUNT_TYPE");
      final int _cursorIndexOfSKUOfferTypeID = _cursor.getColumnIndexOrThrow("SKUOfferTypeID");
      final int _cursorIndexOfCLAIMABLE = _cursor.getColumnIndexOrThrow("CLAIMABLE");
      final int _cursorIndexOfFreeSKUID = _cursor.getColumnIndexOrThrow("FreeSKUID");
      final int _cursorIndexOfGroupID = _cursor.getColumnIndexOrThrow("Group_ID");
      final List<dtPromotionOffer> _result = new ArrayList<dtPromotionOffer>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final dtPromotionOffer _item;
        _item = new dtPromotionOffer();
        final long _tmpPROMOTION_OFFER_ID;
        _tmpPROMOTION_OFFER_ID = _cursor.getLong(_cursorIndexOfPROMOTIONOFFERID);
        _item.setPROMOTION_OFFER_ID(_tmpPROMOTION_OFFER_ID);
        final long _tmpBASKET_ID;
        _tmpBASKET_ID = _cursor.getLong(_cursorIndexOfBASKETID);
        _item.setBASKET_ID(_tmpBASKET_ID);
        final long _tmpPROMOTION_ID;
        _tmpPROMOTION_ID = _cursor.getLong(_cursorIndexOfPROMOTIONID);
        _item.setPROMOTION_ID(_tmpPROMOTION_ID);
        final int _tmpSCHEME_ID;
        _tmpSCHEME_ID = _cursor.getInt(_cursorIndexOfSCHEMEID);
        _item.setSCHEME_ID(_tmpSCHEME_ID);
        final int _tmpDISTRIBUTOR_ID;
        _tmpDISTRIBUTOR_ID = _cursor.getInt(_cursorIndexOfDISTRIBUTORID);
        _item.setDISTRIBUTOR_ID(_tmpDISTRIBUTOR_ID);
        final long _tmpBASKET_DETAIL_ID;
        _tmpBASKET_DETAIL_ID = _cursor.getLong(_cursorIndexOfBASKETDETAILID);
        _item.setBASKET_DETAIL_ID(_tmpBASKET_DETAIL_ID);
        final int _tmpQUANTITY;
        _tmpQUANTITY = _cursor.getInt(_cursorIndexOfQUANTITY);
        _item.setQUANTITY(_tmpQUANTITY);
        final Double _tmpOFFER_VALUE;
        if (_cursor.isNull(_cursorIndexOfOFFERVALUE)) {
          _tmpOFFER_VALUE = null;
        } else {
          _tmpOFFER_VALUE = _cursor.getDouble(_cursorIndexOfOFFERVALUE);
        }
        _item.setOFFER_VALUE(_tmpOFFER_VALUE);
        final float _tmpDISCOUNT;
        _tmpDISCOUNT = _cursor.getFloat(_cursorIndexOfDISCOUNT);
        _item.setDISCOUNT(_tmpDISCOUNT);
        final int _tmpIS_AND;
        _tmpIS_AND = _cursor.getInt(_cursorIndexOfISAND);
        _item.setIS_AND(_tmpIS_AND);
        final int _tmpSKU_ID;
        _tmpSKU_ID = _cursor.getInt(_cursorIndexOfSKUID);
        _item.setSKU_ID(_tmpSKU_ID);
        final int _tmpUOM_ID;
        _tmpUOM_ID = _cursor.getInt(_cursorIndexOfUOMID);
        _item.setUOM_ID(_tmpUOM_ID);
        final int _tmpOFFER_VALUE_TYPE;
        _tmpOFFER_VALUE_TYPE = _cursor.getInt(_cursorIndexOfOFFERVALUETYPE);
        _item.setOFFER_VALUE_TYPE(_tmpOFFER_VALUE_TYPE);
        final int _tmpDISCOUNT_TYPE;
        _tmpDISCOUNT_TYPE = _cursor.getInt(_cursorIndexOfDISCOUNTTYPE);
        _item.setDISCOUNT_TYPE(_tmpDISCOUNT_TYPE);
        final int _tmpSKUOfferTypeID;
        _tmpSKUOfferTypeID = _cursor.getInt(_cursorIndexOfSKUOfferTypeID);
        _item.setSKUOfferTypeID(_tmpSKUOfferTypeID);
        final int _tmpCLAIMABLE;
        _tmpCLAIMABLE = _cursor.getInt(_cursorIndexOfCLAIMABLE);
        _item.setCLAIMABLE(_tmpCLAIMABLE);
        _item.FreeSKUID = _cursor.getInt(_cursorIndexOfFreeSKUID);
        final int _tmpGroup_ID;
        _tmpGroup_ID = _cursor.getInt(_cursorIndexOfGroupID);
        _item.setGroup_ID(_tmpGroup_ID);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
