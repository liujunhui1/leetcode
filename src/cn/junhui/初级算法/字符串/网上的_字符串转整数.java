package cn.junhui.初级算法.字符串;



/**
 * 军辉
 * 2018-09-28 22:10
 */
public class 网上的_字符串转整数 {
    public static void main(String[] args) {

        String s = " -000000000000000123";
        System.out.println(myAtoi(s));
    }


    public static int myAtoi(String str) {
        int length = str.length();
        int start = 0;
        int factor = 1;//判断 正负号
        long result = 0;
        StringBuffer sb = new StringBuffer();

        if (str.length() == 0)
            return 0;

        while (start < length && str.charAt(start) == ' ') {
            start++;
        }
        if (start == length)
            return 0;
        if (str.charAt(start) == '-' || str.charAt(start) == '+') {
            factor = str.charAt(start) == '-' ? -1 : 1;
            start++;
        }


        for (int i = start; i < length; i++) {
            int num = str.charAt(i) - '0';
            if (num < 0 || num > 9)
                break;
            sb.append(str.charAt(i));
        }

        for (int i = 0; i < sb.length(); i++) {
            result = sb.charAt(i) - '0' + result * 10;
            if (result * factor > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (result * factor < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }

        return (int) ((int) factor * result);
    }

}
