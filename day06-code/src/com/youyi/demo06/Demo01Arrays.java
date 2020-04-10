/**
 * FileName: Demo01Arrays
 * Author:   youyi
 * Date:     2020/4/10 16:20
 * Description:
 * History:
 * <author>        <time>            <version>          <desc>
 * 作者姓名        修改时间           版本号             描述
 * youyi          2020/4/10 16:20      1.0.0              创建
 */

package com.youyi.demo06;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo01Arrays {

    public static void main(String[] args) {

        int [] intArray = {10,20,30};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        /*随机字符串，升序排列，倒序打印*/

        String str = "dlkajlnasjdlk";

        char[] chars = str.toCharArray();

        Arrays.sort(chars);
        System.out.println(chars);

        for (int i = chars.length -1; i >0 ; i--) {
            System.out.println(chars[i]);
        }



    }
}
