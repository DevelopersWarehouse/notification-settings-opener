import { WebPlugin } from '@capacitor/core';

import type { NotificationSettingsOpenerPlugin } from './definitions';

export class NotificationSettingsOpenerWeb extends WebPlugin implements NotificationSettingsOpenerPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }

  async openNotificationSettings(): Promise<void> {
    console.log('openNotificationSettings');
  }
}
