package com.example.jenison_3631.dagger2;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jenison-3631 on 22/08/17.
 */

@Module
public class ApplnModule {

    Context context;

    public ApplnModule(Context context){
        this.context=context;
    }

    @Provides
    @Singleton
    JenisonMessageProvider provideJenisonMessage(){
       return new JenisonMessageGenerator();
    }
}
