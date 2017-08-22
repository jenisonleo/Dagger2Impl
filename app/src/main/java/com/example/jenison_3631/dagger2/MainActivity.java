package com.example.jenison_3631.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject JenisonMessageProvider jenisonMessageProvider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainCompoment.getMainInstance().getmainComponent(getApplicationContext()).inject(this);
        String message=jenisonMessageProvider.generateMyMessage();
        Toast.makeText(this,""+message,Toast.LENGTH_LONG).show();
    }
}
