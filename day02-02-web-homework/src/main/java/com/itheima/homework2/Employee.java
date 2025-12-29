package com.itheima.homework2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 员工父类，包含共有属性
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Employee {
    protected String name;    // 姓名
    protected int id;         // 工号
    protected double salary;  // 工资

    // 抽象工作方法，由子类实现
    public abstract void work();
}
