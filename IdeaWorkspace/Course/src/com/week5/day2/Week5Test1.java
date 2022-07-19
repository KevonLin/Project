package com.week5.day2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Lin
 * @date 2021.03.29
 * @version 1.0
 */
public class Week5Test1 {
    public static void main(String[] args) {
        String[] name = new String[3];
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("输入三个名字:");
            for (int i = 0; i < name.length; i++) {
                System.out.println("第" + i + "个：");
                name[i] = s.next();
            }
        } catch (Exception e) {
            System.out.println("出错了！");
        }
        System.out.println("你输入的三个名字分别是");
        System.out.println(Arrays.asList(name));
    }
}