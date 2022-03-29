package com.balconyjhtest.sample;

public class Innerclass {
    public static void main(String[] args) {
        InnerclassOuter outer = new InnerclassOuter("Nested"); // 实例化一个Outer
        InnerclassOuter.Inner inner = outer.new Inner(); // 实例化一个Inner
        inner.hello();
    }
}

class InnerclassOuter {
    private String name;

    InnerclassOuter(String name) {
        this.name = name;
    }

    class Inner {
        void hello() {
            System.out.println("Hello, " + InnerclassOuter.this.name);
        }
    }
}
