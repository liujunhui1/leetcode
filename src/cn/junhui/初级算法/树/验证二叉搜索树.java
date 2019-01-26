package cn.junhui.初级算法.树;

import sun.reflect.generics.tree.Tree;

/**
 * 军辉
 * 2018-10-08 21:14
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 * <p>
 * 假设一个二叉搜索树具有如下特征：
 * <p>
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 * 示例 1:
 * <p>
 * 输入:
 * 2
 * / \
 * 1   3
 * 输出: true
 * 示例 2:
 * <p>
 * 输入:
 * 5
 * / \
 * 1   4
 * / \
 * 3   6
 * 输出: false
 * 解释: 输入为: [5,1,4,null,null,3,6]。
 * 根节点的值为 5 ，但是其右子节点值为 4 。
 */
public class 验证二叉搜索树 {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(4);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(6);
        t1.left = t2;
        t1.right = t3;
        t3.left = t4;
        t3.right = t5;
      //  TreeNode t1 = new TreeNode(null);
        System.out.println(isValidBST(t1));

    }

    public static boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if (root == null) return true;
        if (root.val >= maxVal || root.val <= minVal) return false;
        return isValidBST(root.left, minVal, root.val)
                && isValidBST(root.right, root.val, maxVal);
    }

   /* public static boolean isValidBST(TreeNode root) {
        if (null == root) {
            return false;
        }
        if (null == root.left && null == root.right) {
            return false;
        }
        if (null != root.left) {
            if (root.left.val >= root.val) {
                return false;
            } else {
                isValidBST(root.left);
            }
        }
        if (null != root.right) {
            if (root.right.val <= root.val) {
                return false;
            } else {
                isValidBST(root.right);
            }
        }
        return true;
    }*/
}
