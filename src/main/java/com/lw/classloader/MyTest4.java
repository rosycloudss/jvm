package com.lw.classloader;

/**
 * 对于数组实例来说，其类型是由jvm 在运行期间动态生成的，表示为[Lcom.lw.classloader.MyParent4
 * 这种形式，动态生成的类型其父类型是Object
 * 对于数组来说，javaDoc 经常将构成数组的元素为Component，实际上就是将数组降低一个维度后的类型
 *
 * 助记符
 *  anewarray 创建一个引用类型的（如类，接口、数组）数组，并将其引用值压入栈顶
 *  newarray 创建一个指定的原始类型（如 int、float、char等）数组，并将其引用值压入栈顶
 */
public class MyTest4 {
    public static void main(String[] args) {
        //首次主动调用  执行静态代码块执行
        MyParent4 parent4 = new MyParent4();

        //
        MyParent4[] parent4s = new MyParent4[1];
        MyParent4[][] parent4s1 = new MyParent4[1][1];
        //class [Lcom.lw.classloader.MyParent4;   // java 虚拟机在运行期生成数组类型
        System.out.println(parent4s.getClass());
        System.out.println(parent4s1.getClass());
        System.out.println(parent4s.getClass().getSuperclass());
        System.out.println(parent4s1.getClass().getSuperclass());

        System.out.println("===============");
        int[] ints = new int[1];
        System.out.println(ints.getClass());
        System.out.println(ints.getClass().getSuperclass());

    }
}

class MyParent4 {
    static {
        System.out.println("MyParent4 static block"); // 类首次初始化时执行
    }
    
}
