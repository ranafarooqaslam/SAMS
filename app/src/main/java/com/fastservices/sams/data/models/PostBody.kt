package com.fastservices.sams.data.models

data class PostBody<T>(
        val SpName: String,
        val Parameters: T
) {
}


data class Parameter(
        val UserID: String
) {}

data class Parameters(
        val UserID: String,
        val DistributorID: String
) {}

data class ParentID(
        val ParentID: String
) {
}

data class ParametersDistID(
        val DistributorID: String
) {}