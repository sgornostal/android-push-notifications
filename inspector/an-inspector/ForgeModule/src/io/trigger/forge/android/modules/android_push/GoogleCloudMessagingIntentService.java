package io.trigger.forge.android.modules.android_push;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.gson.JsonObject;
import io.trigger.forge.android.core.ForgeApp;

import java.util.Set;

/**
 * Created by Slava
 * Used to process GCM Intents from Broadcast Manager
 */
public class GoogleCloudMessagingIntentService extends IntentService {

    private static final String TAG = "GoogleCloudMessagingIntentService";

    public GoogleCloudMessagingIntentService() {
        super("GoogleCloudMessagingIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        GoogleCloudMessaging googleCloudMessaging = GoogleCloudMessaging.getInstance(this);
        String messageType = googleCloudMessaging.getMessageType(intent);

        Log.i(TAG, "Received GCM Message Type: " + messageType);

        Bundle extras = intent.getExtras();
        JsonObject jsonObject = new JsonObject();
        Set<String> keys = extras.keySet();
        for (String key : keys) {
            jsonObject.addProperty(key, extras.get(key).toString());
        }
        if(EventListener.isActive) {
            Log.i(TAG, "Trigger Event[FOREGROUND]");
            ForgeApp.event("pushNotificationReceivedForeground", jsonObject);
        } else {
            Log.i(TAG, "Trigger Event[BACKGROUND]");
            ForgeApp.event("pushNotificationReceivedBackground", jsonObject);
        }

    }
}
