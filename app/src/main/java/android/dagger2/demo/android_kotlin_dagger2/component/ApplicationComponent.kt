package android.dagger2.demo.android_kotlin_dagger2.component

import android.dagger2.demo.android_kotlin_dagger2.Application
import android.dagger2.demo.android_kotlin_dagger2.MainActivity
import android.dagger2.demo.android_kotlin_dagger2.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
        modules = [(ApplicationModule::class)]
)
interface ApplicationComponent{
    fun inject(application: Application)

    fun inject(mainActivity: MainActivity)
}