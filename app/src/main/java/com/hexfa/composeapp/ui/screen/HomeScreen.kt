package com.hexfa.composeapp.ui.screen


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hexfa.composeapp.model.HomeCardItem
import com.hexfa.composeapp.ui.components.home.HomeCard
import com.hexfa.composeapp.utils.Constant

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    items: List<HomeCardItem>
) {
    Column(
        modifier = Modifier
            .then(modifier)
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        items.forEach { item ->
            HomeCard(
                headerIconId = item.headerIconId,
                headerTitle = item.headerTitle,
                items = item.items,
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() =
    HomeScreen(items = Constant.homeCards)
