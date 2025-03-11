package robb.stark.holamundo2.ProyectoMobil

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Preview(showBackground = true)
@Composable
fun NavigationManager(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Inicio") {
        composable(route= "Inicio"){
            LoginView(navController)
        }

        composable(route = "Calculadora_macros?usuario={usuario}&contraseña={contraseña}",
            arguments = listOf(
                navArgument("usuario"){
                    type = NavType.StringType
                    nullable = true
                    defaultValue = "-"
                },
                navArgument("contraseña"){
                    type = NavType.StringType
                    defaultValue = "definacontraseña"
                })
        ){
            parametros ->
            val user = parametros.arguments?.getString("usuario") ?: ""
            val password = parametros.arguments?.getString("contraseña") ?: ""
            Calculadora_macros(user,password)
        }
    }
}