package com.example.dnnt.daggerexample.login;

import dagger.Component;

/**
 * Created by dnnt on 17-12-15.
 */

@Component
public interface LoginComponent {
    void inject(LoginActivity loginActivity);
}
