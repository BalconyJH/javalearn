/**
 * Copyright (C), 2017-2022
 * Author: BalconyJH
 * Date: 5/9/2022 4:18 PM
 * FileName: test
 * Description:
 */


package com.balconyjhtest.memony;


import java.util.ArrayList;
import java.util.Comparator;

public class Memory {

    public static int threshold = 100;                    //阈值默认为100KB
    public static int selectedAlgorithm = 1;            //选择使用的算法，默认是首次适应算法
    private final ArrayList<MemoryBlock> usedMemoryBlockList;            //已使用的内存分配表
    private final ArrayList<MemoryBlock> unusedMemoryBlockList;        //未使用的内存分配表
    private int lastVisited;                //记录上次访问的空闲分区地址

    //初始化内存分配表
    public Memory() {
        usedMemoryBlockList = new ArrayList<>();
        unusedMemoryBlockList = new ArrayList<>();

        //已使用的内存分配表
        //十进制：起始地址为0，内存大小为500KB
        usedMemoryBlockList.add(new MemoryBlock(0x0, 500, "programA"));
        //十进制：起始地址为1000，内存大小为200KB
        usedMemoryBlockList.add(new MemoryBlock(0x3e8, 200, "programB"));
        //十进制：起始地址为1200，内存大小为800KB
        usedMemoryBlockList.add(new MemoryBlock(0x4b0, 800, "programC"));
        //十进制，起始地址为2300，内存大小为700KB
        usedMemoryBlockList.add(new MemoryBlock(0x8fc, 700, "programD"));

        //未使用的内存分配表
        //十进制：起始地址为500，内存大小为500KB
        unusedMemoryBlockList.add(new MemoryBlock(0x1f4, 500, "unused"));
        //十进制：起始地址为2000，内存大小为300KB
        unusedMemoryBlockList.add(new MemoryBlock(0x7d0, 300, "unused"));
        //十进制，起始地址为3000，内存大小为1000KB
        unusedMemoryBlockList.add(new MemoryBlock(0xbb8, 1000, "unused"));
    }

    //显示内存分配情况
    public void MemoryStatus(Comparator<MemoryBlock> comparator) {
        //将分配表排序
        usedMemoryBlockList.sort(new FirstAdaptionComparator());
        unusedMemoryBlockList.sort(comparator);
        System.out.println("==========已分配的内存分配表==========");
        System.out.println(" 基址                      大小                      进程名");
        for (MemoryBlock memoryBlock : usedMemoryBlockList) {
            System.out.println("0x" + Integer.toHexString(memoryBlock.getStartAddress()) + "\t\t" + memoryBlock.getSize() + " \t\t" + memoryBlock.getId());
        }
        System.out.println("==========未使用的内存分配表==========");
        System.out.println(" 基址                      大小                      进程名");
        for (MemoryBlock memoryBlock : unusedMemoryBlockList) {
            System.out.println("0x" + Integer.toHexString(memoryBlock.getStartAddress()) + "\t\t" + memoryBlock.getSize() + " \t\t" + memoryBlock.getId());
        }

        //使用一个列表存储整个内存表的分配情况
        System.out.println("===========整个内存分配情况===========");
        ArrayList<MemoryBlock> list = new ArrayList<>();
        list.addAll(usedMemoryBlockList);
        list.addAll(unusedMemoryBlockList);
        list.sort(new FirstAdaptionComparator());
        System.out.println(" 基址                      大小                      进程名");
        for (MemoryBlock memoryBlock : list) {
            System.out.println("0x" + Integer.toHexString(memoryBlock.getStartAddress()) + "\t\t" + memoryBlock.getSize() + " \t\t" + memoryBlock.getId());
        }
    }

    //四种内存分配算法的实现
    public void AllocationAlgorithm(String programName, int size) {

        if (unusedMemoryBlockList.size() == 0) {
            System.out.println("【内存已满！请先释放资源再进行分配！】");
            return;
        }

        //判断是否存在适合分配的内存块
        boolean flag = false;

        switch (selectedAlgorithm) {
            case 1 ->            //首次适应算法
                    unusedMemoryBlockList.sort(new FirstAdaptionComparator());
            case 2 -> {            //循环首次适应算法
                unusedMemoryBlockList.sort(new CircleFirstAdaptionComparator());
                int tmp = unusedMemoryBlockList.size();
                int j = lastVisited;    //上次访问的空闲分区地址

                //循环首次适应需要记录上一次分配的地址，故另写算法过程
                for (int i = 0; i < 2; i++) {
                    //循环2次，确保每个空闲分区都有被访问到，第一次循环从上一次访问的空闲分区开始
                    for (; j < unusedMemoryBlockList.size(); j++) {
                        MemoryBlock block = unusedMemoryBlockList.get(j);
                        if (block.getSize() >= size) {
                            //判断装下程序后剩余的空间是否再进行切割，当剩余空间小于阈值时，不再进行切割
                            if (block.getSize() - size <= threshold) {
                                usedMemoryBlockList.add(new MemoryBlock(block.getStartAddress(), block.getSize(), programName));
                            } else {
                                usedMemoryBlockList.add(new MemoryBlock(block.getStartAddress(), size, programName));
                                unusedMemoryBlockList.add(new MemoryBlock(block.getStartAddress() + size, block.getSize() - size, "unused"));
                            }
                            flag = true;
                            unusedMemoryBlockList.remove(j);
                            //判断移除空闲分区后是否还有空闲分区或者下次访问地址是否会越界，如果是，则将上次访问地址指向0
                            if (unusedMemoryBlockList.isEmpty() || unusedMemoryBlockList.size() != tmp) {
                                lastVisited = 0;
                            } else {
                                lastVisited = j;
                            }
                            if (flag == false) {
                                System.out.println("【无满足分配的内存块！】");
                            } else {
                                System.out.println("【进程：" + programName + "  内存：" + size + "KB  已成功分配！】");
                            }
                            return;
                        }
                    }
                    j = 0;
                }
                if (flag == false) {
                    System.out.println("【无满足分配的内存块！】");
                } else {
                    System.out.println("进程：" + programName + "  内存：" + size + "KB  已成功分配！");
                }
                return;
            }
            case 3 ->            //最坏适应算法
                    unusedMemoryBlockList.sort(new WorstAdaptionComparator());
            case 4 ->            //最佳适应算法
                    unusedMemoryBlockList.sort(new BestAdaptationComparator());
            default -> {
                System.out.println("【请输入正确的序号！】");
                return;
            }
        }

        //除循环首次适应之外的三种算法实现
        for (int i = 0; i < unusedMemoryBlockList.size(); i++) {
            MemoryBlock block = unusedMemoryBlockList.get(i);
            //判断该空闲分区的容量是否能够装下请求的程序
            if (block.getSize() >= size) {
                //判断装下程序后剩余的空间是否再进行切割，当剩余空间小于阈值时，不再进行切割
                if (block.getSize() - size <= threshold) {
                    usedMemoryBlockList.add(new MemoryBlock(block.getStartAddress(), block.getSize(), programName));
                } else {
                    usedMemoryBlockList.add(new MemoryBlock(block.getStartAddress(), size, programName));
                    unusedMemoryBlockList.add(new MemoryBlock(block.getStartAddress() + size, block.getSize() - size, "unused"));
                }
                flag = true;
                unusedMemoryBlockList.remove(i);
                break;
            }
        }

        if (!flag) {
            System.out.println("【无满足分配的内存块！】");
        } else {
            System.out.println("进程：" + programName + "  内存：" + size + "KB  已成功分配！");
        }

    }

    //内存回收算法
    public void RecoveryAlgorithm(String programName) {
        //判断内存中是否存在该进程
        boolean isExist = false;
        //记录进程所在的位置
        int index = 0;
        for (MemoryBlock memoryBlock : usedMemoryBlockList) {
            if (memoryBlock.getId().equals(programName)) {
                isExist = true;
                index = usedMemoryBlockList.indexOf(memoryBlock);
            }
        }
        if (!isExist) {
            System.out.println("【内存中不存在该进程！】");
            return;
        }

        /*
         * 内存回收分为四种情况
         * 1、要回收的内存与前一个空闲分区相邻
         * 2、要回收的内存与后一个空闲分区相邻
         * 3、要回收的内存同时与前后两个内存块相邻
         * 4、要回收的内存块不与任何内存块相邻
         */

        boolean isPrior = false;    //是否与前一个空闲分区相邻
        boolean isNext = false;        //是否与后一个空闲分区相邻
        int priorIndex = 0;            //记录前邻空闲分区的位置
        int nextIndex = 0;            //记录后邻空闲分区的位置

        MemoryBlock block = usedMemoryBlockList.get(index);

        //判断是否与空闲分区相邻
        for (MemoryBlock memoryBlock : unusedMemoryBlockList) {
            //判断是否与前一个空闲分区相邻，判断方法为是否存在一个空闲分区基址 + 内存大小 = 要回收内存的内存块基址
            if (memoryBlock.getStartAddress() + memoryBlock.getSize() == block.getStartAddress()) {
                isPrior = true;
                priorIndex = unusedMemoryBlockList.indexOf(memoryBlock);
            }
            //判断是否与后一个空闲分区相邻，判断方法为是否存在一个空闲分区基址 = 要回收内存的内存块基址 + 要回收内存的内存块大小
            if (block.getStartAddress() + block.getSize() == memoryBlock.getStartAddress()) {
                isNext = true;
                nextIndex = unusedMemoryBlockList.indexOf(memoryBlock);
            }
        }

        //内存回收分为四种情况
        if (isPrior && !isNext) {                //1、要回收的内存与前一个空闲分区相邻

            MemoryBlock priorBlock = unusedMemoryBlockList.get(priorIndex);
            usedMemoryBlockList.remove(index);        //移除回收内存
            priorBlock.setSize(priorBlock.getSize() + block.getSize());  //将前一个空闲分区扩张

        } else if (!isPrior && isNext) {            //2、要回收的内存与后一个空闲分区相邻

            MemoryBlock nextBlock = unusedMemoryBlockList.get(nextIndex);
            usedMemoryBlockList.remove(index);
            nextBlock.setSize(nextBlock.getSize() + block.getSize());  //将后一个空闲分区扩张
            nextBlock.setStartAddress(nextBlock.getStartAddress() - block.getSize()); //修改后一个空闲分区的基址

        } else if (isPrior) {            //3、要回收的内存同时与前后两个空闲分区相邻

            MemoryBlock priorBlock = unusedMemoryBlockList.get(priorIndex);
            MemoryBlock nextBlock = unusedMemoryBlockList.get(nextIndex);
            int nextSize = nextBlock.getSize();
            unusedMemoryBlockList.remove(nextIndex);  //移除后一个空闲分区
            usedMemoryBlockList.remove(index);        //移除回收内存
            priorBlock.setSize(priorBlock.getSize() + block.getSize() + nextSize);    //将前一个空闲分区扩张

        } else {            //4、要回收的内存块不与任何空闲分区相邻

            usedMemoryBlockList.remove(index);        //移除回收内存
            //在空闲内存中表中新增一项
            unusedMemoryBlockList.add(new MemoryBlock(block.getStartAddress(), block.getSize(), "unused"));

        }
        System.out.println("进程【" + block.getId() + "】释放，内存回收成功！");
        MemoryStatus(new FirstAdaptionComparator());
    }
}
