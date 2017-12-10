package com.example.junhee.androidmvppattern;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by JunHee on 2017. 12. 10..
 */

@Module
public class ApplicationModule {

    private Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    // 싱글톤 패턴으로 제공
    @Provides
    @Singleton
    public Context provideContext(){
        return application;
    }
}
