package com.balconyjhtest.homework;

public class PhoneTest {
    public static void main(String[] args) {
        MiPhone phone = new MiPhone();
        phone.call();
        phone.faceTime();
        phone.receiveMessage();
    }
}
interface Phone {
    public void call();
    public void receiveMessage();
}

interface SmartPhone extends Phone {
    public void faceTime();
}

class MiPhone implements SmartPhone {
    {System.out.println("正在使用小米");}
    public void call() {
        System.out.println("语音通话");
    }
    public void receiveMessage() {
        System.out.println("接收短信");
    }
    public void faceTime() {
        System.out.println("视频通话");
    }
}
