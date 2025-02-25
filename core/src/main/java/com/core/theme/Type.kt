package com.core.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.core.R
import androidx.compose.ui.text.font.Font

private val fontFamily = FontFamily(
    Font(R.font.sf_pro_display_semibold, FontWeight.SemiBold),
    Font(R.font.sf_pro_display_medium, FontWeight.Medium),
    Font(R.font.sf_pro_display_regular, FontWeight.Normal)
)

object TextStyles {

    val title1 = TextStyle(
        fontSize = 22.sp,
        fontWeight = FontWeight.SemiBold,
        fontFamily = fontFamily
    )

    val title2 = TextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold,
        fontFamily = fontFamily
    )

    val title3 = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium,
        fontFamily = fontFamily
    )

    val title4 = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        fontFamily = fontFamily
    )

    val text1 = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        fontFamily = fontFamily
    )

    val buttonText1 = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.SemiBold,
        fontFamily = fontFamily
    )

    val buttonText2 = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        fontFamily = fontFamily
    )

    val tabText = TextStyle(
        fontSize = 10.sp,
        fontWeight = FontWeight.Normal,
        fontFamily = fontFamily
    )

    val number = TextStyle(
        fontSize = 7.sp,
        fontWeight = FontWeight.Normal,
        fontFamily = fontFamily
    )
}