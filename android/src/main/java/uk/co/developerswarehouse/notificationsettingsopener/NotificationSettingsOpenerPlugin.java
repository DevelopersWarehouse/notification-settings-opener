package uk.co.developerswarehouse.notificationsettingsopener;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import android.content.Intent;
import android.provider.Settings;

@CapacitorPlugin(name = "NotificationSettingsOpener")
public class NotificationSettingsOpenerPlugin extends Plugin {

    private NotificationSettingsOpener implementation = new NotificationSettingsOpener();

    /**
     * This method opens the device's native notification settings for the app.
     *
     * @example
     * ```typescript
     * import { NotificationSettingsOpener } from 'notification-settings-opener';
     *
     * NotificationSettingsOpener.openNotificationSettings()
     *   .then(() => console.log('Notification settings page opened.'))
     *   .catch(error => console.error('Error opening notification settings:', error));
     * ```
     */
    @PluginMethod
    public void openNotificationSettings(PluginCall call) {
        Intent intent = new Intent();
        String packageName = getContext().getPackageName();

        intent.setAction(Settings.ACTION_APP_NOTIFICATION_SETTINGS);
        intent.putExtra(Settings.EXTRA_APP_PACKAGE, packageName);

        getContext().startActivity(intent);
        call.resolve();
    }
}
