package com.example.loginwithnavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.loginwithnavigation.navigation.Screen
import com.example.loginwithnavigation.screen.AccountScreen
import com.example.loginwithnavigation.screen.HomeScreen
import com.example.loginwithnavigation.screen.ProfilScreen
import com.example.loginwithnavigation.screen.SearchScreen


@Composable
fun Nav(navController:NavHostController){
    NavHost(navController = navController, startDestination = Screen.Home.route ){

            composable(Screen.Home.route){
                HomeScreen()

            }
            composable(Screen.Search.route){
                SearchScreen()
            }
            composable(Screen.Account.route){
                AccountScreen()
            }
            composable(Screen.Profile.route){
                ProfilScreen()
            }

    }
}