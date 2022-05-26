/**
 * Copyright (C), 2017-2022
 * Author: BalconyJH
 * Date: 5/26/2022 3:43 PM
 * FileName: demo
 * Description:
 */


package com.balconyjhtest.homework;

public class ApiTest01 {
    public static void main(String[] args) {
        // 将"123.45"转换为数字123.45
        String str = "123.45";
        double d = Double.parseDouble(str);
        // 将6789转换成"6789"
        int i = 6789;
        String str1 = String.valueOf(i);
        // 将布尔值true包装成对象类型
        boolean b = true;
        Object obj = Boolean.valueOf(b);
        // 将对象类型true转换成布尔值
        boolean b1 = (boolean) obj;
        System.out.println(d);
        System.out.println(str1);
        System.out.println(obj);
        System.out.println(b1);
    }
}

