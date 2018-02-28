package com.yueyue.musicodo.app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.yueyue.musicodo.R;
import com.yueyue.musicodo.app.manager.ActivityManager;
import com.yueyue.musicodo.db.DBMusicocoController;

import com.yueyue.musicodo.preference.AppPreference;
import com.yueyue.musicodo.preference.AuxiliaryPreference;
import com.yueyue.musicodo.preference.PlayPreference;
import com.yueyue.musicodo.preference.SettingPreference;
import com.yueyue.musicodo.preference.ThemeEnum;

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
    protected void onCreate(@Nullable Bundle savedInstanceState) {
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
    protected void onDestroy() {
        super.onDestroy();

        if (dbController != null) {
            dbController.close();
        }

        // NOTICE: 2017/9/6 注意 修复内存泄漏
        ActivityManager.getInstance().removeActivity(this);

    }

    @Override
    protected void onResume() {
        super.onResume();

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
}
