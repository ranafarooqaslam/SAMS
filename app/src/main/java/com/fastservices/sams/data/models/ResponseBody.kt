package com.fastservices.sams.data.models

data class ResponseListBody<T>(
        val dataReturned: List<T>
) {
}