package com.example.dnnt.daggerexample.login;

import com.example.dnnt.daggerexample.dagger2.AppComponent;
import com.example.dnnt.daggerexample.dagger2.scope.ActivityScoped;

import dagger.Component;

/**
 * Created by dnnt on 17-12-15.
 */

@Component(modules = {LoginModule.class},dependencies = {AppComponent.class})
@ActivityScoped
public interface LoginComponent {
    void inject(LoginActivity loginActivity);
}
