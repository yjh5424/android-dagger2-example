package android.dagger2.demo.android_kotlin_dagger2.Appcomponent

import android.app.Application
import android.dagger2.demo.android_kotlin_dagger2.MainActivity
import android.dagger2.demo.android_kotlin_dagger2.module.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
        modules = [(AppModule::class)]
)
interface AppComponent{
    fun inject(application: Application)

    fun inject(mainActivity: MainActivity)

}