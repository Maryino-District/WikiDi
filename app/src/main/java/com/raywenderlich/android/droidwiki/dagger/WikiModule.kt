package com.raywenderlich.android.droidwiki.dagger

import com.raywenderlich.android.droidwiki.network.Homepage
import com.raywenderlich.android.droidwiki.network.Wiki
import com.raywenderlich.android.droidwiki.network.WikiApi
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class WikiModule {
    @Singleton
    @Provides
    fun provideHomePage(wikiApi: WikiApi) : Homepage = Homepage(wikiApi)

    @Singleton
    @Provides
    fun provideWiki(wikiApi: WikiApi) : Wiki = Wiki(wikiApi)
}