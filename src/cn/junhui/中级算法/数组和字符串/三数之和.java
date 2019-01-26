package cn.junhui.中级算法.数组和字符串;

import java.util.List;

/**
 * 军辉
 * 2018-11-17 20:21
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，
 * 使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * <p>
 * 满足要求的三元组集合为：
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 *将时间复杂度 由 O立方 降为 O平方
 * 我们可以先将原数组从小到大排序，固定其中两个元素 i 和 j，i从前往后走，
 * j从后往前走，i 每往后一个，将 j 重置为数组末尾的下标，在 i 和 j 之间找使nums[i] + nums[j] + nums[k] == 0成立的k。
 *
 * 那么如何去重呢？
 * 每次得出nums[i] + nums[j] + nums[k] == 0成立的i、j、k之后，令 i 往后走，直到nums[i] != nums[i + 1],
 * 并令 j 向前走，直到nums[j] != nums[j - 1]。这样就能保证得到的三个数字不会有重复

 */
public class 三数之和 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        threeSum(nums);
    }

    public static void threeSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if ((nums[i] + nums[j] + nums[k]) == 0) {
                        System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
                    }
                }
            }
        }
    }

   /* public static List<List<Integer>> threeSum(int[] nums) {

    }*/
   //测试
}
