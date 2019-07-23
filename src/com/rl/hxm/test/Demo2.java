package com.rl.hxm.test;

import com.rl.hxm.singleton.Singleton3;

import java.util.concurrent.*;

/**
 * @author XAIOHU
 * @date 2019/7/23 --10:17
 **/
public class Demo2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*Singleton3 instance = Singleton3.getInstance();
        Singleton3 instance1 = Singleton3.getInstance();

        System.out.println(instance);
        System.out.println(instance1);*/
        //通过callable返回线程创建多个对象返回值
        //当创建callable对象时

        Callable callable = new Callable<Singleton3>() {
            @Override
            public Singleton3 call() throws Exception {

                return Singleton3.getInstance();
            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Singleton3> submit = executorService.submit(callable);
        Future<Singleton3> submit1 = executorService.submit(callable);
        Singleton3 singleton3 = submit.get();//获得泛型对象
        Singleton3 singleton31 = submit1.get();
        System.out.println("singleton31 = " + singleton31);//两者的对象不同导致异步
        System.out.println("singleton3 = " + singleton3);//两则的对象不同

    }


}
