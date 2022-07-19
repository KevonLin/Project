package com.week10.day1.as1;

import java.util.Scanner;

public class Test {

    TooHigh eh = new TooHigh("太大了");
    TooHigh el = new TooHigh("太小了");

    public void getScore(int x) throws TooHigh, TooLow {
        if (x < 0) {
            System.out.println(el.getMessage());
        }
        if (x > 100) {
            System.out.println(eh.getMessage());
        }
    }

    public static void main(String[] args) {

        try {
            System.out.println("输入一个数");
            Scanner s = new Scanner(System.in);
            int score = s.nextInt();
            new Test().getScore(score);
        } catch (TooHigh e) {
            e.printStackTrace();
        } catch (TooLow e) {
            e.printStackTrace();
        } catch (Exception e) {
        }
    }
}
