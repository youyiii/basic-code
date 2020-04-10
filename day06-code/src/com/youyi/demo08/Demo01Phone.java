/**
 * FileName: Demo01Phone
 * Author:   youyi
 * Date:     2020/4/10 19:24
 * Description:
 * History:
 * <author>        <time>            <version>          <desc>
 * 作者姓名        修改时间           版本号             描述
 * youyi          2020/4/10 19:24      1.0.0              创建
 */

package com.youyi.demo08;

public class Demo01Phone {

    public static void main(String[] args) {

        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("=================");

        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();

    }
}
