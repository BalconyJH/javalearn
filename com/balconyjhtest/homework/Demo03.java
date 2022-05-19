package com.balconyjhtest.homework;

import java.util.Scanner;

public class Demo03 {
    // 用键盘向控制台输入一个Email地址（如：1234567@qq.com）,分析该地址，获取并输出域名（“qq.com”）。
    // (1)定义方法boolean checkEmail(String s)判断邮箱格式是否满足以下要求：
    
    // b.“.”在“@”之后有且只有一个，但不能紧跟“@”；
    // c.@之前要有至少3个字符；
    // d.以.com、.org、.cn、.net结尾；
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入Email地址：");
        String email = sc.next();
        // 不正确重新输入，正确输出其域名。
        while (!checkEmail(email)) {
            System.out.println("邮箱格式不正确，请重新输入：");
            email = sc.next();
        }
        System.out.println("域名为：" + email.substring(email.indexOf("@") + 1));
        sc.close();
    }

    private static boolean checkEmail(String email) {
        // a.有且只有一个@，@不能放在开头，也不能放在结尾；
        if (email.indexOf("@") != email.lastIndexOf("@") || 
            email.indexOf("@") == 0 || 
            email.indexOf("@") == email.length() - 1) {
            return false;
        }
        // b.“.”在“@”之后有且只有一个，但不能紧跟“@”；
        if (email.indexOf(".") != email.lastIndexOf(".") ||
            email.indexOf(".") < email.indexOf("@")|| 
            email.indexOf(".") - email.indexOf("@") == 1) {
            return false;
        }
        // c.@之前要有至少3个字符；
        if (email.indexOf("@") - 3 < 0) {
            return false;
        }
        // d.以.com、.org、.cn、.net结尾；
        if (!email.endsWith(".com") && !email.endsWith(".org") && !email.endsWith(".cn") && !email.endsWith(".net")) {
            return false;
        }
        return true;
    }
}

