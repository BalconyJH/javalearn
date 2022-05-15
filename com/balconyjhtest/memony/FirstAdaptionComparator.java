/**
 * Copyright (C), 2017-2022
 * Author: BalconyJH
 * Date: 5/9/2022 4:20 PM
 * FileName: FirstAdaptionComparator
 * Description:
 */


package com.balconyjhtest.memony;

import java.util.Comparator;

//首次适应算法的排序器，将空闲分区按地址从小到大排序
public class FirstAdaptionComparator implements Comparator<MemoryBlock> {
    @Override
    public int compare(MemoryBlock mb1, MemoryBlock mb2) {
        return mb1.getStartAddress() - mb2.getStartAddress();
    }
}

