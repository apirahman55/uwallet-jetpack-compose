package com.apu.uwallet.features.screen.home

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.apu.uwallet.features.navigation.NavGraphData

fun NavController.navigateToHome(
    navOptions: NavOptions? = null
) = this.navigate(NavGraphData.Home, navOptions)

fun NavGraphBuilder.homeScreen() =
    composable(NavGraphData.Home) {
        HomeScreen(viewModel = hiltViewModel())
    }