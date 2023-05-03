package com.hexfa.composeapp.ui.components.icons.iranian_compamies_icons

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DigikalaIcon(modifier: Modifier = Modifier) {
    Canvas(
        modifier =
        Modifier
            .size(80.dp)
            .padding(16.dp)
            .then(modifier)
    ) {
        val width = size.width
        val height = size.height

        drawRoundRect(
            color= Color(0xFFe93a50),
            cornerRadius = CornerRadius(36f,36f),
        )

        val path = Path().apply {
            moveTo(width.times(.20f), height.times(.45f))
            cubicTo(
                width.times(.20f),
                height.times(.45f),
                width.times(.45f),
                height.times(.75f),
                width.times(.8f),
                height.times(.45f)
            )
        }
        drawPath(
            path = path,
            color = Color.White,
            style = Stroke(width = width.times(.12f), cap = StrokeCap.Butt, pathEffect = PathEffect.cornerPathEffect(8f))
        )
    }
}

@Preview
@Composable
fun DigikalaIconPreview() = DigikalaIcon()