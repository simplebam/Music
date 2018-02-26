package com.yueyue.musicodo.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.yueyue.musicodo.R;
import com.yueyue.musicodo.app.manager.ActivityManager;
import com.yueyue.musicodo.db.DBMusicocoController;

import preference.AppPreference;
import preference.AuxiliaryPreference;
import preference.PlayPreference;
import preference.SettingPreference;
import preference.ThemeEnum;

/**
 * author : yueyue on 2018/2/26 17:03
 * desc   : 检查主题，打开获得数据库连接
 */

public class RootActivity extends AppCompatActivity {

    protected AppPreference appPreference;
    protected PlayPreference playPreference;
    protected SettingPreference settingPreference;
    protected AuxiliaryPreference auxiliaryPreference;

    protected DBMusicocoController dbController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        appPreference = new AppPreference(this);
        playPreference = new PlayPreference(this);
        auxiliaryPreference = new AuxiliaryPreference(this);
        settingPreference = new SettingPreference(this);

        checkTheme();

        dbController = new DBMusicocoController(this, true);

        ActivityManager.getInstance().addActivity(this);

    }

    protected void checkTheme() {
        ThemeEnum themeEnum = appPreference.getTheme();
        if (themeEnum == ThemeEnum.DARK) {
            this.setTheme(R.style.Theme_DARK);
        } else {
            this.setTheme(R.style.Theme_WHITE);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        // FIXME: 2018/2/26 等小米开发者通过先
//        if (Init.xiaomiStatisticalervicesInitSuccess) {
//            MiStatInterface.recordPageStart(this, this.getClass().getName());
//        }
    }

    @Override
    protected void onPause() {
        super.onPause();
//        if (Init.xiaomiStatisticalervicesInitSuccess) {
//            MiStatInterface.recordPageEnd();
//        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (dbController != null) {
            dbController.close();
        }

        // NOTICE: 2018/02/27  修复内存泄漏
        ActivityManager.getInstance().removeActivity(this);

    }
}
