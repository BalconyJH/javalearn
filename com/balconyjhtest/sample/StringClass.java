package com.balconyjhtest.sample;

public class StringClass {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "HELLO";
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equals(s2));
    }
}
