package com.fastservices.sams.data.entities;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "ORDER_MASTER")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0003\b\u00a5\u0001\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u00cd\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\u0006\u0010\u0018\u001a\u00020\f\u0012\u0006\u0010\u0019\u001a\u00020\f\u0012\u0006\u0010\u001a\u001a\u00020\f\u0012\u0006\u0010\u001b\u001a\u00020\f\u0012\u0006\u0010\u001c\u001a\u00020\f\u0012\u0006\u0010\u001d\u001a\u00020\f\u0012\u0006\u0010\u001e\u001a\u00020\f\u0012\u0006\u0010\u001f\u001a\u00020\f\u0012\u0006\u0010 \u001a\u00020\f\u0012\u0006\u0010!\u001a\u00020\f\u0012\u0006\u0010\"\u001a\u00020\n\u0012\u0006\u0010#\u001a\u00020\n\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\f\u0012\u0006\u0010&\u001a\u00020\f\u0012\u0006\u0010\'\u001a\u00020\n\u0012\u0006\u0010(\u001a\u00020\n\u0012\u0006\u0010)\u001a\u00020\n\u0012\u0006\u0010*\u001a\u00020\n\u0012\u0006\u0010+\u001a\u00020\n\u0012\u0006\u0010,\u001a\u00020\u0003\u0012\u0006\u0010-\u001a\u00020\u0003\u00a2\u0006\u0002\u0010.J\n\u0010\u0087\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0088\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u0089\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u008a\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u008b\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u008c\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u008d\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u008e\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u008f\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u0090\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u0091\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0093\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u0094\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u0095\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u0096\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u0097\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u0098\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u0099\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u009a\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u009b\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u009c\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009e\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u009f\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u00a0\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a1\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u00a2\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u00a3\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u00a4\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u00a5\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u00a6\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u00a7\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u00a8\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a9\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00aa\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ab\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ac\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ad\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u00ae\u0001\u001a\u00020\fH\u00c6\u0003J\n\u0010\u00af\u0001\u001a\u00020\fH\u00c6\u0003J\u00a4\u0003\u0010\u00b0\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\f2\b\b\u0002\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010 \u001a\u00020\f2\b\b\u0002\u0010!\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\n2\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\f2\b\b\u0002\u0010&\u001a\u00020\f2\b\b\u0002\u0010\'\u001a\u00020\n2\b\b\u0002\u0010(\u001a\u00020\n2\b\b\u0002\u0010)\u001a\u00020\n2\b\b\u0002\u0010*\u001a\u00020\n2\b\b\u0002\u0010+\u001a\u00020\n2\b\b\u0002\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u0003H\u00c6\u0001J\u0016\u0010\u00b1\u0001\u001a\u00030\u00b2\u00012\t\u0010\u00b3\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00b4\u0001\u001a\u00020\u0003H\u00d6\u0001J\n\u0010\u00b5\u0001\u001a\u00020\nH\u00d6\u0001R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00100\"\u0004\b4\u00102R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010\u0015\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010:\"\u0004\b>\u0010<R\u001a\u0010\u000f\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010:\"\u0004\b@\u0010<R\u001a\u0010-\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u00100\"\u0004\bB\u00102R\u001a\u0010%\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010:\"\u0004\bD\u0010<R\u001a\u0010&\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010:\"\u0004\bF\u0010<R\u001a\u0010,\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u00100\"\u0004\bH\u00102R\u001a\u0010$\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u00100\"\u0004\bJ\u00102R\u001a\u0010\'\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u00106\"\u0004\bL\u00108R\u001a\u0010(\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u00106\"\u0004\bN\u00108R\u001a\u0010)\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u00106\"\u0004\bP\u00108R\u001a\u0010*\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u00106\"\u0004\bR\u00108R\u001a\u0010+\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u00106\"\u0004\bT\u00108R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u00100\"\u0004\bV\u00102R\u001a\u0010\u0014\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u00106\"\u0004\bX\u00108R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u00100\"\u0004\bZ\u00102R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010:\"\u0004\b\\\u0010<R\u001a\u0010\u0013\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010:\"\u0004\b^\u0010<R\u001a\u0010\u0018\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010:\"\u0004\b`\u0010<R\u001a\u0010\u001f\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010:\"\u0004\bb\u0010<R\u001a\u0010\u001e\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010:\"\u0004\bd\u0010<R\u001a\u0010\u0019\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010:\"\u0004\bf\u0010<R\u001a\u0010!\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010:\"\u0004\bh\u0010<R\u001a\u0010 \u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010:\"\u0004\bj\u0010<R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u00100\"\u0004\bl\u00102R\u001a\u0010\u000e\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010:\"\u0004\bn\u0010<R\u001a\u0010\u0016\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010:\"\u0004\bp\u0010<R\u001a\u0010\u001b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bq\u0010:\"\u0004\br\u0010<R\u001a\u0010\u001a\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010:\"\u0004\bt\u0010<R\u001a\u0010\u0017\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bu\u0010:\"\u0004\bv\u0010<R\u001a\u0010\u001d\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bw\u0010:\"\u0004\bx\u0010<R\u001a\u0010\u001c\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010:\"\u0004\bz\u0010<R\u001a\u0010\"\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b{\u00106\"\u0004\b|\u00108R\u001a\u0010#\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b}\u00106\"\u0004\b~\u00108R\u001b\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010:\"\u0005\b\u0080\u0001\u0010<R\u001c\u0010\u0010\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010:\"\u0005\b\u0082\u0001\u0010<R\u001c\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u00100\"\u0005\b\u0084\u0001\u00102R\u001c\u0010\u0012\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010:\"\u0005\b\u0086\u0001\u0010<\u00a8\u0006\u00b6\u0001"}, d2 = {"Lcom/fastservices/sams/data/entities/OrderMaster;", "", "SALE_ORDER_ID", "", "DISTRIBUTOR_ID", "PRINCIPAL_ID", "SOLD_TO", "TOWN_ID", "AREA_ID", "DOCUMENT_DATE", "", "TOTAL_AMOUNT", "", "EXTRA_DISCOUNT_AMOUNT", "STANDARD_DISCOUNT_AMOUNT", "GST_AMOUNT", "TOTAL_NET_AMOUNT", "SCHEME_AMOUNT", "TST_AMOUNT", "SED_AMOUNT", "REMARKS", "EXTRA_TAX", "STANDARD_DISCOUNT_BY_VALUE", "STANDARD_DISCOUNT_PER_VALUE", "SED_AMOUNT_BY_VALUE", "SED_AMOUNT_PER_VALUE", "STANDARD_DISCOUNT_BY_VALUE_TO", "STANDARD_DISCOUNT_BY_VALUE_AD", "STANDARD_DISCOUNT_PER_VALUE_TO", "STANDARD_DISCOUNT_PER_VALUE_AD", "SED_AMOUNT_BY_VALUE_TO", "SED_AMOUNT_BY_VALUE_AD", "SED_AMOUNT_PER_VALUE_TO", "SED_AMOUNT_PER_VALUE_AD", "TIME_IN", "TIME_OUT", "OUTLET_ID", "LATITUDE", "LONGITUDE", "PHOTO_PATH1", "PHOTO_PATH2", "PHOTO_PATH3", "PHOTO_PATH4", "PHOTO_PATH5", "ORDER_PAYMENT_TYPE", "IS_SYNCED", "(IIIIIILjava/lang/String;DDDDDDDDLjava/lang/String;DDDDDDDDDDDDDLjava/lang/String;Ljava/lang/String;IDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getAREA_ID", "()I", "setAREA_ID", "(I)V", "getDISTRIBUTOR_ID", "setDISTRIBUTOR_ID", "getDOCUMENT_DATE", "()Ljava/lang/String;", "setDOCUMENT_DATE", "(Ljava/lang/String;)V", "getEXTRA_DISCOUNT_AMOUNT", "()D", "setEXTRA_DISCOUNT_AMOUNT", "(D)V", "getEXTRA_TAX", "setEXTRA_TAX", "getGST_AMOUNT", "setGST_AMOUNT", "getIS_SYNCED", "setIS_SYNCED", "getLATITUDE", "setLATITUDE", "getLONGITUDE", "setLONGITUDE", "getORDER_PAYMENT_TYPE", "setORDER_PAYMENT_TYPE", "getOUTLET_ID", "setOUTLET_ID", "getPHOTO_PATH1", "setPHOTO_PATH1", "getPHOTO_PATH2", "setPHOTO_PATH2", "getPHOTO_PATH3", "setPHOTO_PATH3", "getPHOTO_PATH4", "setPHOTO_PATH4", "getPHOTO_PATH5", "setPHOTO_PATH5", "getPRINCIPAL_ID", "setPRINCIPAL_ID", "getREMARKS", "setREMARKS", "getSALE_ORDER_ID", "setSALE_ORDER_ID", "getSCHEME_AMOUNT", "setSCHEME_AMOUNT", "getSED_AMOUNT", "setSED_AMOUNT", "getSED_AMOUNT_BY_VALUE", "setSED_AMOUNT_BY_VALUE", "getSED_AMOUNT_BY_VALUE_AD", "setSED_AMOUNT_BY_VALUE_AD", "getSED_AMOUNT_BY_VALUE_TO", "setSED_AMOUNT_BY_VALUE_TO", "getSED_AMOUNT_PER_VALUE", "setSED_AMOUNT_PER_VALUE", "getSED_AMOUNT_PER_VALUE_AD", "setSED_AMOUNT_PER_VALUE_AD", "getSED_AMOUNT_PER_VALUE_TO", "setSED_AMOUNT_PER_VALUE_TO", "getSOLD_TO", "setSOLD_TO", "getSTANDARD_DISCOUNT_AMOUNT", "setSTANDARD_DISCOUNT_AMOUNT", "getSTANDARD_DISCOUNT_BY_VALUE", "setSTANDARD_DISCOUNT_BY_VALUE", "getSTANDARD_DISCOUNT_BY_VALUE_AD", "setSTANDARD_DISCOUNT_BY_VALUE_AD", "getSTANDARD_DISCOUNT_BY_VALUE_TO", "setSTANDARD_DISCOUNT_BY_VALUE_TO", "getSTANDARD_DISCOUNT_PER_VALUE", "setSTANDARD_DISCOUNT_PER_VALUE", "getSTANDARD_DISCOUNT_PER_VALUE_AD", "setSTANDARD_DISCOUNT_PER_VALUE_AD", "getSTANDARD_DISCOUNT_PER_VALUE_TO", "setSTANDARD_DISCOUNT_PER_VALUE_TO", "getTIME_IN", "setTIME_IN", "getTIME_OUT", "setTIME_OUT", "getTOTAL_AMOUNT", "setTOTAL_AMOUNT", "getTOTAL_NET_AMOUNT", "setTOTAL_NET_AMOUNT", "getTOWN_ID", "setTOWN_ID", "getTST_AMOUNT", "setTST_AMOUNT", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class OrderMaster {
    @android.arch.persistence.room.PrimaryKey(autoGenerate = true)
    private int SALE_ORDER_ID;
    private int DISTRIBUTOR_ID;
    private int PRINCIPAL_ID;
    private int SOLD_TO;
    private int TOWN_ID;
    private int AREA_ID;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String DOCUMENT_DATE;
    private double TOTAL_AMOUNT;
    private double EXTRA_DISCOUNT_AMOUNT;
    private double STANDARD_DISCOUNT_AMOUNT;
    private double GST_AMOUNT;
    private double TOTAL_NET_AMOUNT;
    private double SCHEME_AMOUNT;
    private double TST_AMOUNT;
    private double SED_AMOUNT;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String REMARKS;
    private double EXTRA_TAX;
    private double STANDARD_DISCOUNT_BY_VALUE;
    private double STANDARD_DISCOUNT_PER_VALUE;
    private double SED_AMOUNT_BY_VALUE;
    private double SED_AMOUNT_PER_VALUE;
    private double STANDARD_DISCOUNT_BY_VALUE_TO;
    private double STANDARD_DISCOUNT_BY_VALUE_AD;
    private double STANDARD_DISCOUNT_PER_VALUE_TO;
    private double STANDARD_DISCOUNT_PER_VALUE_AD;
    private double SED_AMOUNT_BY_VALUE_TO;
    private double SED_AMOUNT_BY_VALUE_AD;
    private double SED_AMOUNT_PER_VALUE_TO;
    private double SED_AMOUNT_PER_VALUE_AD;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String TIME_IN;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String TIME_OUT;
    private int OUTLET_ID;
    private double LATITUDE;
    private double LONGITUDE;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String PHOTO_PATH1;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String PHOTO_PATH2;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String PHOTO_PATH3;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String PHOTO_PATH4;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String PHOTO_PATH5;
    private int ORDER_PAYMENT_TYPE;
    private int IS_SYNCED;
    
    public final int getSALE_ORDER_ID() {
        return 0;
    }
    
    public final void setSALE_ORDER_ID(int p0) {
    }
    
    public final int getDISTRIBUTOR_ID() {
        return 0;
    }
    
    public final void setDISTRIBUTOR_ID(int p0) {
    }
    
    public final int getPRINCIPAL_ID() {
        return 0;
    }
    
    public final void setPRINCIPAL_ID(int p0) {
    }
    
    public final int getSOLD_TO() {
        return 0;
    }
    
    public final void setSOLD_TO(int p0) {
    }
    
    public final int getTOWN_ID() {
        return 0;
    }
    
    public final void setTOWN_ID(int p0) {
    }
    
    public final int getAREA_ID() {
        return 0;
    }
    
    public final void setAREA_ID(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDOCUMENT_DATE() {
        return null;
    }
    
    public final void setDOCUMENT_DATE(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getTOTAL_AMOUNT() {
        return 0.0;
    }
    
    public final void setTOTAL_AMOUNT(double p0) {
    }
    
    public final double getEXTRA_DISCOUNT_AMOUNT() {
        return 0.0;
    }
    
    public final void setEXTRA_DISCOUNT_AMOUNT(double p0) {
    }
    
    public final double getSTANDARD_DISCOUNT_AMOUNT() {
        return 0.0;
    }
    
    public final void setSTANDARD_DISCOUNT_AMOUNT(double p0) {
    }
    
    public final double getGST_AMOUNT() {
        return 0.0;
    }
    
    public final void setGST_AMOUNT(double p0) {
    }
    
    public final double getTOTAL_NET_AMOUNT() {
        return 0.0;
    }
    
    public final void setTOTAL_NET_AMOUNT(double p0) {
    }
    
    public final double getSCHEME_AMOUNT() {
        return 0.0;
    }
    
    public final void setSCHEME_AMOUNT(double p0) {
    }
    
    public final double getTST_AMOUNT() {
        return 0.0;
    }
    
    public final void setTST_AMOUNT(double p0) {
    }
    
    public final double getSED_AMOUNT() {
        return 0.0;
    }
    
    public final void setSED_AMOUNT(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getREMARKS() {
        return null;
    }
    
    public final void setREMARKS(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getEXTRA_TAX() {
        return 0.0;
    }
    
    public final void setEXTRA_TAX(double p0) {
    }
    
    public final double getSTANDARD_DISCOUNT_BY_VALUE() {
        return 0.0;
    }
    
    public final void setSTANDARD_DISCOUNT_BY_VALUE(double p0) {
    }
    
    public final double getSTANDARD_DISCOUNT_PER_VALUE() {
        return 0.0;
    }
    
    public final void setSTANDARD_DISCOUNT_PER_VALUE(double p0) {
    }
    
    public final double getSED_AMOUNT_BY_VALUE() {
        return 0.0;
    }
    
    public final void setSED_AMOUNT_BY_VALUE(double p0) {
    }
    
    public final double getSED_AMOUNT_PER_VALUE() {
        return 0.0;
    }
    
    public final void setSED_AMOUNT_PER_VALUE(double p0) {
    }
    
    public final double getSTANDARD_DISCOUNT_BY_VALUE_TO() {
        return 0.0;
    }
    
    public final void setSTANDARD_DISCOUNT_BY_VALUE_TO(double p0) {
    }
    
    public final double getSTANDARD_DISCOUNT_BY_VALUE_AD() {
        return 0.0;
    }
    
    public final void setSTANDARD_DISCOUNT_BY_VALUE_AD(double p0) {
    }
    
    public final double getSTANDARD_DISCOUNT_PER_VALUE_TO() {
        return 0.0;
    }
    
    public final void setSTANDARD_DISCOUNT_PER_VALUE_TO(double p0) {
    }
    
    public final double getSTANDARD_DISCOUNT_PER_VALUE_AD() {
        return 0.0;
    }
    
    public final void setSTANDARD_DISCOUNT_PER_VALUE_AD(double p0) {
    }
    
    public final double getSED_AMOUNT_BY_VALUE_TO() {
        return 0.0;
    }
    
    public final void setSED_AMOUNT_BY_VALUE_TO(double p0) {
    }
    
    public final double getSED_AMOUNT_BY_VALUE_AD() {
        return 0.0;
    }
    
    public final void setSED_AMOUNT_BY_VALUE_AD(double p0) {
    }
    
    public final double getSED_AMOUNT_PER_VALUE_TO() {
        return 0.0;
    }
    
    public final void setSED_AMOUNT_PER_VALUE_TO(double p0) {
    }
    
    public final double getSED_AMOUNT_PER_VALUE_AD() {
        return 0.0;
    }
    
    public final void setSED_AMOUNT_PER_VALUE_AD(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTIME_IN() {
        return null;
    }
    
    public final void setTIME_IN(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTIME_OUT() {
        return null;
    }
    
    public final void setTIME_OUT(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getOUTLET_ID() {
        return 0;
    }
    
    public final void setOUTLET_ID(int p0) {
    }
    
    public final double getLATITUDE() {
        return 0.0;
    }
    
    public final void setLATITUDE(double p0) {
    }
    
    public final double getLONGITUDE() {
        return 0.0;
    }
    
    public final void setLONGITUDE(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPHOTO_PATH1() {
        return null;
    }
    
    public final void setPHOTO_PATH1(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPHOTO_PATH2() {
        return null;
    }
    
    public final void setPHOTO_PATH2(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPHOTO_PATH3() {
        return null;
    }
    
    public final void setPHOTO_PATH3(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPHOTO_PATH4() {
        return null;
    }
    
    public final void setPHOTO_PATH4(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPHOTO_PATH5() {
        return null;
    }
    
    public final void setPHOTO_PATH5(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getORDER_PAYMENT_TYPE() {
        return 0;
    }
    
    public final void setORDER_PAYMENT_TYPE(int p0) {
    }
    
    public final int getIS_SYNCED() {
        return 0;
    }
    
    public final void setIS_SYNCED(int p0) {
    }
    
    public OrderMaster(int SALE_ORDER_ID, int DISTRIBUTOR_ID, int PRINCIPAL_ID, int SOLD_TO, int TOWN_ID, int AREA_ID, @org.jetbrains.annotations.NotNull()
    java.lang.String DOCUMENT_DATE, double TOTAL_AMOUNT, double EXTRA_DISCOUNT_AMOUNT, double STANDARD_DISCOUNT_AMOUNT, double GST_AMOUNT, double TOTAL_NET_AMOUNT, double SCHEME_AMOUNT, double TST_AMOUNT, double SED_AMOUNT, @org.jetbrains.annotations.NotNull()
    java.lang.String REMARKS, double EXTRA_TAX, double STANDARD_DISCOUNT_BY_VALUE, double STANDARD_DISCOUNT_PER_VALUE, double SED_AMOUNT_BY_VALUE, double SED_AMOUNT_PER_VALUE, double STANDARD_DISCOUNT_BY_VALUE_TO, double STANDARD_DISCOUNT_BY_VALUE_AD, double STANDARD_DISCOUNT_PER_VALUE_TO, double STANDARD_DISCOUNT_PER_VALUE_AD, double SED_AMOUNT_BY_VALUE_TO, double SED_AMOUNT_BY_VALUE_AD, double SED_AMOUNT_PER_VALUE_TO, double SED_AMOUNT_PER_VALUE_AD, @org.jetbrains.annotations.NotNull()
    java.lang.String TIME_IN, @org.jetbrains.annotations.NotNull()
    java.lang.String TIME_OUT, int OUTLET_ID, double LATITUDE, double LONGITUDE, @org.jetbrains.annotations.NotNull()
    java.lang.String PHOTO_PATH1, @org.jetbrains.annotations.NotNull()
    java.lang.String PHOTO_PATH2, @org.jetbrains.annotations.NotNull()
    java.lang.String PHOTO_PATH3, @org.jetbrains.annotations.NotNull()
    java.lang.String PHOTO_PATH4, @org.jetbrains.annotations.NotNull()
    java.lang.String PHOTO_PATH5, int ORDER_PAYMENT_TYPE, int IS_SYNCED) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    public final double component10() {
        return 0.0;
    }
    
    public final double component11() {
        return 0.0;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    public final double component13() {
        return 0.0;
    }
    
    public final double component14() {
        return 0.0;
    }
    
    public final double component15() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    public final double component17() {
        return 0.0;
    }
    
    public final double component18() {
        return 0.0;
    }
    
    public final double component19() {
        return 0.0;
    }
    
    public final double component20() {
        return 0.0;
    }
    
    public final double component21() {
        return 0.0;
    }
    
    public final double component22() {
        return 0.0;
    }
    
    public final double component23() {
        return 0.0;
    }
    
    public final double component24() {
        return 0.0;
    }
    
    public final double component25() {
        return 0.0;
    }
    
    public final double component26() {
        return 0.0;
    }
    
    public final double component27() {
        return 0.0;
    }
    
    public final double component28() {
        return 0.0;
    }
    
    public final double component29() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component31() {
        return null;
    }
    
    public final int component32() {
        return 0;
    }
    
    public final double component33() {
        return 0.0;
    }
    
    public final double component34() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component35() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component36() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component37() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component38() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component39() {
        return null;
    }
    
    public final int component40() {
        return 0;
    }
    
    public final int component41() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.data.entities.OrderMaster copy(int SALE_ORDER_ID, int DISTRIBUTOR_ID, int PRINCIPAL_ID, int SOLD_TO, int TOWN_ID, int AREA_ID, @org.jetbrains.annotations.NotNull()
    java.lang.String DOCUMENT_DATE, double TOTAL_AMOUNT, double EXTRA_DISCOUNT_AMOUNT, double STANDARD_DISCOUNT_AMOUNT, double GST_AMOUNT, double TOTAL_NET_AMOUNT, double SCHEME_AMOUNT, double TST_AMOUNT, double SED_AMOUNT, @org.jetbrains.annotations.NotNull()
    java.lang.String REMARKS, double EXTRA_TAX, double STANDARD_DISCOUNT_BY_VALUE, double STANDARD_DISCOUNT_PER_VALUE, double SED_AMOUNT_BY_VALUE, double SED_AMOUNT_PER_VALUE, double STANDARD_DISCOUNT_BY_VALUE_TO, double STANDARD_DISCOUNT_BY_VALUE_AD, double STANDARD_DISCOUNT_PER_VALUE_TO, double STANDARD_DISCOUNT_PER_VALUE_AD, double SED_AMOUNT_BY_VALUE_TO, double SED_AMOUNT_BY_VALUE_AD, double SED_AMOUNT_PER_VALUE_TO, double SED_AMOUNT_PER_VALUE_AD, @org.jetbrains.annotations.NotNull()
    java.lang.String TIME_IN, @org.jetbrains.annotations.NotNull()
    java.lang.String TIME_OUT, int OUTLET_ID, double LATITUDE, double LONGITUDE, @org.jetbrains.annotations.NotNull()
    java.lang.String PHOTO_PATH1, @org.jetbrains.annotations.NotNull()
    java.lang.String PHOTO_PATH2, @org.jetbrains.annotations.NotNull()
    java.lang.String PHOTO_PATH3, @org.jetbrains.annotations.NotNull()
    java.lang.String PHOTO_PATH4, @org.jetbrains.annotations.NotNull()
    java.lang.String PHOTO_PATH5, int ORDER_PAYMENT_TYPE, int IS_SYNCED) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}