package com.dzero;

import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author DZero
 */
public class Main {

    public static String domstring = "ABcdeFgHijklmN213";

    public static void main(String[] args) {

        //字符串截断
        subString();

        //忽略大小写的比较是否相等
        equalsIgnoreCase();

        //大小写转换
        ToLowerOrUpper();

        stringSearch();

        //字符串拆分
        split();

        //字符串和时间类型的转换
        timeConvert();
    }


    /**
     * 字符串截断
     */
    public static void subString() {
        String newStr = domstring.substring(1);
        System.out.println(newStr);

        String newStr2 = domstring.substring(1, 4);
        System.out.println(newStr2);
    }


    /**
     * 字符串相对判断（大小写忽略）
     */
    public static void equalsIgnoreCase() {
        boolean result = domstring.equalsIgnoreCase("ABcdeFgHijklmN");
        System.out.println(result);
    }


    /**
     * 字符串大小写转换
     */
    public static void ToLowerOrUpper() {
        String lwStr = domstring.toLowerCase();
        String upStr = domstring.toUpperCase();
        System.out.println("toLowerCase()...");
        System.out.println(lwStr);

        System.out.println("toUpperCase()...");
        System.out.println(upStr);
    }


    /**
     * 字符串查找
     */
    public static void stringSearch() {
        int index = domstring.indexOf(2);
        System.out.println(index);
        int index2 = domstring.indexOf("2");
        System.out.println(index2);

        boolean result = domstring.contains("2");
        System.out.println(result);
    }

    public static void split() {
        String demoStr2 = "1,2,3,4,5,6=7";
        //用分隔符"，"和"="进行分割
        String[] news = demoStr2.split(",|=");
        System.out.println(news.length);

        //用分隔符"，"进行分割，至多分割两次
        String[] news2 = demoStr2.split(",", 3);
        System.out.println(news2.length);
    }

    public static void timeConvert() {
        SimpleDateFormat formatTest = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatTest.parse("2005-06-09", new ParsePosition(0));
        System.out.println(date);

        StringBuffer newDateStr = formatTest.format(new Date(), new StringBuffer(), new FieldPosition(0));
        System.out.println(newDateStr);
    }
}


