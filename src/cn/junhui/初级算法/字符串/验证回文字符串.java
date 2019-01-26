package 初级算法.字符串;

import java.util.ArrayList;

/**
 * 军辉
 * 2018-09-26 22:23
 *
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * 示例 1:
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 * 输入: "race a car"
 * 输出: false
 */
public class 验证回文字符串 {
    public static void main(String[] args) {
        String st = "0P";
        boolean b = isPalindrome(st);
        System.out.println(b);
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char ch[] = s.toCharArray();
        if(ch.length == 0){
            return true;
        }
        ArrayList<Character> al = new ArrayList<>();
        for(int i = 0; i < ch.length; i++){
            if((ch[i] >= 'a' && ch[i] <= 'z')||(ch[i] >= '0' && ch[i] <= '9')){
                    al.add(ch[i]);
            }
        }
        for(int i = 0; i < al.size() / 2; i++){
            if(al.get(i) != al.get(al.size() - 1 - i)){
                return false;
            }
        }
        return true;
    }

}
