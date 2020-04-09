/**
 * ClassName: Demo06StringPracitce
 * Descreption TODO
 * Author: YouYi
 * Date: 2020/03/26 17:04
 * Description:
 * Version: 1.0
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.youyi.demo05;

import javax.sound.midi.Soundbank;

/*
 * 定义一个方法，把数组{1，2，3}按照指定格式拼接成字符串，格式[word1#word2#word3]
 * */
public class Demo06StringPracitce {

    public static void main(String[] args) {

        char[] chars = {'1', '2', '3'};
        System.out.println(chars[1]);
        String string = new String();
        string = charArrayToString(chars);
        System.out.println(string);

    }

    public static String charArrayToString(char[] charArray) {

        String string = new String();

        string += "[";

        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            string += "word";
            //string = string.concat(String.valueOf(ch));
            string += ch;
            if (i == charArray.length - 1)
                string += "]";
            else
                string += "#";
        }

        return string;

    }
}