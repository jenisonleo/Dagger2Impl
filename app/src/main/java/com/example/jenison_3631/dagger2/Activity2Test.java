package com.example.jenison_3631.dagger2;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by jenison-3631 on 10/01/18.
 */
@Activity2Scope
public class Activity2Test {
    @Inject
    public Activity2Test(){
        Log.e("Activity2Test","Object created");
    }
}
