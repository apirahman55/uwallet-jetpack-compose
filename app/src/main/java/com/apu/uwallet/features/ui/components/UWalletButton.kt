package com.apu.uwallet.features.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.apu.uwallet.features.ui.theme.Gray100

enum class ButtonType { bordered, normal }
@Composable
fun UWalletButton(
    onClick: () -> Unit = {},
    text: String = "",
    textStyle: TextStyle? = null,
    icon: Int? = null,
    iconColor: Color? = null,
    color: ButtonColors? = null,
    border: BorderStroke? = null
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp)
            .border(
                border = border ?: BorderStroke(0.dp, Color.Transparent),
                shape = RoundedCornerShape(16.dp)
            ),
        shape = RoundedCornerShape(16.dp),
        colors = color ?: ButtonDefaults.buttonColors(),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
        ) {
            if (icon != null)
                Icon(
                    painter = painterResource(id = icon),
                    contentDescription = null,
                    tint = iconColor ?: Color.White
                )

            Text(
                text = text,
                color = Color.White,
                style = textStyle ?: MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(vertical = 8.dp)
            )
        }
    }
}