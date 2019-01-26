package 初级算法.数组;

/**
 * 军辉
 * 2018-09-02 14:34
 */
public class test {
    public static void main(String[] args) {
        int a = 3, b = 3;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b);
    }
}
