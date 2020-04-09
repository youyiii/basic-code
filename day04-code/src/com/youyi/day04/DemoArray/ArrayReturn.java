/**
 * ClassName: ArrayReturn
 * Descreption TODO
 * Author: YouYi
 * Date: 2020/02/28 15:48
 * Description:
 * Version: 1.0
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.youyi.day04.DemoArray;


public class ArrayReturn {


    public static void main(String[] args) {
        int[] res = calc(10,10,10);

        System.out.println("和："+res[0]);
        System.out.println("平均："+res[1]);

    }

    //方法返回值为数组
    public static int[] calc(int a, int b, int c) {

        int sum = a + b;
        int avg = sum / 3;

        int[] arr = {sum,avg};

        return arr;

    }
}