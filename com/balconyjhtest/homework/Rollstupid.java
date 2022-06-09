package com.balconyjhtest.homework;

import java.util.ArrayList;
import java.util.List;


public class Rollstupid {

    private static final int THIRD_NUM = 3;
    private static final int SECOND_NUM = 2;
    private static final int FIRST_NUM = 1;

    public static void main(String[] args) {
        List<Integer> person = new ArrayList<>();
        List<String> third = new ArrayList<>();
        List<String> second = new ArrayList<>();
        List<String> first = new ArrayList<>();

        myLotteryDraw(person, third, THIRD_NUM);
        myLotteryDraw(person, second, SECOND_NUM);
        myLotteryDraw(person, first, FIRST_NUM);

        System.out.println("三等奖: ");
        myPrint(third);
        System.out.println();

        System.out.println("二等奖: ");
        myPrint(second);
        System.out.println();

        System.out.println("一等奖: ");
        myPrint(first);
        System.out.println();
    }

    private static void myPrint(List<String> stringList) {
        for (var str : stringList) {
            System.out.print(str + "\t");
        }
    }

    private static void myLotteryDraw(List<Integer> person, List<String> stringList, int nums) {
        while (stringList.size() < nums) {
            int id = (int) (Math.ceil(Math.random() * 50));
            if (person.contains(id)) continue;
            person.add(id);
            stringList.add(Integer.toString(id));
        }
    }
}
