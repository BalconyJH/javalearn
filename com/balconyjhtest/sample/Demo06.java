/**
 * Copyright (C), 2017-2022
 * Author: BalconyJH
 * Date: 4/24/2022 8:41 AM
 * FileName: Demo06
 * Description: test
 */


package com.balconyjhtest.sample;

public class Demo06 {
    public static void main(String[] args) {
        int[][] a1 = new int[11][11];
        a1[1][2] = 1;
        a1[2][3] = 2;
        for (int[] ints : a1) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        // 稀疏数组
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (a1[i][j] != 0) {
                    sum++;
                }
            }
        }
        System.out.println("nonull" + sum);
    }
}
