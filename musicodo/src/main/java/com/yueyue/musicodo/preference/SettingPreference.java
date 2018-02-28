package com.yueyue.musicodo.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * author : yueyue on 2018/2/26 17:06
 * desc   :  应用偏好设置：打开应用自动播放，记忆播放，自动切换夜间模式，耳机线控
 * 由 SettingFragment 进行管理
 */

public class SettingPreference {

    private static final String PRE_AUTO_PLAY = "pre_auto_play";
    private static final String PRE_MEMORY_PLAY = "pre_memory_play";
    private static final String PRE_AUTO_SWITCH_NIGHT_THEME = "pre_auto_switch_night_theme";
    private static final String PRE_HEADPHONE_WIRE = "pre_headphone_wire";

    private final SharedPreferences preferences;
    private Context context;

    public SettingPreference(Context context) {
        this.context = context;

        preferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public boolean openAutoPlay() {
        return preferences.getBoolean(PRE_AUTO_PLAY, false);
    }

    public boolean memoryPlay() {
        return preferences.getBoolean(PRE_MEMORY_PLAY, true);
    }

    public boolean autoSwitchNightTheme() {
        return preferences.getBoolean(PRE_AUTO_SWITCH_NIGHT_THEME, true);
    }

    public boolean preHeadphoneWire() {
        return preferences.getBoolean(PRE_HEADPHONE_WIRE, true);
    }

}