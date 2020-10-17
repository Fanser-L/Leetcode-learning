package Demo09.test;


import java.util.Scanner;

public class Solution2 {
    public void judgeNum(int x) {
        int temp = 0;
        int pop = 0;

        if (x >= 10000) {
            System.out.println("输入值大于10000，将进行位数判断");
            while (x > 0) {
                x /= 10;
                temp++;
            }
            System.out.println("输入值为" + temp + "位数");
        } else if (x >= 0) {
            int num = x;
            System.out.println("输入值小于10000，判断是否为回文数");
            while (x >= 0) {
                pop = x % 10 + pop * 10;
                x /= 10;
            }
            if (pop == num) {
                System.out.println("输入的值为回文数:" + pop);
            } else
                System.out.println("输入的值不为回文数");
        }
        if (x < 0)
            System.out.println("输入值错误");
    }
}



