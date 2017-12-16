package com.example.dnnt.daggerexample.dagger2.qualifier;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by dnnt on 17-12-16.
 */

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheThreadPool {}
