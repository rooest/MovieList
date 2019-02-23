package com.omer.movielist.utils

import android.content.Context
import android.util.TypedValue

object GeneralUtils {


    fun dpToPx(context: Context, valueInDp: Float): Float {
        val metrics = context.resources.displayMetrics
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, valueInDp, metrics)
    }
}