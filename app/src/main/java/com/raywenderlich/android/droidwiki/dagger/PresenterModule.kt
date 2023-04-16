package com.raywenderlich.android.droidwiki.dagger

import com.raywenderlich.android.droidwiki.network.Homepage
import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenter
import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenterImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PresenterModule {
    @Singleton
    @Provides
    fun proviseHomepagePresenter(homepage: Homepage) : HomepagePresenter = HomepagePresenterImpl(homepage)
}