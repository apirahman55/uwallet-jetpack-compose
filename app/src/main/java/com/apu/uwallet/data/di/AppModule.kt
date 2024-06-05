package com.apu.uwallet.data.di

import android.content.Context
import androidx.compose.runtime.Stable
import com.apu.uwallet.UWalletApp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Stable
@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Singleton
    @Provides
    fun provideApplication(@ApplicationContext app: Context): UWalletApp {
        return app as UWalletApp
    }
}