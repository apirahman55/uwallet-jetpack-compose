package com.apu.uwallet.features.screen.home

import com.apu.uwallet.features.base.IViewEvent
import com.apu.uwallet.features.base.IViewState

data class HomeViewState(
    val totalBalance: Int = 0,
): IViewState

sealed class HomeViewEvent : IViewEvent {
    object balanceUpdated : HomeViewEvent()
}