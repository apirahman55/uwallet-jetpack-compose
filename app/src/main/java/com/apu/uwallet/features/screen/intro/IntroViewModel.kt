package com.apu.uwallet.features.screen.intro

import androidx.lifecycle.viewModelScope
import com.apu.uwallet.features.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class IntroViewModel @Inject constructor(
) : BaseViewModel<IntroViewState, IntroViewEvent>() {
    override fun createInitialState() = IntroViewState()
    override fun onTriggerEvent(event: IntroViewEvent) {}
}