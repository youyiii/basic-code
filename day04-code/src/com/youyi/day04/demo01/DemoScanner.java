/**
 * ClassName: DemoScanner
 * Descreption TODO
 * Author: YouYi
 * Date: 2020/03/02 15:31
 * Description:
 * Version: 1.0
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.youyi.day04.demo01;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //system.in代表从键盘输入

        //获取键盘输入的数字
        int num = sc.nextInt();
        System.out.println("输入的数字是：" +num);

        //获取键盘输入的字符串
        String str = sc.next();
        System.out.println("输入的字符串是：" + str);

    }

}