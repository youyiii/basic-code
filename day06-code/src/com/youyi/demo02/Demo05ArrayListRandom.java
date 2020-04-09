/**
 * ClassName: Demo05ArrayListRandom
 * Descreption TODO
 * Author: YouYi
 * Date: 2020/03/25 17:01
 * Description:
 * Version: 1.0
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.youyi.demo02;

import java.util.ArrayList;
import java.util.Random;

/*
*
*练习题：生成1-33之间的随机数，添加到集合，遍历集合
*
* 思路：
* 1、需要存储6个数据，创建一个集合<Inteher>
* 2、产生随机数需要用到Random
* 3、循环6次，生成六个随机数
* 4、循环内调用rd.nextInt(33); 0~32 + 1
*
* */
public class Demo05ArrayListRandom {

    public static void main(String[] args) {

        Random rd = new Random();
        ArrayList<Integer> listInt = new ArrayList<>();

        for (int i = 0; i < 6; i++) {

            listInt.add(rd.nextInt(33)+1);

        }

        System.out.println("6个1~33的随机数是："+listInt);

        for (int i = 0; i < listInt.size(); i++) {
            System.out.println("第" + i + "个位置的元素：" + listInt.get(i));
        }
    }
}