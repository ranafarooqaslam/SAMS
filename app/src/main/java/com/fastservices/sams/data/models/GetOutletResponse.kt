package com.fastservices.sams.data.models

import com.fastservices.sams.data.entities.Outlet
import com.google.gson.annotations.SerializedName

data class GetOutletResponse(
        @SerializedName("customer")
        val outlets: List<Outlet>
) {
}