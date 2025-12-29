package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student2 {
    private String name;
    private Integer age;
    private String hobby;
    public static void main(String[] args) {
        //创建老式Student封装对象并进行成员赋值
        Student student = new Student();
        student.setName("abc");
        student.setAge(20);
        student.setHobby("敲代码");
        System.out.println(student);

        //创建lombok的Student2封装对象并进行成员赋值
        Student2 student2 = new Student2();
        student2.setName("abc");
        student2.setAge(20);
        student2.setHobby("敲代码");
        System.out.println(student2);
    }
}
