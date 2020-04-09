/**
 * ClassName: Demo04ArrayListBasic
 * Descreption TODO
 * Author: YouYi
 * Date: 2020/03/25 16:51
 * Description:
 * Version: 1.0
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.youyi.demo02;

import java.util.ArrayList;

/*
如果想在ArrayList使用基本类型，必须使用基本类型的包装类


 */
public class Demo04ArrayListBasic {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);

        int num = list.get(1);
    }

}