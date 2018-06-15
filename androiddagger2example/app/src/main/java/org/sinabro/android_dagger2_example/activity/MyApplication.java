package org.sinabro.android_dagger2_example.activity;

import android.app.Application;

import org.sinabro.android_dagger2_example.component.ApiComponent;

import dagger.android.DaggerActivity;
import dagger.android.DaggerApplication;
import dagger.android.DaggerContentProvider;
import dagger.android.DaggerService;
import dagger.internal.DaggerCollections;

/**
 * Created by 윤정현 on 2018-02-06.
 */

public class MyApplication extends Application {

    private ApiComponent mApiComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApiComponent = DaggerService.class.
    }
}
