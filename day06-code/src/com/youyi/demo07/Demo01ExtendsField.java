/**
 * FileName: Demo01ExtendsField
 * Author:   youyi
 * Date:     2020/4/10 18:45
 * Description:
 * History:
 * <author>        <time>            <version>          <desc>
 * 作者姓名        修改时间           版本号             描述
 * youyi          2020/4/10 18:45      1.0.0              创建
 */

package com.youyi.demo07;

import javax.sound.midi.Soundbank;

public class Demo01ExtendsField {

    public static void main(String[] args) {

        Fu fu  = new Fu();
        System.out.println(fu.numFu);

        Zi zi = new Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);


    }
}
