package com.week5.day1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Lin
 */
public class Week5As4 {
    public static void main(String[] args) {
        int[] num = new int[9];
        int tmp = 0;
        boolean flag = false;
//        int[] sort = new int[9];
        //随机生成0-99之间的数字
        for (int i = 1; i < 9; i++) {
            num[i] = (int) (Math.random() * 100);
        }
        System.out.print("生成的数字是:");
        for (int i = 1; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println();

        //排序
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    flag = true;
                    tmp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = tmp;

                    for (int k = 1; k < num.length; k++) {
                        System.out.print(num[k] + ", ");
                    }
                    if (flag == false) {
                        break;
                    }
                    System.out.println();
                }
            }
        }

        System.out.print("排序结果是");
        for (int i = 1; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
    }
}
