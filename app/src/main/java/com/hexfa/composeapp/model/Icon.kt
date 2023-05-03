package com.hexfa.composeapp.model

import androidx.compose.runtime.Composable

data class Icon(
    val title: String,
    val action: @Composable (() -> Unit)? = null,
    val url : String? = null,
)
