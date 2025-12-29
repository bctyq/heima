package com.itheima.homework1;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int nunber = scanner.nextInt();
        String result = nunber % 2 == 0 ? "偶数" : "奇数";
        System.out.println(result);
    }
}
