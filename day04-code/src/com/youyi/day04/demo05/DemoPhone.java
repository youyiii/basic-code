/**
 * ClassName: DemoPhone
 * Descreption TODO
 * Author: YouYi
 * Date: 2020/02/28 16:46
 * Description:
 * Version: 1.0
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.youyi.day04.demo05;

public class DemoPhone {

    public static void main(String[] args) {

        //创建一个手机对象
        Phone phone = new Phone();

        phone.brand = "华为";
        phone.color = "玫瑰金";
        phone.price = 4899;

        phone.sendMsg();
        phone.call("马化腾");
    }

}