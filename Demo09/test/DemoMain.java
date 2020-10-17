package Demo09.test;

import java.util.Scanner;
public class DemoMain {
    public static void main (String []args){
        System.out.println("请输入一个值");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Solution2 sl = new Solution2();
        sl.judgeNum(num);

    }
}