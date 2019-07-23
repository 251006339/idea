package com.rl.hxm.singleton;

/**
 * 恶汉式   类加载器机制就是线程安全
 * 1.直接创建实例对象,不管你是否需要这个对象
 * 2.构造器私有化
 * 3.自行创建,
 * 4.向外界提供这个实例
 * 5.
 * @author XAIOHU
 * @date 2019/7/23 --10:19
 **/
public class Singleton {
private static final Singleton SINGLETON=new Singleton();
   private Singleton(){
       
   }

    public static void main(String[] args) {
        Singleton singleton = Singleton.SINGLETON;
        System.out.println("singleton = " + singleton);
    }
    
    
}
