package com.example.dnnt.daggerexample.login;

import android.os.Bundle;
import android.util.Log;

import com.example.dnnt.daggerexample.BaseActivity;
import com.example.dnnt.daggerexample.MyApplication;
import com.example.dnnt.daggerexample.R;

import javax.inject.Inject;

import dagger.Lazy;

public class LoginActivity extends BaseActivity implements LoginContract.LoginView{

//    @Inject
//    LoginPresenterImpl presenter;
    @Inject
    Lazy<LoginPresenterImpl> presenterLazy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ((MyApplication)getApplicationContext()).appComponent
                .loginComponent()
                .build()
                .inject(this);

//        presenter.attachView(this);
//        presenter.login("abc","123456");

        presenterLazy.get().attachView(this);
        presenterLazy.get().login("abc","123456");
    }

    @Override
    public void finishLogin() {}

}
