package com.apu.uwallet.features.screen.intro

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.apu.uwallet.features.navigation.NavGraphData

fun NavController.navigateToIntro(
    navOptions: NavOptions? = null
) = this.navigate(NavGraphData.Intro, navOptions)

fun NavGraphBuilder.introScreen() =
    composable(NavGraphData.Intro) {
        IntroScreen(viewModel = hiltViewModel())
    }
