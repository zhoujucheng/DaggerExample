package com.example.dnnt.daggerexample.login;

import android.os.Bundle;
import android.util.Log;

import com.example.dnnt.daggerexample.BaseActivity;
import com.example.dnnt.daggerexample.MyApplication;
import com.example.dnnt.daggerexample.R;
import com.example.dnnt.daggerexample.dagger2.DaggerAppComponent;

import javax.inject.Inject;

public class LoginActivity extends BaseActivity implements LoginContract.LoginView{

    @Inject
    LoginPresenterImpl presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        DaggerLoginComponent.builder()
                .appComponent(((MyApplication)getApplicationContext()).appComponent)
                .build()
                .inject(this);
        presenter.attachView(this);
        presenter.login("abc","123456");
    }

    @Override
    public void finishLogin() {}

}
