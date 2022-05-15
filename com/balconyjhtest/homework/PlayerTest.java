/**
 * Copyright (C), 2017-2022
 * Author: BalconyJH
 * Date: 5/15/2022 3:47 PM
 * FileName: test
 * Description:
 */

package com.balconyjhtest.homework;

// NoThisSongException继承Exception类，类中有一个无参和一个接收一个String类型参数的构造方法，构造方法中都使用super关键字调用父类的构造方法。
class NoThisSongException extends Exception {
    public NoThisSongException() {
        super();
    }

    public NoThisSongException(String message) {
        super(message);
    }
}

//  Player类中定义一个void play(int index)方法，
// 方法接收一个int类型的参数，表示播放歌曲的索引
// 当index>10时，play()方法用throw关键字抛出NoThisSongException异常
// 创建异常对象时，调用有参的构造方法，传入“您播放的歌曲不存在”,否则提示“正在播放歌曲”。
class Player {
    public void play(int index) throws NoThisSongException {
        if (index > 10) {
            throw new NoThisSongException("您播放的歌曲不存在");
        } else {
            System.out.println("正在播放歌曲");
        }
    }
}

// 在测试类PlayerTest中创建Player对象,并调用play()方法测试自定义的NoThisSongException异常，使用try…catch语句捕获异常，调用NoThisSongException的getMessage()方法打印出异常信息。
public class PlayerTest {
    public static void main(String[] args) {
        Player player = new Player();
        try {
            player.play(11);
        } catch (NoThisSongException e) {
            System.out.println(e.getMessage());
        }
    }
}