package com.itranswarp.sample;

class demo {
    public static void main(String[] args) {
        // 一张纸的厚度是0.08毫米，对折多少次达到珠穆朗玛峰的高度8848米。
        int count = 0;
        int end = 884800;
        int start = 8;
        while(start<=end) {
            count++;
            start *= 2;
        }
        System.out.println("要叠"+count+"次");
    }
}