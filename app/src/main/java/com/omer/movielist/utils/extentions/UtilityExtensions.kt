package com.omer.movielist.utils.extentions

import android.graphics.Bitmap
import android.graphics.Matrix
import android.util.Base64
import com.omer.movielist.BuildConfig
import java.io.ByteArrayOutputStream

inline fun debug(body: () -> Unit) {
    if (BuildConfig.DEBUG) body()
}

inline fun release(body: () -> Unit) {
    if (!BuildConfig.DEBUG) body()
}

fun Bitmap.imageToBase64(): String {
    val bos = ByteArrayOutputStream()
    this.compress(Bitmap.CompressFormat.JPEG, 13, bos)
    val byteArr = bos.toByteArray()
    return Base64.encodeToString(byteArr, Base64.DEFAULT)
}

fun Bitmap.scaleBitmap(newWidth: Int, newHeight: Int): Bitmap {
    val resizedBitmap = Bitmap.createScaledBitmap(this, newWidth, newHeight, true)
    return resizedBitmap
}


fun Bitmap.rotate(angle: Float): Bitmap {
    val matrix = Matrix()
    matrix.postRotate(angle)
    return Bitmap.createBitmap(this, 0, 0, this.width, this.height, matrix,
            true)
}

