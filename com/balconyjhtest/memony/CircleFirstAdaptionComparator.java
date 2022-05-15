/**
 * Copyright (C), 2017-2022
 * Author: BalconyJH
 * Date: 5/9/2022 4:27 PM
 * FileName: CircleFirstAdaptionComparator
 * Description:
 */


package com.balconyjhtest.memony;

import java.util.Comparator;

//循环首次适应排序器，将空闲分区按地址从小到大排序
public class CircleFirstAdaptionComparator implements Comparator<MemoryBlock> {
    @Override
    public int compare(MemoryBlock mb1, MemoryBlock mb2) {
        return mb1.getStartAddress() - mb2.getStartAddress();
    }
}

