package com.apu.uwallet.features.screen.home

import com.apu.uwallet.features.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
) : BaseViewModel<HomeViewState, HomeViewEvent>() {
    override fun createInitialState() = HomeViewState()
    override fun onTriggerEvent(event: HomeViewEvent) {}
}