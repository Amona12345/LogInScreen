package com.example.loginwithnavigation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route:String,val title:String,val icon:ImageVector){
    object Home: Screen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    ) object Account: Screen(
        route = "account",
        title = "Account",
        icon = Icons.Default.AccountBox
    ) object Search: Screen(
        route = "search",
        title = "Search",
        icon = Icons.Default.Search
    ) object Profile: Screen(
        route = "profile",
        title = "Profile",
        icon = Icons.Default.Person
    )
}
