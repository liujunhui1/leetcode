package 初级算法.其他;

import java.util.Stack;

/**
 * 军辉
 * 2018-11-17 16:06
 */
public class 有效的括号 {
    public static void main(String[] args) {
        String s = "{{";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        if (s == null) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                //删除栈顶元素，并返回
                char topChar = stack.pop();

                if (ch == ')' && topChar != '(') {
                    return false;
                } else if (ch == '}' && topChar != '{') {
                    return false;
                } else if (ch == ']' && topChar != '[') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
