package android.dagger2.demo.android_kotlin_dagger2.module

import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class ApplicationModule(val app : Application){

    @Provides
    @Singleton
    fun app(): Application {
        return app
    }

    @Provides
    @Singleton
    fun context(): Context {
        return app
    }

    @Provides
    @Singleton
    fun connectivity(): ConnectivityManager {
        val service = app.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        return service
    }
}