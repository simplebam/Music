package com.yueyue.musicodo.util;

import android.content.Context;

import com.yueyue.musicodo.aidl.Song;
import com.yueyue.musicodo.app.manager.MediaManager;
import com.yueyue.musicodo.db.modle.DBSongInfo;
import com.yueyue.musicodo.modle.SongInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * author : yueyue on 2018/2/27 21:23
 * desc   :
 */

public class MediaUtils {

    public static List<Song> DBSongInfoListToSongList(List<DBSongInfo> list) {
        List<Song> songs = new ArrayList<>();
        for (DBSongInfo d : list) {
            Song song = new Song(d.path);
            songs.add(song);
        }
        return songs;
    }

    public static List<SongInfo> DBSongInfoToSongInfoList(Context context,
                                                          List<DBSongInfo> list,
                                                          MediaManager mediaManager) {
        List<SongInfo> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            DBSongInfo info = list.get(i);
            SongInfo si = mediaManager.getSongInfo(context, info.path);
            if (si != null) {
                res.add(si);
            }
        }
        return res;
    }
}
