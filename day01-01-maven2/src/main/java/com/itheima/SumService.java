package com.itheima;

public class SumService {
        public static void main(String[] args) {
            int sum = 0;
            System.out.print("1到100之间，能被3和5整除的数字有：");
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print(i + " ");
                    sum += i;
                }
            }
            System.out.println("\n这些数字的和为：" + sum);
        }
}
