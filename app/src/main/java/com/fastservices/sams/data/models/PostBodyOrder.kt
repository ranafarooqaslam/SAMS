package com.fastservices.sams.data.models

import com.fastservices.sams.data.entities.OrderDetail
import com.fastservices.sams.data.entities.OrderDetailFreeSKU

data class PostBodyOrder (
        val OrderDetail: List<OrderDetail>,
        val FreeSKU:List<OrderDetailFreeSKU>
){
}