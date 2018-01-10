package com.example.jenison_3631.dagger2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

/**
 * Created by jenison-3631 on 10/01/18.
 */

public class Activity2 extends AppCompatActivity {
    @Inject
    MesasgeObject mesasgeObject;

    @Inject
    Activity2Test activity2Test;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityComponent build = DaggerActivityComponent.builder().mainComponent(MainActivity.appComponent).activityModule(new ActivityModule()).build();
        build.inject(this);
        Log.e("oncreate", "activity2"+mesasgeObject.getMessage());
    }
}
