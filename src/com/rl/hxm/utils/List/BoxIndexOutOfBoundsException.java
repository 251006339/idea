package com.rl.hxm.utils.List;

/**
 * @author XAIOHU
 * @date 2019/7/22 --21:31
 **/
public class BoxIndexOutOfBoundsException extends  RuntimeException{
    public BoxIndexOutOfBoundsException() {

    }
    public BoxIndexOutOfBoundsException(String msg){
        super(msg);//msg提供给父类
    }
}
