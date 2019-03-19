package com.mumu.liulib;

import android.text.TextUtils;

/**
 * edie create on 2019/3/19
 */
public class LiuUtil {

    public static String formatStr(String root, String decorate) {
        if (TextUtils.isEmpty(root)) {
            root = "暂无";
        }
        if (TextUtils.isEmpty(decorate)) {
            return root;
        } else {
            return String.format("%s(%s)", root, decorate);
        }
    }
}
