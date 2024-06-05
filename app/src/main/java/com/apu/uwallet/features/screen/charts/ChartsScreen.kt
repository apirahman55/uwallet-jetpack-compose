package com.apu.uwallet.features.screen.charts

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ChartsScreen(
    modifier: Modifier = Modifier
) {
    Box(modifier) {
        Text(text = "ChartsScreen")
    }
}

@Preview(name = "ChartsScreen")
@Composable
private fun PreviewChartsScreen() {
    ChartsScreen()
}