package io.trigger.forge.android.modules.android_push;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.gson.JsonPrimitive;
import io.trigger.forge.android.core.ForgeApp;
import io.trigger.forge.android.core.ForgeParam;
import io.trigger.forge.android.core.ForgeTask;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class API {
	private static final String TAG = "GoogleCloudMessagingModuleApi";

	private static final String PREFERENCES_NAME = "GCM_ANDROID_PUSH_REGISTRATION_ID";
	private static final String PROPERTY_REG_ID = "GCM_REGISTRATION_ID";
	private static final String PROPERTY_APP_VERSION = "APP_VERSION";

	private static GoogleCloudMessaging googleCloudMessaging;
	private static String registrationId;
	private static AtomicInteger msgId = new AtomicInteger();

	public static void registerWithGCM(final ForgeTask forgeTask, @ForgeParam("gcm_id") final String gcmId) {
		googleCloudMessaging = GoogleCloudMessaging.getInstance(ForgeApp.getActivity());
		registrationId = getRegistrationId(ForgeApp.getActivity());

		if(registrationId == null || registrationId.equals("")) {
			new AsyncTask<Void, Void, Boolean>() {

				@Override
				protected Boolean doInBackground(Void... voids) {
					if(googleCloudMessaging == null) {
						googleCloudMessaging = GoogleCloudMessaging.getInstance(ForgeApp.getActivity());
					}
					try {
						registrationId = googleCloudMessaging.register(gcmId);
						storeRegistrationId(ForgeApp.getActivity(), registrationId);
					} catch (IOException e) {
						Log.w(TAG, "Failed to register with GCM", e);
						return false;
					}
					return true;
				}

				@Override
				protected void onPostExecute(Boolean registered) {
					super.onPostExecute(registered);
					if(registered && !(registrationId == null && registrationId.equals(""))) {
						Log.i(TAG, "RegisterId = [" + registrationId + "]");
						forgeTask.success(new JsonPrimitive(registrationId));
					} else {
						forgeTask.error("Failed to register, id=["+registrationId+"]");
					}
				}
			}.execute();
		} else {
			Log.i(TAG, "Already registered. ");
			forgeTask.success(new JsonPrimitive(registrationId));
		}
	}

	public static void checkIfRegisteredWithGCM(final ForgeTask forgeTask) {
		String regId = getRegistrationId(ForgeApp.getActivity());
		if(regId == null || regId.equals("")) {
			forgeTask.error("Not registered.");
		} else {
			forgeTask.success();
		}
	}

	private static void storeRegistrationId(final Activity activity, final String regId) {
		final SharedPreferences prefs = activity.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE);
		int appVersion = getAppVersion(activity);
		Log.i(TAG, "Saving Registration Id on App version " + appVersion);
		SharedPreferences.Editor editor = prefs.edit();
		editor.putString(PROPERTY_REG_ID, regId);
		editor.putInt(PROPERTY_APP_VERSION, appVersion);
		editor.commit();
	}

	private static String getRegistrationId(final Activity activity) {
		final SharedPreferences prefs = activity.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE);
		String registrationId = prefs.getString(PROPERTY_REG_ID, "");
		if (registrationId == null || registrationId.equals("")) {
			Log.i(TAG, "Registration id not found in preferences.");
			return "";
		}
		int registeredVersion = prefs.getInt(PROPERTY_APP_VERSION, Integer.MIN_VALUE);
		int currentVersion = getAppVersion(activity);
		if (registeredVersion != currentVersion) {
			Log.i(TAG, "App version changed.");
			return "";
		}
		return registrationId;
	}

	private static int getAppVersion(Context context) {
		try {
			PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
			return packageInfo.versionCode;
		} catch (PackageManager.NameNotFoundException e) {
			// should never happen 
			throw new RuntimeException("Could not get package name: " + e);
		}
	}

}
