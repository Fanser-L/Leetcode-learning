package Demo09;

/*
判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数
方法一：
对整数进行分解，每个数字进行倒置，然后拼成一个新的数，对这两个数进行比较，如果两数大小相同，则为回文数
注意： 这样的话，可能会超出数值存储范围造成数据丢失或者对不上，但实际上数值越界后会默认变成负数，负数必然不是回文数
方法二：
将整数转换为字符串，然后将字符串分割为数组，循环判断数组的一半元素是否相等即可
方法三：
取后半段数字进行反转
每次取余
将最低的数字加到取出数的末尾
然后同样的判断
注意的是：这里的判断并不是全部翻转完之后再进行判断，而是翻转一半就进行判断，先判断前一半和后一半翻转过的是否相等，不相等了就可以进行直接的返回了
*  */
public class Solution1 {

    public boolean judgeNum(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int reverseNum = 0;
        int num = x;
        while (x > 0) {
            if (reverseNum > Integer.MAX_VALUE / 10) return false;
            reverseNum = reverseNum * 10 + x % 10;
            x /= 10;
        }
        return num == reverseNum;
    }
}

//这个方法递交不了，LeetCode不能识别Integer关键字，观察发现递交的是c++
//=_= 眼睛不太好使，第一遍居然运行成功了。。。
