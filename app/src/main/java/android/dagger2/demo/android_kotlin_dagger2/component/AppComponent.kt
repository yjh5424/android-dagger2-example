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
    //inject 할 액티비티 지정
    fun inject(application: Application)

}