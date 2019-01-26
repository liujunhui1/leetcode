package 初级算法.树;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 军辉
 * 2018-10-09 10:26
 * 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
 * <p>
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回其层次遍历结果：
 * <p>
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 * 广度优先遍历
 */
public class 二叉树的层次遍历 {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(2);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(4);
        TreeNode t6 = new TreeNode(4);
        TreeNode t7 = new TreeNode(3);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;
        System.out.println(levelOrder(t1));
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List list = new LinkedList();
        Queue queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            List l1 = new LinkedList();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode t1 = (TreeNode) queue.poll();
                l1.add(t1.val);
                queue.add(t1.left);
                queue.add(t1.right);
            }
            list.add(l1);
        }
        return list;
    }
}
