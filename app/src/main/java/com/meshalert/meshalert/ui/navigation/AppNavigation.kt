package com.meshalert.meshalert.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.meshalert.meshalert.ui.screens.BroadcastScreen
import com.meshalert.meshalert.ui.screens.HomeScreen
import com.meshalert.meshalert.ui.screens.SafeScreen
import com.meshalert.meshalert.ui.screens.SosScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {

        composable("home") {
            HomeScreen(navController)
        }

        composable("sos") {
            SosScreen(navController)
        }

        composable("safe") {
            SafeScreen(navController)
        }

        composable("broadcast") {
            BroadcastScreen(navController)
        }
    }
}