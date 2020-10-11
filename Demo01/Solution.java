package Demo01;

/*
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

* 来源：力扣（LeetCode）
* 链接：https://leetcode-cn.com/problems/two-sum
* 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

1.解题思路，暴力枚举
枚举每一个数x，寻找数组中是否存在 target - x
先查找每一个值相加的值是否会与target相同，再进行查找对应元素下标

值得注意的是：
因为要使用数组的值的下标，所以说，for循环基本必不可少
而且这是第一道算法题，内容简单，题目描述也很明确，需要哪些元素则输入哪些元素
这一点在定义变量时很明确，因此设计好算法的计算方式很重要

* */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
