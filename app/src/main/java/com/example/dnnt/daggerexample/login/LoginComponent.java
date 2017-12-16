package com.example.dnnt.daggerexample.login;

import com.example.dnnt.daggerexample.dagger2.AppComponent;
import com.example.dnnt.daggerexample.dagger2.scope.ActivityScoped;

import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by dnnt on 17-12-15.
 */

@Subcomponent(modules = {LoginModule.class})
@ActivityScoped
public interface LoginComponent {
    void inject(LoginActivity loginActivity);
    @Subcomponent.Builder
    interface Builder{
        LoginComponent build();
    }
}
