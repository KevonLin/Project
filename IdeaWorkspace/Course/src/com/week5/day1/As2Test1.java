package com.week5.day1;

import java.util.Scanner;

/**
 * @author Lin
 */
public class As2Test1 {
    public static void main(String[] args) {
        //用于打印每个数字
        int num = 0;
        //第一行第一个数
        int first_num = 1;
        //初始行距
        int row = 2;
        //初始列距
        int column = 1;


        //提示输入显示行数
        int line = 0;
        try {
            Scanner s = new Scanner(System.in);
            line = s.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //实现方法
        for (int i = line; i > 0; i--) {
            num = first_num;
            row = column + 1;
            for (int j = 0; j < i; j++) {
                System.out.print(num + " ");
                num += row;
                row++;
            }
            System.out.println();
            first_num += column;
            column++;
        }
    }
}
