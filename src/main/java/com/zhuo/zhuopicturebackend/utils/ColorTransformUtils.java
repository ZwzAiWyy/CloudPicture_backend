package com.zhuo.zhuopicturebackend.utils;

import java.awt.*;

/**
 * 工具类：颜色转换
 */
public class ColorTransformUtils {

    private ColorTransformUtils() {
        // 工具类不需要实例化
    }

    /**
     * 获取标准颜色（将数据万象的 5 位色值转换为 6 位色值）
     * @param color
     * @return
     */
    public static String getStandardColor(String color){
        if (color.length() == 7){
            color = color.substring(0, 4) + "0" + color.substring(4, 7);
        }
        return color;

    }

}
