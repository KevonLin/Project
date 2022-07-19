package com.week5.day1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Lin
 */
public class Week5As3 {
    public static void main(String[] args) {
        int g = 0;
        int sum = 0;
        int[] num = {8, 4, 2, 1, 23, 344, 12};
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println("Sum:" + sum);

        try {
            Scanner s = new Scanner(System.in);
            System.out.println("输入一个数字:");
            g = s.nextInt();
        } catch (Exception e) {

        }
        for (int i = 0; i < num.length; i++) {

            g = num[i];

            if (i == g) {
                System.out.println("在数组中");
                break;
            } else {
                System.out.println("不在数组中");
                break;
            }
        }
    }
}
