package com.example.dnnt.daggerexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.dnnt.daggerexample.login.DaggerLoginComponent;

/**
 * Created by dnnt on 17-12-13.
 */

public class BaseActivity extends AppCompatActivity implements BaseView {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void showToast(String msg) {

    }
}
