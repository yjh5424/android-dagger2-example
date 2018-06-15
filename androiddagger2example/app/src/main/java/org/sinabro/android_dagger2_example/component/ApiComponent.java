package org.sinabro.android_dagger2_example.component;

import org.sinabro.android_dagger2_example.activity.MainActivity;
import org.sinabro.android_dagger2_example.module.ApiModule;
import org.sinabro.android_dagger2_example.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by 윤정현 on 2018-02-06.
 */

@Singleton
@Component(modules = {AppModule.class, ApiModule.class})
public interface ApiComponent  {
    void inject(MainActivity activity);
}
