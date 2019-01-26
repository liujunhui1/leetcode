package cn.junhui.中级算法.数组和字符串;

import java.util.ArrayList;
import java.util.Arrays;
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
 * 将时间复杂度 由 O立方 降为 O平方
 * 我们可以先将原数组从小到大排序，固定其中两个元素 i 和 j，i从前往后走，
 * j从后往前走，i 每往后一个，将 j 重置为数组末尾的下标，
 * 在 i 和 j 之间找使nums[i] + nums[j] + nums[k] == 0成立的k。
 * <p>
 * 那么如何去重呢？
 * 每次得出nums[i] + nums[j] + nums[k] == 0成立的i、j、k之后，令 i 往后走，
 * 直到nums[i] != nums[i + 1],
 * 并令 j 向前走，直到nums[j] != nums[j - 1]。这样就能保证得到的三个数字不会有重复
 */
public class 三数之和 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> list = threeSum(nums);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    /* 自己写的 O^3
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
     }*/

    /*
    思路：这道题与两数之和有一定区别，两数之和可以直接用list放置，但是三数和这么做时间复杂度过高O(n^2).
    因此先将数组排序，得到的有序数组中，设置一个目标target=0-a，然后再对剩下的两个数字进行筛选。
    递增数组可以选择二分查找，两根指针的方法，此处使用双指针的方法。
    注意点： 由于不包含重复元素，因此要去重。只要有两个元素重复，则跳过。
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) {//如果最小值大于0的话，三数之和不可能为0
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;//去重
            }
            int target = 0 - nums[i];
            int l = i + 1, r = len - 1; //此处必须对i后面的数字进行筛选，不能重复
            while (l < r) {
                List<Integer> list = new ArrayList<>();
                if (nums[l] + nums[r] == target) {
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    res.add(list);
                    while (r > l && nums[l + 1] == nums[l]) {
                        l++;
                    }
                    while (r > l && nums[r] == nums[r - 1]) {
                        r--;
                    }
                    l++;
                    r--;
                } else if (nums[l] + nums[r] > target) {
                    r--;
                } else {
                    l++;
                }

            }
        }
        return res;
    }
}
