package Demo09;

/*
疑问：如何实现继承原有类的方法时同时对原方法进行微小的修改，而不是完全的重写
* */
public class Solution3 extends Solution1 {
    @Override
    public boolean judgeNum(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int reverseNum = 0;
        while (x > reverseNum) {
            reverseNum = reverseNum * 10 + x % 10;
            x /= 10;
        }
        return x == reverseNum || x == reverseNum / 10;
    }
}
