package com.yueyue.musicodo.service;

import android.content.Context;

import com.yueyue.musicodo.aidl.PlayControlImpl;

/**
 * author : yueyue on 2018/2/28 14:05
 * desc   :
 */

public class PlayServiceIBinder extends PlayControlImpl {

    private Context mContext;

    public PlayServiceIBinder(Context context) {
        super(context);
        this.mContext = context;
    }
}
