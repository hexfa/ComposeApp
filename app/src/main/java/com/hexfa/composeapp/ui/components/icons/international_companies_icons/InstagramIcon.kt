package com.hexfa.composeapp.ui.components.icons.international_companies_icons

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

@Composable
fun InstagramIcon(modifier: Modifier = Modifier) {
    val instagramColors = listOf(Color.Yellow, Color.Red, Color.Magenta)
    Canvas(
        modifier =
        Modifier
            .size(80.dp)
            .padding(16.dp)
            .then(modifier)
    ) {
        drawRoundRect(
            brush = Brush.linearGradient(instagramColors),
            cornerRadius = CornerRadius(40f,40f),
            style = Stroke(width = 10f, cap = StrokeCap.Round),
        )
        drawCircle(
            brush = Brush.linearGradient(instagramColors),
            radius = 28f,
            style = Stroke(width = 10f, cap = StrokeCap.Round),
        )
        drawCircle(
            brush = Brush.linearGradient(instagramColors),
            radius = 10f,
            center = Offset(x = this.size.width * 0.8f , y = this.size.height * 0.2f)
        )
    }
}