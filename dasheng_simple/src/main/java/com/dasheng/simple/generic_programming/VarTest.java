package com.dasheng.simple.generic_programming;

import com.dasheng.common.util.VarUtils;
import org.junit.Test;

public class VarTest {

    @Test
    public void testTransfer(){
        Integer int1 = 22;
        String str1 = "44";
        System.out.println(VarUtils.valueOf(int1,String.class));
        System.out.println(VarUtils.valueOf(str1,Integer.class));
    }
}
