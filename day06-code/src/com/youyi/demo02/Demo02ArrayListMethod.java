/**
 * ClassName: Demo02ArrayListMethod
 * Descreption TODO
 * Author: YouYi
 * Date: 2020/03/25 16:30
 * Description:
 * Version: 1.0
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.youyi.demo02;


import java.util.ArrayList;

public class Demo02ArrayListMethod {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        System.out.println(list);

        //向集合中添加元素：add
        boolean success = list.add("java从入门到放弃");
        System.out.println(list);
        System.out.println("添加的动作是否成功：" + success);

        list.add("oracle从入门到放弃");
        list.add("python从入门到放弃");
        list.add("php从入门到放弃");
        System.out.println(list); //[java从入门到放弃, oracle从入门到放弃, python从入门到放弃, php从入门到放弃]

        //从集合中获取元素 get 索引值从0开始
        String name = list.get(1); //oracle从入门到放弃
        System.out.println("第1号索引位置："+ name);

        //从集合中删除元素 remove 索引值从0开始
        String elementRemoved = list.remove(1);//oracle从入门到放弃
        System.out.println("被删除的元素是："+elementRemoved);
        System.out.println(list);

        //集合的大小
        int size = list.size();
        System.out.println("集合中有"+ size + "个元素");



    }

}