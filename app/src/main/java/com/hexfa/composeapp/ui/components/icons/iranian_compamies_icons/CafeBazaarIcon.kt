package com.hexfa.composeapp.ui.components.icons.iranian_compamies_icons

import android.graphics.RectF
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CafeBazaarIcon(modifier: Modifier = Modifier) {
    val cafeBazaarColor = listOf(
        Color(0xFF6AC716),
        Color(0xFF6AC716),
        Color(0xFF00A152),
        Color(0xFF00A152),
        Color(0xFF00A152),
    )
    Canvas(
        modifier =
        Modifier
            .size(80.dp)
            .padding(16.dp)
            .then(modifier)
    ) {
        val width = size.width
        val height = size.height
        val paint = android.graphics.Paint().apply {
            color = Color.White.toArgb()
            setShadowLayer(25f, 0f, 0f, Color.DarkGray.copy(alpha = .20f).toArgb())
        }
        drawIntoCanvas {
            it.nativeCanvas.drawRoundRect(
                RectF(0f, 0f, width, height),
                36f,
                36f,
                paint,
            )
        }
        val bottomPath = Path().apply {
            moveTo(width.times(.15f), height.times(.4f))
            cubicTo(
                width.times(.20f),
                height.times(.95f),
                width.times(.80f),
                height.times(.95f),
                width.times(.85f),
                height.times(.4f)
            )
        }
        drawPath(
            path = bottomPath,
            brush = Brush.verticalGradient(
                colors = cafeBazaarColor,
                startY = height.times(.4f),
            ),
            style = Fill
        )
        val topPath = Path().apply {
            moveTo(width.times(.15f), height.times(.4f))
            quadraticBezierTo(
                width.times(.5f),
                height.times(.325f),
                width.times(.85f),
                height.times(.4f),
            )
        }
        translate(top = .2f) {
            drawPath(
                path = topPath,
                color = Color(0xFF6AC716),
                style = Fill,
            )
        }
        val strapPath = Path().apply {
            moveTo(width.times(.38f), height.times(.4f))
            quadraticBezierTo(
                width.times(.5f),
                height.times(0.02f),
                width.times(.62f),
                height.times(.4f),
            )
        }
        drawPath(
            path = strapPath,
            color = Color(0xFF6AC716),
            style = Stroke(width = width.times(.05f), cap = StrokeCap.Round),
        )
    }
}

@Preview
@Composable
fun CafeBazaarIconPreview() = CafeBazaarIcon()