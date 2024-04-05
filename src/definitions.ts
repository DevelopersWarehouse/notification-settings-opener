export interface NotificationSettingsOpenerPlugin {
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
 openNotificationSettings(): Promise<void>;
}
