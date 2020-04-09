/**
 * ClassName: Demo01ScannerMax
 * Descreption TODO
 * Author: YouYi
 * Date: 2020/03/02 15:48
 * Description:
 * Version: 1.0
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.youyi.day04.demo01;

import java.util.Scanner;

public class Demo01ScannerMax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int max = a;

        int b = sc.nextInt();
        if (b > max) max = b;


        int c = sc.nextInt();
        if (c > max) max = c;

        System.out.println("最大值："+max);


    }

}