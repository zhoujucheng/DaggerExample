package com.example.dnnt.daggerexample.dagger2.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by dnnt on 17-12-16.
 */

@Scope
@Documented
@Retention(RUNTIME)
public @interface ActivityScoped {}
