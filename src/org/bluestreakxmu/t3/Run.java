package org.bluestreakxmu.t3;

/**
 * 实例变量不共享测试类
 *
 * @author XiboLee
 */
public class Run {
    public static void main(String[] args) {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");
        a.start();
        b.start();
        c.start();
    }
}
