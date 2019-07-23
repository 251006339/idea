package com.rl.hxm.thread;

/**
 * @author XAIOHU
 * @date 2019/7/23 --15:54
 **/
public class DemoThread {

    public static void main(String[] args) {
        Thread thread;
        thread = new Thread();
        thread.start();

        ThreadTest threadTest = new ThreadTest();
        for (int i = 0; i < 5; i++) {

            threadTest.start();
        }


    }
}
