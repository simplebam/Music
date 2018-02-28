package com.yueyue.musicodo.preference;

/**
 * author : yueyue on 2018/2/26 19:22
 * desc   : 主题类型
 */

public enum ThemeEnum {
    //白色
    WHITE,

    //黑色
    DARK,

    //随专辑图片变化
    VARYING;

    public static ThemeEnum reversal(ThemeEnum theme) {
        if (theme == WHITE || theme == VARYING) {
            return DARK;
        } else {
            return WHITE;
        }
    }
}