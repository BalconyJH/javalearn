package com.balconyjhtest.homework;

class DateTest {
    public static void main(String[] args) {
        DateT d1 = new DateT(6, 4, 2022);
        d1.isLeapYear();
        d1.setDate(7, 4, 2022);
        d1.isLeapYear();
    }
}


public class DateT {
    private int year;
    private int month;
    private int day;

    public DateT(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void isLeapYear() {
        System.out.print(this.day + "/" + this.month + "/" + this.year);
        if (this.year % 4 == 0 && this.year % 100 != 0 || this.year % 400 == 0) {
            System.out.println("是闰年");
        } else {
            System.out.println("不是闰年");
        }
    }
}