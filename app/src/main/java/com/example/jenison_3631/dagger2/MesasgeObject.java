package com.example.jenison_3631.dagger2;

import android.content.Context;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by jenison-3631 on 09/01/18.
 */
@MainActivityScope
public class MesasgeObject {
    @Inject
    public MesasgeObject() {
        Log.e("obbject created"," ");
    }

    public String getMessage(){
        return "1and1ly";
    }
}