package 初级算法.数学;

/**
 * 军辉
 * 2018-11-17 11:17
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 * 输入: 27
 * 输出: true
 * <p>
 * 输入: 45
 * 输出: false
 */
public class 三的幂 {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(1162261467 ));
    }

    public static boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        }
        while (n > 3) {
            if (n % 3 != 0) {
                return false;
            } else {
                n /= 3;
                System.out.print(n+" ");
            }
        }
        if (n == 3) {
            return true;
        } else {
            return false;
        }
    }
}
