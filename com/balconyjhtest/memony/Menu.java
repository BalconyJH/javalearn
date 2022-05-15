/**
 * Copyright (C), 2017-2022
 * Author: BalconyJH
 * Date: 5/9/2022 4:28 PM
 * FileName: Menu
 * Description:
 */


package com.balconyjhtest.memony;

public class Menu {

    public static void showMenu() {
        System.out.println("=======模拟内存管理，实现内存块的分配与回收=======");
        System.out.println("1.查看内存空间分配情况");
        System.out.println("2.设置阈值（默认阈值为100KB）");
        System.out.println("3.分配内存");
        System.out.println("4.回收内存");
        System.out.println("0.退出");
    }

    public static void showSelectedAlgorithm() {
        System.out.println("===========请选择使用的分配算法配与回收===========");
        System.out.println("1.首次适应算法");
        System.out.println("2.循环首次适应算法");
        System.out.println("3.最坏适应算法");
        System.out.println("4.最佳适应算法");
    }

}