/**
 * Copyright (C), 2017-2022
 * Author: BalconyJH
 * Date: 5/9/2022 4:28 PM
 * FileName: Demo
 * Description:
 */


package com.balconyjhtest.memony;

import java.util.Comparator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Memory memory = new Memory();

        int order;
        Scanner sc = new Scanner(System.in);
        Menu.showMenu();
        order = sc.nextInt();
        while (order != 0) {
            switch (order) {
                case 1 -> {
                    System.out.println("============内存空间如下：============");
                    memory.MemoryStatus(new FirstAdaptionComparator());
                    Menu.showMenu();
                    order = sc.nextInt();
                }
                case 2 -> {
                    System.out.print("请输入阈值（默认值为100KB）：");
                    Memory.threshold = sc.nextInt();
                    System.out.println("阈值修改成功，现阈值为：" + Memory.threshold + "KB");
                    Menu.showMenu();
                    order = sc.nextInt();
                }
                case 3 -> {
                    Menu.showSelectedAlgorithm();
                    System.out.println("请选择使用的算法：");
                    Memory.selectedAlgorithm = sc.nextInt();
                    boolean flag = true;
                    String exit;
                    while (flag) {
                        Comparator<MemoryBlock> comparator = null;
                        switch (Memory.selectedAlgorithm) {
                            case 1 -> comparator = new FirstAdaptionComparator();
                            case 2 -> comparator = new CircleFirstAdaptionComparator();
                            case 3 -> comparator = new WorstAdaptionComparator();
                            case 4 -> comparator = new BestAdaptationComparator();
                            default -> System.out.println("请输入合法的序号命令！");
                        }
                        memory.MemoryStatus(comparator);
                        System.out.print("请输入进程名称：");
                        String programName = sc.next();
                        System.out.print("请输入进程内存大小（单位为KB）：");
                        int size = sc.nextInt();
                        memory.AllocationAlgorithm(programName, size);
                        memory.MemoryStatus(comparator);
                        System.out.print("是否继续添加进程？（T/F）");
                        exit = sc.next();
                        if (!(exit.equals("t") || exit.equals("T"))) {
                            flag = false;
                        }

                    }
                    Menu.showMenu();
                    order = sc.nextInt();
                }
                case 4 -> {
                    System.out.print("请输入要回收内存的进程名称：");
                    String programName = sc.next();
                    memory.RecoveryAlgorithm(programName);
                    System.out.println("是否继续回收内存？（T/F）");
                    String tmp = sc.next();
                    if (!(tmp.equals("t") || tmp.equals("T"))) {
                        Menu.showMenu();
                        order = sc.nextInt();
                    }
                }
                case 0 -> {
                    System.out.println("程序正常退出！");
                    return;
                }
                default -> {
                    System.out.println("请输入合法的序号命令！");
                    Menu.showMenu();
                    order = sc.nextInt();
                }
            }
        }
        sc.close();
    }
}