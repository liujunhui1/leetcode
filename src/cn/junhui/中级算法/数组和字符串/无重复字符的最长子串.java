package cn.junhui.中级算法.数组和字符串;

import java.util.HashMap;
import java.util.Map;

/**
 * 军辉
 * 2019-01-28 18:28
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class 无重复字符的最长子串 {
    /*
    子串：必须是连续的
    子序列：不必连续
     */
    /*
    使用的hashmap
     */
   /* public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            result = Math.max(result, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return result;
    }*/
/*
使用数组 int[26] 适用于26个字母 a-z 或者 A-Z
        int[128] 适用于ASCII码
        int[256] 适用于扩展ASCII码
 */
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int result = 0;
        int arr[] = new int[128];
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(arr[s.charAt(j)], i);
            result = Math.max(result, j - i + 1);
            arr[s.charAt(j)] = j + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
