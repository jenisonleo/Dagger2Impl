package com.example.jenison_3631.dagger2;

import android.content.Context;
import android.util.Log;

import junit.framework.Test;

import javax.inject.Inject;

/**
 * Created by jenison-3631 on 10/01/18.
 */

public class MainActivityTest {

    @Inject
    MesasgeObject mesasgeObject;
    public MainActivityTest(Context context){
        MainActivity.appComponent.inject(this);
        Log.e("test"," "+mesasgeObject.getMessage());
    }
}
