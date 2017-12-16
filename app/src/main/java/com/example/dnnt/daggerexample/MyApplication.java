package com.example.dnnt.daggerexample;

import android.app.Application;
import android.util.Log;

import com.example.dnnt.daggerexample.dagger2.DaggerAppComponent;

import java.util.concurrent.ExecutorService;

import javax.inject.Inject;

/**
 * Created by dnnt on 17-12-13.
 */

public class MyApplication extends Application {

    private static final String TAG = "MyApplication";
    @Inject
    ExecutorService es;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.builder().build().inject(this);
        Log.i(TAG,"ExecutorService: " + es.toString());
    }
}
