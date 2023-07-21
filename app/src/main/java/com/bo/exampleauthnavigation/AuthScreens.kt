package com.bo.exampleauthnavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController

@Composable
fun AuthNavigation(rootNavController: NavController) {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "splash") {
        composable("splash") {
            SplashScreen {
                navController.navigate("signup")
            }
        }
        composable("signup") {
            SignUpScreen {
                navController.navigate("login")
            }
        }
        composable("login") {
            LoginScreen {
                rootNavController.navigate("authenticated" ) {
                    popUpTo("auth") { inclusive = true }
                }
            }
        }

        navigation(startDestination = "home", route = "authenticated") {}
    }
}

@Composable
fun SplashScreen(onLoginClicked: () -> Unit) {
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            modifier = Modifier.padding(bottom = 15.dp),
            text = "Current Screen : SplashScreen"
        )
        Button(onClick = onLoginClicked) {
            Text("Go SignUpScreen")
        }
    }
}

@Composable
fun SignUpScreen(onLoginClicked: () -> Unit) {
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.padding(bottom = 15.dp),
            text = "Current Screen : SignUpScreen"
        )
        Button(onClick = onLoginClicked) {
            Text("Go LoginScreen")
        }
    }
}

@Composable
fun LoginScreen(onLoginClicked: () -> Unit) {
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.padding(bottom = 15.dp),
            text = "Current Screen : LoginScreen"
        )
        Button(onClick = onLoginClicked) {
            Text("Go HomeScreen")
        }
    }
}
