package com.dasheng.generic_programming.generic_class;

import com.dasheng.basic.vo.BasicGenericProgrammingVO;
import com.dasheng.common.util.ArrayUtils;
import org.junit.Test;

/**
 * 测试案例
 * @author sunzhandong
 */
public class GenericClassTest {

    /**
     * 获取最大值最小值
     */
    @Test
    public void compareStr(){
        String[] words = {"Mary","had","a","little","lamb"};
        BasicGenericProgrammingVO<String> mm = ArrayUtils.minMax(words);
        System.out.println("最大值："+mm.getFirst());
        System.out.println("最小值："+mm.getSecond());
    }

}
