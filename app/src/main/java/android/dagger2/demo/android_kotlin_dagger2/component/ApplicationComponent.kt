package android.dagger2.demo.android_kotlin_dagger2.component

import android.dagger2.demo.android_kotlin_dagger2.Application
import android.dagger2.demo.android_kotlin_dagger2.MainActivity


interface ApplicationComponent{
    fun inject(application: Application)

    fun inject(mainActivity: MainActivity)
}