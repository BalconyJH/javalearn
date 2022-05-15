package com.balconyjhtest.sample;

import java.util.Random;
import java.util.Scanner;

public class Paperscissorsrock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 猜拳: ");
        String uinput = scanner.nextLine();
        int opt = switch (uinput) {
            case "布" -> 1;
            case "石头" -> 2;
            case "剪刀" -> 3;
            default -> 0;
        };
        //user uinput
        Random rand = new Random();
        int pinput = rand.nextInt(3) + 1;
        //computer pinput
        int result = opt - pinput;
        switch (result) {
            case 1, -2 -> System.out.println("电脑获胜");
            case 2, -1 -> System.out.println("玩家获胜");
            case 0 -> System.out.println("平局");
            default -> System.out.println("输入错误");
        }
        scanner.close();
    }
}
