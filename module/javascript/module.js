// Expose the native API to javascript
forge.android_push = {

    // Events
    'onPushNotificationReceivedForeground': {
        'addListener': function (success) {
            forge.internal.addEventListener("push.pushNotificationReceivedForeground", success);
        }
    },
    'onPushNotificationReceivedBackground': {
        'addListener': function (success) {
            forge.internal.addEventListener("push.pushNotificationReceivedBackground", success);
        }
    }
};


