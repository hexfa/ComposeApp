package com.hexfa.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.hexfa.composeapp.ui.screen.HomeScreen
import com.hexfa.composeapp.ui.theme.ComposeAppTheme
import com.hexfa.composeapp.utils.Constant
import com.hexfa.composeapp.utils.changeStatusBarColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            changeStatusBarColor(color = Color.White)
            ComposeAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black.copy(alpha = .03f)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    )
                    {
                        HomeScreen(
                            items = Constant.homeCards
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeAppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.Black.copy(alpha = .05f)
        ) {
            Box(modifier = Modifier.fillMaxSize())
            {

                HomeScreen(items = Constant.homeCards)
            }
        }
    }
}