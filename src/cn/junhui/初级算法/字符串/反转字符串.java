package 初级算法.字符串;

import java.util.Scanner;

/**
 * 军辉
 * 2018-09-19 10:15
 * <p>
 * 编写一个函数，其作用是将输入的字符串反转过来。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "hello"
 * 输出: "olleh"
 * 示例 2:
 * <p>
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: "amanaP :lanac a ,nalp a ,nam A"
 */
public class 反转字符串 {
    public static void main(String[] args) {

        String s = "amanaP :lanac a ,nalp a ,nam A";
        String st = fan(s);

        System.out.println(st);
    }

    public static String fan(String s) {
/*       if (s == null) {
            return null;
        }
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            s1 += s.substring(s.length() - 1 - i, s.length() - i);
        }
        return s1;*/
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();

    }
}
