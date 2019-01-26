package 初级算法.其他;

/**
 * 军辉
 * 2018-11-17 15:52
 * 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
 * 输入: 11
 * 输出: 3
 * 解释: 整数 11 的二进制表示为 00000000000000000000000000001011
 */
public class 位1的个数 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
    }

    public static int hammingWeight(int n) {
        int count = 0;
        String st = Integer.toBinaryString(n);
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
