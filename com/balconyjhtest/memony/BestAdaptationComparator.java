/**
 * Copyright (C), 2017-2022
 * Author: BalconyJH
 * Date: 5/9/2022 4:25 PM
 * FileName: BestAdaptationComparator
 * Description:
 */


package com.balconyjhtest.memony;

import java.util.Comparator;

//最佳适应算法的排序器，将空闲分区按容量从小到大排序
public class BestAdaptationComparator implements Comparator<MemoryBlock> {
    @Override
    public int compare(MemoryBlock mb1, MemoryBlock mb2) {
        return mb1.getSize() - mb2.getSize();
    }
}

