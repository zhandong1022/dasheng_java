package com.dasheng.basic.vo;

import lombok.Data;

/**
 * 泛型基础类
 * @author sunzhandong
 */
@Data
public class BasicGenericProgrammingVO<T> {


    public BasicGenericProgrammingVO() {
    }

    public BasicGenericProgrammingVO(T maxValue, T minValue) {
        this.first = maxValue;
        this.second = minValue;
    }


    private T first;
    private T second;


}
