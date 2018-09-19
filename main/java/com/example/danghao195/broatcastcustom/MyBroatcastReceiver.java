package com.example.danghao195.broatcastcustom;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MyBroatcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
//        Intent intent1 =\
        String  abc = intent.getStringExtra("keyName");
        Bundle abcBundle = intent.getExtras();
        String abcN = abcBundle.getString("keyNhat");
        Toast.makeText(context,"Đã nhật được event", Toast.LENGTH_SHORT).show();
    }
}
