package com.example.dnnt.daggerexample.login;

import javax.inject.Inject;

/**
 * Created by dnnt on 17-12-13.
 */

public class LoginPresenterImpl implements LoginContract.LoginPresenter {

    private LoginContract.LoginView loginView;

    @Inject
    public LoginPresenterImpl(){}

    @Override
    public void attachView(LoginContract.LoginView view) {
        loginView = view;
    }

    @Override
    public void login(String user, String password) {}

}
