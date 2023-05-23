package com.meghna.exoplayer.data

import android.net.Uri

/**
 * Created by meghnanandwana on
 * 25, April, 2023
 **/
data class Media(
    var uri: Uri,
    var mediaId: String,
    var title: String,
    var description: String,
    var bitmapResource: Int
)