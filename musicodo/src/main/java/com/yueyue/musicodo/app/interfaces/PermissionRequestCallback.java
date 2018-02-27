package com.yueyue.musicodo.app.interfaces;

/**
 * author : yueyue on 2018/2/27 20:54
 * desc   :
 */

public interface PermissionRequestCallback {
    /**
     * 检查权限，成功获取权限后回调，不要在这里操作控件，因为此时可能 setContentView 还未执行
     * @param requestCode
     */
    void permissionGranted(int requestCode);

    /**
     * 检查权限，获取权限失败后回调
     * @param requestCode
     */
    void permissionDenied(int requestCode);
}
