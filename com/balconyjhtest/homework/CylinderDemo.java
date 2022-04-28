///**
// * Copyright (C), 2017-2022
// * Author: BalconyJH
// * Date: 4/21/2022 3:02 PM
// * FileName: Demo01
// * Description: test
// */
//
//
////        （1）基类：Circle类，它封装了：
////        一个成员变量：
////        radius                  //半径
////        六个成员方法：
////        Circle()               //将半径置为0
////        Circle(double r)               //创建Circle对象时将半径初始化为r
////        double getRadius()    //获得圆的半径值
////        double getPerimeter()   //获得圆的周长
////        double gerArea()    //获得圆的面积
////        void disp()       //将圆的半径、周长、面积输出到屏幕
////        （2）派生类∶圆柱体类Cylinder，它新增了∶
////        一个成员变量∶
////        height
////        四个方法成员∶
////        Cylinder(double r,double h)  //创建Cylinder 对象时将圆半径初始化为r，圆柱高初始化为h
////        double getHeight() //获得圆柱体的高
////        double getVol()  //获得圆柱体的体积
////        void dispVol() //将圆柱体的体积输出到屏幕
////        要求：使用构造方法设置圆柱体的底面半径为5，高为2，显示圆柱体的底面半径，底面周长，底面面积及圆柱体体积
//
//package com.balconyjhtest.homework;
//
//
//class Circle {
//    private final double radius;
//
//    public Circle() {
//        radius = 0;
//    }
//
//    public Circle(double r) {
//        radius = r;
//    }
//
//    public double getRadius() {
//        return radius;
//    }
//
//    public double getPerimeter() {
//        return 2 * Math.PI * radius;
//    }
//
//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//
//    public void disp() {
//        System.out.println("圆的半径为：" + radius);
//        System.out.println("圆的周长为：" + getPerimeter());
//        System.out.println("圆的面积为：" + getArea());
//    }
//}
//
//class Cylinder extends Circle {
//    private final double height;
//
//    public Cylinder(double r, double h) {
//        super(r);
//        height = h;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public double getVol() {
//        return getArea() * height;
//    }
//
//    public void dispVol() {
//        System.out.println("圆柱体的底面半径为：" + getRadius());
//        System.out.println("圆柱体的底面周长为：" + getPerimeter());
//        System.out.println("圆柱体的底面面积为：" + getArea());
//        System.out.println("圆柱体的体积为：" + getVol());
//    }
//}
//
//
//public class CylinderDemo {
//    public static void main(String[] args) {
//        Cylinder c = new Cylinder(5, 2);
//        c.dispVol();
//    }
//}
