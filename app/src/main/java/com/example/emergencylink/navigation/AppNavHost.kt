package com.example.emergencylink.navigation

import android.net.wifi.hotspot2.pps.HomeSp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.emergencylink.ui.theme.screens.home.HomeScreen
import com.example.emergencylink.ui.theme.screens.login.LoginScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination:String = LOGIN_URL) {
    NavHost(navController = navController,
        startDestination = startDestination,
        modifier = Modifier) {
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }
        composable(HOME_URL){
            HomeScreen(navController = navController)
        }

    }
}