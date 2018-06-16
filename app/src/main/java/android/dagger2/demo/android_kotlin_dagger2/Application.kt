package android.dagger2.demo.android_kotlin_dagger2

import android.app.Application
import android.dagger2.demo.android_kotlin_dagger2.component.ApplicationComponent
import android.dagger2.demo.android_kotlin_dagger2.component.DaggerApplicationComponent
import android.dagger2.demo.android_kotlin_dagger2.module.ApplicationModule
import android.location.LocationManager

import javax.inject.Inject

class Application : Application(){

    companion object {
        @JvmStatic lateinit var graph : ApplicationComponent
    }


    override fun onCreate() {
        super.onCreate()
        //graph = Dagger.builder(
        graph = DaggerApplicationComponent.builder().applicationModule(ApplicationModule(this)).build()
        graph.inject(this)
    }
}