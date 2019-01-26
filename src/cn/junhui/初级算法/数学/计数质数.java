package cn.junhui.初级算法.数学;

/**
 * 军辉
 * 2018-11-17 10:48
 * 统计所有小于非负整数 n 的质数的数量。
 * 示例:
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 */
public class 计数质数 {
    public static void main(String[] args) {
        System.out.println(countPrimes(2));
        //System.out.println(isZhi(7));
    }

    public static int countPrimes(int n) {
        if (n <= 2 ) {
            return 0;
        }
        int count = 1;
        for (int i = 3; i < n; i+=2) {
            if (isZhi(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isZhi(int n) {
        for (int i = 3; i <= Math.sqrt(n); i+=2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
