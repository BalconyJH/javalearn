/**
 * Copyright (C), 2017-2022
 * Author: BalconyJH
 * Date: 5/15/2022 3:46 PM
 * FileName: teat01
 * Description:
 */


package com.balconyjhtest.homework;


import java.util.Scanner;

// 在控制台提示输入1-3之间任一个数字，程序将输出相应的课程名称。
public class ClassTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// (1)根据键盘输入进行判断，1输出Java语言程序设计，2输出C语言程序设计，3输出Python语言程序设计。
// (2)如果有错误，给出异常提示及异常信息。要求：输入范围不在1-3之间抛出“超出范围”异常，处理异常并给出异常信息；输入不匹配异常及其他异常，处理异常并给出异常信息。
// (3)不管输入是否正确，均输出“欢迎提出建议”。
        try {
            int[] arr = {1, 2, 3};
            System.out.println("请输入1-3之间的数字：");
            int num = sc.nextInt();
            int x = arr[num - 1];
            switch (num) {
                case 1 -> System.out.println("Java语言程序设计");
                case 2 -> System.out.println("C语言程序设计");
                case 3 -> System.out.println("Python语言程序设计");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("欢迎提出建议");
        }
        sc.close();
    }
}

