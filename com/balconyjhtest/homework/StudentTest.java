/**
 * Copyright (C), 2017-2022
 * Author: BalconyJH
 * Date: 4/21/2022 9:02 PM
 * FileName: Demo01
 * Description: test
 */


package com.balconyjhtest.homework;

public class StudentTest {
    public static void main(String[] args) {
        System.out.println("=====studentinfo=====");
        var student = new Student("Tom", "2009001", 22);
        student.printMsg();
        ;
        student.setAge(26);
        student.setSname("Jack");
        student.printMsg();
        System.out.println("=====collegestudentinfo======");
        var cstudent = new CollegeStudent();
        cstudent.setSname("Jerry");
        cstudent.setSno("2009002");
        cstudent.setAge(23);
        cstudent.setMajor("软件开发");
        cstudent.printMsg();
    }
}

class Student {
    private String sname;
    private String sno;
    private int age;

    public Student() {
    }

    public Student(String sname, String sno, int age) {
        this.sname = sname;
        this.sno = sno;
        this.age = age;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printMsg() {
        System.out.println("学号：" + sno + "，姓名：" + sname + "，年龄：" + age);
    }
}


class CollegeStudent extends Student {
    private String major;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void printMsg() {
        System.out.println("学号：" + getSno() + "，姓名：" + getSname() + "，年龄：" + getAge());
    }
}
