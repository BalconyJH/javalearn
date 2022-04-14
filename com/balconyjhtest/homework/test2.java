package com.balconyjhtest.homework;


import java.util.ArrayList;
import java.util.List;

//定义一个学生类Student。
//        （1）实例变量
//        String sno;    //学生学号
//        String sname;  //学生姓名
//        int math,chinese ;  //数学和语文成绩
//        （2）实例方法
//        Student(String sno, String sname, int math, int chinese); //有参构造方法
//        String getSno();
//        void setSno(String sno);
//        String getSname();
//        void setSname(String sname);
//        int getMath();
//        void setMath(int math);
//        int getChinese();
//        void setChinese(int chinese);
//定义一个计数变量，用来统计当前共创建了多少个对象。


public class test2 {
    public static void main(String[] args) {
        // (1) 定义一个计数变量,用来统计当前共创建了多少个对象.
        int objectCreateCount = 0;
        // (2) 使用数组存放3个学生对象
        List<Student> studentList = new ArrayList<>();
        String[] snos = new String[]{"202011101", "202011102", "202011103"};
        String[] snames = new String[]{"jack", "tom", "lucy"};
        int[] maths = new int[]{98, 83, 92};
        int[] chineses = new int[]{88, 95, 78};

        for (int i = 0; i < snos.length; i++) {
            Student student = new Student(snos[i], snames[i], maths[i], chineses[i]);
            objectCreateCount += 1;
            studentList.add(student);
        }

        // (3) 输出所有学生信息并输出分数最高的学生信息
//        Student studentTemp = null;
        Student studentTemp = null;
        int scoreSum = 0;
        System.out.println("当前创建对象个数: " + objectCreateCount);
        for (Student student :
                studentList) {

            int sum = student.getChinese() + student.getMath();
            if (sum > scoreSum) {
                scoreSum = sum;
                studentTemp = student;
            }

            System.out.println("学号: " + student.getSno()
                    + "， 姓名: " + student.getSname()
                    + "， 数学: " + student.getMath()
                    + "， 语文: " + student.getChinese());
        }
        assert studentTemp != null;
        System.out.println("总分最高是: "
                + studentTemp.getSno() + ","
                + studentTemp.getSname() + ","
                + scoreSum);
    }
}

class Student {
    public String sno;
    public String sname;
    public int math, chinese;

    public Student(String sno, String sname, int math, int chinese) {
        this.sno = sno;
        this.sname = sname;
        this.math = math;
        this.chinese = chinese;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }
}