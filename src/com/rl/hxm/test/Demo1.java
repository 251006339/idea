package com.rl.hxm.test;

import com.rl.hxm.singleton.Singleton2;

/**
 * @author XAIOHU
 * @date 2019/7/23 --10:17
 **/
public class Demo1 {

    public static void main(String[] args) {
         Singleton2 singleton2 = Singleton2.SINGLETON2;
        System.out.println("singleton2 = " + singleton2);
    }


}
