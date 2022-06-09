/**
 * Copyright (C), 2017-2022
 * Author: BalconyJH
 * Date: 6/2/2022 11:34 AM
 * FileName: test01
 * Description:
 */


package com.balconyjhtest.homework;

import java.io.File;

// 获取文件类型。写一个方法 String getFileType(File f),根据传入f的类型不同分别返回不同的文档类型，例如:f封装的是word 文档的路径，返回“DOCX文档”，f封装的是.txt 文档的路径，返回“文本文档”，f封装的是. java 文档的路径，返回“Java 源文件”其他情况返回“文件类型不详”。。
public class test01 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Administrator\\Desktop\\test.docx");
        System.out.println(getFileType(f));
    }

    public static String getFileType(File f) {
        String fileType = "文件类型不详";
        if (f.isFile()) {
            String fileName = f.getName();
            if (fileName.endsWith(".docx")) {
                fileType = "DOCX文档";
            } else if (fileName.endsWith(".txt")) {
                fileType = "文本文档";
            } else if (fileName.endsWith(".java")) {
                fileType = "Java 源文件";
            }
        }
        return fileType;
    }

}
