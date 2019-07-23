package com.rl.hxm.singleton;

/**在内部类被加载和初始化时,才创建instace实例对象
 * 静态内部类不会自动随着外部类的加载和初始化而初始化,它是要单独去加载和初始化的
 * @author XAIOHU
 * @date 2019/7/23 --13:38
 **/
public class Singleton4 {

    private Singleton4(){

    }
    private static class Inner {
        private static final Singleton4 INSTACE = new Singleton4();
    }
    public Singleton4 getInstance(){
              return  Inner.INSTACE;

    }



}
