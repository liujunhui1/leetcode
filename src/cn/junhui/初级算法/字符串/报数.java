package 初级算法.字符串;

import java.util.HashMap;

/**
 * 军辉
 * 2018-09-29 20:20
 * <p>
 * 报数序列是指一个整照其中的整数的顺序进数序列，按行报数，得到下一个数。其前五项如下：
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
 * 注意：整数顺序将表示为一个字符串。
 * 示例 1:
 * <p>
 * 输入: 1
 * 输出: "1"
 * 示例 2:
 * <p>
 * 输入: 4
 * 输出: "1211"
 */
public class 报数 {

    public static void main(String[] args) {
        int n = 30;
        System.out.println(countAndSay(n));
    }

    public static String countAndSay(int n) {
        String st = "1";
        while (--n > 0) {
            st = toStr(st);
        }
        return st;
    }

    private static String toStr(String st) {
        String res = "";
        int i = 0;
        while (i < st.length()) {
            char ch = st.charAt(i);
            int cnt = 0;
            while (i < st.length() && ch == st.charAt(i)) {
                i++;
                cnt++;
            }
            res += cnt;//先加上前面改变的值
            res += ch;//再加上后面准备改变的值
        }
        return res;
    }
}
