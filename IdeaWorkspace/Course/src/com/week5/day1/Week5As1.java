package com.week5.day1;

import java.util.Scanner;

/**
 * @author Lin
 */
public class Week5As1 {


    public static void main(String[] args) {
        double num = 0, sum = 0;

        try {
            System.out.println("输入一个数:");
            Scanner s = new Scanner(System.in);
            num = s.nextDouble();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int count = 0;
        while (num > 0) {
            //符号
            if (count % 2 != 0) {
                num = -num;
                count++;
            }
            //累加
            sum += 1 / num;

            num --;
        }

        System.out.println("结果为:" + sum);
    }

}
