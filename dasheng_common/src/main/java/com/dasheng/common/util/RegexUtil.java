package com.dasheng.common.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * 常用正则表达式
 * @author sunzhandong
 * @date 2018/12/18
 *
 */
public class RegexUtil {
    /**
     *
     * @param validateValue 要验证的字符串
     * @return
     */
    public static Boolean isNumber(String validateValue){
        // 数值
        String regEx = "^-?[1-9]\\d*\\.?\\d*|0|-?0\\.\\d*[1-9]\\d*$";
        // 编译正则表达式
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(validateValue);
        // 字符串是否与正则表达式相匹配
        boolean rs = matcher.matches();
        return rs;
    }

    /**
     *
     *验证是否否HH:mm格式的时间
     * @param validateValue
     * @return
     */
    public static Boolean isHHmm(String validateValue){
        // 数值
        String regEx = "^[0][0-9]|[10-24]";
        // 编译正则表达式
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(validateValue);
        // 字符串是否与正则表达式相匹配
        boolean rs = matcher.matches();
        return rs;
    }

    /**
     * 检查是否含有中文
     * @author sunzhandong
     * @date 2018/12/18
     * @param content
     * @return java.lang.Boolean
     */
    public static Boolean checkChineseCharacter(String content){
      Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
      Matcher m = p.matcher(content);
      if(m.find()){
          return true;
      }
      return false;
    }


    /***
     * 是否都为英文
     * @param content
     * @return
     */
    public static Boolean checkEnglish(String content){
        // 数值
        String regEx = "^[A-Za-z0-9]+$";
        // 编译正则表达式
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(content);
        // 字符串是否与正则表达式相匹配
        boolean rs = matcher.matches();
        return rs;
    }

}
