package cn.junhui.初级算法.树;

/**
 * 军辉
 * 2018-10-08 10:45
 * 树:前中后序 遍历 （前序遍历：根左右)
 *      1
 *     / \
 *    2   2
 *   / \ / \
 *  3  4 4  3
 * 深度搜索 DFS (Depth First Search)：
 * 1 --> 2 --> 3 --> 4 --> 2 --> 4 --> 3
 *
 * 广度搜索 BFS (Breadth First Search)
 * 1 --> 2 --> 2 --> 3 --> 4 --> 4 --> 3
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left.val +
                ", right=" + right.val +
                '}';
    }
}
