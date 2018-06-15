package org.sinabro.android_dagger2_example.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.sinabro.android_dagger2_example.R;
import org.sinabro.android_dagger2_example.base.BaseActivity;
import org.sinabro.android_dagger2_example.network.NetworkClient;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {
    @Inject
    NetworkClient networkClient;

    @Inject


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
