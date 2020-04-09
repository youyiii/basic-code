/**
 * ClassName: Demo03StringEquals
 * Descreption TODO
 * Author: YouYi
 * Date: 2020/03/26 16:00
 * Description:
 * Version: 1.0
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.youyi.demo05;

public class Demo03StringEquals {

    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "hello";

        char[] charArray = {'h','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase("hello"));
    }

}