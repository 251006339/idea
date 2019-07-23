package com.rl.hxm.test;

import com.rl.hxm.thread.ThreadTest;

/**
 * @author XAIOHU
 * @date 2019/7/23 --13:48
 **/
public class Demo4 {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }


        ThreadTest thread = new ThreadTest();

        new Thread(thread).start();
        new Thread(thread).start();



    }



}

