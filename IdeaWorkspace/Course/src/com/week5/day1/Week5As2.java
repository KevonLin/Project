package com.week5.day1;

import java.util.Scanner;

/**
 * @author Lin
 */

public class Week5As2 {
    public static void main(String[] args) {
        int n;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("请输入行数：");
            n = s.nextInt();
        }
        //定义行差值key，初始值为2
        int key = 2;
        //保存数据，初始值为0
        int num = 0;
        //定义num_row来记录行数，初始值为1
        int num_row = 1;
        //定义num_first,用与表示每行的第一个数
        int num_first = 1;
        //定义num_y，用于表示第一列数之间的差值，初始值为1
        int num_y = 1;
        //n行数
        for (int i = n; i >= 1; i--) {
            //循环开始，重新定义num
            num = num_first;
            //通过观察发现，每行开始时，第一个差值是行数+1
            key = num_row + 1;
            //用于控制每行输出的个数
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += key;
                //差值自增
                key++;
            }
            System.out.println();
            //输出完一行之后，num_row自增
            num_row++;
            //num_first变化
            num_first += num_y;
            //列差值变化
            num_y++;
        }

    }
}
