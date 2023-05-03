package com.hexfa.composeapp.ui.components.icons.international_companies_icons

import android.graphics.Paint
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun GoogleVoiceSearchIcon() {
    Canvas(
        modifier = Modifier
            .size(80.dp)
            .padding(16.dp)
    ) {

        val paint = Paint().apply {
            color = Color.White.toArgb()
            setShadowLayer(20f, 0f, 0f, Color.DarkGray.copy(alpha = .20f).toArgb())
        }
        drawIntoCanvas {
            it.nativeCanvas.drawOval(this.size.width, this.size.height, 0f, 0f, paint)
        }

        drawRoundRect(
            color = Color(0xFF4385f7),
            cornerRadius = CornerRadius(40f, 40f),
            topLeft = Offset(size.width.times(.40f), size.height.times(.20f)),
            size = Size(size.width * .20f, size.height.times(.40f))
        )

        drawRect(
            color = Color(0xFF30a952),
            topLeft = Offset(size.width.times(.47f), size.height.times(.72f)),
            size = Size(size.width.times(.08f), size.height.times(.17f))
        )

        drawArc(
            color = Color(0xFFffbf00),
            startAngle = 0f,
            sweepAngle = 180f,
            useCenter = false,
            style = Stroke(width = size.width.times(.08f)),
            size = Size(size.width.times(.40f), size.height.times(.40f)),
            topLeft = Offset(size.width.times(.30f), size.height.times(.30f))
        )

        drawArc(
            color = Color(0xFFf04231),
            startAngle = 0f,
            sweepAngle = 130f,
            useCenter = false,
            style = Stroke(width = size.width.times(.08f)),
            size = Size(size.width.times(.40f), size.height.times(.40f)),
            topLeft = Offset(size.width.times(.30f), size.height.times(.30f))
        )

    }
}

@Preview
@Composable
fun GoogleVoiceSearchIconPreview() = GoogleVoiceSearchIcon()
