package com.hexfa.composeapp.ui.components.icons.iranian_compamies_icons

import android.graphics.Paint
import android.graphics.Typeface
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SnappIcon(modifier: Modifier = Modifier) {
    val assetManager = LocalContext.current.assets
    val paint = Paint().apply {
        textAlign = Paint.Align.CENTER
        textSize = 150f
        color = Color.White.toArgb()
        textScaleX = 1.15f
        typeface = Typeface.createFromAsset(assetManager,"fonts/SNAPP.TTF")
    }
    Canvas(
        modifier =
        Modifier
            .size(80.dp)
            .padding(16.dp)
            .scale(scaleX = -1f, scaleY = 1f)
            .then(modifier)
    ) {
        drawRoundRect(
            color= Color(0xFF05e06f),
            cornerRadius = CornerRadius(36f,36f),
        )
        rotate(-10f){
            drawContext.canvas.nativeCanvas.drawText("!",center.x , size.height - 20  , paint)
        }
    }
}

@Preview
@Composable
fun SnappIconPreview() = SnappIcon()