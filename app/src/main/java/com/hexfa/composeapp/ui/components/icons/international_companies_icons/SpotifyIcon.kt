package com.hexfa.composeapp.ui.components.icons.international_companies_icons

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

@Composable
fun SpotifyIcon() {
    Canvas(
        modifier = Modifier
            .size(80.dp)
            .padding(16.dp)
    ) {
        val width = size.width
        val height = size.height
        val path = Path().apply {
            moveTo(width.times(.18f), height.times(.34f))
            cubicTo(
                width.times(.18f),
                height.times(.35f),
                width.times(.45f),
                height.times(.20f),
                width.times(.83f),
                height.times(.40f)
            )
            moveTo(
                width.times(.28f),
                height.times(.50f),
            )
            cubicTo(
                width.times(.28f),
                height.times(.50f),
                width.times(.45f),
                height.times(.43f),
                width.times(.73f),
                height.times(.55f)
            )
            moveTo(
                width.times(.33f),
                height.times(.67f),
            )
            cubicTo(
                width.times(.33f),
                height.times(.67f),
                width.times(.45f),
                height.times(.62f),
                width.times(.67f),
                height.times(.72f)
            )
        }
        drawCircle(color = Color(0xFF1ed760))
        drawPath(
            path = path,
            color = Color.Black,
            style = Stroke(width = width.times(.09f), cap = StrokeCap.Round)
        )
    }
}