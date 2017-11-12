package com.example.evgastap.calendaralarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import static android.support.v4.content.ContextCompat.startActivity;


public class AlarmReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "ALARM", Toast.LENGTH_LONG).show();
        Log.d("alarm has rang", "true");
        context.startActivity(new Intent(context, AlarmScreen.class));
    }

}