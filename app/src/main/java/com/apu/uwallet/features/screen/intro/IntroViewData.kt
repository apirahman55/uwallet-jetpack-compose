package com.apu.uwallet.features.screen.intro

import androidx.compose.runtime.Stable
import com.apu.uwallet.features.base.*

@Stable
data class IntroViewState(
    val page: Int = 1,
): IViewState

sealed class IntroViewEvent : IViewEvent {
    data object onChangePage : IntroViewEvent()
}