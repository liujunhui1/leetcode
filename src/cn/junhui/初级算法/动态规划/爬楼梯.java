package 初级算法.动态规划;

import com.company.Main;

/**
 * 军辉
 * 2018-10-27 19:48
 * <p>
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 * 示例 1：
 * <p>
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 * <p>
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 * <p>
 * 要找到状态转移方程
 * dp[n]时，你有两种选择
 * 走一步 dp[n-1]
 * 走两步 dp[n-2]
 */
public class 爬楼梯 {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }


    public static int climbStairs(int n) {
    /*
    递归会超时

        if (n == 1 || n == 0) {
            return 1;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
     */
        int sum = 0;
        if (n < 2) {
            return 1;
        }
        int dp[] = new int[n];
        dp[0] = 1;//只有一个台阶
        dp[1] = 2;//有两个台阶时的步数

        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];

        }
        return dp[n - 1];
    }
}
