package com.example.jenison_3631.dagger2;

import android.content.Context;

/**
 * Created by jenison-3631 on 22/08/17.
 */

public class MainCompoment  {

    private static final MainCompoment mainInstance = new MainCompoment();

    private AppComponent mainCompoment;
    public AppComponent getmainComponent(Context context){
        if(mainCompoment==null){
            mainCompoment=DaggerAppComponent.builder().applnModule( new ApplnModule( context ) ).build();
        }
        return mainCompoment;
    }

    private MainCompoment() {

    }

    public static MainCompoment getMainInstance(){
        return mainInstance;
    }

}
