package com.hackathon.rescueconnect.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hackathon.rescueconnect.ui.screens.auth.LoginScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.LoginScreen.route
    ) {
        composable(Screen.LoginScreen.route) {
            // We will create the UI for this screen in the next step
            LoginScreen(navController = navController)
        }

        // We will add the OTPScreen and HomeScreen here later
    }
}