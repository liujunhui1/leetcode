package cn.junhui.中级算法.数组和字符串;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 军辉
 * 2018-11-17 20:54
 * 给定一个 m x n 的矩阵，如果一个元素为 0，则将其所在行和列的所有元素都设为 0。请使用原地算法。
 * <p>
 * 输入:
 * [
 * [1,1,1],
 * [1,0,1],
 * [1,1,1]
 * ]
 * 输出:
 * [
 * [1,0,1],
 * [0,0,0],
 * [1,0,1]
 * ]
 */
public class 矩阵置零 {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5},
        };
        setZeroes(arr);
    }

    public static void setZeroes(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> zero = new HashMap<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    // zero.put(i, j);
                    list.add(i);
                    list.add(j);
                }
            }
        }

        for (int i = 0; i < list.size() - 1; i += 2) {
            //    System.out.println(list.get(i) + " " + list.get(i + 1));
            int p = list.get(i);
            int q = list.get(i + 1);
            for (int k = 0; k < matrix[0].length; k++) {
                matrix[p][k] = 0;
            }
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][q] = 0;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


}
