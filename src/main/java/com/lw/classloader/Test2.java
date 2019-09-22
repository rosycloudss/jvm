package com.lw.classloader;

/**
 * 常量在变异阶段或存入到调用这个常量的方法所在的类(使用类)的常量池中
 * 本质上，调用类并没有直接引用到定义常量的类，因此并不会触发定义常量的类的初始化
 * 注：这里将常量存放到MyTest2的常量池中，之后Test2与Parent2没有任何关系了
 * 甚至我们可以将Parent2 的class文件删除
 * <p>
 * 助记符：
 *       ldc 表示将int，float或是String类型的常量值从常量池中推送至栈顶
 *       bipush 表示将单字节 (-128,127)的常量推送至栈顶
 *       sipush 表示将一个短整型常量值（-32768,32767）推送至栈顶
 *       iconst_1 表示将int类型的数字 1 推送至栈顶 （iconst_m1 ~ iconst_5） 5以上 使用 bipush   m1 表示-1
 *
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(Parent2.m);// -> hello world
    }
}


class Parent2 {
    public static final String str = "hello world";

    public static final short s = 127;
    public static final int i = 128;
    public static final int m = 111;



    static {
        System.out.println("Parent2 static block");
    }
}
