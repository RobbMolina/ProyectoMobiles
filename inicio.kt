package robb.stark.holamundo2.ProyectoMobil

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import robb.stark.holamundo2.R

@Composable
fun inicio3(navegar: NavController,name: String,id: String,mensaje:String){
    Column(Modifier.fillMaxSize(),horizontalAlignment = Alignment.CenterHorizontally) {
        val rainbowColorsBrush = remember {
            Brush.sweepGradient(
                listOf(
                    Color(0xFF9575CD),
                    Color(0xFFBA68C8),
                    Color(0xFFE57373),
                    Color(0xFFFFB74D),
                    Color(0xFFFFF176),
                    Color(0xFFAED581),
                    Color(0xFF4DD0E1),
                    Color(0xFF9575CD)
                )
            )
        }
        val borderWidth = 4.dp
        Row(Modifier.fillMaxWidth().weight(1f).background(Color(0xFFFF5A01)), verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.minion),
                contentDescription = "Imagen de perfil",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(horizontal = 15.dp)
                    .size(50.dp)
                    .clip(CircleShape)
                    .border(
                        BorderStroke(borderWidth, rainbowColorsBrush),
                        CircleShape
                    )
                    .padding(borderWidth)
            )
            Text(text = name, fontSize = 40.sp, fontWeight = FontWeight.Bold, color = Color.White)
        }
        Column(Modifier.weight(9f).padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = mensaje, fontSize = 30.sp)
        }

    }
    }
