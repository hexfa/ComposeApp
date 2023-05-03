package com.hexfa.composeapp.ui.components.icons.iranian_compamies_icons

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AntenIcon(modifier: Modifier = Modifier) {
    Canvas(
        modifier =
        Modifier
            .size(80.dp)
            .padding(16.dp)
            .then(modifier)
    ) {
        drawRoundRect(
            color = Color(0xFFf02867),
            cornerRadius = CornerRadius(36f, 36f),
        )
        drawCircle(
            color = Color.White.copy(alpha = .5f),
            radius = 15f,
            center = Offset(x = this.size.width * 0.2f , y = this.size.height * 0.5f)
        )
        drawCircle(
            color = Color.White.copy(alpha = .75f),
            radius = 15f,
            center = Offset(x = this.size.width * 0.5f , y = this.size.height * 0.5f)
        )
        drawCircle(
            color = Color.White,
            radius = 15f,
            center = Offset(x = this.size.width * 0.8f , y = this.size.height * 0.5f)
        )
    }
}

@Preview
@Composable
fun AntenIconPreview() = AntenIcon()