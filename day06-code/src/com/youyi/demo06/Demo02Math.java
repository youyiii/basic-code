/**
 * FileName: Demo02Math
 * Author:   youyi
 * Date:     2020/4/10 16:49
 * Description:
 * History:
 * <author>        <time>            <version>          <desc>
 * 作者姓名        修改时间           版本号             描述
 * youyi          2020/4/10 16:49      1.0.0              创建
 */

package com.youyi.demo06;

/*计算-10.8到5.9之间，绝对值大于6或者小于2.1的正数有多少个*/
public class Demo02Math {

    public static void main(String[] args) {

        int cnt = 0;

        int max = (int) Math.floor(2.1);
        int min = (int) Math.ceil(-10.8);

        for (int i = min; i <= max; i++) {

            if (Math.abs(i) > 6 || Math.abs(i) < 2.1)
                cnt ++;

        }

        System.out.println("绝对值大于6或者小于2.1的整数有：" + cnt + "个");

    }
}

