/**
 * Copyright (C), 2017-2022
 * Author: BalconyJH
 * Date: 5/26/2022 3:42 PM
 * FileName: demo
 * Description:
 */


package com.balconyjhtest.homework;


public class ApiTest {
    public static void main(String[] args) {
        // 利用GregorianCalendar的get()方法输出系统的当前时间，输出格式：北京时间：xxxx年xx月xx日xx时xx分xx秒
        java.util.GregorianCalendar gc = new java.util.GregorianCalendar();
        int year = gc.get(java.util.GregorianCalendar.YEAR);
        int month = gc.get(java.util.GregorianCalendar.MONTH) + 1;
        int day = gc.get(java.util.GregorianCalendar.DAY_OF_MONTH);
        int hour = gc.get(java.util.GregorianCalendar.HOUR_OF_DAY);
        int minute = gc.get(java.util.GregorianCalendar.MINUTE);
        int second = gc.get(java.util.GregorianCalendar.SECOND);
        System.out.println("北京时间：" + year + "年" + month + "月" + day + "日" + hour + "时" + minute + "分" + second + "秒");
        // 将毫秒值1653392360281转换成日期格式：xxxx/xx/xx xx:xx:xx
        long time = 1653392360281L;
        java.util.Date date = new java.util.Date(time);
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String str = sdf.format(date);
        System.out.println(str);
        // "20220228"到"20220525"间隔的天数
        String str1 = "20220228";
        String str2 = "20220525";
        java.text.SimpleDateFormat sdf1 = new java.text.SimpleDateFormat("yyyyMMdd");
        java.util.Date date1 = null;
        java.util.Date date2 = null;
        try {
            date1 = sdf1.parse(str1);
            date2 = sdf1.parse(str2);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        long time1 = date1.getTime();
        long time2 = date2.getTime();
        long days = (time2 - time1) / (1000 * 60 * 60 * 24);
        System.out.println(days);
    }
}
