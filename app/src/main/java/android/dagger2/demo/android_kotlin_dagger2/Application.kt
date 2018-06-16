package android.dagger2.demo.android_kotlin_dagger2

import android.app.Application
import android.dagger2.demo.android_kotlin_dagger2.AppComponent.Builder
import android.dagger2.demo.android_kotlin_dagger2.component.ApplicationComponent
import android.location.LocationManager
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.DaggerContentProvider
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class Application : Application{

    companion object {
        @JvmStatic lateinit var graph : ApplicationComponent
    }

    @Inject
    lateinit var locationManager: LocationManager


    override fun onCreate() {
        super.onCreate()

        graph = DaggerApplicationComponent.builder().androidModule(AndroidModule(this)).build()
        graph.inject(this)
    }
}