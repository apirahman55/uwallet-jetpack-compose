package com.apu.uwallet.features.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.apu.uwallet.R
import com.apu.uwallet.features.ui.theme.Gray100
import com.apu.uwallet.features.ui.theme.UWalletTheme

enum class UWalletTopBarType { parent, child }
object UWalletTopBarData {
    val toolbarHeight: Dp = 44.dp
}

@Composable
fun UWalletTopBar(
    title: String? = "",
    parent: UWalletTopBarType? = UWalletTopBarType.parent,
//    navigationIcon: @Composable (() -> Unit)? = null,
//    navigationIconContentDescription: String? = null,
//    navigationIconColor: Int? = null,
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .height(UWalletTopBarData.toolbarHeight)
            .background(color = MaterialTheme.colorScheme.background)
    ) {
        Button(
            onClick = {},
            contentPadding = PaddingValues(0.dp),
            modifier = Modifier
                .defaultMinSize(minWidth = 1.dp, minHeight = 1.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = Gray100
            )
        ) {
            when (parent) {
                UWalletTopBarType.parent -> {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        painter = painterResource(R.drawable.equal),
                        contentDescription = "History Transaction",
                    )
                }

                UWalletTopBarType.child -> {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        painter = painterResource(R.drawable.arrow_left),
                        contentDescription = "Go Back",
                    )
                }

                else -> {}
            }
        }


        Text(
            text = title?.uppercase() ?: "",
            style = MaterialTheme.typography.titleMedium,
            color = Gray100,
            textAlign = TextAlign.Center,
        )

        if (parent == UWalletTopBarType.parent) {
            Button(
                onClick = {},
                contentPadding = PaddingValues(0.dp),
                modifier = Modifier
                    .defaultMinSize(minWidth = 1.dp, minHeight = 1.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = Gray100
                )
            ) {
                Icon(
                    modifier = Modifier.size(24.dp),
                    painter = painterResource(R.drawable.scan),
                    contentDescription = "History Transaction",
                )
            }
        } else {
            Box(modifier = Modifier.size(24.dp)) {}
        }
    }
}

@Composable
@Preview
fun UWalletTopBarPreview() {
    UWalletTheme(false, false) {
        UWalletTopBar()
    }
}