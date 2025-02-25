package com.core.di

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class CoreModule(private val application: Context) {
    @Provides
    fun provideContext(): Context = application
}