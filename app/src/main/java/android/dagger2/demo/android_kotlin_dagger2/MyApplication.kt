package android.dagger2.demo.android_kotlin_dagger2

import android.app.Application
import android.dagger2.demo.android_kotlin_dagger2.Appcomponent.AppComponent
import android.dagger2.demo.android_kotlin_dagger2.Appcomponent.DaggerAppComponent
import android.dagger2.demo.android_kotlin_dagger2.module.AppModule
import android.location.LocationManager
import javax.inject.Inject

class MyApplication : Application() {

    companion object {
        //platformStatic allow access it from java code
        @JvmStatic lateinit var graph: AppComponent
    }

    @Inject
    lateinit var locationManager: LocationManager

    override fun onCreate() {
        super.onCreate()

        graph=DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}