package com.itheima.homework3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    //1 私有的成员变量
    private String sid;     //学号
    private String name;    //姓名
    private int age;        //年龄
    private String address; //地址
}