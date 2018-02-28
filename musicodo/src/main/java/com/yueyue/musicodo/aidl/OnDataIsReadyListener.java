package com.yueyue.musicodo.aidl;

import android.os.IBinder;
import android.os.RemoteException;

/**
 * author : yueyue on 2018/2/27 21:05
 * desc   :
 */

public abstract class OnDataIsReadyListener extends IOnDataIsReadyListener.Stub {

    @Override
    public IBinder asBinder() {
        return super.asBinder();
    }

    /**
     * 在此之前服务端已经能够对监听者分发其他事件回调，而客户端想要与服务端交互（操作服务端），应在这里开始
     */
    @Override
    public abstract void dataIsReady() throws RemoteException;

}
