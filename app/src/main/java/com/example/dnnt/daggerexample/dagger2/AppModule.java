package com.example.dnnt.daggerexample.dagger2;

import com.example.dnnt.daggerexample.dagger2.qualifier.CacheThreadPool;
import com.example.dnnt.daggerexample.dagger2.qualifier.SingleThreadPool;
import com.example.dnnt.daggerexample.login.LoginComponent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dnnt on 17-12-15.
 */

@Module(subcomponents = {LoginComponent.class})
class AppModule {
    @Provides
    @Singleton
    @CacheThreadPool
    ExecutorService provideExecutorService(){ return Executors.newCachedThreadPool(); }

    @Provides
    @Singleton
    @SingleThreadPool
    ExecutorService provideSingleThreadPool(){ return Executors.newSingleThreadExecutor(); }
}
