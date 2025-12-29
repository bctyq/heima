package com.itheima.homework2;

public class Homework2 {
    public static void main(String[] args) {
        String str = "20 30 33 55 66 88";
        String[] numbers = str.split(" ");
        int sum = 0;
        for (String numStr : numbers) {
            sum += Integer.parseInt(numStr);
        }
        double average = (double) sum / numbers.length;
        System.out.println("字符串: " + str);
        System.out.println("数字个数: " + numbers.length);
        System.out.println("总和: " + sum);
        System.out.println("平均值: " + average);
    }
}