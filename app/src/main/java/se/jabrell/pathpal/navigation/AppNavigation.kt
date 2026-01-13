package se.jabrell.pathpal.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
//import se.jabrell.pathpal.MainViewModel
import se.jabrell.pathpal.ui.start.StartScreen
import se.jabrell.pathpal.ui.login.LogInScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "start"
    ) {
        composable("start") {
            StartScreen(navController)
        }
        composable("logIn") {
            LogInScreen(navController)
        }
    }
}