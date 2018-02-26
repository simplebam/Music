package preference;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * author : yueyue on 2018/2/26 19:15
 * desc   :
 */

public class BasePreference {

    protected SharedPreferences.Editor editor;
    protected final SharedPreferences preferences;
    protected final Context context;

    public enum PreferenceEnum {
        /**
         * 应用设置
         */
        APP_PREFERENCE,

        /**
         * 应用辅助设置，临时数据
         */
        AUXILIARY_PREFERENCE,

        /**
         * 播放界面设置
         */
        PLAY_PREFERENCE,
    }

    public BasePreference(Context context, PreferenceEnum which) {
        this.context = context;
        String name = which.toString().toLowerCase();
        this.preferences = context.getSharedPreferences(name, Context.MODE_PRIVATE);
    }

}