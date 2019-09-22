package com.lw.classloader;

/**
 * -XX:+TraceClassLoading:追踪类中的加载信息并打印出来
 * -XX:+<option>:开启option选项
 * -XX:-<option>:关闭option选项
 * -XX:<option>=<value> 将option选项设置为value
 */
public class Test1 {

    public static void main(String[] args) {
        System.out.println(Child1.str); // Parent1 初始化
                                        // parent1
    }


}

class Parent1{
    public static String str="parent1";
    static {
        System.out.println("Parent1 初始化");
    }

}

class Child1 extends  Parent1{
    public static String str2="child1";
    static {
        System.out.println("Child1 初始化");
    }
}