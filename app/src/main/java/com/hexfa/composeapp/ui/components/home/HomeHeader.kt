package com.hexfa.composeapp.ui.components.home

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hexfa.composeapp.R

@Composable
fun HomeHeader(
    modifier: Modifier = Modifier,
    @DrawableRes iconId: Int,
    iconSize: Dp = 24.dp,
    title: String,
    textSize: TextUnit = 15.sp,
    iconTint :Color = Color(0xFF32434D),
    textColor: Color = Color(0xFF32434D),
    dividerColor :Color = Color(0xFF32434D),
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 16.dp, start = 16.dp, top = 16.dp)
            .then(modifier),
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = iconId),
                contentDescription = "$title Icon",
                modifier = Modifier
                    .size(iconSize)
                ,
                tint = iconTint,
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = "$title Icons",
                style = TextStyle(
                    fontSize = textSize,
                    color = textColor,
                ),
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Divider(color = dividerColor, thickness = 0.7.dp)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() = HomeHeader(title = "International", textSize = 20.sp, iconId = R.drawable.ic_international)