package com.yueyue.musicodo.preference;


/**
 * author : yueyue on 2018/2/26 19:17
 * desc   : 以下三种模式只在 PlayPreference 的 them 为 VARYING 时有效
 */

public enum PlayBackgroundModeEnum {

    // 纯色
    COLOR,

    // 颜色渐变
    GRADIENT_COLOR,

    // 带遮罩(黑边)的专辑图片
    PICTUREWITHMASK,

    //虚化的专辑图片
    PICTUREWITHBLUR,
}
