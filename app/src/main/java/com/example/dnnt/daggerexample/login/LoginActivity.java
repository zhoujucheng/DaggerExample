package com.example.dnnt.daggerexample.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.dnnt.daggerexample.BaseActivity;
import com.example.dnnt.daggerexample.R;

import javax.inject.Inject;

public class LoginActivity extends BaseActivity implements LoginContract.LoginView{

    @Inject
    LoginPresenterImpl presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        DaggerLoginComponent.builder().build().inject(this);
        presenter.attachView(this);
    }

    @Override
    public void finishLogin() {}

}
