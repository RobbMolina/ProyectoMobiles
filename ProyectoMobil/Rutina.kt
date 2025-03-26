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
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@ExperimentalMaterial3Api
@Preview(showBackground = true)
@Composable

fun Rutina(){

    val Morado= Color(0xFF331E36)
    val Violeta = Color(0xFF41337A)
    val Azul = Color(0xFF6EA4BF)
    val GrisClaro = Color(0xF2807F7F)
    val Grisfondo = Color(0x9CE7E9EC)


    Column(Modifier.fillMaxSize().padding(15.dp)) {
        Column(Modifier.fillMaxWidth().weight(.5f)) {
            Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
                Icon(imageVector = Icons.Default.Person, contentDescription = "icono",
                    tint = Violeta,
                    modifier = Modifier.size(35.dp).scale(-1f, 1f))
                Text( text = "Perfil", fontSize = 20.sp)
                Icon(imageVector = Icons.Default.Notifications, contentDescription = "icono",
                    tint = Violeta,
                    modifier = Modifier.size(35.dp).scale(-1f, 1f))

            }
        }
        Column(Modifier.fillMaxWidth().weight(9f)) {
            Text( text = "Rutina", fontSize = 40.sp, color = Violeta, fontWeight = FontWeight.Bold)
            Text( text = "Aqui va un listado view yeah", fontSize = 30.sp)

        }
        Column(Modifier.fillMaxSize().weight(1f), verticalArrangement = Arrangement.SpaceBetween) {
            Row(Modifier.fillMaxWidth()
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


