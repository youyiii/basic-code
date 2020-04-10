/**
 * ClassName: Demo01String
 * Descreption TODO
 * Author: YouYi
 * Date: 2020/03/26 15:13
 * Description:
 * Version: 1.0
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.youyi.demo05;


public class Demo01String {

    public static void main(String[] args) {

        //1. 使用默认构造方法创建
        String str1 = new String();
        System.out.println("第一个字符串是：" + str1);

        //2. 根据字符数据创建字符串
        char[] charArray = {'a','b','c'};
        String str2 = new String(charArray);
        System.out.println("根据字符数组创建：" + str2);

        //3.根据字节数组来创建字符串
        byte[] byteArray = {97,98,99};
        String str3 = new String(byteArray);
        System.out.println("根据byte数组创建："+str3);

        System.out.println("第一次使用git提交代码到github");


    }



}