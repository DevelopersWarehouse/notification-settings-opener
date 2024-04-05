import { registerPlugin } from '@capacitor/core';

import type { NotificationSettingsOpenerPlugin } from './definitions';

const NotificationSettingsOpener = registerPlugin<NotificationSettingsOpenerPlugin>('NotificationSettingsOpener', {
  web: () => import('./web').then(m => new m.NotificationSettingsOpenerWeb()),
});

export * from './definitions';
export { NotificationSettingsOpener };
