package com.example.dnnt.daggerexample.login;

import android.util.Log;

import java.util.concurrent.ExecutorService;

import javax.inject.Inject;

/**
 * Created by dnnt on 17-12-13.
 */

public class LoginPresenterImpl implements LoginContract.LoginPresenter {
    private LoginContract.LoginView loginView;
    @Inject
    ExecutorService es;

    @Inject
    public LoginPresenterImpl(){}

    @Override
    public void attachView(LoginContract.LoginView view) {
        loginView = view;
    }

    @Override
    public void login(final String user,final String password) {
        es.submit(new Runnable() {
            @Override
            public void run() {
                Log.i("login","user: " + user + ", password: " + password);
            }
        });
    }

}
