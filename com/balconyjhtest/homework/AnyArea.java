package com.balconyjhtest.homework;

public class AnyArea {
    public static void main(String[] args) {
        new getArea(5);
        new getArea(2, 3);
        new getArea(2, 3, 4);
    }
}

class getArea {
    public getArea(float r) {
        System.out.println(Math.PI * r * r);
    }

    public getArea(float w, float h) {
        System.out.println(w * h);
    }

    public getArea(float h, float b1, float b2) {
        System.out.println((b1 + b2) * h / 2);
    }
}