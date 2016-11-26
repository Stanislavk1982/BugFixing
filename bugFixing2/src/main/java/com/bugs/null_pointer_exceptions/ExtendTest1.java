package com.bugs.null_pointer_exceptions;

public class ExtendTest1 {

    public static void main(String[] args) {
        new Child();


    }
}

abstract class Parent {
   // private String mTitle = null;
    public Parent() {
        init();
    }

    public abstract void init();
}


class Child extends Parent {
    private String mTitle;

    public Child() {
       super();
        System.out.println(mTitle);
    }

    public void init() {
        mTitle = "It' a test";
    }
}