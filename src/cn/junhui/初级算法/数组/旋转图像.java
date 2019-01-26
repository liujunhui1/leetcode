package 初级算法.数组;


/**
 * 军辉
 * 2018-09-17 10:48
 * <p>
 * 给定一个 n × n 的二维矩阵表示一个图像。
 * 将图像顺时针旋转 90 度。
 * 说明：
 * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
 * 示例 1:给定 matrix =
 * [
 * [1,2,3],
 * [4,5,6],
 * [7,8,9]
 * ],
 * 原地旋转输入矩阵，使其变为:
 * [
 * [7,4,1],
 * [8,5,2],
 * [9,6,3]
 * ]
 * 示例 2:给定 matrix =
 * [
 * [ 5, 1, 9,11],
 * [ 2, 4, 8,10],
 * [13, 3, 6, 7],
 * [15,14,12,16]
 * ],
 * <p>
 * 原地旋转输入矩阵，使其变为:
 * [
 * [15,13, 2, 5],
 * [14, 3, 4, 1],
 * [12, 6, 8, 9],
 * [16, 7,10,11]
 * ]
 */
public class 旋转图像 {
    /*
    转置矩阵:将矩阵的昂列互换得到的新矩阵成为转置矩阵，转置矩阵的行列式不变
     */
    public static void rotate(int[][] matrix) {
        int len = matrix[0].length;
        //把原数组 变为其 转置矩阵
        for (int i = 0; i < len; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
       /* System.out.println("转置矩阵");
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }*/
    }

    /*public static void swap(int x, int y) {
        int tmp = x;
        x = y;
        y = tmp;
        System.out.println("m:" + x + " n:" + y + "函数");
    }*/

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // System.out.println(matrix.length);
        rotate(matrix);

    }
}

        /*
        int n = matrix.length;
        for (int k = 0; k < n / 2; k++) {
            for (int i = 0; i < ((n - 2 * k) - 1); i++) {
                int tmp = matrix[k][k + i];
                matrix[k][k + i] = matrix[n - 1 - (k + i)][k];
                matrix[n - 1 - (k + i)][k] = matrix[n - 1 - k][n - 1 - (k + i)];
                matrix[n - 1 - k][n - 1 - (k + i)] = matrix[k + i][n - 1 - k];
                matrix[k + i][n - 1 - k] = tmp;
            }
        }*/
