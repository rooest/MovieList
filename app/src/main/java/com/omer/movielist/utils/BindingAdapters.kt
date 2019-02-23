package com.omer.movielist.utils

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.omer.movielist.R
import com.squareup.picasso.Picasso

@BindingAdapter(value = ["loadImageUrl"])
fun load(view: ImageView, url: String?) {
    if (url != null && !url.isEmpty()) {
        Picasso.get().load(url)
            .placeholder(R.drawable.image_place_holder)
            .error(R.drawable.image_place_holder)
            .resize(GeneralUtils.dpToPx(view.context, if (view.measuredHeight > 0) view.measuredHeight.toFloat() else 70f).toInt(),
                GeneralUtils.dpToPx(view.context, if (view.measuredHeight > 0) view.measuredHeight.toFloat() else 70f).toInt())
            .centerCrop()
            .into(view)
    } else {
        return
    }
}