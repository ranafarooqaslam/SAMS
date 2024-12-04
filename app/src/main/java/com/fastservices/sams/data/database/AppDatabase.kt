package com.fastservices.sams.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.fastservices.sams.data.dao.AppSettingValueDao
import com.fastservices.sams.data.dao.ChannelDao
import com.fastservices.sams.data.dao.ComplaintReasonsDao
import com.fastservices.sams.data.dao.MenuDao
import com.fastservices.sams.data.dao.MerchandiseDao
import com.fastservices.sams.data.dao.NoOrderDao
import com.fastservices.sams.data.dao.NoOrderReasonDao
import com.fastservices.sams.data.dao.OrderDetailDao
import com.fastservices.sams.data.dao.OrderDetailFreeSKUDao
import com.fastservices.sams.data.dao.OrderMasterDao
import com.fastservices.sams.data.dao.OutletComplaintDao
import com.fastservices.sams.data.dao.OutletDao
import com.fastservices.sams.data.dao.OutletLocalDao
import com.fastservices.sams.data.dao.ReplacementDao
import com.fastservices.sams.data.dao.ReplacementReasonsDao
import com.fastservices.sams.data.dao.SKUCategoryDao
import com.fastservices.sams.data.dao.SKUDao
import com.fastservices.sams.data.dao.SKUGroupDao
import com.fastservices.sams.data.dao.SectionDao
import com.fastservices.sams.data.dao.StockMasterDao
import com.fastservices.sams.data.dao.StockPositioningDao
import com.fastservices.sams.data.dao.UserDao
import com.fastservices.sams.data.dao.promotions.BasketDetailDao
import com.fastservices.sams.data.dao.promotions.BasketMasterDao
import com.fastservices.sams.data.dao.promotions.PromotionCustomerDao
import com.fastservices.sams.data.dao.promotions.PromotionDao
import com.fastservices.sams.data.dao.promotions.PromotionOfferDao
import com.fastservices.sams.data.dao.promotions.PromotionValueDao
import com.fastservices.sams.data.entities.AppSettingValueClass
import com.fastservices.sams.data.entities.Brand
import com.fastservices.sams.data.entities.Category
import com.fastservices.sams.data.entities.Channel
import com.fastservices.sams.data.entities.ComplaintReason
import com.fastservices.sams.data.entities.CustomerOrderStatus
import com.fastservices.sams.data.entities.CustomerUnorderedStatus
import com.fastservices.sams.data.entities.DistributorArea
import com.fastservices.sams.data.entities.Locality
import com.fastservices.sams.data.entities.Menu
import com.fastservices.sams.data.entities.Merchandise
import com.fastservices.sams.data.entities.NoOrderItem
import com.fastservices.sams.data.entities.NoOrderReason
import com.fastservices.sams.data.entities.OrderDetail
import com.fastservices.sams.data.entities.OrderDetailFreeSKU
import com.fastservices.sams.data.entities.OrderMaster
import com.fastservices.sams.data.entities.Outlet
import com.fastservices.sams.data.entities.OutletComplaint
import com.fastservices.sams.data.entities.OutletLocal
import com.fastservices.sams.data.entities.Replacement
import com.fastservices.sams.data.entities.ReplacementReason
import com.fastservices.sams.data.entities.SKU
import com.fastservices.sams.data.entities.SKUGroup
import com.fastservices.sams.data.entities.Section
import com.fastservices.sams.data.entities.StockPosition
import com.fastservices.sams.data.entities.StockPositionMaster
import com.fastservices.sams.data.entities.SubChannel
import com.fastservices.sams.data.entities.User
import com.fastservices.sams.data.entities.promotions.dtBasketDetail
import com.fastservices.sams.data.entities.promotions.dtBasketMaster
import com.fastservices.sams.data.entities.promotions.dtFreeSKUDetail
import com.fastservices.sams.data.entities.promotions.dtPromotion
import com.fastservices.sams.data.entities.promotions.dtPromotionCustomerType
import com.fastservices.sams.data.entities.promotions.dtPromotionOffer
import com.fastservices.sams.data.entities.promotions.dtPromotionValueClass

@Database(entities = [AppSettingValueClass::class, Brand::class, Category::class, CustomerOrderStatus::class, CustomerUnorderedStatus::class, DistributorArea::class, OrderDetail::class, OrderDetailFreeSKU::class, OrderMaster::class, SKU::class, User::class, Outlet::class, OutletLocal::class, Menu::class, Section::class, Locality::class, Channel::class, SubChannel::class, Merchandise::class, ComplaintReason::class, ReplacementReason::class, OutletComplaint::class, NoOrderReason::class, NoOrderItem::class, SKUGroup::class, dtBasketDetail::class, dtBasketMaster::class, dtFreeSKUDetail::class, dtPromotion::class, dtPromotionCustomerType::class, dtPromotionOffer::class, dtPromotionValueClass::class, StockPosition::class, StockPositionMaster::class, Replacement::class], version = 3)
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
    abstract fun AppSettingValueDao(): AppSettingValueDao

    companion object {
        private var INSTANCE: AppDatabase? = null

        val MIGRATION_1_2: Migration = object: Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("ALTER TABLE SECTIONS " + "ADD COLUMN mapType TEXT")
                database.execSQL("ALTER TABLE SECTIONS " + "ADD COLUMN allowOutAreaBooking INTEGER")
                database.execSQL("ALTER TABLE SKU " + "ADD COLUMN closingStockToShow TEXT")
                database.execSQL("ALTER TABLE SKU " + "ADD COLUMN closingStockToValidate TEXT")
            }
        }

        val MIGRATION_2_3: Migration = object: Migration(2, 3) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("CREATE TABLE AppSetting (" +
                        "VOLUMECLASS_ID INTEGER NOT NULL PRIMARY KEY," +
                        "isManualDiscount INTEGER NOT NULL" +
                        ");")
                database.execSQL("ALTER TABLE ORDER_DETAIL " + "ADD COLUMN SPECIAL_DISCOUNT DOUBLE")
            }
        }

        fun getInstance(context: Context): AppDatabase? {
            if (INSTANCE == null) {
                synchronized(AppDatabase::class) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "sams.db")
                        .addMigrations(MIGRATION_2_3)
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