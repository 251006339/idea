package com.rl.hxm.test;

import com.rl.hxm.singleton.Singleton1;

/**
 * @author XAIOHU
 * @date 2019/7/23 --10:17
 **/
public class Demo {

    public static void main(String[] args) {
      //获得单例对象
        Singleton1 instance = Singleton1.INSTANCE;
        System.out.println("instance = " + instance);

    }


}
