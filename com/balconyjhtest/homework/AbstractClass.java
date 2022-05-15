package com.balconyjhtest.homework;

public class AbstractClass {
    public static void main(String[] args) {
        Animal animal1 = new dog("德国黑贝");
        Animal animal2 = new cat("波斯猫");
        dog.show();
        animal1.talk();
        cat.show();
        animal2.talk();
        }
    }


abstract class Animal {
    private static String type;
    public static void show() {
        System.out.println("Animal");
    }
    public abstract void talk();
}

class dog extends Animal {
    private static String name;
    public dog(String name) {
        dog.name = name;
    }
    public static void show() {
        System.out.println("此动物属于犬科动物，名字是" + name);
    }
    public void talk() {
        System.out.println("叫声是汪汪");
    }
    
}

class cat extends Animal {
    private static String name;
    public cat(String name) {
        cat.name = name;
    }
    public static void show() {
        System.out.println("此动物属于猫科动物，名字是" + name);
    }
    public void talk() {
        System.out.println("叫声是喵喵");
    }
}

