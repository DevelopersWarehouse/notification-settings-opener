package uk.co.developerswarehouse.notificationsettingsopener;

import android.util.Log;

public class NotificationSettingsOpener {
    public void openNotificationSettings(PluginCall call) {
        Log.d("NotificationSettingsOpener", "Opening notification settings...");
        call.resolve();
    }
}
