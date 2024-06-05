package com.apu.uwallet.features.screen.splash

import androidx.compose.runtime.Stable
import com.apu.uwallet.features.base.*

@Stable
data class SplashViewState(
    val isLoading: Boolean = false
): IViewState

sealed class SplashViewEvent : IViewEvent {
    data object NavigateToHome : SplashViewEvent()
}