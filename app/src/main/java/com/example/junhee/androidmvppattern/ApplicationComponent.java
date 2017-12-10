package com.example.junhee.androidmvppattern;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by JunHee on 2017. 12. 10..
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(MainActivity target);
}
