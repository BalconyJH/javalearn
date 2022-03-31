package com.balconyjhtest.homework;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[][] myArray = new int[2][3];
        myArray[0] = new int[5];
        myArray[1] = new int[10];
        for (int j = 0; j < myArray[0].length; j++) {
            myArray[0][j] = (int) (Math.random() * 10);
        }
        for (int j = 0; j < myArray[1].length; j++) {
            myArray[1][j] = (int) (Math.random() * 101 + 100);
        }
        for (int[] ints : myArray) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}
