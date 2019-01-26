package cn.junhui.初级算法.树;

import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * 军辉
 * 2018-10-09 14:54
 */
public class DFS_BFS {
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
        dfs(t1);
        System.out.println();
       // bfs(t1);
    }

    /*
    depth first search
     */
    public static void dfs(TreeNode root) {
        if (root == null) {
            System.out.println("empty tree");
            return;
        }
        //     ArrayDeque<TreeNode> stack=new ArrayDeque<TreeNode>();
        Stack<TreeNode> stack = new Stack();   //也可以用栈实现

        stack.push(root);//将元素压入堆栈顶部
        while (stack.isEmpty() == false) {
            TreeNode node = stack.pop();//删除栈顶元素，并将该元素返回
            System.out.print(node.val + " ");
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    /*
    breadth first search
     */
    public static void bfs(TreeNode root) {
        if (root == null) {
            System.out.println("empty tree");
            return;
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);//在队列尾部添加一元素
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();//删除头部元素，并返回次元素
            System.out.print(node.val + " ");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }
}
