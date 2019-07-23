package com.rl.hxm.utils.Map;

/**
 * @author XAIOHU
 * @date 2019/7/22 --21:55
 **/
public class Entry<K, V> implements BaseEntry<K, V> {
        K k;
        V v;
        Entry<K, V> next;

        public Entry(K k, V v, Entry<K, V> next) {
            this.k = k;
            this.v = v;
            this.next = next;
        }

        @Override
        public K getKey() {
            return k;
        }

        @Override
        public V getValue() {
            return v;
        }
    }

