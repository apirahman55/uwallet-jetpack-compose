package com.apu.uwallet.features.screen.intro

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.apu.uwallet.features.screen.intro.pager.IntroPagerFour
import com.apu.uwallet.features.screen.intro.pager.IntroPagerIndicator
import com.apu.uwallet.features.screen.intro.pager.IntroPagerOne
import com.apu.uwallet.features.screen.intro.pager.IntroPagerThree
import com.apu.uwallet.features.screen.intro.pager.IntroPagerTwo
import com.apu.uwallet.features.ui.components.UWalletButton
import com.apu.uwallet.features.ui.components.UWalletScaffold
import com.apu.uwallet.features.ui.theme.Gray100
import com.apu.uwallet.features.ui.theme.Primary300
import com.apu.uwallet.features.ui.theme.UWalletTheme

@Composable
fun IntroScreen(
    viewModel: IntroViewModel
) {
    UWalletScaffold {
        Content()
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Content() {
    val pagerState = rememberPagerState(pageCount = { 4 })

    Box(
        modifier = Modifier
            .padding(top = 84.dp)
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFE211F2D),
                        Color(0xFE11101C)
                    ),
                ),
                shape = RoundedCornerShape(16.dp, 16.dp, 0.dp, 0.dp)
            )
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(vertical = 24.dp)
                .fillMaxHeight()
        ) {
            Column {
                HorizontalPager(
                    state = pagerState,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 40.dp)
                ) {
                    when (it) {
                        0 -> IntroPagerOne()
                        1 -> IntroPagerTwo()
                        2 -> IntroPagerThree()
                        3 -> IntroPagerFour()
                    }
                }

                IntroPagerIndicator(pagerState)
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
            ) {

                UWalletButton(
                    onClick = {},
                    text = "Create a new wallet",
                    color = ButtonDefaults.buttonColors(
                        containerColor = Primary300,
                    )
                )

                UWalletButton(
                    onClick = {},
                    text = "I already have a wallet",
                    border = BorderStroke(1.dp, Gray100),
                    color = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent,
                    )
                )
            }
        }
    }
}


@Preview(name = "IntroScreen")
@Composable
private fun PreviewIntroScreen(
    darkTheme: Boolean = true,
    dynamicColor: Boolean = false,
) {
    UWalletTheme(darkTheme, dynamicColor) {
        IntroScreen(viewModel = hiltViewModel())
    }
}