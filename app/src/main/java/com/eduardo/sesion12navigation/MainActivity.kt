package com.eduardo.sesion12navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
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
fun HomeScreen(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "ruta1" ){
        composable("ruta1") { PantallaUno(navController = navController) }
        composable("ruta2") { PantallaDos(navController = navController)}
        composable("ruta3") {PantallaTres(navController = navController)}
    }
}


@Preview
@Composable
fun Previo(){
    HomeScreen()
}