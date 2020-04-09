/**
 * ClassName: Demo01ArrayListStudent
 * Descreption TODO
 * Author: YouYi
 * Date: 2020/03/25 17:13
 * Description:
 * Version: 1.0
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.youyi.demo03;

import java.util.ArrayList;

public class Demo01ArrayListStudent {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        Student stuOne = new Student("Jack",20);
        Student stuTwo = new Student("John",21);
        Student stuThree = new Student("Mark",22);
        Student stuFour = new Student("Ben",23);

        list.add(stuOne);
        list.add(stuTwo);
        list.add(stuThree);
        list.add(stuFour);

        for (int i = 0; i < list.size(); i++) {

            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + "，年龄：" + stu.getAge());

        }

        for (int i = 0; i < list.size(); i++) {

            System.out.println("姓名：" + list.get(i).getName() + "，年龄：" + list.get(i).getAge());

        }


    }

}