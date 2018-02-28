package com.yueyue.musicodo.app;

import android.app.Application;
import android.content.Context;

import com.yueyue.musicodo.setting.AutoSwitchThemeController;

import com.yueyue.musicodo.preference.SettingPreference;

/**
 * author : yueyue on 2018/2/26 17:03
 * desc   : App基类
 */

public class MusicApp extends Application {

    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = this;

        ForegroundObserver.init(this);

        checkAutoThemeSwitch();
    }


    private void checkAutoThemeSwitch() {
        SettingPreference settingPreference = new SettingPreference(this);
        AutoSwitchThemeController instance = AutoSwitchThemeController.getInstance(this);
        if (settingPreference.autoSwitchNightTheme() && !instance.isSet()) {
            instance.setAlarm();
        } else {
            instance.cancelAlarm();
        }
    }


    public static Context getContext() {
        return sContext;
    }
}
