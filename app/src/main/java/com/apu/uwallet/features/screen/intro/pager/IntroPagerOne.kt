package com.apu.uwallet.features.screen.intro.pager

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.apu.uwallet.R
import com.apu.uwallet.features.ui.theme.Gray100

@Composable
fun IntroPagerOne() {
    Column(
        modifier = Modifier.padding(horizontal = 16.dp),
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
}