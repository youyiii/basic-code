/**
 * ClassName: Demo01Student
 * Descreption TODO
 * Author: YouYi
 * Date: 2020/03/02 15:15
 * Description:
 * Version: 1.0
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.youyi.day04.Demo06;


public class Demo01Student {

    public static void main(String[] args) {

        Student stu1 = new Student();
        stu1.setName("迪丽热巴");
        stu1.setAge(20);
        System.out.println("姓名："+ stu1.getName() + "，年龄："+stu1.getAge());
        System.out.println("=================");

        Student stu2 = new Student("古力娜扎",20);
        System.out.println("姓名："+ stu2.getName() + "，年龄："+stu2.getAge());


    }


}