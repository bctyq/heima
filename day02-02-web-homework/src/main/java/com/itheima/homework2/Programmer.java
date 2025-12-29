package com.itheima.homework2;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Programmer extends Employee {
    // 构造方法
    public Programmer(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("工号为" + id + "，姓名叫" + name + "的程序员月薪" + salary + "元，他正写代码。");
    }
}