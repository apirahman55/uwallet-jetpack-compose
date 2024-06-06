package com.apu.uwallet.features.screen.intro.pager

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
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
fun IntroPagerThree() {
    Column(
        modifier = Modifier.padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.intro_conversion),
            contentDescription = "Intro Conversion",
            modifier = Modifier.size(240.dp)
        )
        Box(modifier = Modifier.size(40.dp))
        Text(
            text = "Conversion",
            style = MaterialTheme.typography.headlineMedium,
        )
        Box(modifier = Modifier.size(16.dp))
        Text(
            text = "Conduct secure exchange transactions with cryptocurrencies in all directions.",
            style = MaterialTheme.typography.bodySmall,
            color = Gray100,
            textAlign = TextAlign.Center
        )
    }
}