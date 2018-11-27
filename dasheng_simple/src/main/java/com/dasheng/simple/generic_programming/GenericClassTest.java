package com.dasheng.simple.generic_programming;

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
    public void maxMin(){
        String[] words = {"Mary","had","a","little","lamb"};
        BasicGenericProgrammingVO<String> mm = ArrayUtils.maxMin(words);
        System.out.println("最大值："+mm.getFirst());
        System.out.println("最小值："+mm.getSecond());
    }

    /**
     * 获取数组的中间值
     */
    @Test
    public void getMiddleValue(){
        String[] words = {"Mary","had","a","little","lamb"};
        String word = ArrayUtils.<String>getMiddleValue(words);
        System.out.println("中间值："+word);
    }

    /**
     * 获取最小值
     */
    @Test
    public void getMinValue(){
        String[] words = {"Mary","had","a","little","lamb"};
        String word = ArrayUtils.getMin(words);
        System.out.println("最小值："+word);
    }




}
