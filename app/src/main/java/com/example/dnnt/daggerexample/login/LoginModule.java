package com.example.dnnt.daggerexample.login;

import com.example.dnnt.daggerexample.dagger2.scope.ActivityScoped;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by dnnt on 17-12-16.
 */

@Module
public abstract class LoginModule {
    @Binds
    abstract LoginContract.LoginPresenter providePresenter(LoginPresenterImpl presenter);
}
