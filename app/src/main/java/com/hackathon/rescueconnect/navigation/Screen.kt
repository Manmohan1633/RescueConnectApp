package com.hackathon.rescueconnect.navigation

sealed class Screen(val route: String) {
    object LoginScreen : Screen("login_screen")
    object OTPScreen : Screen("otp_screen")
    object HomeScreen : Screen("home_screen")
}