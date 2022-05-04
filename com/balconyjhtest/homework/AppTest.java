/**
 * Copyright (C), 2017-2022
 * Author: BalconyJH
 * Date: 4/28/2022 5:24 PM
 * FileName: Demo01
 * Description: demo
 */


package com.balconyjhtest.homework;


public class AppTest {
    public static void main(String[] args) {
        C c = new C();
        c.display();
        c.draw();
        System.out.println("\n以下是使用抽象类引用、接口变量调用方法的结果：\n");
        A a = new C();
        a.display();
        //声明接口变量b，并将c赋给b
        C b = new C();
        b.draw();
    }

    static class A {
        public void display() {
            System.out.println("A.display()");
        }
    }

    interface B {
        static void display() {
            System.out.println("C.display()");
        }
    }

    static class C extends A implements B {
        public void display() {
            System.out.println("C.display()");
        }

        public void draw() {
            System.out.println("C.draw()");
        }
    }
}