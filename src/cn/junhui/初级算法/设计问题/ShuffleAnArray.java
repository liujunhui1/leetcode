package cn.junhui.初级算法.设计问题;

import com.sun.org.apache.bcel.internal.generic.SWAP;
import sun.security.util.AuthResources_it;

import java.util.Random;

/**
 * 军辉
 * 2018-11-17 8:47
 * <p>
 * 打乱一个没有重复元素的数组。
 * <p>
 * 示例:
 * <p>
 * // 以数字集合 1, 2 和 3 初始化数组。
 * int[] nums = {1,2,3};
 * Solution solution = new Solution(nums);
 * <p>
 * // 打乱数组 [1,2,3] 并返回结果。任何 [1,2,3]的排列返回的概率应该相同。
 * solution.shuffle();
 * <p>
 * // 重设数组到它的初始状态[1,2,3]。
 * solution.reset();
 * <p>
 * // 随机返回数组[1,2,3]打乱后的结果。
 * solution.shuffle();
 */
public class ShuffleAnArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Solution s = new Solution(nums);
        int reset[] = s.reset();
        for (int r : reset) {
            System.out.print(r + " ");
        }
        System.out.println();
        int[] shuffle = s.shuffle();
        for (int sh : shuffle) {
            System.out.print(sh + " ");
        }
    }
}

class Solution {
    private int[] nums = null;
    private Random random = null;

    public Solution(int[] nums) {
        this.nums = nums;
        random = new Random();
    }

    public int[] reset() {
        return nums;
    }

    public int[] shuffle() {
        if (nums == null) {
            return null;
        }
        int[] a = nums.clone();
        for (int i = 1; i < nums.length; i++) {
            int j = random.nextInt(i + 1);
            /*
            返回伪随机数 界于 (0,n)
             */
            swap(a, i, j);
        }
        return a;
    }

    public static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}