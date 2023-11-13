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
            val navegante = rememberNavController()
            NavHost(navController = navegante, startDestination = "pantalla1" ){
                composable("pantalla1") { Screen1(navegador = navegante)}
                composable("pantalla2") { Screen2(navegador = navegante)}
            }
        }
    }
}

@Composable
fun Screen1(navegador: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Yellow)){
        Text(text = "PANTALLA 1", fontSize = 50.sp)
        Button(onClick = { navegador.navigate("pantalla2")})
        {
            Text(text = "A pantalla 2", fontSize = 40.sp)
        }
    }
}

@Composable
fun Screen2(navegador: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Green)){
        Text(text = "PANTALLA 2", fontSize = 50.sp)
        Button(onClick = { navegador.navigate("pantalla1") })
        {
            Text(text = "A pantalla 1", fontSize = 40.sp)
        }
    }
}

@Preview
@Composable
fun Previo(){
    val navegante = rememberNavController()
    Screen1(navegador = navegante)
}