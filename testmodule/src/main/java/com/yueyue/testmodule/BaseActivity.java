package com.yueyue.testmodule;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * author : yueyue on 2018/2/26 20:09
 * desc   :
 */

public class BaseActivity extends AppCompatActivity {

    private final String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("activity", TAG + " onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("activity", TAG + " onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("activity", TAG + " onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("activity", TAG + " onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("activity", TAG + " onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("activity", TAG + " onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("activity", TAG + " onDestroy");
    }

    protected void activityStart(Class clz) {
        startActivity(new Intent(getApplicationContext(), clz));
    }
}
