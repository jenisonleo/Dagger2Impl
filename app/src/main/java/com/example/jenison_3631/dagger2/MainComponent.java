package com.example.jenison_3631.dagger2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jenison-3631 on 22/08/17.
 */
@Component(modules = {MainModule.class})
@MainActivityScope
public interface MainComponent {
    void inject(MainActivity mainActivity);

    MesasgeObject getmessgaeobject();

    void inject(MainActivityTest testCalss);
}
