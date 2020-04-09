/**
 * ClassName: Person
 * Descreption TODO
 * Author: YouYi
 * Date: 2020/03/02 14:23
 * Description:
 * Version: 1.0
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.youyi.day04.demo05;


public class Person {
    String name;
    private int age;

    public void  show(){
        System.out.println("我的名字是：" + name + "，年龄：" + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ( age < 100 && age > 0  ) {
            this.age = age;
        }
        else {
            System.out.println("数据不合理！");

        }

    }
}