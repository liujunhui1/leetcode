package 初级算法.字符串;

import java.util.Arrays;

/**
 * 军辉
 * 2018-09-26 22:08
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 * 示例 1:
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 */
public class 字母异位词 {
    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "car"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char chs[] = s.toCharArray();
        Arrays.sort(chs);
        char[] cht = t.toCharArray();
        Arrays.sort(cht);
        System.out.println();
        for (int i = 0; i < s.length(); i++) {
            if (chs[i] == cht[i]) {
            } else {
                return false;
            }
        }
        return true;
    }
}
