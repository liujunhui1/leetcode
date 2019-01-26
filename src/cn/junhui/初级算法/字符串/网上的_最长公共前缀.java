package cn.junhui.初级算法.字符串;
/**
 * 军辉
 * 2018-09-29 22:12
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 示例 1:
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * 所有输入只包含小写字母 a-z 。
 */
public class 网上的_最长公共前缀 {
    public static void main(String[] args) {
        String[] strs = {};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int minLen = strs[0].length();
        for (String s : strs) {
            minLen = Math.min(minLen, s.length());
        }
        if (minLen == 0) {
            return "";
        }
        StringBuffer sb = new StringBuffer(minLen);
        for (int j = 0; j < minLen; j++) {
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].charAt(j) != strs[0].charAt(j))
                    return sb.toString();

            }
          sb.append(strs[0].charAt(j));

        }
        return sb.toString();
    }

}