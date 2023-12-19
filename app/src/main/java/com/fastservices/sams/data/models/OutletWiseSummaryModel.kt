package com.fastservices.sams.data.models

data class OutletWiseSummaryModel(
        var OUTLET_CODE :Int,
        var OUTLET_NAME : String,
        var ORDER_DATE : String,
        var NET_AMOUNT: Double
) {
}