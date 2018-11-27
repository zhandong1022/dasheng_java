package com.dasheng.common.util;

import com.dasheng.basic.vo.BasicGenericProgrammingVO;

import java.io.Serializable;

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
    public static <T extends Comparable> BasicGenericProgrammingVO maxMin(T[] valueList){
        if(checkIsEmpty(valueList)){
            return null;
        }
        T min = valueList[0];
        T max = valueList[0];
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
    public static boolean checkIsEmpty(Object[] arrayList){
        if(arrayList==null||arrayList.length==0){
            return true;
        }
        return false;
    }

    /**
     * get the middle value of an array
     * @param a
     * @param <T>
     * @return
     */
    public static <T> T getMiddleValue(T... a){
        return a[a.length/2];
    }

    /**
     * get min value of an array
     * @param array
     * @param <T>
     * @return
     */
    public static <T extends Comparable & Serializable> T getMin(T... array){
        if(checkIsEmpty(array)){
            return null;
        }
        T smallest = array[0];
        for(int i =0;i<array.length;i++){
            if(smallest.compareTo(array[i])>0) {
                smallest=array[i];
            }

        }
        return smallest;
    }
}
