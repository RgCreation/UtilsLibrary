package com.rgcreation.my_utils_library

import android.content.Context
import android.widget.Toast
import org.threeten.bp.LocalDateTime
import org.threeten.bp.format.DateTimeFormatter

class MyUtils {

    fun LocalDateTime.exportFormat(): String =
        DateTimeFormatter.ofPattern("yyyy_MM_dd__kk_mm_ss").format(this)

    fun Context.myToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}