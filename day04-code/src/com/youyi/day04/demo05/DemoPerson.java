/**
 * ClassName: DemoPerson
 * Descreption TODO
 * Author: YouYi
 * Date: 2020/03/02 14:25
 * Description:
 * Version: 1.0
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.youyi.day04.demo05;

public class DemoPerson {

    public static void main(String[] args) {

        Person person = new Person();
        person.show();

        person.name = "佟丽娅";
//        person.age = 18; //直接访问private变量错误，通过get set方法
        person.setAge(-20);
        person.show();


    }

}