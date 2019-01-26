package 初级算法.链表;

import java.util.List;

/**
 * 军辉
 * 2018-10-01 8:09
 * <p>
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */
public class 反转链表 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        System.out.println(l1);
        // reverseList(l1);
        System.out.println(reverseList(l1));
    }

    //迭代
    public static ListNode reverseList(ListNode head) {
        ListNode p = head;

        ListNode q = null;//新节点用来存放结果

        while (p != null) {//遍历输入链表，开始处理每一个节点
            //p.next = p.next.next;
            ListNode node = p.next;//先处理第一个节点p，需要一个指针来存储 p 的后继
            p.next = q;//将 p 放到新链表头结点的首部
            q = p; //移动新链表的头指针，让他始终指向新链表头部
            p = node; //继续处理原链表的节点，即 之前指针存放的后继，循环反复
        }
        return q;

    }

    //递归
    public static ListNode rever(ListNode head){
        return null;
    }
}
