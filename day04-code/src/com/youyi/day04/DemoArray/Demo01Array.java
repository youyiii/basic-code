/**
 * ClassName: Demo01Array
 * Descreption TODO
 * Author: YouYi
 * Date: 2020/02/26 14:15
 * Description:
 * Version: 1.0
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.youyi.day04.DemoArray;

public class Demo01Array {


    public static void main(String[] args) {
        //动态初始化
        int[] arrA = new int[300];
        double[] arrB = new double[100];
        String[] arrC = new String[100];

        //静态初始化
        int[] arrInt = new int[]{1,2,3,4,5};
        double[] arrDbl = new double[]{1.0,2.0,3.0};
        String[] arrStr = new  String[]{"hello","world"};

        //省略格式的静态初始化
        int[] arrIntStatic = {1,2,3,4,5};

    }

}