package cn.junhui.初级算法.链表;

/**
 * 军辉
 * 2018-10-01 8:10
 */
public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "val: " + val +
                " --> next: " + next;
    }
}
