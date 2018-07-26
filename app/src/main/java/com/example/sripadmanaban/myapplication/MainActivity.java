package com.example.sripadmanaban.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import timber.log.Timber;
import rx.android.schedulers.AndroidSchedulers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timber.d("");
        String value = AndroidSchedulers.class.getSimpleName();
    }
}