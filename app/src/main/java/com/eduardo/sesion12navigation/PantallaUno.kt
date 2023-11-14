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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaUno(navController: NavController){
    var texto1 by remember{ mutableStateOf("")}
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(216, 192, 120, 255))){
        Text(
            text = "Esta es la pantalla uno",
            fontSize = 30.sp,
            modifier = Modifier.padding(10.dp))

        OutlinedTextField(
            value = texto1, onValueChange = {texto1=it},
            modifier = Modifier.padding(10.dp),
            label = { Text(text = "Ingrese su nombre")})

        Button(
            onClick = {
                if(texto1 == "") texto1= "0"
                navController.navigate("ruta2/$texto1")
                      },
            colors = ButtonDefaults.buttonColors(Color(15, 74, 81, 255))
        )
        {
            Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "")
            Text(
                text = "A pantalla 2",
                fontSize = 20.sp,
                modifier = Modifier.padding(10.dp)
            )
        }
    }
}