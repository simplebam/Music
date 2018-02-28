package com.yueyue.musicodo.app;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.yueyue.musicodo.R;
import com.yueyue.musicodo.aidl.Song;
import com.yueyue.musicodo.app.interfaces.PermissionRequestCallback;
import com.yueyue.musicodo.app.manager.MediaManager;
import com.yueyue.musicodo.app.manager.PermissionManager;
import com.yueyue.musicodo.app.manager.PlayServiceManager;
import com.yueyue.musicodo.util.MediaUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * author : yueyue on 2018/2/27 20:53
 * desc   :
 */

public abstract class InspectActivity extends RootActivity implements PermissionRequestCallback {

    protected final static String TAG = "InspectActivity";

    protected MediaManager mediaManager;
    private PermissionManager permissionManager;

    @Override
    @CallSuper
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        permissionManager = PermissionManager.getInstance();
        mediaManager = MediaManager.getInstance();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    protected void checkPermission() {

        String[] ps = new String[]{
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
        };

        if (!permissionManager.checkPermission(this, ps)) {
            //没有这些权限
            PermissionManager.PerMap perMap = new PermissionManager.PerMap(
                    getString(R.string.permission_media_read),
                    getResources().getString(R.string.permission_required),
                    PermissionManager.PerMap.CATEGORY_MEDIA_READ,
                    ps);

            permissionManager.showPermissionRequestTip(perMap, this, new PermissionManager.OnPermissionRequestRefuse() {
                @Override
                public void onRefuse() {
                    permissionDenied(PermissionManager.PerMap.CATEGORY_MEDIA_READ);
                }
            });

        } else {
            permissionGranted(PermissionManager.PerMap.CATEGORY_MEDIA_READ);
        }
    }

    @Override
    public final void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == PermissionManager.PerMap.CATEGORY_MEDIA_READ) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                permissionGranted(requestCode);
            } else {
                permissionDenied(requestCode);
            }
        }
    }

    protected void prepareData() {
        mediaManager.refreshData(this);
    }

    protected void initAppDataIfNeed() {
        if (appPreference.appOpenTimes() == 0) {
            //首次打开App
            Init.initAlbumVisualizerImageCache(this);
            Init.initMusicocoDB(this, mediaManager);
//            mediaManager.scanSdCard(this,null);
        }

        // 更新数据库
        List<Song> diskSongs = mediaManager.getSongList(this);
        List<Song> dbSongs = MediaUtils.DBSongInfoListToSongList(dbController.getSongInfos());

        // FIXME: 2018/2/27 这里的逻辑还是没有搞懂,为什么删了又加回去dbSongs里面
        // 移除
        for (Song song : dbSongs) {
            if (!diskSongs.contains(song)) {
                dbController.removeSongInfo(song);
            }
        }

        // 新增
        dbSongs = MediaUtils.DBSongInfoListToSongList(dbController.getSongInfos());
        List<Song> add = new ArrayList<>();
        for (Song song : diskSongs) {
            if (!dbSongs.contains(song)) {
                add.add(song);
            }
        }
        if (add.size() > 0) {
            dbController.addSongInfo(add);
        }

    }

    /**
     * 启动服务，应确保获得文件读写权限后再启动，启动服务后再绑定，这样即使绑定这解除绑定，
     * 服务端也能继续运行 ？？？
     * 方法加多一个Or，到时删除
     */
    protected void startService() {
        PlayServiceManager.startPlayService(this);
    }

}
