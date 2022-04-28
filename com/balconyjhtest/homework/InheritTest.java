/**
 * Copyright (C), 2017-2022
 * Author: BalconyJH
 * Date: 4/28/2022 11:53 AM
 * FileName: InheritTest.java
 * Description: sb
 */


package com.balconyjhtest.homework;


public class InheritTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(10, 25, 5.5f);
        System.out.println(c1.toString());
        Circle c2 = new Circle(10, 25, 5.5f);
        System.out.println(c1.equals(c2));
    }
}

class Point {
    private int x;
    private int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

class Circle extends Point {
    private float radius;

    public Circle() {
        super();
        radius = 0;
    }

    public Circle(int x, int y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    public float getPerimeter() {
        return (float) (2 * Math.PI * radius);
    }

    public String toString() {
        return "圆点(" + getX() + "," + getY() + ")，半径：" + getRadius() + "，周长：" + getPerimeter() + "，面积：" + getArea();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Circle c) {
            return c.getX() == getX() && c.getY() == getY() && c.getRadius() == getRadius();
        }
        return false;
    }
}

