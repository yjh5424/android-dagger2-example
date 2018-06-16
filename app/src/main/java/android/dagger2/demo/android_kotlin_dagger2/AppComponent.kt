package android.dagger2.demo.android_kotlin_dagger2

import android.app.Application
import android.dagger2.demo.android_kotlin_dagger2.module.ApplicationModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import javax.inject.Singleton


@Singleton
@Component(modules = [(ApplicationModule::class)])
interface AppComponent : AndroidInjector<android.dagger2.demo.android_kotlin_dagger2.Application> {

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application: Application) : AppComponent.Builder
        fun build() : AppComponent
    }
}