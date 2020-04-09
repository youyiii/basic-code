/**
 * ClassName: Demo03ArrayEach
 * Descreption TODO
 * Author: YouYi
 * Date: 2020/03/25 16:47
 * Description:
 * Version: 1.0
 * History:
 * <author>          <time>          <version>          <desc>
 **/
package com.youyi.demo02;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Demo03ArrayEach {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("java从入门到放弃");
        list.add("oracle从入门到放弃");
        list.add("python从入门到放弃");
        list.add("php从入门到放弃");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}