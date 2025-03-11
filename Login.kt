package robb.stark.holamundo2.ProyectoMobil

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import robb.stark.holamundo2.R

@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true)
@Composable


fun LoginView(navegar: NavController){
    val Morado= Color(0xFF331E36)
    val Violeta = Color(0xFF41337A)
    val Azul = Color(0xFF6EA4BF)
    val GrisClaro = Color(0xFF919191)
    var user by remember{
        mutableStateOf(value = "")
    }

    var password by remember{
        mutableStateOf(value = "")
    }


    Column(Modifier.fillMaxSize().background(Color.White), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Column(Modifier.fillMaxWidth()
            .weight(2.5f), verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            //Spacer(modifier = Modifier.height(120.dp))
            Image(painter = painterResource(id = R.drawable.fitnesslogo),
                contentDescription = "fondo",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(150.dp)
            )
            Row {
                Text(text = "Fitness ", fontSize = 50.sp, fontWeight = FontWeight.Bold, color = Violeta)
                Text(text = "Now ", fontSize = 50.sp, fontWeight = FontWeight.Bold, color = Azul)
            }
        }

        Column(Modifier.fillMaxWidth().weight(1.5f),
            verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally) {

            TextField(value = user,onValueChange = { user = it},
                colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xDAE1D4EA),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent),
                    shape = RoundedCornerShape(12.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                    placeholder = {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(imageVector = Icons.Default.Person, contentDescription = "icono",
                                tint = Violeta,
                                modifier = Modifier.size(30.dp))
                            Text(text = "ejemplo@gmail.com")
                        }})

            TextField(value = password,onValueChange = { password = it },
                colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xDAE1D4EA), focusedIndicatorColor = Color.Transparent, unfocusedIndicatorColor = Color.Transparent), shape = RoundedCornerShape(12.dp), keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                placeholder = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(imageVector = Icons.Default.Lock, contentDescription = "icono",
                            tint = Violeta,
                            modifier = Modifier.size(30.dp))
                        Text(text = "Contraseña")
                    }})

           }
        Column(Modifier.fillMaxWidth().weight(1.5f),verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = {
                navegar.navigate("Calculadora_macros?user=$user&password=$password")
            },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Violeta),
                    modifier = Modifier.width(250.dp)){
                Text(text = "Inicia sesion", fontSize = 25.sp, modifier = Modifier.padding(vertical = 8.dp))}
            Text(text = "No tienes sesión? Crea tu cuenta aqui.", fontSize = 15.sp, color = Azul)
        }
        Spacer(modifier = Modifier.height(100.dp))
    }
}