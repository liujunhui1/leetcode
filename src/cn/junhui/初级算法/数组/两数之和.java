package cn.junhui.初级算法.数组;

/**
 * 军辉
 * 2018-09-14 9:33
 * <p>
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * <p>
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class 两数之和 {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length;j++){
                if(nums[i] + nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = {3,3};
        nums = twoSum(nums, 6);
        for (int i : nums) {
            System.out.print(i + " ");
        }

    }

}
