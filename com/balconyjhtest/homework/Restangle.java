package com.balconyjhtest.homework;

public class Restangle {
    // 成员变量 
    private float width, length;

    // 构造方法
    public void getWidth() {
    }

    public void getLength() {
    }

    public void getArea() {
        System.out.println("面积为：" + width * length);
    }

    public void getPerimeter() {
        System.out.println("周长为：" + (width + length) * 2);
    }

    public void setWidth(float w) {
        this.width = w;
        System.out.println("设置宽度为：" + w);
    }

    public void setLength(float l) {
        this.length = l;
        System.out.println("设置长度为：" + l);
    }

    public static void main(String[] args) {
        var r = new Restangle();
        r.setLength(5f);
        r.setWidth(8f);
        r.getArea();
        r.getPerimeter();
        r.getLength();
        r.getWidth();
    }
}