package com.soton.android.buggythefix;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by AndroidHPE on 1/28/2017.
 */

public class Blistener extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        final Bundle bundle = intent.getExtras();
        Toast.makeText(context,bundle.getString("Message"),Toast.LENGTH_SHORT).show();
    }
}
