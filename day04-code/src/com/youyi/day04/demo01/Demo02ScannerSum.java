/**
 * ClassName: Demo02ScannerSum
 * Descreption TODO
 * Author: YouYi
 * Date: 2020/03/02 15:45
 * Description:
 * Version: 1.0
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.youyi.day04.demo01;

import java.util.Scanner;

public class Demo02ScannerSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();

        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();

        int res = a + b;
        System.out.println("两个数字的和："+ res);

    }

}