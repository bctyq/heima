package com.itheima.homework3;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        //创建集合对象，保存Student学生
        ArrayList<Student> list = new ArrayList<>();
        //1 打印欢迎词和创建Scanner对象
        System.out.println("---------------欢迎来到学生管理系统-------------");
        Scanner sc = new Scanner(System.in);
        //2 while死循环打印选项信息
        while (true) {
            System.out.println("1、添加学生\t2、删除学生\t3、修改学生\t4、查看所有学生\t5、根据学号查询学生\t6、批量删除学生\t7、按其他任意键退出");
            //3 提示并获取用户的选择
            System.out.println("请输入您的选择：");
            String choose = sc.next();
            //4 使用switch分支结构判断用户选择执行对应的操作
            switch (choose) {
                case "1":
                    System.out.println("正在添加学生....");
                    addStudent(list);  //快捷键：alt+enter-->选择create method...
                    System.out.println(list);
                    break;
                case "2":
                    System.out.println("正在删除学生....");
                    deleteStudent(list);
                    break;
                case "3":
                    System.out.println("正在修改学生....");
                    updateStudent(list);
                    break;
                case "4":
                    System.out.println("正在查看所有学生....");
                    printAllStudent(list);
                    break;
                case "5":
                    System.out.println("正在根据学号查询学生....");
                    printStudentBySid(list);
                    break;
                case "6":
                    System.out.println("正在批量删除学生....");
                    batchDeleteStudent(list);
                    break;
                default:
                    System.out.println("感谢使用，再见！");
                    return;//退出程序
            }
        }
    }

    /**
     * 批量删除学生
     * @param list 学生集合
     */
    private static void batchDeleteStudent(ArrayList<Student> list) {
        //1 键盘录入要删除的学生学号，多个用,隔开
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您要删除的学生的学号(多个用英文,隔开)：");
        String sids = sc.next();  //例如：heima001,heima002,heima03,...
        //2 字符串切割，得到学生sid数组，遍历数组根据每个学号删除学生
        String[] splits = sids.split(",");//例如：["heima001","heima002",...]
        for (int i = 0; i < splits.length; i++) {
            String sid = splits[i];
            //3 根据学号查询学生在集合中的索引
            int index = getIndex(list,sid );
            //4 如果索引等于-1，说明要删除的学生不存在
            if(index==-1){
                System.out.println("您要删除的"+ sid +"学生不存在");
            }else{
                //5 如果索引不等于-1，说明要删除的学生存在，调用集合的remove方法删除学生
                list.remove(index);
                System.out.println("删除"+ sid +"学生成功");
            }
        }
    }

    /**
     * 根据学号查询学生
     * @param list 学生集合
     */
    private static void printStudentBySid(ArrayList<Student> list) {
        //1 键盘录入要查询的学生学号
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要查询的学生的学号：");
        String sid = sc.next();
        //2 根据学号查询学生在集合中的索引
        int index = getIndex(list, sid);
        //3 如果索引等于-1，说明要查询的学生不存在
        if(index==-1){
            System.out.println("您要查询的学生不存在");
        }else{
            //4 如果索引不等于-1，获取学生信息，打印学生信息
            //获取学生信息
            Student s = list.get(index);
            //打印学生信息
            System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");
            System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getAge()+"岁\t"+s.getAddress());
        }
    }

    /**
     * 修改学生
     *
     * @param list 保存学生对象的集合
     */
    private static void updateStudent(ArrayList<Student> list) {
        //1 创建Scanner对象，提示并获取用户输入的学生学号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生学号：");
        String sid = sc.next();
        //2 调用getIndex方法根据学号查询学生在集合中的索引
        int index = getIndex(list, sid);
        //3 如果等于-1，说明要修改的学生不存在，提示错误信息。
        if(index==-1){
            System.out.println("您要修改的学生学号不存在");
        }else{
            //4 如果不等于-1，可以修改学生。提示并获取学的新姓名、新年龄、新地址
            System.out.println("请输入学生的新姓名：");
            String name = sc.next();
            System.out.println("请输入学生的新年龄：");
            int age = sc.nextInt();
            System.out.println("请输入学生的新地址：");
            String address = sc.next();
            //5 重新封装学生信息，重新设置到集合中,提示修改成功
            Student student=new Student(sid,name,age,address);
            list.set(index,student);
            System.out.println("修改学生成功！");
        }
    }

    /**
     * 删除学生
     *
     * @param list 保存学生对象的集合
     */
    private static void deleteStudent(ArrayList<Student> list) {
        //1 创建Scanner键盘录入对象
        Scanner sc = new Scanner(System.in);
        //2 提示并获取用户输入的学生学号
        System.out.println("请输入要删除的学生学号：");
        for (int i = 5; i > 0; i--) {  //最多只能错5次。
            String sid = sc.next();
            //3 调用getIndex方法根据学习查询学生在集合中的索引
            int index = getIndex(list, sid);
            //4 如果索引等于-1，说明要删除的学生不存在，提示并让用户重新输入。
            if (index == -1) {
                System.out.println("您要删除的学生不存在，请重新输入学号：");
                //输出之后判断剩余次数，如果大于一次就提示还有几次机会，如果不大于1就说明机会用完了，结束jvm虚拟机
                if (i > 1) {
                    System.out.println("您还有" + (i - 1) + "次机会~~~");
                } else {
                    System.out.println("您的账号已被锁定，请5分钟后再尝试~");
                    //结束Java虚拟机
                    System.exit(0);//0表示正常退出。
                }
            } else {
                //5 如果索引不等于-1，调用集合的remove方法删除学生并提示删除成功。
                list.remove(index);
                System.out.println("删除学生成功！");
                break;
            }
        }
    }

    /**
     * 根据学号查询学生在集合中的索引。
     *
     * @param list 保存学生对象的集合
     * @param sid  要查询的学生学号
     * @return 学生在集合中的索引，-1表示每查到。
     */
    public static int getIndex(ArrayList<Student> list, String sid) {
        //1 遍历集合
        for (int i = 0; i < list.size(); i++) {
            //2 获取每一个学生对象
            Student student = list.get(i);
            //3 获取每个学生的学号
            String id = student.getSid();
            //4 判断每个学生的学号和传递进来(要查找的学号)是否相等，如果相等就返回索引。
            if (id.equals(sid)) {  //找到了
                return i;
            }
        }
        //5 如果都不相等就返回-1
        return -1;  //没找到
    }


    /**
     * 查看所有学生
     *
     * @param list 保存学生对象的集合
     */
    private static void printAllStudent(ArrayList<Student> list) {
        //判断是否有学生，如果没有就提示错误信息结束方法
        if (list.size() == 0) {
            System.out.println("还没有学生，请先添加学生后查询！");
            return;
        }
        //1 打印表头信息（学号   姓名  年龄  居住地）
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");
        //2 遍历集合
        for (int i = 0; i < list.size(); i++) {
            //3 获取每一个学生，按照表头的格式打印学生信息
            Student student = list.get(i);
            System.out.println(student);
        }
    }

    /**
     * 添加学生的方法
     *
     * @param list 保存学生对象的集合
     */
    private static void addStudent(ArrayList<Student> list) {
        //1 创建Scanner键盘录入对象
        Scanner sc = new Scanner(System.in);
        //2 提示并键盘录入学生对象所需要的数据(学号、姓名、年龄、地址)
        System.out.println("请输入学生学号(例如：heima001)：");
        String sid="";
        while (true){
            sid= sc.next();
            //需求：判断学号是否存在，如果存在就执行后面的代码，不存在就循环输入学号
            //①、调用getIndex方法根据学号查询学生在集合中的索引
            int index = getIndex(list,sid);
            //②、如果等于-1，说明要添加的学生不存在【正常情况】,  heima001,heima002,heima003
            if(index==-1){
                break;
            }else{
                //③、如果不等于-1，说明要添加的学生存在【非正常情况】，重新输入学号
                System.out.println("您要添加的学生学号已经存在，请重新输入学号：");
            }
        }
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生地址：");
        String address = sc.next();
        //3 创建Student对象，封装上述学生信息
        Student student = new Student(sid, name, age, address);
        //4 将学生对象添加到集合中(保存)
        list.add(student);
        //5 给出添加成功提示
        System.out.println("添加学生成功！");
    }
}