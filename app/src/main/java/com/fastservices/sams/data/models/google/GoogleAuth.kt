package com.fastservices.sams.data.models.google

data class GoogleAuth (
        var access_token:String,
        var expires_in:Long,
        var scope:String,
        var token_type:String
){
}