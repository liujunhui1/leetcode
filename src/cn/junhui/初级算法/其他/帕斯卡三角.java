package cn.junhui.初级算法.其他;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 军辉
 * 2018-11-17 17:50
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 输入: 5
 * 输出:
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */
public class 帕斯卡三角 {
    public static void main(String[] args) {
        generate(5);
    }

    public static List<List<Integer>> generate(int numRows) {
        int arr[][] = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
            arr[i][0] = 1;
            arr[i][i] = 1;
        }
        for (int i = 1; i < numRows; i++) {
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        List<List<Integer>> Lists = new ArrayList<>();
        List<Integer> list = null;
        for (int i = 0; i < numRows; i++) {
            list = new ArrayList();
            for (int j = 0; j <= i; j++) {
                //System.out.print(arr[i][j] + " ");

                list.add(arr[i][j]);
            }
            Lists.add(list);
            //System.out.println();
        }
        return Lists;
    }
}
