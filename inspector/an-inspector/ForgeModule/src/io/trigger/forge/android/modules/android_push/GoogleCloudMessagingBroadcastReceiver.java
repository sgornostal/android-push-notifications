package io.trigger.forge.android.modules.android_push;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Slava
 * Used to receive incoming Messages from GCM
 */
public class GoogleCloudMessagingBroadcastReceiver extends BroadcastReceiver {

    private static final String TAG = "GoogleCloudMessagingReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {

        Log.i(TAG, "Received intent: " + intent.getAction() );

        ComponentName comp = new ComponentName(context.getPackageName(),
                GoogleCloudMessagingIntentService.class.getName());
        intent.setComponent(comp);
        context.startService(intent);
        setResultCode(Activity.RESULT_OK);

    }


}
