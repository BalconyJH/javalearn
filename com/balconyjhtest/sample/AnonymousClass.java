package com.balconyjhtest.sample;

public class AnonymousClass {
    public static void main(String[] args) {
        AnonymousClassOuter outer = new AnonymousClassOuter("Nested");
        outer.asyncHello();
    }
}

class AnonymousClassOuter {
    private String name;

    AnonymousClassOuter(String name) {
        this.name = name;
    }

    void asyncHello() {
        var r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, " + AnonymousClassOuter.this.name);
            }
        };
        new Thread(r).start();
    }
}