package com.balconyjhtest.homework;

import java.util.ArrayList;

public class Rollstupid {
    public static void main(String[] args) {
        // 从编号为0-50的学生中随机产生一等奖1名，二等奖2名，三等奖3名，不重复，抽奖顺序为三等奖，二等奖，一等奖
        ArrayList<String> all = new ArrayList<String>();
        ArrayList<String> third = new ArrayList<String>();
        ArrayList<String> second = new ArrayList<String>();
        ArrayList<String> first = new ArrayList<String>();
        String string;

        for (int i = 0; i < 50; i++) {
            if (i < 10) {
                string = "00" + (int)(i);
            } else {
                string = "0" + (int)(i);
            }
            all.add(string);
        }
        String students;
        for(int i = 1; i <= 3; i++) {
            for(int j = 0; j < i; j++) {
                int test = (int)all.get((int)(Math.random() * 50));
                if
            }
        }
        
    }
}

