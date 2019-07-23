package com.rl.hxm.singleton;

/*
 * @author XAIOHU
 * @date 2019/7/23 --13:44
 **/
public class Singleton5 {

    //静态类部类不会因为自动初始化加载,需要调用之后才会加载静态对象
    public static class Inner{
        private  static final Singleton5 INSTACE=new Singleton5();


    }
     public static Singleton5 getinstace(){

        return  Inner.INSTACE;
     }


}
