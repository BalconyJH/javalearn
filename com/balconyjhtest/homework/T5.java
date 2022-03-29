package com.balconyjhtest.homework;

import java.util.Scanner;

public class T5 {
//    4、猜数字游戏。
//            （1）生成一个100以内的随机数。
//            （2）从键盘输入一个整数。
//            （3）根据输入的整数和随机数作比较，如果猜对了，提示“恭喜您，猜对了！”，如果不对，提示猜大了或是猜小了，接着猜数字，直到猜对为止。
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        System.out.println("number=" + number);
        int guess;
        while (true) {
            System.out.print("guess=");
            Scanner scanner = new Scanner(System.in);
            guess = scanner.nextInt();
            if (guess == number) {
                System.out.println("恭喜您，猜对了！");
                break;
            } else if (guess > number) {
                System.out.println("猜大了！");
            } else {
                System.out.println("猜小了！");
            }
        }
    }
}
