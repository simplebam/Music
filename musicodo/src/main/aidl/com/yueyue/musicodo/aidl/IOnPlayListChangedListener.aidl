// IOnSongChange.aidl
package com.yueyue.musicodo.aidl;
import com.yueyue.musicodo.aidl.Song;

// Declare any non-default types here with import statements

interface IOnPlayListChangedListener {

    void onPlayListChange(in Song current,int index,int id);
}
