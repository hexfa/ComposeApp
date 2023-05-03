package com.hexfa.composeapp.ui.components.home

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hexfa.composeapp.model.Icon
import com.hexfa.composeapp.ui.components.icons.international_companies_icons.InstagramIcon

@Composable
fun HomeIconItem(icon: Icon, modifier: Modifier = Modifier, textSize: TextUnit = 15.sp) {
    val context = LocalContext.current
    val intent = icon.url?.let { url ->
        remember {
            Intent(Intent.ACTION_VIEW, Uri.parse(url))
        }
    }
    Box(
        modifier = Modifier
            .wrapContentSize()
            .clickable {
                context.startActivity(intent)
            },
    ) {
        Column(
            modifier = Modifier
                .wrapContentSize()
                .then(modifier),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            icon.action?.invoke()
            Text(
                text = icon.title,
                style = TextStyle(fontSize = textSize),
                modifier = Modifier.padding(bottom = 16.dp),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview
@Composable
fun IconItemPreview() = HomeIconItem(icon = Icon(title = "Instagram", action = { InstagramIcon() }))