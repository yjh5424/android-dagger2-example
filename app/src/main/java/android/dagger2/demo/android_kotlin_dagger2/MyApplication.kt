package android.dagger2.demo.android_kotlin_dagger2

import android.app.Application
import android.dagger2.demo.android_kotlin_dagger2.component.AppComponent
import android.dagger2.demo.android_kotlin_dagger2.component.DaggerAppComponent
import android.dagger2.demo.android_kotlin_dagger2.module.AppModule
import android.dagger2.demo.android_kotlin_dagger2.module.NetworkModule
import android.location.LocationManager
import javax.inject.Inject

class MyApplication : Application() {

    companion object {
        //platformStatic allow access it from java code
        @JvmStatic lateinit var component: AppComponent
        val BASE_URL="https://api.github.com/"
    }

    override fun onCreate() {
        super.onCreate()

        component=DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .networkModule(NetworkModule(BASE_URL))
                .build()

        component.inject(this)
    }




}