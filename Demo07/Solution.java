package Demo07;

/*
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
目标：
1.把输入的数反转，并且反转的数值不能大于int类能存储的最大值
2.怎么实现数的反转
（1）先将数字拆分开，每个数都拆分成单独的个体，然后再进行反向排序
（2）想到的简单的方法就是 x%10 ，对每一位的余数进行计算，直到最后 x%10==0
3.判断反转后的值会不会越界，超出int类型能存储的值的范围，因此需要加上if来进行判断
* */
public class Solution {
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
//            这里进行反转的第一步，先将数字拆分开成单个的数字
            if  (res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if  (res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;

            res = res * 10 + pop;
        }
        return res ;
    }

}
