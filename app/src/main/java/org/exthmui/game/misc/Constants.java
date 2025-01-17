/*
 * Copyright (C) 2020 The exTHmUI Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.exthmui.game.misc;

import android.provider.Settings;

public class Constants {

    // Notification
    public final static String CHANNEL_GAMING_MODE_STATUS = "gaming_mode_status";

    public final static String PROP_GAMING_PERFORMANCE = "sys.performance.level";

    public static class Broadcasts {
        public static final String SYS_BROADCAST_GAMING_MODE_ON = "exthmui.intent.action.GAMING_MODE_ON";
        public static final String SYS_BROADCAST_GAMING_MODE_OFF = "exthmui.intent.action.GAMING_MODE_OFF";

        // Local broadcast
        public static final String BROADCAST_CONFIG_CHANGED = "org.exthmui.game.CONFIG_CHANGED";
        public static final String BROADCAST_NEW_DANMAKU = "org.exthmui.game.NEW_DANMAKU";

        /*
        * GAMING_ACTION 需要携带的extra: String target, value
        */
        public static final String BROADCAST_GAMING_ACTION = "org.exthmui.game.GAMING_ACTION";
        public static final String BROADCAST_GAMING_MENU_CONTROL = "org.exthmui.game.GAMING_MENU_CONTROL";

        /* 来电状态与控制 */
        public static final String BROADCAST_CALL_STATUS = "org.exthmui.game.CALL_STATUS";
        // cmd: 1=挂断 2=接听
        public static final String BROADCAST_CALL_CONTROL = "org.exthmui.game.CALL_CONTROL";
    }

    public static class ConfigKeys {
        // 动态过滤通知
        public static final String DYNAMIC_NOTIFICATION_FILTER = Settings.System.GAMING_MODE_DANMAKU_DYNAMIC_NOTIFICATION_FILTER;
        // 通知黑名单
        public static final String NOTIFICATION_APP_BLACKLIST = Settings.System.GAMING_MODE_DANMAKU_APP_BLACKLIST;

        // 禁用自动亮度
        public static final String DISABLE_AUTO_BRIGHTNESS = Settings.System.GAMING_MODE_DISABLE_AUTO_BRIGHTNESS;

        // 请勿打扰模式
        public static final String DISABLE_RINGTONE = Settings.System.GAMING_MODE_DISABLE_RINGTONE;

        // 屏蔽按键
        public static final String DISABLE_HW_KEYS = Settings.System.GAMING_MODE_DISABLE_HW_KEYS;

        // 屏蔽手势
        public static final String DISABLE_GESTURE = Settings.System.GAMING_MODE_DISABLE_GESTURE;

        // 快速启动app
        public static final String QUICK_START_APPS = Settings.System.GAMING_MODE_QS_APP_LIST;
    }

    public static class ConfigDefaultValues {
        // 动态过滤通知
        public static final boolean DYNAMIC_NOTIFICATION_FILTER = true;

        // 请勿打扰模式
        public static final boolean DISABLE_RINGTONE = true;

        // 关闭自动亮度
        public static final boolean DISABLE_AUTO_BRIGHTNESS = true;

        // 屏蔽手势
        public static final boolean DISABLE_GESTURE = true;

        // 屏蔽按键
        public static final boolean DISABLE_HW_KEYS = false;

    }

    public static class GamingActionTargets {
        // 请勿打扰模式
        public static final String DISABLE_RINGTONE = ConfigKeys.DISABLE_RINGTONE;
        // 屏蔽按键
        public static final String DISABLE_HW_KEYS = ConfigKeys.DISABLE_HW_KEYS;
        // 屏蔽手势
        public static final String DISABLE_GESTURE = ConfigKeys.DISABLE_GESTURE;
        // 自动亮度
        public static final String DISABLE_AUTO_BRIGHTNESS = ConfigKeys.DISABLE_AUTO_BRIGHTNESS;
    }

    public static class LocalConfigKeys {
        // 悬浮球位置
        public static final String FLOATING_BUTTON_COORDINATE_HORIZONTAL_X = "floating_button_horizontal_x";
        public static final String FLOATING_BUTTON_COORDINATE_HORIZONTAL_Y = "floating_button_horizontal_y";
        public static final String FLOATING_BUTTON_COORDINATE_VERTICAL_X = "floating_button_vertical_x";
        public static final String FLOATING_BUTTON_COORDINATE_VERTICAL_Y = "floating_button_vertical_y";
    }
}
