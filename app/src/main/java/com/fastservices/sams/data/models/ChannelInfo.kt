package com.fastservices.sams.data.models

import com.fastservices.sams.data.entities.Channel
import com.fastservices.sams.data.entities.SubChannel

data class ChannelInfo(
        val channel: List<Channel>,
        val channelsub: List<SubChannel>
) {
}