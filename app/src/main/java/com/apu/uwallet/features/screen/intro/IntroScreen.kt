package com.apu.uwallet.features.screen.intro

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.apu.uwallet.R
import com.apu.uwallet.features.ui.components.UWalletScaffold
import com.apu.uwallet.features.ui.theme.Gray100
import com.apu.uwallet.features.ui.theme.Gray500
import com.apu.uwallet.features.ui.theme.Primary1000
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

@Composable
fun Content() {
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
                .padding(vertical = 24.dp, horizontal = 16.dp)
                .fillMaxHeight()
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.intro_multicurrency),
                    contentDescription = "Intro Multicurrency",
                    modifier = Modifier.size(240.dp)
                )
                Box(modifier = Modifier.size(40.dp))
                Text(
                    text = "Multicurrency",
                    style = MaterialTheme.typography.headlineMedium,
                )
                Box(modifier = Modifier.size(16.dp))
                Text(
                    text = "Get access to over 20 cryptocurrencies, stablecoins and fiat payment systems.",
                    style = MaterialTheme.typography.bodySmall,
                    color = Gray100,
                    textAlign = TextAlign.Center
                )
            }

            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = {},
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Primary300,
                    ),
                ) {
                    Text(
                        text = "Create a new wallet",
                        color = Color.White,
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                }

                Button(
                    onClick = {},
                    modifier = Modifier.fillMaxWidth()
                        .padding(top = 16.dp)
                        .border(
                            border = BorderStroke(1.dp, Gray100),
                            shape = RoundedCornerShape(16.dp)
                        ),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent,
                    ),
                ) {
                    Text(
                        text = "I already have a wallet",
                        color = Color.White,
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                }
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