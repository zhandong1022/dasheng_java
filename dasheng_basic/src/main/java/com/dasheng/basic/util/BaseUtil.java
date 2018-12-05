package com.dasheng.basic.util;

/**
 * 基本工具类
 */
public class BaseUtil {
    /**
     * 判断是否为空
     * @param obj
     * @return
     */
    public static boolean isEmpty(Object obj){
        if(obj==null){
            return true;
        }
        return false;
    }
}
