package com.rl.hxm.utils.Map;

/**
 * @author XAIOHU
 * @date 2019/7/22 --21:54
 **/
public interface BaseMap<K,V> {

        //存
        public V put(K k, V v) ;
        //取
        public V get(K k);

}
