package com.dasheng.generic_programming.generic_class;

import lombok.Data;

/**
 * 泛型类
 * @author sunzhandong
 * @param <T>
 */
@Data
public class Pair<T> {

    

    private T first;
    private T Second;
}
