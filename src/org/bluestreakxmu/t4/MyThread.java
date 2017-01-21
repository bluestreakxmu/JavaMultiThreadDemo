package org.bluestreakxmu.t4;

/**
 * 实例变量共享线程类
 *
 * @author XiboLee
 */
public class MyThread extends Thread {
    private int count = 5;

    @Override
    synchronized public void run() {
        super.run();
        // 此示例不要用for语句，因为使用同步后其他线程就得不到运行的机会了，
        // 一直由一个线程进行减法运算
        count--;
        System.out.println(" 由 " + Thread.currentThread().getName() + " 计算，count=" + count);
    }
}
