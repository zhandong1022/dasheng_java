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

    public BasicGenericProgrammingVO(T first, T second) {
        this.first = first;
        this.second = second;
    }

    private T first;
    private T second;

}
