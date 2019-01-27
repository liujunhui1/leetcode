package cn.junhui.中级算法.数组和字符串;

import java.util.*;

/**
 * 军辉
 * 2019-01-27 18:58
 * <p>
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 * <p>
 * 示例:
 * <p>
 * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * 输出:
 * [
 * ["ate","eat","tea"],
 * ["nat","tan"],
 * ["bat"]
 * ]
 * 说明：
 * <p>
 * 所有输入均为小写字母。
 * 不考虑答案输出的顺序。
 */
public class 字谜分组 {
    /*这道题考察的就是如何判断两个字符串是否是字母异位词，这里有一个方法，
    如果把字母异位词重新排序，会得到相同的结果，所以重新排序可以判断两个字符串是否互为字母异位词。
    由于字母异位词重新排序后都会得到相同的字符串，所以我们可以定义一个 HashMap<String, List<String>>，
    以排序后的字符串作为 key，然后将所有字母异位词保存到该 key 对应的 ArrayList 中，
    最后再返回一个包含所有 ArrayList 的 List<List<String>> 即可。

。*/
    public static List<List<String>> groupAnagrams(String[] strs) {
        //Arrays.sort(strs);
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);

        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String strs[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> list = groupAnagrams(strs);
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
