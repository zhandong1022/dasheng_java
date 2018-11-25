package com.dasheng.common.util;

import com.dasheng.basic.vo.BasicGenericProgrammingVO;

/**
 *
 * 数据工具
 * @author sunzhandong
 */
public class ArrayUtils {

    /**
     * Gets the min and max of an array of strings
     *
     * @param valueList  an array of string
     * @return
     */
    public static BasicGenericProgrammingVO maxMin(String[] valueList){
        if(checkIsEmpy(valueList)){
            return null;
        }
        String min = valueList[0];
        String max = valueList[0];
        for(int i=0;i<valueList.length;i++){
            if(min.compareTo(valueList[i])>0){
                min=valueList[i];
            }
            if(max.compareTo(valueList[i])<0){
                max=valueList[i];
            }
        }
        return new BasicGenericProgrammingVO(max,min);
    }

    /**
     * check array of Object is null or empty
     *
     * @param arrayList an array of Object
     * @return
     */
    public static boolean checkIsEmpy(Object[] arrayList){
        if(arrayList==null||arrayList.length==0){
            return true;
        }
        return false;
    }
}
