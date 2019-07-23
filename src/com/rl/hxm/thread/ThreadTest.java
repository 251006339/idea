package com.rl.hxm.thread;

/**
 * @author XAIOHU
 * @date 2019/7/23 --14:07
 **/
public class ThreadTest  extends  Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("pool线程池");
    }
}
