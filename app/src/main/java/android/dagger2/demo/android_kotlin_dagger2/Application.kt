package android.dagger2.demo.android_kotlin_dagger2

import android.dagger2.demo.android_kotlin_dagger2.AppComponent.Builder
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.DaggerContentProvider
import dagger.android.support.DaggerAppCompatActivity

class Application : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent().builder().application(this).build()
    }

}