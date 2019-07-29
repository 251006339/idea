package com.rl.hxm.utils.List;

/**
 * @author XAIOHU
 * @date 2019/7/22 --21:30
 **/
public class ArrayBox implements  Box {

        //描述事物
        //属性：
        private static final int DEFAULT_CAPACITY = 10;
        private int[] elementData;//给ArrayBox一个初始数组
        private int size = 0;//记录ArrayBox中有效数据的个数,给一个初始值

        //构造方法：
        public ArrayBox(){
            elementData = new int[DEFAULT_CAPACITY];
        }
        public ArrayBox(int capacity){
            elementData = new int[capacity];
        }


        //方法：
        //1.需要设计一个方法，用来添加元素
        //      提供什么条件（参数）  返回一个结果（返回值）--告知用户一个结果，是否存储成功 boolean
        //
        //存储元素的时候方法给位置存放
        //如果位置满了，方法要解决这个问题

        public boolean add(int element){                   //添加元素
            //首先要确保自己的属性数组的内部容量够不够用
            //      调用一个方法，来确定内部容量够用否
            this.ensureCapacity(size+1);

            //我想把element存入elementData数组中
            elementData[size++] = element;
            return true;
        }
        //访问控制修饰符是private的，是不希望用户看到的方法
        private void ensureCapacity(int minCapacity){    //来确定内部容量够用否
            //minCapacity即用户所需最小空间
            if(minCapacity > elementData.length){
                //如果内部容量不够用，调用一个扩容的方法
                this.grow(minCapacity);
            }
        }

        private void grow(int minCapacity){  //给内部空间扩容
            int oldCapacity = elementData.length;
            int newCapacity = oldCapacity + (oldCapacity>>1);//即oldCapacty*1.5
            if(newCapacity < minCapacity){
                newCapacity = minCapacity;
            }

            //既然要把空间扩容，要把旧数组的内容放到新的更大空间的数组中
            //调用一个类，复制数组内容
            elementData = this.copyOf(elementData,newCapacity);
        }

        private int[] copyOf(int[] oldArray,int newCapacity){  //把就数组的内容复制到新的数组中
            int[] newArray = new int[newCapacity];
            for(int i = 0; i < elementData.length; i++){
                newArray[i] = oldArray[i];
            }
            return newArray;
        }


        //2.需要设计一个方法 用来获取元素
        public int get(int index){
            //调用一个方法，先检验index是否合法
            this.rangeCheck(index);
            return elementData[index];
        }

        private void rangeCheck(int index){       //检验index是否合法
            //region Description
            if(index < 0 || index > this.size){
                //参考数组的操作，自己定义一个异常（自己创建的类）来说明这个问题
                throw new BoxIndexOutOfBoundsException("index:" + index + ",Size" + size);
            }
            //endregion
        }


        //3.需要设计一个方法，删除元素
        public int remove(int index){
            //region Description
            //检测index是否合法
            this.rangeCheck(index);

            //将要删除的元素保存下来，返回给用户
            int oldValue = elementData[index];

            //删除元素
            for(int i = index;i < size-1; i++){
                elementData[i] = elementData[i+1];
            }
            elementData[--size] = 0;

            return oldValue;
            //endregion
        }

        //4.设计一个方法，看元素的个数

        public int elementDataLength() {   //给用户查看真实数组的长度
            return elementData.length;
        }

        public int size() {           //给用户查看有效元素的个数
            return this.size;

        }




        //程序块：



}
