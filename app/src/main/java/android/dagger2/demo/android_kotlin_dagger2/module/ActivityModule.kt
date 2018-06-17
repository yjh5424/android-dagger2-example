package android.dagger2.demo.android_kotlin_dagger2.module

import android.app.Activity
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: Activity) {

    @Provides
    fun provideActivity() = activity
}