package robb.stark.holamundo2.ProyectoMobil

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

//@Preview(showBackground = true)
@Composable

fun Calculadora_macros(user:String,password:String){
    val Morado= Color(0xFF331E36)
    val Violeta = Color(0xFF41337A)
    val Azul = Color(0xFF6EA4BF)
    val GrisClaro = Color(0xFF919191)
    val Grisfondo = Color(0x9CE7E9EC)


    Column(Modifier.fillMaxSize().background(Grisfondo).padding(10.dp)) {

        Row(Modifier.fillMaxWidth().weight(.15f).clip(RoundedCornerShape(35.dp)).background(Color.White).padding(15.dp),horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
            Icon(imageVector = Icons.Default.ExitToApp, contentDescription = "icono", tint = Violeta, modifier = Modifier.size(50.dp))
            Icon(imageVector = Icons.Default.Person, contentDescription = "icono", tint = Violeta, modifier = Modifier.size(50.dp))
        }
        Column(Modifier.fillMaxWidth().weight(1f)) {
            Spacer(Modifier.height(30.dp))
            Row(Modifier.fillMaxWidth()) {
                Column(Modifier.clip(RoundedCornerShape(25.dp)).background(Color.White).size(500.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) { Text(text = "$user -- $password") }
            }
        }

    }

}