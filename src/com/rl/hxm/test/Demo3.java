package com.rl.hxm.test;

import com.rl.hxm.singleton.Singleton5;

/**
 * @author XAIOHU
 * @date 2019/7/23 --13:48
 **/
public class Demo3 {

    public static void main(String[] args) {
        Singleton5 getinstace = Singleton5.getinstace();
        Singleton5 getinstace1 = Singleton5.getinstace();
        System.out.println(getinstace);
        System.out.println(getinstace1);
    }



}

