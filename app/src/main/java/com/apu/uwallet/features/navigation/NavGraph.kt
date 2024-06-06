package com.apu.uwallet.features.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.apu.uwallet.features.screen.home.homeScreen
import com.apu.uwallet.features.screen.intro.introScreen
import com.apu.uwallet.features.ui.components.UWalletScaffold

@Composable
fun NavGraph() {
    val navController = rememberNavController()
//    val navBackStackEntry by navController.currentBackStackEntryAsState()
//    val currentRoute = navBackStackEntry?.destination?.route
//    val currentDestination = navController.currentBackStackEntryAsState().value?.destination

    UWalletScaffold {
        NavHost(
            navController = navController,
            startDestination = NavGraphData.Intro,
            Modifier.padding(it)
        ) {
            introScreen()
            homeScreen()
        }
    }
}