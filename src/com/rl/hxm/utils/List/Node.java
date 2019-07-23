package com.rl.hxm.utils.List;

/**
 * @author XAIOHU
 * @date 2019/7/22 --21:50
 **/
public class Node {
    private Node prev;//上一个Node对象
    private int item;  //当前的数据
    private Node next;//下一个Node对象

    public Node(Node prev,int element,Node next){
        this.item = element;
        this.next = next;
        this.prev = prev;
    }

    public int getItem() {
        return item;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }


}
