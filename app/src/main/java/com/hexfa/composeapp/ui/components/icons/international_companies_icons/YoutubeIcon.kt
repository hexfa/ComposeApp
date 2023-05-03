package com.hexfa.composeapp.ui.components.icons.international_companies_icons

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.dp

@Composable
fun YoutubeIcon() {
    Canvas(
        modifier = Modifier
            .size(80.dp)
            .padding(16.dp)
    ) {

        val path = Path().apply {
            moveTo(size.width * .40f, size.height * .45f)
            lineTo(size.width * .70f, size.height * .60f)
            lineTo(size.width * .40f, size.height * .75f)
            close()
        }
        drawRoundRect(
            color = Color.Red,
            cornerRadius = CornerRadius(32f, 32f),
            size = Size(size.width, size.height * .80f),
            topLeft = Offset(size.width.times(.0f), size.height.times(.20f))
        )
        drawPath(color = Color.White, path = path)
    }
}