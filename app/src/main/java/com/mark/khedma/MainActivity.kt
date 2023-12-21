package com.mark.khedma

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.mark.khedma.navigation.Screen
import com.mark.khedma.navigation.SetUpNavGraph
import com.mark.khedma.ui.theme.KhedmaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KhedmaTheme {
              val navController = rememberNavController()
              SetUpNavGraph(startDestination = Screen.Authentication.route, navController = navController)
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KhedmaTheme {
     }
}