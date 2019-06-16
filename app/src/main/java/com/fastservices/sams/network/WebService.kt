package com.fastservices.sams.network

import com.fastservices.sams.data.entities.*
import com.fastservices.sams.data.entities.promotions.*
import com.fastservices.sams.data.models.*
import io.reactivex.Observable
import kotlinx.coroutines.Deferred
import retrofit2.http.*

public interface WebService {

    @GET(GET_CLIENT_INFO)
    public fun getClientInfo(@Query("Pin") pin: String): Observable<ClientInfo>

    @FormUrlEncoded
    @POST(GET_TOKEN)
    public fun getToken(@Field("username") username: String,
                        @Field("password") password: String,
                        @Field("grant_type") grantType: String = "password"): Deferred<UserInfo>

    @POST(EXEC_SP)
    public fun getMenu(@Body body: PostBody<Parameter>): Deferred<ResponseListBody<Menu>>

    @POST(EXEC_SP)
    public fun getOutlets(@Body body: PostBody<Parameters>): Deferred<ResponseListBody<Outlet>>

    @POST(EXEC_SP)
    fun getCategories(@Body body: PostBody<Map<String, String>>): Deferred<ResponseListBody<Category>>

    @POST(EXEC_SP)
    fun getSKUs(@Body body: PostBody<Map<String, String>>): Deferred<ResponseListBody<SKU>>

    @POST(EXEC_SP)
    fun getBasketDetails(@Body body: PostBody<Map<String, String>>): Deferred<ResponseListBody<dtBasketDetail>>

    @POST(EXEC_SP)
    fun getBasketMaster(@Body body: PostBody<Map<String, String>>): Deferred<ResponseListBody<dtBasketMaster>>


    @POST(EXEC_SP)
    fun getPromotions(@Body body: PostBody<Map<String, String>>): Deferred<ResponseListBody<dtPromotion>>

    @POST(EXEC_SP)
    fun getPromotionCustomerType(@Body body: PostBody<Map<String, String>>): Deferred<ResponseListBody<dtPromotionCustomerType>>

    @POST(EXEC_SP)
    fun getPromotionOffers(@Body body: PostBody<Map<String, String>>): Deferred<ResponseListBody<dtPromotionOffer>>

    @POST(EXEC_SP)
    fun getSKUGroups(@Body body: PostBody<Map<String, String>>): Deferred<ResponseListBody<SKUGroup>>


    @POST(EXEC_SP)
    fun getPromotionValue(@Body body: PostBody<Map<String, String>>): Deferred<ResponseListBody<dtPromotionValueClass>>

    @POST(INSERT_NO_ORDER)
    fun insertNoOrder(@Query("DistributorID", encoded = true) DistributorID: String,
                      @Query("UserID") UserID: String,
                      @Body body: NoOrderItem):  Deferred<ResponseInsertOrder>

    @POST(INSERT_ORDER)
    fun insertOrder(@Body body: PostBodyOrder,
                    @Query("DistributorID", encoded = true) DistributorID: String,
                    @Query("OutletID") OutletID: String,
                    @Query("TownID") TownID: String,
                    @Query("SectionID") SectionID: String,
                    @Query("UserID") UserID: String,
                    @Query("GrossAmount") GrossAmount: String,
                    @Query("ExtraDiscount") ExtraDiscount: String,
                    @Query("StandardDiscount") StandardDiscount: String,
                    @Query("TotalGST") TotalGST: String,
                    @Query("NetAmount") NetAmount: String,
                    @Query("DocumentDate") DocumentDate: String,
                    @Query("Comments") Comments: String,
                    @Query("TimeIn", encoded = true) TimeIn: String,
                    @Query("TimeOut", encoded = true) TimeOut: String,
                    @Query("SchemeAmount") SchemeAmount: String,
                    @Query("TstAmount") TstAmount: String,
                    @Query("SedAmount") SedAmount: String,
                    @Query("ExtraTax") ExtraTax: String,
                    @Query("StandardDiscountByValue") StandardDiscountByValue: String,
                    @Query("StandardDiscountPerValue") StandardDiscountPerValue: String,
                    @Query("SedDiscountByValue") SedDiscountByValue: String,
                    @Query("SedDiscountPerValue") SedDiscountPerValue: String,
                    @Query("StandardDiscountByValueTo") StandardDiscountByValueTo: String,
                    @Query("StandardDiscountByValueAd") StandardDiscountByValueAd: String,
                    @Query("StandardDiscountPerValueTo") StandardDiscountPerValueTo: String,
                    @Query("StandardDiscountPerValueAd") StandardDiscountPerValueAd: String,
                    @Query("SedAmountByValueTo") SedAmountByValueTo: String,
                    @Query("SedAmountByValueAd") SedAmountByValueAd: String,
                    @Query("SedAmountPerValueTo") SedAmountPerValueTo: String,
                    @Query("SedAmountPerValueAd") SedAmountPerValueAd: String,
                    @Query("Latitude") Latitude: Double,
                    @Query("Longitude") Longitude: Double,
                    @Query("PhotoPath1") PhotoPath1: String,
                    @Query("PhotoPath2") PhotoPath2: String,
                    @Query("PhotoPath3") PhotoPath3: String,
                    @Query("PhotoPath4") PhotoPath4: String,
                    @Query("PhotoPath5") PhotoPath5: String,
                    @Query("OrderPaymentType") OrderPaymentType: Int): Deferred<ResponseInsertOrder>

    @POST(INSERT_STOCK_POSITIONING)
    fun insertStockPositioning(@Query("DistributorID") DistributorID: String, @Query("UserID") userId: String
                               , @Query("CustomerID") CustomerID: String,
                               @Query("DocumentDate") DocumentDate: String, @Body body: List<StockPosition>): Deferred<InsertAPIResponse>


    @POST(INSERT_REPLACEMENT)
    fun insertReplacement(@Query("DistributorID") DistributorID: String, @Query("UserID") userId: String
                          , @Query("CustomerID") CustomerID: String, @Query("ReplacementTypeID") ReplacementTypeID: String,
                          @Query("DocumentDate", encoded = true) DocumentDate: String, @Body body: List<Replacement>): Deferred<InsertAPIResponse>


    @POST(INSERT_ORDER_BOOKER_START)
    fun insertOrderBookerStartDay(@Query("DistributorID") DistributorID: String, @Query("UserID") userId: String): Deferred<ResponseOrderBookerStartDay>

    @POST(INSERT_ORDER_BOOKER_END)
    fun insertOrderBookerEndDay(@Query("DistributorID") DistributorID: String, @Query("UserID") userId: String, @Query("StartDayDateTime") StartDayDateTime: String): Deferred<Any>


    @POST(INSERT_OUTLETS)
    fun insertOutlet(@Query("DistributorID") DistributorID: String, @Query("UserID") userId: String, @Body body: List<OutletLocal>): Deferred<InsertAPIResponse>

    @POST(EXEC_SP)
    public fun getSections(@Body body: PostBody<Parameters>): Deferred<ResponseListBody<Section>>

    @POST(EXEC_SP)
    public fun getChannel(@Body body: PostBody<Map<String, String>>): Deferred<ResponseListBody<Channel>>

    @POST(EXEC_SP)
    public fun getSubChannel(@Body body: PostBody<Map<String, String>>): Deferred<ResponseListBody<SubChannel>>

    @POST(EXEC_SP)
    public fun getNoOrderReasons(@Body body: PostBody<Any>): Deferred<ResponseListBody<NoOrderReason>>

    @POST(EXEC_SP)
    public fun getComplaintReason(@Body body: PostBody<ParametersDistID>): Deferred<ResponseListBody<ComplaintReason>>

    @POST(EXEC_SP)
    public fun getReplacementReason(@Body body: PostBody<ParametersDistID>): Deferred<ResponseListBody<ReplacementReason>>


    @POST(INSERT_MERCHANDISING)
    public fun insertMerchandising(@Query("DistributorID") DistributorID: String, @Query("UserID") userId: String, @Body body: List<Merchandise>): Deferred<InsertAPIResponse>


    @POST(INSERT_OUTLET_COMPLAINT)
    public fun insertOutletComplaint(@Query("DistributorID") DistributorID: String, @Query("UserID") userId: String, @Body body: List<OutletComplaint>): Deferred<InsertAPIResponse>


}