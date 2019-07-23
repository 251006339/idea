package com.rl.hxm.singleton;
/**懒汉式创建对象
 * @author XAIOHU
 * @date 2019/7/23 --10:58
 **/
public class Singleton3 {
   private static Singleton3 instance;
 private Singleton3(){

 }

    public static Singleton3 getInstance() throws InterruptedException {
        if (instance == null) { //提高效率的写发


            synchronized (Singleton3.class) { //线程安全版本
                if (instance == null) {
                    Thread.sleep(3000);
                    instance = new Singleton3();
                }
            }
        }
     return  instance;
    }


}
