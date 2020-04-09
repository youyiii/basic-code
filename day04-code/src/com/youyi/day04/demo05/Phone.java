/**
 * ClassName: Phone
 * Descreption TODO
 * Author: YouYi
 * Date: 2020/02/28 16:41
 * Description:
 * Version: 1.0
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.youyi.day04.demo05;

public class Phone {


    String brand;//品牌
    double price;//价格
    String color;//颜色

    public  void call(String who){
        System.out.println("打电话给" + who );
    }

    public  void sendMsg(){
        System.out.println("群发短信");
    }

}