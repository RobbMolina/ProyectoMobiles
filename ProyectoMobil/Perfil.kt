@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class
)

package robb.stark.holamundo2.ProyectoMobil

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.FlowColumnScopeInstance.weight
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.DirectionsRun
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material.icons.filled.Calculate
import androidx.compose.material.icons.filled.DirectionsRun
import androidx.compose.material.icons.filled.Fastfood
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Sports
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@ExperimentalMaterial3Api
@Preview(showBackground = true)
@Composable

fun Perfil(){

    val Morado= Color(0xFF331E36)
    val Violeta = Color(0xFF41337A)
    val Azul = Color(0xFF6EA4BF)
    val GrisClaro = Color(0xF2807F7F)
    val Grisfondo = Color(0x9CE7E9EC)


    Column(Modifier.fillMaxSize().padding(15.dp)) {
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
            Icon(imageVector = Icons.Default.Person, contentDescription = "icono",
                tint = Violeta,
                modifier = Modifier.size(35.dp).scale(-1f, 1f))
            Text( text = "Perfil", fontSize = 20.sp)
            Icon(imageVector = Icons.Default.Notifications, contentDescription = "icono",
                tint = Violeta,
                modifier = Modifier.size(35.dp).scale(-1f, 1f))

        }
            Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
                Column(Modifier.weight(8f)) {
                    Column(Modifier.weight(1f).fillMaxWidth(), verticalArrangement = Arrangement.Center) {
                        Text( text = "Roberto Molina", fontSize = 25.sp)
                        Text( text = "Continuemos con el objetivo!", fontSize = 18.sp, color = GrisClaro)

                    }
                    Column(Modifier
                        .clip(RoundedCornerShape(16.dp))
                        .background(color = Violeta)
                        .weight(1.5f),
                        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                        Text( text = "Macros Diarios", fontSize = 25.sp, fontWeight = FontWeight.Bold, color = Color.White, modifier = Modifier.padding(bottom = 10.dp))
                        Row(Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceAround) {
                            Text( text = "Proteina", fontSize = 20.sp, color = Color.White)
                            Text( text = "Calorias", fontSize = 20.sp, color = Color.White)
                            Text( text = "Grasas", fontSize = 20.sp, color = Color.White)
                        }
                        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
                            Text( text = "150", fontSize = 25.sp, fontWeight = FontWeight.Bold, color = Color.White)
                            Text( text = "1900", fontSize = 25.sp, fontWeight = FontWeight.Bold, color = Color.White)
                            Text( text = "60", fontSize = 25.sp, fontWeight = FontWeight.Bold, color = Color.White)
                        }
                    }
                    Column(Modifier.fillMaxWidth().weight(7f).padding(top = 20.dp)) {
                        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                            Icon(imageVector = Icons.Default.Info, contentDescription = "icono",
                                tint = Azul,
                                modifier = Modifier.size(35.dp).scale(-1f, 1f))
                            Text( text = "Tu informacion", fontSize = 25.sp)
                        }

                        Row(Modifier.fillMaxWidth().padding(vertical = 15.dp)){
                            Column(Modifier.weight(1f).padding(end = 5.dp)) {
                                Text( text = "Edad", fontSize = 25.sp)
                                TextField(
                                    value = "",
                                    onValueChange = {},  // Necesitas un onValueChange para que funcione correctamente
                                    colors = TextFieldDefaults.textFieldColors(
                                        containerColor = Color(0xDAE1D4EA),
                                        focusedIndicatorColor = Color.Transparent,
                                        unfocusedIndicatorColor = Color.Transparent),
                                    modifier = Modifier.clip(RoundedCornerShape(12.dp)).height(40.dp), // Redondea los bordes
                                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text))
                                Text( text = "Peso", fontSize = 25.sp)
                                TextField(
                                    value = "",
                                    onValueChange = {},  // Necesitas un onValueChange para que funcione correctamente
                                    colors = TextFieldDefaults.textFieldColors(
                                        containerColor = Color(0xDAE1D4EA),
                                        focusedIndicatorColor = Color.Transparent,
                                        unfocusedIndicatorColor = Color.Transparent
                                    ),
                                    modifier = Modifier.clip(RoundedCornerShape(12.dp)).height(40.dp), // Redondea los bordes
                                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),)
                            }
                            Column(Modifier.weight(1f).padding(start = 5.dp)) {
                                Text( text = "Sexo", fontSize = 25.sp)
                                TextField(
                                    value = "",
                                    onValueChange = {},  // Necesitas un onValueChange para que funcione correctamente
                                    colors = TextFieldDefaults.textFieldColors(
                                        containerColor = Color(0xDAE1D4EA),
                                        focusedIndicatorColor = Color.Transparent,
                                        unfocusedIndicatorColor = Color.Transparent
                                    ),
                                    modifier = Modifier.clip(RoundedCornerShape(12.dp)).height(40.dp), // Redondea los bordes
                                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),)

                                Text( text = "Altura", fontSize = 25.sp)
                                TextField(
                                    value = "",
                                    onValueChange = {},  // Necesitas un onValueChange para que funcione correctamente
                                    colors = TextFieldDefaults.textFieldColors(
                                        containerColor = Color(0xDAE1D4EA),
                                        focusedIndicatorColor = Color.Transparent,
                                        unfocusedIndicatorColor = Color.Transparent
                                    ),
                                    modifier = Modifier.clip(RoundedCornerShape(12.dp)).height(40.dp), // Redondea los bordes
                                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),)
                            }

                        }
                        Column(Modifier.fillMaxWidth()) { Text( text = "Nivel de actividad fisica", fontSize = 25.sp)

                            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.CenterVertically) {
                                Button(onClick = {},
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Violeta),
                                    modifier = Modifier.weight(1f).padding(10.dp)){
                                    Text(text = "Bajo", fontSize = 15.sp, modifier = Modifier.padding(vertical = 8.dp))}

                                Button(onClick = {},
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Violeta),
                                    modifier = Modifier.weight(1f).padding(10.dp)){
                                    Text(text = "Bajo", fontSize = 15.sp, modifier = Modifier.padding(vertical = 8.dp))}

                                Button(onClick = {},
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Violeta),
                                    modifier = Modifier.weight(1f).padding(10.dp)){
                                    Text(text = "Bajo", fontSize = 15.sp, modifier = Modifier.padding(vertical = 8.dp))}

                            }

                            Text( text = "Objetivo", fontSize = 25.sp)
                            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.CenterVertically) {
                                Button(onClick = {},
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Violeta),
                                    modifier = Modifier.weight(1f).padding(10.dp)){
                                    Text(text = "Perder grasa", fontSize = 15.sp, modifier = Modifier.padding(vertical = 8.dp))}

                                Button(onClick = {},
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Violeta),
                                    modifier = Modifier.weight(1f).padding(10.dp)){
                                    Text(text = "Ganar musculo", fontSize = 15.sp, modifier = Modifier.padding(vertical = 8.dp))}
                            }
                    }
                }
            }


                Row(Modifier.fillMaxWidth().weight(1f)
                    .clip(RoundedCornerShape(16.dp))
                    .background(color = Morado)
                    .padding(15.dp), horizontalArrangement = Arrangement.SpaceAround, verticalAlignment = Alignment.CenterVertically){
                    Icon(imageVector = Icons.AutoMirrored.Filled.ExitToApp, contentDescription = "icono",
                        tint = Color.White,
                        modifier = Modifier.size(35.dp).scale(-1f, 1f))
                    Icon(imageVector = Icons.Default.Person, contentDescription = "icono",
                        tint = Color.White,
                        modifier = Modifier.size(35.dp).scale(-1f, 1f))
                    Icon(imageVector = Icons.Default.Home, contentDescription = "icono",
                        tint = Color.White,
                        modifier = Modifier.size(35.dp).scale(-1f, 1f))

                    Icon(imageVector = Icons.Default.Fastfood, contentDescription = "icono",
                        tint = Color.White,
                        modifier = Modifier.size(35.dp).scale(-1f, 1f))

                    Icon(imageVector = Icons.AutoMirrored.Filled.DirectionsRun, contentDescription = "icono",
                        tint = Color.White,
                        modifier = Modifier.size(35.dp))


                }
            }
        }
    }


