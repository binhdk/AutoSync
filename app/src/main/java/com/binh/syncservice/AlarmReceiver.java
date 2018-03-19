package com.binh.syncservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by binh on 3/19/2018.
 */

public class AlarmReceiver extends BroadcastReceiver {
    public static final int REQUEST_CODE = 12345;

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent intent1 = new Intent(context, ScheduleSync.class);
        context.startService(intent1);
    }

}
