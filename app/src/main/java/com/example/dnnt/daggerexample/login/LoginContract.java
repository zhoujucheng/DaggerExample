package com.example.dnnt.daggerexample.login;

import com.example.dnnt.daggerexample.BasePresenter;
import com.example.dnnt.daggerexample.BaseView;

/**
 * Created by dnnt on 17-12-13.
 */

public interface LoginContract {
    interface LoginView extends BaseView{
        void finishLogin();
    }

    interface LoginPresenter extends BasePresenter<LoginView>{
        void attachView(LoginView view);
        void login(String user, String password);
    }
}
