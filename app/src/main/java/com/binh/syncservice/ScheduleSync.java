package com.binh.syncservice;

import android.app.IntentService;
import android.app.NotificationManager;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

/**
 * Created by binh on 3/14/2018.
 */

public class ScheduleSync extends IntentService {

    public ScheduleSync() {
        super(ScheduleSync.class.getSimpleName());

    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d(ScheduleSync.class.getSimpleName(), String.valueOf(System.currentTimeMillis()));
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
