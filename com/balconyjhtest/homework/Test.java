/**
 * Copyright (C), 2017-2022
 * Author: BalconyJH
 * Date: 5/15/2022 3:47 PM
 * FileName: dedmo
 * Description:
 */


package com.balconyjhtest.homework;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = {1, 2, 3};
            System.out.println("请输入数组的下标：");
            int index = sc.nextInt();
            System.out.println(arr[index]);
            System.out.println("请输入除数：");
            int x = sc.nextInt();
            int y = 4 / x;
            System.out.println("y=" + y);
        } catch (ArithmeticException e) {  //算术异常处理
            //使用getMessage打印异常信息
            System.out.println(e.getMessage());
            //异常处理：产生算术异常，程序结束。finally执行
        } catch (ArrayIndexOutOfBoundsException e) {//数组下标越界异常处理
            //使用toString打印异常信息
            System.out.println(e);
            //异常处理：产生数组下标越界异常，程序退出。finally不执行
        } catch (Exception e) { //其他异常处理
            //使用printStackTrace打印异常信息
            e.printStackTrace();
        } finally {
            System.out.println("程序执行完毕！");
        }
    }
}