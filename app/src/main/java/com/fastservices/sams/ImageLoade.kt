package com.fastservices.sams

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

object ImageLoader {


    fun loadImage(iv: ImageView, url: String) {
        Glide.with(iv.context)
                .load(url)
                .apply(RequestOptions.centerCropTransform())
                .into(iv)
    }
}