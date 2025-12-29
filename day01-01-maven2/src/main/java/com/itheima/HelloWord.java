package com.itheima;

import cn.hutool.core.util.StrUtil;

public class HelloWord {
    public static void main(String[] args) {
        System.out.println("HelloWorld");

        //定义一个字符串，将字符串的数据反转输出
        //  定义变量语法： 数据类型  变量名 = 值;
        String str = "黑马程序员南宁学院项目实训";
        System.out.println("正序输出："+str);
        //  hutool工具类StrUtils.reverse(字符串)  将字符串内容反转输出
        String reverse = StrUtil.reverse(str);
        System.out.println("倒序输出："+reverse);
    }
}
