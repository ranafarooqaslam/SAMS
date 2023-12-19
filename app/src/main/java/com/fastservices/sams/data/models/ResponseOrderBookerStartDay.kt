package com.fastservices.sams.data.models

data class ResponseOrderBookerStartDay(
        var obDailyProcess: List<DailyProcess>
) {
}

data class DailyProcess(
        var workingDate: String,
        var startDayDateTime: String
) {}