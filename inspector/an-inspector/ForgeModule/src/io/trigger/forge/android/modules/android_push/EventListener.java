package io.trigger.forge.android.modules.android_push;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import io.trigger.forge.android.core.ForgeApp;
import io.trigger.forge.android.core.ForgeEventListener;

public class EventListener extends ForgeEventListener {

	private static final String TAG = "GoogleCloudMessagingModuleEvents";

	public static Boolean isActive = false;
	private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;

	@Override
	public void onStop() {
		isActive = false;
		Log.i(TAG, "Play service background");
	}

	@Override
	public void onStart() {
		isActive = true;
		Log.i(TAG, "Play service foreground");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		int resultCode = GooglePlayServicesUtil.isGooglePlayServicesAvailable(ForgeApp.getActivity());
		if(resultCode != ConnectionResult.SUCCESS) {
			if(GooglePlayServicesUtil.isUserRecoverableError(resultCode)) {
				GooglePlayServicesUtil.getErrorDialog(resultCode, ForgeApp.getActivity(), PLAY_SERVICES_RESOLUTION_REQUEST).show();
			} else {
				Log.e(TAG, "This device is not supported");
				ForgeApp.getActivity().finish();
			}
			Log.w(TAG, "Play service checking failed");
		} else {
			Log.i(TAG, "Play service checking succeeded");
		}
	}

}
