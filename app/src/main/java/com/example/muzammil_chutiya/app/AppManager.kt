package com.example.muzammil_chutiya.app

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.muzammil_chutiya.presentation.screen1.ScreenOne
import com.example.muzammil_chutiya.presentation.screen2.ScreenTwo
import kotlinx.serialization.Serializable


@Composable
fun AppManager(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = ScreenOneRoute
    ) {
        composable <ScreenOneRoute> {
            ScreenOne(
                onButtonClick = {
                    navController.navigate(ScreenTwoRoute)
                }
            )
        }
        composable <ScreenTwoRoute> {
            ScreenTwo(
                onGoBackClick = {
                    navController.navigate(ScreenOneRoute){
                        popUpTo(ScreenOneRoute){
                            inclusive = true
                        }
                    }
                }
            )
        }
    }
}




@Serializable
object ScreenOneRoute


@Serializable
object ScreenTwoRoute