package com.hexfa.composeapp.utils

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun Context.changeStatusBarColor(color: Color){
    val systemUiController = rememberSystemUiController()
    systemUiController.setSystemBarsColor(
        color = color
    )
}