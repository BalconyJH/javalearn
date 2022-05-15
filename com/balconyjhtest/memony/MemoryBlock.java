/**
 * Copyright (C), 2017-2022
 * Author: BalconyJH
 * Date: 5/9/2022 4:15 PM
 * FileName: test01
 * Description: memory
 */


package com.balconyjhtest.memony;


public class MemoryBlock {

    private int startAddress;        //内存块的起始地址(16进制表示)
    private int size;                //内存块大小(16进制表示)
    private String id;                //内存块标识符，当内存块已分配时，id为进程名称，未分配时为unused

    public MemoryBlock() {

    }

    public MemoryBlock(int startAddress, int size, String id) {
        super();
        this.startAddress = startAddress;
        this.size = size;
        this.id = id;
    }


    public int getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(int startAddress) {
        this.startAddress = startAddress;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MemoryBlock [startAddress=0x" + Integer.toHexString(startAddress) + ", size=" + size + "KB, id=" + id + "]";
    }
}
