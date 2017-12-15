package com.example.dnnt.daggerexample.login;

import com.example.dnnt.daggerexample.dagger2.AppModule;

import dagger.Component;

/**
 * Created by dnnt on 17-12-15.
 */

@Component(modules = {AppModule.class})
public interface LoginComponent {
    void inject(LoginActivity loginActivity);
}
