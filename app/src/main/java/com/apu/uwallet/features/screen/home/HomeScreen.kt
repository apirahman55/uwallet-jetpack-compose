package com.apu.uwallet.features.screen.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.apu.uwallet.features.ui.components.UWalletScaffold
import com.apu.uwallet.features.ui.components.UWalletTopBar
import com.apu.uwallet.features.ui.components.UWalletTopBarData
import com.apu.uwallet.features.ui.theme.UWalletTheme

@Composable
fun HomeScreen(
    viewModel: HomeViewModel,
) {
    UWalletScaffold(topBar = { UWalletTopBar() }) {
        Content()
    }
}

@Composable
private fun Content() {
    Box(modifier = Modifier.padding(top = UWalletTopBarData.toolbarHeight)) {
        Text("Home")
    }
}

@Preview
@Composable
fun HomeScreenPreview(darkMode: Boolean = true, dynamicColor: Boolean = false) {
    UWalletTheme(darkMode, dynamicColor) {
        HomeScreen(
            viewModel = hiltViewModel()
        )
    }
}
