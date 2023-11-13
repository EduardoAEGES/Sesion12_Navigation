package com.eduardo.sesion12navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun PantallaTres(navController: NavController){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(124, 203, 213, 255))){
        Text(text = "Esta es la pantalla tres", fontSize = 30.sp, modifier = Modifier.padding(10.dp))
        Button(
            onClick = { navController.navigate("ruta1")},
            colors = ButtonDefaults.buttonColors(Color(62, 40, 103, 255))
        )
        {
            Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "")
            Text(
                text = "A pantalla 3",
                fontSize = 20.sp,
                modifier = Modifier.padding(10.dp)
            )
        }
    }
}