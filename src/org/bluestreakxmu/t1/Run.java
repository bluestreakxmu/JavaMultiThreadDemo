package org.bluestreakxmu.t1;

/**
 * @author XiboLee
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        // Note：线程执行顺序与调用顺序无关
        myThread.start();
        System.out.println("运行结束！");
    }
}
