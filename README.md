android-push-notifications
==========

Trigger.IO native module for push notifications on anroid devices via Google Cloud Messaging tokens

## Getting Started
To use this as your own trigger module, set up **Google Cloud Messaging for Anroid**, fork module and upload to trigger's toolkit titled `android-push`. After enabling the module you can use any of the below methods and listeners as you see fit.

#### Creating a Google API project
To create a Google API project:

1. Open the [Google Developers Console](https://cloud.google.com/console).  
2. If you haven't created an API project yet, click **Create Project**.  
3. Supply a project name and click **Create**.  
4. Once the project has been created, a page appears that displays your project ID and project number. For example, **Project Number: 670330094152**.  
5. Copy down your project number. You will use it later on as the **GCM sender ID**.  


#### Enabling the GCM Service
To enable the GCM service:

1. In the sidebar on the left, select **APIs & auth**.  
2. In the displayed list of APIs, turn the **Google Cloud Messaging for Android** toggle to ON.

##Obtaining an API Key
To obtain an API key:

1. In the sidebar on the left, select **APIs & auth > Credentials**.
2. Under **Public API access**, click **Create new key**.
3. In the **Create a new key** dialog, click **Server key**.
4. In the resulting configuration dialog, supply your server's IP address. For testing purposes, you can use 0.0.0.0/0.
5. Click **Create**.
6. In the refreshed page, copy the **API key**. You will need the API key later on to perform authentication in your application server.

>Note: If you need to rotate the key, click Regenerate key. A new key will be created. If you think the key has >been compromised and you want to delete it immediately, click Delete.

#### Next Steps
Once you've finished the tasks listed above, you're ready to start implementing GCM. Here is an overview of the basic steps:

1. Decide which Google-provided GCM connection server you want to use— HTTP or XMPP (CCS). GCM connection servers take messages from a 3rd-party application server (written by you) and send them to a GCM-enabled Android application (the "client app," also written by you) running on a device.
2. Implement an application server (the "3rd-party application server") to interact with your chosen GCM connection server. The app server sends data to a GCM-enabled Android client application via the GCM connection server. For more information about implementing the server side, see Implementing GCM Server.
Write your client app. This is the GCM-enabled Android application that runs on a device. See Implementing GCM Client for more information.


## Methods

#### Register with GCM
This method register your application in Google Cloud Messaging. Success object contains unique `deviceToken`. Token used in your server to push notifications for this spectific device.
```js
forge.internal.call('android_push.registerWithAPNS', {"gcm_id":"Your GCM sender ID"}, success, error);
```

#### Check GCM registration status
This can be used to check whether or a device has been previously registered with GCM.
```js
forge.internal.call('android_push.checkIfRegisteredWithAPNS', success, error);
```

## Listeners

#### Background Push notifications
Capture push notifications received while the app is running and in the background. The success object will contain the push notification payload.
```js
forge.android_push.addEventListener('onPushNotificationReceivedBackground', success, error);
```

#### Foreground Push notifications
Capture push notifications received while the app is running in the foreground. The success object will contain the push notification payload.
```js
forge.android_push.addEventListener('onPushNotificationReceivedForeground', success, error);
```

## General Push Notification Background

Google Cloud Messaging for Android (GCM) is a service that allows you to send data from your server to your users' Android-powered device, and also to receive messages from devices on the same connection. The GCM service handles all aspects of queueing of messages and delivery to the target Android application running on the target device. GCM is completely free no matter how big your messaging needs are, and there are no quotas.

Full developer guide for native Android you can read [here](https://developer.android.com/google/gcm/index.html)
