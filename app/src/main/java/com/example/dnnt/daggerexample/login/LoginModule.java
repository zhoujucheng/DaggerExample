package com.example.dnnt.daggerexample.login;

import com.example.dnnt.daggerexample.dagger2.scope.ActivityScoped;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dnnt on 17-12-16.
 */

@Module
public class LoginModule {
    @Provides
    @ActivityScoped
    LoginContract.LoginPresenter providePresenter(LoginPresenterImpl presenter){
        return presenter;
    }
}
