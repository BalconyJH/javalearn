/**
 * Copyright (C), 2017-2022
 * Author: BalconyJH
 * Date: 4/28/2022 5:47 PM
 * FileName: Demo02
 * Description: demo
 */


package com.balconyjhtest.homework;


// （1）Shape接口中有一个抽象方法area()，方法接收有一个double类型的参数，返回一个double类型的结果；
// （2）Square和Circle中实现了Shape接口的area()抽象方法，分别求正方形和圆形的面积并返回。
//  在测试类ShapeTest中创建Shape的引用指向Square和Circle对象，计算边长为2的正方形面积和半径为3的圆形面积。

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Square(2);
        System.out.println(shape.area());
        shape = new Circle(3);
        System.out.println(shape.area());
    }
}

interface Shape {
    double area();
}

class Square implements Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
