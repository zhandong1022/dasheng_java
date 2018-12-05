package com.dasheng.common.util;

import com.dasheng.basic.util.BaseUtil;

public class StringUtils {
    public static boolean isEmpty(String str){
        if(BaseUtil.isEmpty(str)){
            return true;
        }
        if(str.equalsIgnoreCase("")){
            return true;
        }
        return false;
    }
}
