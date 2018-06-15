package org.sinabro.android_dagger2_example.base;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Provides;

/**
 * Created by 윤정현 on 2018-02-06.
 */

public class AppModule {
    Application application;


    public AppModule(Application application){
        this.application=application;
    }

    @Provides
    @Singleton
    Application providesApplication() {
        return this.application;
    }
}
