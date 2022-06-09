/**
 * Copyright (C), 2017-2022
 * Author: BalconyJH
 * Date: 6/2/2022 11:02 AM
 * FileName: yi
 * Description:
 */


package com.balconyjhtest.homework;

import java.io.File;
import java.util.Scanner;

public class yi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("file path:");
        String filePath = sc.nextLine();
        //用输入字符串作为文件或目录名
        File file = new File(filePath);
        //如果是文件则显示其有关信息
        if (file.isFile()) {
            System.out.println("AbsolutePath:" + file.getAbsolutePath());
            System.out.println("FileSize:" + file.length());
        } else if (file.isDirectory()) {
            System.out.println("directory" + file);
            String list[] = file.list();
            for (int i = 0; i < list.length; i++) {
                System.out.println("\t" + list[i]);
            }
        }
    }
}
