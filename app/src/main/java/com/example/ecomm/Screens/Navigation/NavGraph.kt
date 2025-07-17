package com.example.ecomm.Screens.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ecomm.Screens.Home.HomeScreen
import com.example.ecomm.Screens.LoginIn.LoginSCreen
import com.example.ecomm.Screens.Profile.ProfileScreen
import com.example.ecomm.Screens.SignIN.SignInScreen

@Composable
fun NavGraph(navController: NavHostController)
     {

    val navController = rememberNavController()

        NavHost(
            navController = navController, startDestination = "login"

    ) {
        composable("login"){
            LoginSCreen(navController)
        }
           composable("Signup"){
                 SignInScreen(navController)
        }
        composable("bottomNav"){
            BottomNav(navController)
        }
            composable("Home"){
                HomeScreen(navController)
            }
            composable("Profile"){
                ProfileScreen(navController)
            }
            //composable("searchBar"){
             //   HomeScreen(navController)
            //}
    }
    
}
