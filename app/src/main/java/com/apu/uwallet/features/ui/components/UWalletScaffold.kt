package com.apu.uwallet.features.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.FabPosition
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun UWalletScaffold(
    modifier: Modifier = Modifier,
    topBar: @Composable (() -> Unit) = {},
    bottomBar: @Composable () -> Unit = {},
    floatingActionButton: @Composable (() -> Unit) = {},
    backgroundColor: Color = MaterialTheme.colorScheme.background,
    contentColor: Color = contentColorFor(backgroundColor),
    content: @Composable (PaddingValues) -> Unit
) {
    Surface(
        Modifier.background(color = MaterialTheme.colorScheme.background)
    ) {
        Scaffold(
            modifier = modifier,
            topBar = topBar,
            content = content,
            bottomBar = bottomBar,
            contentColor = contentColor,
            floatingActionButton = floatingActionButton,
            floatingActionButtonPosition = FabPosition.Center,
        )
    }
}