package com.rl.hxm.test;


import com.sun.jmx.remote.internal.ArrayQueue;

import java.awt.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author XAIOHU
 * @date 2019/7/23 --22:09
 **/
public class Demo7 {
    public static void main(String[] args) {
        System.out.println("args = [" + args + "]");
        ArrayList arrayList = new ArrayList();
        arrayList.add("112");
        arrayList.add("112");
        arrayList.add("112");
        arrayList.add("112");
        arrayList.add("112");
        arrayList.add("112");
        System.out.println("arrayList = " + arrayList);
        HashMap hashMap = new HashMap();
         hashMap.put("1","2");
         hashMap.put("3","4");
         hashMap.put("2","4");
         hashMap.put("2","4");
        LinkedList linkedList = new LinkedList();
        linkedList.add("1");
        linkedList.add("dsa");
        linkedList.add("dsa3");
        linkedList.add("d1sa");
        System.out.println("linkedList = " + linkedList);
        TreeSet treeSet = new TreeSet();
        treeSet.add("4");
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("8");
        treeSet.add("2");
        System.out.println("treeSet = " + treeSet);
        HashSet<String> strings = new HashSet<>();
        strings.add("13");
        strings.add("32");
        strings.add("2");
        strings.add("55");
        strings.add("42");
        strings.add("22");
        strings.add("2");
        System.out.println("strings = " + strings);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("1","3");
        concurrentHashMap.put("33","3");
        concurrentHashMap.put("4","3");
        concurrentHashMap.put("4",32);
        System.out.println(concurrentHashMap);
        TreeMap treeMap = new TreeMap();
        treeMap.put("2","44");
        treeMap.put("1","44");
        treeMap.put("5","44");
        treeMap.put("7","44");
        treeMap.put("7","44");
        treeMap.put("6","44");
        treeMap.put("1","44");
        System.out.println("treeMap = " + treeMap);

        Stack stack = new Stack();
        stack.push("rewq");
        stack.push("rewq1");
        stack.push("rewq3");
        stack.push("rewq4");
        System.out.println("stack = " + stack);
        ArrayQueue arrayQueue = new ArrayQueue(4);
         arrayQueue.add(23331);
         arrayQueue.add(233);
         arrayQueue.add(33);
         arrayQueue.add(633);
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        linkedBlockingQueue.offer("sddsa");
        linkedBlockingQueue.offer("sddsa");
        linkedBlockingQueue.offer("sddsa");
        linkedBlockingQueue.offer("sddsa");
        linkedBlockingQueue.poll();
        System.out.println("linkedBlockingQueue = " + linkedBlockingQueue);


        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        linkedBlockingDeque.offer("dasda");
        linkedBlockingDeque.add("EREW");
        linkedBlockingDeque.add("ER54");
        linkedBlockingDeque.add("ER54");
        linkedBlockingDeque.add("E23");
        linkedBlockingDeque.offer("dsad");
        linkedBlockingDeque.poll();
        System.out.println("linkedBlockingDeque = " + linkedBlockingDeque);
        System.out.println("arrayQueue = " + arrayQueue);



    }
}
