package com.fastservices.sams.data.database;

import java.lang.System;

@android.arch.persistence.room.TypeConverters(value = {com.fastservices.sams.data.database.DateTypeConverters.class})
@android.arch.persistence.room.Database(entities = {com.fastservices.sams.data.entities.Brand.class, com.fastservices.sams.data.entities.Category.class, com.fastservices.sams.data.entities.CustomerOrderStatus.class, com.fastservices.sams.data.entities.CustomerUnorderedStatus.class, com.fastservices.sams.data.entities.DistributorArea.class, com.fastservices.sams.data.entities.OrderDetail.class, com.fastservices.sams.data.entities.OrderDetailFreeSKU.class, com.fastservices.sams.data.entities.OrderMaster.class, com.fastservices.sams.data.entities.SKU.class, com.fastservices.sams.data.entities.User.class, com.fastservices.sams.data.entities.Outlet.class, com.fastservices.sams.data.entities.OutletLocal.class, com.fastservices.sams.data.entities.Menu.class, com.fastservices.sams.data.entities.Section.class, com.fastservices.sams.data.entities.Locality.class, com.fastservices.sams.data.entities.Channel.class, com.fastservices.sams.data.entities.SubChannel.class, com.fastservices.sams.data.entities.Merchandise.class, com.fastservices.sams.data.entities.ComplaintReason.class, com.fastservices.sams.data.entities.ReplacementReason.class, com.fastservices.sams.data.entities.OutletComplaint.class, com.fastservices.sams.data.entities.NoOrderReason.class, com.fastservices.sams.data.entities.NoOrderItem.class, com.fastservices.sams.data.entities.SKUGroup.class, com.fastservices.sams.data.entities.promotions.dtBasketDetail.class, com.fastservices.sams.data.entities.promotions.dtBasketMaster.class, com.fastservices.sams.data.entities.promotions.dtFreeSKUDetail.class, com.fastservices.sams.data.entities.promotions.dtPromotion.class, com.fastservices.sams.data.entities.promotions.dtPromotionCustomerType.class, com.fastservices.sams.data.entities.promotions.dtPromotionOffer.class, com.fastservices.sams.data.entities.promotions.dtPromotionValueClass.class, com.fastservices.sams.data.entities.StockPosition.class, com.fastservices.sams.data.entities.StockPositionMaster.class, com.fastservices.sams.data.entities.Replacement.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 92\u00020\u0001:\u00019B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u001cH&J\b\u0010\u001d\u001a\u00020\u001eH&J\b\u0010\u001f\u001a\u00020 H&J\b\u0010!\u001a\u00020\"H&J\b\u0010#\u001a\u00020$H&J\b\u0010%\u001a\u00020&H&J\b\u0010\'\u001a\u00020(H&J\b\u0010)\u001a\u00020*H&J\b\u0010+\u001a\u00020,H&J\b\u0010-\u001a\u00020.H&J\b\u0010/\u001a\u000200H&J\b\u00101\u001a\u000202H&J\b\u00103\u001a\u000204H&J\b\u00105\u001a\u000206H&J\b\u00107\u001a\u000208H&\u00a8\u0006:"}, d2 = {"Lcom/fastservices/sams/data/database/AppDatabase;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "SKUDao", "Lcom/fastservices/sams/data/dao/SKUDao;", "basketDetailDao", "Lcom/fastservices/sams/data/dao/promotions/BasketDetailDao;", "basketMasterDao", "Lcom/fastservices/sams/data/dao/promotions/BasketMasterDao;", "channelDao", "Lcom/fastservices/sams/data/dao/ChannelDao;", "complaintReasonDao", "Lcom/fastservices/sams/data/dao/ComplaintReasonsDao;", "menuDao", "Lcom/fastservices/sams/data/dao/MenuDao;", "merchandiseDao", "Lcom/fastservices/sams/data/dao/MerchandiseDao;", "noOrderDao", "Lcom/fastservices/sams/data/dao/NoOrderDao;", "noOrderReasonDao", "Lcom/fastservices/sams/data/dao/NoOrderReasonDao;", "orderDetailDao", "Lcom/fastservices/sams/data/dao/OrderDetailDao;", "orderDetailFreeSkusDao", "Lcom/fastservices/sams/data/dao/OrderDetailFreeSKUDao;", "orderMasterDao", "Lcom/fastservices/sams/data/dao/OrderMasterDao;", "outletComplaintsDao", "Lcom/fastservices/sams/data/dao/OutletComplaintDao;", "outletDao", "Lcom/fastservices/sams/data/dao/OutletDao;", "outletLocalDao", "Lcom/fastservices/sams/data/dao/OutletLocalDao;", "promotionCustomerDao", "Lcom/fastservices/sams/data/dao/promotions/PromotionCustomerDao;", "promotionDao", "Lcom/fastservices/sams/data/dao/promotions/PromotionDao;", "promotionOfferDao", "Lcom/fastservices/sams/data/dao/promotions/PromotionOfferDao;", "promotionValueDao", "Lcom/fastservices/sams/data/dao/promotions/PromotionValueDao;", "replacementDao", "Lcom/fastservices/sams/data/dao/ReplacementDao;", "replacementReasonDao", "Lcom/fastservices/sams/data/dao/ReplacementReasonsDao;", "sectionDao", "Lcom/fastservices/sams/data/dao/SectionDao;", "skuCategoryDao", "Lcom/fastservices/sams/data/dao/SKUCategoryDao;", "skuGroupDao", "Lcom/fastservices/sams/data/dao/SKUGroupDao;", "stockPositioningMasterDao", "Lcom/fastservices/sams/data/dao/StockMasterDao;", "stockPostioningDao", "Lcom/fastservices/sams/data/dao/StockPositioningDao;", "userDao", "Lcom/fastservices/sams/data/dao/UserDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends android.arch.persistence.room.RoomDatabase {
    private static com.fastservices.sams.data.database.AppDatabase INSTANCE;
    public static final com.fastservices.sams.data.database.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.OutletDao outletDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.OutletLocalDao outletLocalDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.MenuDao menuDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.SectionDao sectionDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.ChannelDao channelDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.MerchandiseDao merchandiseDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.ComplaintReasonsDao complaintReasonDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.ReplacementReasonsDao replacementReasonDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.OutletComplaintDao outletComplaintsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.SKUCategoryDao skuCategoryDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.SKUDao SKUDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.NoOrderReasonDao noOrderReasonDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.NoOrderDao noOrderDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.OrderMasterDao orderMasterDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.OrderDetailDao orderDetailDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.OrderDetailFreeSKUDao orderDetailFreeSkusDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.StockMasterDao stockPositioningMasterDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.StockPositioningDao stockPostioningDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.ReplacementDao replacementDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.promotions.PromotionDao promotionDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.promotions.PromotionValueDao promotionValueDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.promotions.PromotionCustomerDao promotionCustomerDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.promotions.BasketMasterDao basketMasterDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.promotions.BasketDetailDao basketDetailDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.promotions.PromotionOfferDao promotionOfferDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fastservices.sams.data.dao.SKUGroupDao skuGroupDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/fastservices/sams/data/database/AppDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/fastservices/sams/data/database/AppDatabase;", "destroyInstance", "", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.fastservices.sams.data.database.AppDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        public final void destroyInstance() {
        }
        
        private Companion() {
            super();
        }
    }
}