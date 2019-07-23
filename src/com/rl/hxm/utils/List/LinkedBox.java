package com.rl.hxm.utils.List;

/**
 * @author XAIOHU
 * @date 2019/7/22 --21:32
 **/
public class LinkedBox implements  Box{

    //先定义头节点和尾节点的属性
    private Node first;
    private Node last;
    private int size = 0;//记录有效元素的个数


    //1.增加元素的方法
    public boolean add(int element) {

        //将element元素存入一个新的node里，挂在链表的尾端
        //      调用linkLast方法
        this.linkLast(element);

        //告知添加成功
        return true;
    }

    private void linkLast(int element){ //将element元素存入一个新的node里，挂在链表的尾端
        //获取链表的尾节点
        Node l = last;

        //创建一个新的Node对象，将新数据包装起来
        Node newNode = new Node(l,element,null);

        //再将新节点设置为尾节点
        last = newNode;

        if(l == null){
            first = newNode;
        }
        else{
            l.setNext(newNode);
        }

        //有效元素增加一个
        size++;

    }


    //2.获取元素的方法
    public int get(int index) {
        //调用一个方法，先检验index是否合法
        this.rangeCheck(index);

        //找寻index对应位置的那个Node对象，将对象中的数据据取出来
        //调用node方法
        Node targetNode = this.node(index);

        //返回index位置的值
        return targetNode.getItem();
    }

    private void rangeCheck(int index){       //检验index是否合法
        if(index < 0 || index > this.size){
            //参考数组的操作，自己定义一个异常（自己创建的类）来说明这个问题
            throw new BoxIndexOutOfBoundsException("index:" + index + ",Size" + size);
        }
    }

    private Node node(int index){  //找寻index对应位置的那个Node对象，将对象中的数据据取出来

        Node targetNode;//用来存储当前目标元素的对象

        if(index < (index>>1)){
            targetNode = first;
            for(int i = 0; i < index; i++){
                targetNode = targetNode.getNext();
            }
        }
        else{
            targetNode = last;
            for(int i = size-1; i > index; i--){
                targetNode = targetNode.getPrev();
            }
        }
        return targetNode;
    }


    //3.删除元素的方法
    public int remove(int index) {

        //检测index是否合法
        this.rangeCheck(index);

        //找到index位置的那个Node
        //调用node方法
        Node targetNode = this.node(index);

        //将要删除的元素保存下来，返回给用户
        int oldValue = targetNode.getItem();

        //删除当前元素的目标节点
        //调用
        this.unLink(targetNode);

        //有效元素减少一个
        size--;

        //返回被删元素
        return oldValue;
    }

    private void unLink(Node targetNode){
        if(targetNode.getPrev() == null){
            first = targetNode.getNext();
        }else{
            targetNode.getPrev().setNext(targetNode.getNext());
        }

        if(targetNode.getNext() == null){
            last = targetNode.getNext();
        }else{
            targetNode.getNext().setPrev(targetNode.getPrev());
        }


        targetNode.setNext(null);
        targetNode.setPrev(null);
    }


    //4.获取元素个数的方法
    public int size() {
        return this.size;
    }
}
