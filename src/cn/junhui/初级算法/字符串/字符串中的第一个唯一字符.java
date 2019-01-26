package 初级算法.字符串;

import java.util.HashMap;

/**
 * 军辉
 * 2018-09-26 17:52
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * 案例:
 * s = "leetcode"
 * 返回 0.
 * s = "loveleetcode",
 * 返回 2.
 * 注意事项：您可以假定该字符串只包含小写字母。
 */
public class 字符串中的第一个唯一字符 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("dddccdbba"));
    }

    public static int firstUniqChar(String s) {

        HashMap<String, Integer> hm = new HashMap<>();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (hm.containsKey(ch[i] + "")) {
                int val = hm.get(ch[i] + "");
                hm.put(ch[i] + "", ++val);
            } else {
                hm.put(ch[i] + "", 1);
            }
        }
        for (int i = 0; i < ch.length; i++) {
         //   System.out.println(hm.get(ch[i]+""));
            if (hm.get(ch[i] + "") == 1) {
                return i;
            }
        }
        return -1;
    }
}
