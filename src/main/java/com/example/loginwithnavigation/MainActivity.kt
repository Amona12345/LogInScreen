package com.example.loginwithnavigation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.loginwithnavigation.navigation.Nav
import com.example.loginwithnavigation.navigation.Screen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           MyApp()
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Preview(showBackground = true)
@Composable
fun MyApp(){
    val navController = rememberNavController()
    val items = listOf(Screen.Home, Screen.Account, Screen.Search, Screen.Profile)

    androidx.compose.material.Scaffold(bottomBar = {
        BottomNavigation(modifier = Modifier.clip(shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)),
            backgroundColor = Color.LightGray,
            contentColor =  Color(0xFF183949)
        ) {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentRoute = navBackStackEntry?.destination?.route
            items.forEach { screen ->
                BottomNavigationItem(
                    selected = currentRoute == screen.route,
                    onClick = {
                        navController.navigate(screen.route) {
                            popUpTo(navController.graph.findStartDestination().id)
                            launchSingleTop=true
                        }
                    },
                    icon = {
                        androidx.compose.material.Icon(
                            imageVector = screen.icon,
                            contentDescription = null
                        )
                    },
                    label = { Text(text = screen.title) })
            }
        }
    }) {
        Nav(navController = navController)
    }
}