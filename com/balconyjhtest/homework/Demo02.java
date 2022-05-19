package com.balconyjhtest.homework;

public class Demo02 {
    // 使用StringBuffer类实现判断一个字符串是否是对称字符串。例如：aba,abba,mnanm是对称字符串
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("aba");
        StringBuffer str1 = new StringBuffer("abba");
        StringBuffer str2 = new StringBuffer("mnanm");
        if (str.toString().equals(str.reverse().toString())) {
            System.out.println("是对称字符串");
        } else {
            System.out.println("不是对称字符串");
        }
        if (str1.toString().equals(str1.reverse().toString())) {
            System.out.println("是对称字符串");
        } else {
            System.out.println("不是对称字符串");
        }
        if (str2.toString().equals(str2.reverse().toString())) {
            System.out.println("是对称字符串");
        } else {
            System.out.println("不是对称字符串");
        }
    }
}
