package com.offcn.test;

import sun.font.TextSource;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        Map map = new HashMap();
        System.out.println("123");
    }



}

class A{
    static {
        System.out.println("1");
    }

    public A(){
        System.out.println("a");
    }
}
class B  extends A{
    static {
        System.out.println("2");
    }

    public B(){
        System.out.println("b");
    }
}
