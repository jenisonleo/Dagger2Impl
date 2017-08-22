package com.example.jenison_3631.dagger2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jenison-3631 on 22/08/17.
 */
@Singleton
@Component(modules = {ApplnModule.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
