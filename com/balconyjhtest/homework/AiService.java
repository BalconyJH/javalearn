/**
 * Copyright (C), 2017-2022
 * Author: BalconyJH
 * Date: 4/28/2022 6:01 PM
 * FileName: AiService
 * Description: phone
 */


package com.balconyjhtest.homework;

import java.util.Scanner;

public class AiService {
    public static void main(String[] args) {
        System.out.println("当前拨入的区号是：");
        Scanner scanner = new Scanner(System.in);
        String areaCode = scanner.nextLine();
        if (areaCode.equals("86")) {
            Chinese.voice();
        } else if (areaCode.equals("33")) {
            French.voice();
        } else {
            Other.voice();
        }
        scanner.close();
    }
}

interface Language {
    static void voice() {
    }
}

class Chinese implements Language {
    public static void voice() {
        System.out.println("您好，有什么可以帮助您？");
    }
}

class French implements Language {
    public static void voice() {
        System.out.println("Bonjour, comment pouvons-nous vous aider?");
    }
}

class Other implements Language {
    public static void voice() {
        System.out.println("Hello, May help you?");
    }
}