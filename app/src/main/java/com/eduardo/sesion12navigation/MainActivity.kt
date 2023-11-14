package com.eduardo.sesion12navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeScreen()
        }
    }
}

@Composable
fun HomeScreen() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "ruta1") {
        composable("ruta1") {
            PantallaUno(navController = navController) }

        composable("ruta2/{texto1}"){navBackStackEntry ->
            PantallaDos(
                navController = navController,
                texto1 = navBackStackEntry.arguments?.getString("texto1").orEmpty())
        }

        composable("ruta3") {
            PantallaTres(navController = navController) }
    }
}

@Preview
@Composable
fun Previo(){
    HomeScreen()
}