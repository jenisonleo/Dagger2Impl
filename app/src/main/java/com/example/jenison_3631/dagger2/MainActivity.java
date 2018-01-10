package com.example.jenison_3631.dagger2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    public static MainComponent appComponent;
    @Inject MesasgeObject mesasgeObject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appComponent=DaggerMainComponent.builder().mainModule( new MainModule( this ) ).build();
        appComponent.inject(this);
        Log.e("messgae"," "+mesasgeObject.getMessage());
        MainActivityTest mainActivityTest=new MainActivityTest(this);

        findViewById(R.id.textview).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Activity2.class);
                startActivity(i);
            }
        });
    }
}
