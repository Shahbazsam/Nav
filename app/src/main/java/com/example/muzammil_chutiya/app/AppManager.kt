package com.example.muzammil_chutiya.app

import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.runtime.Composable
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
        composable <ScreenTwoRoute>(
            enterTransition = { slideInHorizontally(animationSpec = tween(durationMillis = 400 , delayMillis = 400) , initialOffsetX = {it}) },
            exitTransition = { slideOutHorizontally(animationSpec = tween(durationMillis = 400 , delayMillis = 400) , targetOffsetX = { -it}) }
        ) {
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