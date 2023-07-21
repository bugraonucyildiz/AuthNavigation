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
import androidx.navigation.compose.rememberNavController

@Composable
fun AuthenticatedNavigation(rootNavController: NavController) {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "home") {
        composable("home") {
            HomeScreen {
                navController.navigate("call")
            }
        }
        composable("call") {
            CallScreen {
                navController.navigate("user")
            }
        }
        composable("user") {
            UserScreen {
                navController.navigate("settings")
            }
        }
        composable("settings") {
            SettingsScreen {
                rootNavController.navigate("auth") {
                    popUpTo("authenticated") { inclusive = true }
                }
            }
        }
    }
}

@Composable
fun HomeScreen(onLoginClicked: () -> Unit) {
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            modifier = Modifier.padding(bottom = 15.dp),
            text = "Current Screen : HomeScreen"
        )
        Button(onClick = onLoginClicked) {
            Text("Go CallScreen")
        }
    }
}

@Composable
fun CallScreen(onLoginClicked: () -> Unit) {
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            modifier = Modifier.padding(bottom = 15.dp),
            text = "Current Screen : CallScreen"
        )
        Button(onClick = onLoginClicked) {
            Text("Go UserScreen")
        }
    }
}

@Composable
fun UserScreen(onLoginClicked: () -> Unit) {
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            modifier = Modifier.padding(bottom = 15.dp),
            text = "Current Screen : UserScreen"
        )
        Button(onClick = onLoginClicked) {
            Text("Go SettingsScreen")
        }
    }
}

@Composable
fun SettingsScreen(onLoginClicked: () -> Unit) {
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            modifier = Modifier.padding(bottom = 15.dp),
            text = "Current Screen : SettingsScreen"
        )
        Button(onClick = onLoginClicked) {
            Text("Go Authenticated Screens")
        }
    }
}