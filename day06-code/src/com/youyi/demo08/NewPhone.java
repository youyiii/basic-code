/**
 * FileName: NewPhone
 * Author:   youyi
 * Date:     2020/4/10 19:21
 * Description:
 * History:
 * <author>        <time>            <version>          <desc>
 * 作者姓名        修改时间           版本号             描述
 * youyi          2020/4/10 19:21      1.0.0              创建
 */

package com.youyi.demo08;

//定义新手机，使用老手机作为父类
public class NewPhone  extends Phone{


    @Override
    public void show() {
        //System.out.println("显示号码");
        super.show(); //把父类的show（）方法拿过来用，然后在添加自己的内容
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
