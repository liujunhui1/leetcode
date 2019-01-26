package 初级算法.字符串;

import javafx.beans.binding.BooleanBinding;

/**
 * 军辉
 * 2018-09-26 16:54
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * 示例 1:
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * 输入: 120
 * 输出: 21
 * 注意:
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−2^31,  2^31 − 1](int类型的范围就这个)。
 * 根据这个假设，如果反转后的整数溢出，则返回 0。
 */
public class 颠倒整数 {
    public static void main(String[] args) {

        System.out.println(reverse(999999909));
    }


    public static int reverse(int x) {
        boolean b = true;
        if (x < 0) {
            b = false;
            x = 0 - x;
        }
        long tmp = x;
        long res = 0;
        while (tmp != 0) {
            res = res * 10 + tmp % 10;
            tmp /= 10;
        }
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return 0;
        }
        if(b){
            return (int) res;
        } else {
            return (int) -res;
        }
       // return (int) (x >= 0 ? res : -res);
    }

    public static int reverse1(int x) {
        if (x == 0 || x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) return 0;
        boolean b = true;
        if (x < 0) {
            b = false;
            x = 0 - x;
        }
        while (x % 10 == 0) {
            x /= 10;
        }
        String st = x + "";
        char[] ch = st.toCharArray();
        for (int i = 0; i < ch.length / 2; i++) {
            char tmp = ch[i];
            ch[i] = ch[ch.length - 1 - i];
            ch[ch.length - 1 - i] = tmp;
        }
        String s = "";
        for (char c : ch) {
            s += c;
        }
        int i = Integer.parseInt(s);
        if (b) {
            return i;
        } else {
            return -i;
        }

    }

}
