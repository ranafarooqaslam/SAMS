package com.fastservices.sams.data.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import android.content.Context
import com.fastservices.sams.data.dao.*
import com.fastservices.sams.data.dao.promotions.*
import com.fastservices.sams.data.entities.*
import com.fastservices.sams.data.entities.promotions.*


@Database(entities = arrayOf(Brand::class, Category::class, CustomerOrderStatus::class,
        CustomerUnorderedStatus::class, DistributorArea::class, OrderDetail::class, OrderDetailFreeSKU::class,
        OrderMaster::class, SKU::class, User::class, Outlet::class, OutletLocal::class,Menu::class, Section::class,Locality::class, Channel::class, SubChannel::class,
        Merchandise::class, ComplaintReason::class,ReplacementReason::class, OutletComplaint::class,
        NoOrderReason::class, NoOrderItem::class,SKUGroup::class,
        dtBasketDetail::class, dtBasketMaster::class, dtFreeSKUDetail::class, dtPromotion::class,
        dtPromotionCustomerType::class,dtPromotionOffer::class,dtPromotionValueClass::class,
        StockPosition::class,StockPositionMaster::class,Replacement::class), version = 1)
@TypeConverters(DateTypeConverters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun outletDao(): OutletDao
    abstract fun outletLocalDao(): OutletLocalDao
    abstract fun userDao(): UserDao
    abstract fun menuDao(): MenuDao
    abstract fun sectionDao(): SectionDao
    abstract fun channelDao(): ChannelDao
    abstract fun merchandiseDao(): MerchandiseDao
    abstract fun complaintReasonDao(): ComplaintReasonsDao
    abstract fun replacementReasonDao(): ReplacementReasonsDao
    abstract fun outletComplaintsDao(): OutletComplaintDao
    abstract fun skuCategoryDao(): SKUCategoryDao
    abstract fun SKUDao(): SKUDao
    abstract fun noOrderReasonDao(): NoOrderReasonDao
    abstract fun noOrderDao(): NoOrderDao
    abstract fun orderMasterDao():OrderMasterDao
    abstract fun orderDetailDao():OrderDetailDao
    abstract fun orderDetailFreeSkusDao():OrderDetailFreeSKUDao

    abstract fun stockPositioningMasterDao():StockMasterDao
    abstract fun stockPostioningDao():StockPositioningDao

    abstract fun replacementDao():ReplacementDao


    abstract fun promotionDao():PromotionDao
    abstract fun promotionValueDao():PromotionValueDao
    abstract fun promotionCustomerDao():PromotionCustomerDao
    abstract fun basketMasterDao():BasketMasterDao
    abstract fun basketDetailDao():BasketDetailDao
    abstract fun promotionOfferDao():PromotionOfferDao
    abstract fun skuGroupDao(): SKUGroupDao


    companion object {
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase? {
            if (INSTANCE == null) {
                synchronized(AppDatabase::class) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase::class.java, "sams.db")
                            .build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}