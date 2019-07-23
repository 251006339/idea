package com.rl.hxm.test;

import java.util.concurrent.*;

/**
 * @author XAIOHU
 * @date 2019/7/23 --15:39
 **/
public class Demo5 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {

                return "12344";
            }
        };
        Future<String> submit = executorService.submit(callable);//执行一次是一次pool线程 execute执行一次也是一次线程
        String s = null;
        try {
            s = submit.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("s = " + s);
    }
}
