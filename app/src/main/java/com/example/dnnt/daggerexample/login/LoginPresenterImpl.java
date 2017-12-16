package com.example.dnnt.daggerexample.login;

import android.util.Log;

import com.example.dnnt.daggerexample.dagger2.qualifier.CacheThreadPool;
import com.example.dnnt.daggerexample.dagger2.scope.ActivityScoped;

import java.util.concurrent.ExecutorService;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by dnnt on 17-12-13.
 */

@ActivityScoped
public class LoginPresenterImpl implements LoginContract.LoginPresenter {

    private static final String TAG = "LoginPresenterImpl";

    private LoginContract.LoginView loginView;
    @Inject
    @CacheThreadPool
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
        Log.i(TAG,"ExecutorService: " + es.toString());
    }

}
