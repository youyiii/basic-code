/**
 * ClassName: PrintMethod
 * Descreption TODO
 * Author: YouYi
 * Date: 2020/02/25 17:27
 * Description:
 * Version: 1.0
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.youyi.day04.demo02;

import org.omg.CORBA.PUBLIC_MEMBER;

public class PrintMethod {

    public static void main(String[] args) {

//        System.out.println(sum(10, 20));
//        sum(10, 20);
//        PrintMethodDemo();
        System.out.println(getSum());

    }

    //MethodDemo1 Print
    public static void PrintMethodDemo() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 20; j++) {


                System.out.print("*");
            }

            System.out.println("");
        }
    }

    // MethodDemo2  sum
    public static int sum(int a, int b) {
        int res = a + b;
        System.out.println("Method Worked!");
        return res;
    }


    //求和
    public  static int  getSum(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        return  sum;
    }
}