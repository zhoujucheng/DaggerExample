package com.example.dnnt.daggerexample.dagger2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import dagger.Module;
import dagger.Provides;

/**
 * Created by dnnt on 17-12-15.
 */

@Module
public class AppModule {
    @Provides
    public ExecutorService provideExecutorService(){
        return Executors.newCachedThreadPool();
    }
}
