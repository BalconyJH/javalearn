/**
 * Copyright (C), 2017-2022
 * Author: BalconyJH
 * Date: 4/22/2022 2:35 AM
 * FileName: Animal
 * Description: homework
 */


//3.	定义一个动物类Animal,有成员方法void voice()，再定义两个子类：狗类Dog和猫类Cat，在子类中自行重写成员方法voice()实现其功能。当调用格式如下时，分别实现其输出信息：
//        Dog doggie=new Dog();
//        doggie.voice();//输出信息：“汪汪”
//        Cat kitty=new Cat();
//        kitty.voice();//输出信息：“喵喵”


package com.balconyjhtest.homework;

class animal {
    public void voice() {
        System.out.println("default voice");
    }
}


class Dog extends animal {
    public void voice() {
        System.out.println("汪汪");
    }
}

class Cat extends animal {
    public void voice() {
        System.out.println("喵喵");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Dog doggie = new Dog();
        doggie.voice();//输出信息：“汪汪”
        Cat kitty = new Cat();
        kitty.voice();//输出信息：“喵喵”
    }
}