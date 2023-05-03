package com.hexfa.composeapp.ui.components.icons.international_companies_icons

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.unit.dp

@Composable
fun StackOverFlowIcon() {
    Canvas(
        modifier = Modifier
            .size(80.dp)
            .padding(16.dp)
    ) {
        drawRect(
            color = Color(0xFFbcbbbb),
            topLeft = Offset(size.width * .10f, size.height * .63f),
            Size(size.width * .10f, size.height * .35f)
        )
        drawRect(
            color = Color(0xFFbcbbbb),
            topLeft = Offset(size.width * .10f, size.height * .89f),
            Size(size.width * .89f, size.height * .10f)
        )
        drawRect(
            color = Color(0xFFbcbbbb),
            topLeft = Offset(size.width * .89f, size.height * .63f),
            Size(size.width * .10f, size.height * .35f)
        )

        rotate(0f) {
            drawRect(
                color = Color(0xFFf48023),
                topLeft = Offset(size.width * .28f, size.height * .72f),
                Size(size.width * .54f, size.height * .10f)
            )
        }

        rotate(6f) {
            drawRect(
                color = Color(0xFFf48023),
                topLeft = Offset(size.width * .30f, size.height * .56f),
                Size(size.width * .54f, size.height * .10f)
            )
        }

        rotate(15f) {
            drawRect(
                color = Color(0xFFf48023),
                topLeft = Offset(size.width * .30f, size.height * .40f),
                Size(size.width * .54f, size.height * .10f)
            )
        }

        rotate(24f) {
            drawRect(
                color = Color(0xFFf48023),
                topLeft = Offset(size.width * .26f, size.height * .22f),
                Size(size.width * .54f, size.height * .10f)
            )
        }
        rotate(34f) {
            drawRect(
                color = Color(0xFFf48023),
                topLeft = Offset(size.width * .22f, size.height * .06f),
                Size(size.width * .54f, size.height * .10f)
            )
        }
    }
}