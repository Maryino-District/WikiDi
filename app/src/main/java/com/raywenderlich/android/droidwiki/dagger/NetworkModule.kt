package com.raywenderlich.android.droidwiki.dagger

import com.raywenderlich.android.droidwiki.network.Wiki
import com.raywenderlich.android.droidwiki.network.WikiApi
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
class NetworkModule {
    @Singleton
    @Provides
    fun provideOkHttp() : OkHttpClient = OkHttpClient()

    @Singleton
    @Provides
    fun providewikiApi(okHttp: OkHttpClient) : WikiApi = WikiApi(okHttp)
}