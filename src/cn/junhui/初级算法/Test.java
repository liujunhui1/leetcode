package 初级算法;

/**
 * 军辉
 * 2018-09-19 11:04
 */
public class Test {
    /*
    public String substring(int beginIndex,int endIndex)返回一个字符串，
    该字符串是此字符串的子字符串。 子串开始于指定beginIndex并延伸到字符索引endIndex - 1 。 因此，子串的长度为endIndex-beginIndex 。
例子：
 "hamburger".substring(4, 8) returns "urge"
 "smiles".substring(1, 5) returns "mile"
 参数
beginIndex - 开始索引，包括。
endIndex - 结束索引，独家。
结果
指定的子字符串。
     */
    public static void main(String[] args) {
        String s = "0000000000012345678";
        char ch[] = s.toCharArray();
 /*       for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '0') {

            }
        }*/
        String st = "";
        int i = 0;
        while (ch[i] != '0') {
            st += ch[i];
            i++;
        }
        if (st.length() >= 10) {
            if (ch[0] == '-') {
                System.out.println(Integer.MIN_VALUE);
            } else {
                System.out.println(Integer.MAX_VALUE);
            }
        } else {
            System.out.println(Integer.parseInt(s));
        }

    }

}
