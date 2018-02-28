package com.yueyue.musicodo.service;

import android.app.Service;

import com.yueyue.musicodo.app.manager.MediaManager;
import com.yueyue.musicodo.db.DBMusicocoController;
import com.yueyue.musicodo.preference.AppPreference;
import com.yueyue.musicodo.preference.PlayPreference;
import com.yueyue.musicodo.preference.SettingPreference;

/**
 * author : yueyue on 2018/2/28 13:59
 * desc   :
 */

public abstract class RootService extends Service {

    protected DBMusicocoController dbController;
    protected MediaManager mediaManager;

    protected PlayPreference playPreference;
    protected AppPreference appPreference;
    protected SettingPreference settingPreference;

    public RootService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.playPreference = new PlayPreference(this);
        this.appPreference = new AppPreference(this);
        this.settingPreference = new SettingPreference(this);
        this.dbController = new DBMusicocoController(this, false);
        this.mediaManager = MediaManager.getInstance();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        if (dbController != null) {
            dbController.close();
        }
    }
}

