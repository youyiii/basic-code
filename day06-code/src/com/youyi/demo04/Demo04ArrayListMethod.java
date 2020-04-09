/**
 * ClassName: Demo04ArrayListMethod
 * Descreption TODO
 * Author: YouYi
 * Date: 2020/03/25 17:24
 * Description:
 * Version: 1.0
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.youyi.demo04;

import jdk.nashorn.internal.ir.LiteralNode;

import java.util.ArrayList;

public class Demo04ArrayListMethod {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("java从入门到放弃");
        list.add("oracle从入门到放弃");
        list.add("python从入门到放弃");
        list.add("php从入门到放弃");

        //调用方法
        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list) {

        //拼接左括号
        System.out.print("{");

        for (int i = 0; i < list.size(); i++) {
            //遍历集合
            if(i == list.size() - 1){
                System.out.print(list.get(i) + "}");
            } else {
                System.out.print(list.get(i) + "@");
            }
        }

    }

}