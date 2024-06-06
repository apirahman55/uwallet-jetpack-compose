package com.apu.uwallet.features.screen.intro.pager

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.apu.uwallet.features.ui.theme.Primary300

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun IntroPagerIndicator(pagerState: PagerState) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically
    ) {
        repeat(pagerState.pageCount) {
            val color = if (pagerState.currentPage == it) Primary300 else Color.White
            val width = if (pagerState.currentPage == it) 18.dp else 6.dp
            val height = if (pagerState.currentPage == it) 8.dp else 6.dp

            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .background(color)
                    .size(width, height)
            )
        }
    }
}
