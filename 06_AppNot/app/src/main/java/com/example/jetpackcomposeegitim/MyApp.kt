package com.example.jetpackcomposeegitim


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposeegitim.LoginScreen
import com.example.jetpackcomposeegitim.RegisterScreen
import com.example.jetpackcomposeegitim.TasksScreen

@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login") {
        composable("login") { LoginScreen(navController) }
        composable("register") { RegisterScreen(navController) }
        composable("tasks") { TasksScreen() }
    }
}
