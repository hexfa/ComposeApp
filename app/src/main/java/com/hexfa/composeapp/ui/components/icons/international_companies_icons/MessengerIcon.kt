package com.hexfa.composeapp.ui.components.icons.international_companies_icons


import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

@Composable
fun MessengerIcon() {
    val colors = listOf(Color(0xFF02b8f9), Color(0xFF0277fe))
    Canvas(
        modifier = Modifier
            .size(80.dp)
            .padding(16.dp),
    ) {
        val trianglePath = Path().let { path ->
            path.moveTo(this.size.width * .20f, this.size.height * .77f)
            path.lineTo(this.size.width * .20f, this.size.height * 0.95f)
            path.lineTo(this.size.width * .37f, this.size.height * 0.86f)
            path.close()
            path
        }

        val electricPath = Path().let { path ->
            path.moveTo(this.size.width * .20f, this.size.height * 0.60f)
            path.lineTo(this.size.width * .45f, this.size.height * 0.35f)
            path.lineTo(this.size.width * 0.56f, this.size.height * 0.46f)
            path.lineTo(this.size.width * 0.78f, this.size.height * 0.35f)
            path.lineTo(this.size.width * 0.54f, this.size.height * 0.60f)
            path.lineTo(this.size.width * 0.43f, this.size.height * 0.45f)
            path.close()
            path
        }
        drawOval(
            brush = Brush.verticalGradient(colors = colors),
            size = Size(width = this.size.width, height = this.size.height * 0.95f)
        )
        drawPath(
            path = electricPath,
            color = Color.White
        )
        drawPath(
            path = trianglePath,
            brush = Brush.verticalGradient(colors = colors),
            style = Stroke(width = 15f, cap = StrokeCap.Round)
        )
    }
}