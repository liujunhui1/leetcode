package 初级算法.链表;


/**
 * 军辉
 * 2018-09-30 10:40
 * <p>
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 * 给定的 n 保证是有效的。
 * <p>
 * 进阶：
 * 你能尝试使用一趟扫描实现吗？
 */
/*
典型的利用双指针法解题。首先让指针 first 指向头节点，然后让其向后移动 n 步，
接着让指针 sec 指向头结点，并和 first 一起向后移动。
当 first 的 next 指针为 NULL 时，sec 即指向了要删除节点的前一个节点，
接着让 first 指向的 next 指针指向要删除节点的下一个节点即可。
注意如果要删除的节点是首节点，那么 first 向后移动结束时会为 NULL，
这样加一个判断其是否为 NULL 的条件，若为 NULL 则返回头结点的 next 指针。

思路很简单，只有两种出现的情况，1、链表的长度刚刚好等于n，也就是说删除表头节点，
2、链表长度大于n，那么我们先定义两个表头，一个后移n位，然后两个链表同时后移
，这时当后面的节点到达尾部时，前面的节点就是删除的节点的前一个节点。
 */
public class 删除链表的倒数第N个节点 {
    public static void main(String[] args) {

        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);
        ListNode ln4 = new ListNode(4);
        ListNode ln5 = new ListNode(5);
        // ListNode ln6 = new ListNode(6);
        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
        ln4.next = ln5;
        ln5.next = null;
        // ln5.next = ln6;
        System.out.println("初始的：" + ln1);
        System.out.println("处理之后的：" + removeNthFromEnd(ln1, 2));

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {


        ListNode p = head;
        ListNode q = head;
        for (int i = 0; i < n; i++) {
            p = p.next;
        }
        if (p == null) {
            head = head.next;
            return head;
        }
        while (p.next != null) {
            p = p.next;
            q = q.next;
        }
        q.next = q.next.next;//删除指定节点
        return head;
    }


}
