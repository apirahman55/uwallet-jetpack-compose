package com.apu.uwallet

import android.app.Application
import androidx.compose.runtime.Stable
import androidx.compose.runtime.mutableStateOf
import dagger.hilt.android.HiltAndroidApp

@Stable
@HiltAndroidApp
class UWalletApp : Application() {
    var isDarkMode = mutableStateOf(true)

    fun toggleTheme() {
        isDarkMode.value = !isDarkMode.value
    }
}