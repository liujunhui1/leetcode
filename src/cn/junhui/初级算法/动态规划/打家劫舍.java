package cn.junhui.初级算法.动态规划;

/**
 * 军辉
 * 2018-10-27 21:43
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，
 * 影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 * <p>
 * 示例 1:
 * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 * 偷窃到的最高金额 = 1 + 3 = 4 。
 * 示例 2:
 * 输入: [2,7,9,3,1]
 * 输出: 12
 * 解释: 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 * 偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 * <p>
 *
 * 需要找到一个 状态转移方程
 * dp[i] =
 */
public class 打家劫舍 {
    /*
    分析 {2 7 9 3 1}
    首先 dp[0] = arr[0]
    dp[1]--> 2 < 7 -->dp[1] = 7
    dp[2]--> 7 < 9 -- dp[2] = max(dp[2-2]+arr[2],dp[1])
     */

   /* public static int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0].nums[1]);
        //int n = 0;
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }

        return dp[nums.length - 1];
    }*/

    public static void main(String[] args) {
        int arr[] = {2, 1, 1, 2};
        System.out.println(rob(arr));
    }

    public static int rob(int[] nums) {
        int a = 0, b = 0;
        for (int i = 0; i < nums.length; ++i) {
            int m = a, n = b;
            a = n + nums[i];
            b = Math.max(m, n);
        }
        return Math.max(a, b);
    }
}
