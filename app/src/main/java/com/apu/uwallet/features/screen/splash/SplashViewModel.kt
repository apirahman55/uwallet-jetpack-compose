package com.apu.uwallet.features.screen.splash

import androidx.lifecycle.viewModelScope
import com.apu.uwallet.features.base.BaseViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

class SplashViewModel @Inject constructor(
) : BaseViewModel<SplashViewState, SplashViewEvent>() {
    init {
        viewModelScope.launch {
            setEvent(SplashViewEvent.NavigateToHome)
        }
    }

    override fun createInitialState() = SplashViewState()
    override fun onTriggerEvent(event: SplashViewEvent) {}
}