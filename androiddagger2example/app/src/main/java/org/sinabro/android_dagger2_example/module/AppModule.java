package org.sinabro.android_dagger2_example.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Provides;

/**
 * Created by 윤정현 on 2018-02-06.
 */

public class AppModule {
    private Application application;

    AppModule(Application application){
        this.application=application;
    }

    @Provides
    @Singleton
    Application provideApplication(){
        return this.application;
    }
}
