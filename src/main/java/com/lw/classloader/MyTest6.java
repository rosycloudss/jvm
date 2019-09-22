package com.lw.classloader;

public class MyTest6 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("count1:" + Singleton.count1);
        System.out.println("count2:" + Singleton.count2);
    }
}

class Singleton {
    public static int count1;


    private static Singleton singleton = new Singleton();

    private Singleton() {
        count1++;
        count2++;
    }

    public static int count2 = 0;

    public static Singleton getInstance() {
        return singleton;
    }

}