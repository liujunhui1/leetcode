package cn.junhui.初级算法.树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 军辉
 * 2018-10-08 10:45
 * <p>
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 说明: 叶子节点是指没有子节点的节点。
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回它的最大深度 3 。
 */
/*
Queue 队列
    Boolean add(E e):将指定的元素插入到此队列中，如果可以立即执行此操作，而不会违反容量限制，
true在成功后返回 IllegalStateException如果当前没有可用空间，则抛出IllegalStateException。
    Boolean offer(E e): 如果在不违反容量限制的情况下立即执行，则将指定的元素插入到此队列中。
    E peek(): 检索但不删除次队列的头
    E poll():检索并删除此队列的头，如果此队列为空，则返回null
    E remove():检索并删除此队列的头
 */
public class 二叉树的最大深度 {
    public static void main(String[] args) {

        TreeNode tn1 = new TreeNode(3);
        TreeNode tn2 = new TreeNode(9);
        TreeNode tn3 = new TreeNode(20);
        TreeNode tn4 = new TreeNode(15);
        TreeNode tn5 = new TreeNode(7);
        tn1.left = tn2;
        tn1.right = tn3;
        tn3.left = tn4;
        tn3.right = tn5;

        System.out.println(maxDepth(tn1));
    }

    //递归
    public static int maxDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }
        if (null == root.left && null == root.right) {
            return 1;
        }

        int l = 0, r = 0;
        if (null != root.left) {
            l = maxDepth(root.left) + 1;
        }
        if (null != root.right) {
            r = maxDepth(root.right) + 1;
        }
        return Math.max(l, r);
    }

    /*public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int res = 0;
        //队列
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        //插入一个元素

        while (!q.isEmpty()) {
            ++res;
            int n = q.size();
            for (int i = 0; i < n; ++i) {
                TreeNode tn = q.poll();
                if (tn.left != null) {
                    q.offer(tn.left);
                }
                if (tn.right != null) {
                    q.offer(tn.right);
                }
            }
        }
        return res;
    }*/
}
