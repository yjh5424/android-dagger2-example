package android.dagger2.demo.android_kotlin_dagger2.component

import android.app.Application
import android.dagger2.demo.android_kotlin_dagger2.ui.MainActivity
import android.dagger2.demo.android_kotlin_dagger2.module.AppModule
import android.dagger2.demo.android_kotlin_dagger2.module.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
        modules = [(AppModule::class),(NetworkModule::class)]
)
interface AppComponent{
    fun inject(application: Application)

    fun inject(mainActivity: MainActivity)

}