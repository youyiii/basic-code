/**
 * ClassName: Demo04ArrayListReturn
 * Descreption TODO
 * Author: YouYi
 * Date: 2020/03/25 17:51
 * Description:
 * Version: 1.0
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.youyi.demo04;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

/*
题目：用一个大集合存放20个随机数字，然后晒选其中的偶数元素，放到小集合中，
要求使用自定义方法来实现晒选
* */
public class Demo04ArrayListReturn {

    public static void main(String[] args) {

        ArrayList<Integer> listBig = new ArrayList<>();
        ArrayList<Integer> listSmall = new ArrayList<>();
        Random random = new Random();

        //随机产生20个数字存入集合中
        for (int i = 0; i < 20; i++) {
            listBig.add(random.nextInt());
        }
        System.out.println("生成的集合是："+listBig);

        //遍历集合找出偶数
        for (int i = 0; i < listBig.size(); i++) {
            int num = listBig.get(i);
            //找偶数
            if(num%2 == 0 ) {
                listSmall.add(num);
            }
        }

        System.out.println("集合中的偶数有："+listSmall);
        System.out.println("===============================");
        System.out.println("通过方法获取集合中的偶数："+getEvenNumber(listBig));


    }

    //使用方法晒选
    public  static  ArrayList<Integer> getEvenNumber(ArrayList<Integer> list) {

        int num;
        ArrayList<Integer> listSmall = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            num = list.get(i);
            //找偶数
            if (num % 2 == 0) {
                listSmall.add(num);
            }
        }
        return listSmall;

    }

}