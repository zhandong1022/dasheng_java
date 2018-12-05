package com.dasheng.common.util;

import com.dasheng.basic.util.BaseUtil;

/**
 * 类型转换
 * @author sunzhandong
 */
public class VarUtils {

//    private Logger

    public static <T> T valueOf(Object val,Class<T> cl){
        if(BaseUtil.isEmpty(val)){
            return null;
        }
        try{
            if(cl.newInstance() instanceof String){
                return (T) String.valueOf(val);
            }
            if(cl.newInstance() instanceof Integer){
                return (T) Integer.valueOf(String.valueOf(val));
            }
            return (T)val;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
