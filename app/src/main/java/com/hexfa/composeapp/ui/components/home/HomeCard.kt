package com.hexfa.composeapp.ui.components.home

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeCard(
    modifier: Modifier = Modifier,
    cardElevation: Dp = 12.dp,
    cardCornerRadius: Dp = 16.dp,
    cardPadding :Dp = 12.dp,
    backgroundColor: Color = MaterialTheme.colors.surface,
    @DrawableRes headerIconId: Int,
    headerTitle :String,
    headerIconSize : Dp = 20.dp,
    headerTextSize :TextUnit = 16.sp,
    gridColumnsCount: Int = 3,
    iconItemTextSize:TextUnit = 14.sp,
    items: List<com.hexfa.composeapp.model.Icon>
) {
    Card(
        shape = RoundedCornerShape(cardCornerRadius),
        elevation = cardElevation,
        backgroundColor = backgroundColor,
        modifier = Modifier
            .padding(cardPadding)
            .fillMaxWidth()
            .wrapContentHeight()
            .then(modifier),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
        ) {
            HomeHeader(
                iconId = headerIconId,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                title = headerTitle,
                iconSize = headerIconSize,
                textSize = headerTextSize,
            )
            LazyVerticalGrid(
                modifier = Modifier
                    .fillMaxWidth(),
                columns = GridCells.Fixed(gridColumnsCount),
            ) {
                items(
                    items
                ) { icon ->
                    HomeIconItem(icon = icon, textSize = iconItemTextSize)
                }
            }
        }
    }
}