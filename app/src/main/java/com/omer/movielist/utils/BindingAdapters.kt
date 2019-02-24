package com.omer.movielist.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.omer.movielist.R
import com.omer.movielist.data.ApiConstants
import com.squareup.picasso.Picasso


@BindingAdapter(value = ["loadImageUrl"])
fun load(view: ImageView, url: String?) {
    if (url != null && !url.isEmpty()) {
        val imageUrl = ApiConstants.IMAGE_BASE_URL + "/w300" + url
        Picasso.get().load(imageUrl)
            .placeholder(R.drawable.image_place_holder)
            .error(R.drawable.image_place_holder)
            .into(view)
    } else {
        return
    }
}
