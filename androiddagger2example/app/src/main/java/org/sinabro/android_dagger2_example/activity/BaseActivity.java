package org.sinabro.android_dagger2_example.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.sinabro.android_dagger2_example.R;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }
}
