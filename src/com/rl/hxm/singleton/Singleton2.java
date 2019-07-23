package com.rl.hxm.singleton;



import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 恶汉式
 * 1.静态初始化就创建了对象
 * 2,给属性赋值通过类加载器
 * 3.通过私有参参数给属性赋值同时创建休息
 * @author XAIOHU
 * @date 2019/7/23 --10:33
 **/
public class Singleton2 {
 public  static final   Singleton2 SINGLETON2;
 public  static final   Singleton2 SINGLETON1;//通过构造器私有化对象
 public  String  info;
    static{
        Properties properties = new Properties();
        InputStream inputstream = Singleton2.class.getClassLoader().getResourceAsStream("singleton.properties");
        try {
            properties.load(inputstream);
        } catch (IOException e) {
           throw  new RuntimeException(e);
        }

        String info = properties.getProperty("info");
        SINGLETON2 = new Singleton2(info);

 }
 static{
        SINGLETON1 = new Singleton2();
 }


private Singleton2(){

}
   private Singleton2(String info){
           this.info = info;
   }

}
