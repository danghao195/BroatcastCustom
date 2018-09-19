package com.example.danghao195.broatcastcustom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendBroatcast(View view){
        Bundle b = new Bundle();
        b.putString("keyNhat","valueNhat");
        Intent broatcastIntent = new Intent();
        broatcastIntent.putExtra("keyName","keyValue");
        broatcastIntent.putExtra("keyBundle",b);
        broatcastIntent.setAction("nhat");
        broatcastIntent.setAction("hao");
        sendBroadcast(broatcastIntent);
    }
}
