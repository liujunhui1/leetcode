package 初级算法.字符串;

/**
 * 军辉
 * 2018-09-28 17:56
 * <p>
 * 说明：
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。如果数值超过可表示的范围，
 * 则返回  INT_MAX (231 − 1) 或 INT_MIN (−231) 。
 * 示例 1:
 * <p>
 * 输入: "42"
 * 输出: 42
 * 示例 2:
 * <p>
 * 输入: "   -42"
 * 输出: -42
 * 解释: 第一个非空白字符为 '-', 它是一个负号。
 * 我们尽可能将负号与后面所有连续出现的数字组合起来，最后得到 -42 。
 * 示例 3:
 * <p>
 * 输入: "4193 with words"
 * 输出: 4193
 * 解释: 转换截止于数字 '3' ，因为它的下一个字符不为数字。
 * 示例 4:
 * <p>
 * 输入: "words and 987"
 * 输出: 0
 * 解释: 第一个非空字符是 'w', 但它不是数字或正、负号。
 * 因此无法执行有效的转换。
 * 示例 5:
 * <p>
 * 输入: "-91283472332"
 * 输出: -2147483648
 * 解释: 数字 "-91283472332" 超过 32 位有符号整数范围。
 * 因此返回 INT_MIN (−231) 。
 */
public class 字符串转整数 {

    public static void main(String[] args) {
        String s = "2147483800";
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String str) {
        str = str.trim();
        if (str.length() == 0 || str.equals("+") || str.equals("-")) {
            return 0;
        }
      //  System.out.println(str);
        long number = 0;
        boolean b = true;
        char ch[] = str.toCharArray();
        if ((ch[0] == '-' || ch[0] == '+') && ((ch[1] >= '0' && ch[1] <= '9'))) {
            b = false;
            number = toNum(ch, b);
            if (ch[0] == '-') {
                number = -number;
            }

        } else if ((ch[0] >= '0' && ch[0] <= '9')) {
            number = toNum(ch, b);
        } else {
            return 0;
        }
        return (int) number;
    }

    private static int toNum(char[] ch, boolean b) {
        int start = 0;
        if (!b) {
            start = 1;
        }
        String s = "";
        for (int i = start; i < ch.length; i++) {
            if (ch[i] >= '0' && ch[i] <= '9') {
                s += ch[i];
            } else {
                return isMax(s);
            }
        }

        return isMax(s);

    }

    static int isMax(String s) {
        char ch[] = s.toCharArray();
        String st = "";
        int i = 0;
        while (ch[i] != '0') {
            st += ch[i];
            if (i == ch.length - 1) {
                break;
            } else {
                i++;
            }
        }
        if (st.length() >= 10) {
            if (ch[0] == '-') {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        } else {
            return Integer.parseInt(s);
        }

    }
}