package com.example.jenison_3631.dagger2;

import dagger.Component;

/**
 * Created by jenison-3631 on 09/01/18.
 */
@Component( dependencies = {MainComponent.class},modules = {ActivityModule.class})
@Activity2Scope
public interface ActivityComponent {

    void inject(Activity2 mainActivity);

    Activity2Test getActivity2TestObject();
}
