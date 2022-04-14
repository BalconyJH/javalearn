package com.balconyjhtest.homework;

public class TestCourse {
    public static void main(String[] args) {
        Course course = new Course(419001, "c语言程序设计", 4, "张三");
        Course course1 = new Course(419002, "数据结构", 4, "李四");
        Course course2 = new Course(419003, "计算机组成原理", 3, "王五");
        Course course3 = new Course(419004, "Java语言程序设计", 4, "赵六");
        Course course4 = new Course(419005, "计算机操作系统", 4, "钱七");
        System.out.println(course.toString());
        System.out.println(course1.toString());
        System.out.println(course2.toString());
        System.out.println(course3.toString());
        System.out.println(course4.toString());
    }
}
