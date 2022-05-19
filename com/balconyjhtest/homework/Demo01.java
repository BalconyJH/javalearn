package com.balconyjhtest.homework;

public class Demo01 {
    // 使用String类实现统计字符串中"bc"字符出现的次数
    public static void main(String[] args) {
        String str = "dfcsdfbcddabcdsbc";
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 1) == 'c') {
                count++;
            }
        }
        System.out.println(count);
    }
}
