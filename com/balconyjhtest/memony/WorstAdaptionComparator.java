/**
 * Copyright (C), 2017-2022
 * Author: BalconyJH
 * Date: 5/9/2022 4:23 PM
 * FileName: WorstAdaptionComparator
 * Description:
 */


package com.balconyjhtest.memony;

import java.util.Comparator;

//最坏适应算法的排序器，将空闲分区按容量从大到小排序
public class WorstAdaptionComparator implements Comparator<MemoryBlock> {
    @Override
    public int compare(MemoryBlock mb1, MemoryBlock mb2) {
        return mb2.getSize() - mb1.getSize();
    }
}

