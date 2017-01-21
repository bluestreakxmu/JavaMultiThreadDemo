package org.bluestreakxmu.t3;

/**
 * 实例变量不共享线程类
 *
 * @author XiboLee
 */
public class MyThread extends Thread {
    private int count = 5;

    public MyThread(String name) {
        super();
        setName(name); // 设置线程名称
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println(" 由 " + Thread.currentThread().getName() + " 计算，count=" + count);
        }
    }
}
