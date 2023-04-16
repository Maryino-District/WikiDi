package com.raywenderlich.android.droidwiki.dagger

import com.raywenderlich.android.droidwiki.ui.homepage.HomepageActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [SomeModule::class, PresenterModule::class, NetworkModule::class, WikiModule::class])
interface AppComponent {
    fun inject(activity: HomepageActivity)
}