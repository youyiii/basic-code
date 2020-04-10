/**
 * FileName: Demo01Extends
 * Author:   youyi
 * Date:     2020/4/10 17:39
 * Description:
 * History:
 * <author>        <time>            <version>          <desc>
 * 作者姓名        修改时间           版本号             描述
 * youyi          2020/4/10 17:39      1.0.0              创建
 */

package com.youyi.demo06;

public class Demo01Extends {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        //Teacher类当中虽然什么都没写，但是会继承来自父类的方法
        teacher.mehtod();
    }

}
