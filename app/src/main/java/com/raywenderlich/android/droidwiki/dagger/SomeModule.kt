package com.raywenderlich.android.droidwiki.dagger

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class SomeModule(private val applicationContext: Application) {
    @Provides
    @Singleton
    fun provideApplicationContext() = applicationContext
}