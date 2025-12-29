package com.itheima.homework2;

import lombok.Data;
import lombok.EqualsAndHashCode;

// 项目经理类，继承员工类
@Data
@EqualsAndHashCode(callSuper = true)
public class Manager extends Employee {
    private double bonus;  // 特有属性：奖金

    // 构造方法
    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("工号为" + id + "，姓名叫" + name + "的项目经理月薪" + salary + "元，奖金" + bonus + "元，他正在汇报项目进度。");
    }
}