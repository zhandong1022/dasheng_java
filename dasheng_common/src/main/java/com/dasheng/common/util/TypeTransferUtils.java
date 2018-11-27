package com.dasheng.common.util;

import com.alibaba.fastjson.JSONObject;

/**
 * 类型转换
 * @author sunzhandong
 */
public class TypeTransferUtils {

    public static <T> T valueOf(Object obj){
        String str = JSONObject.toJSONString(obj);
        return (T)obj;
    }
}
