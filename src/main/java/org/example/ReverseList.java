package org.example;

public class ReverseList {

    public static ListNode reverseList(ListNode head) {

        // input check, null
        if (head == null) {
            return null;
        }

        // from left to right
        ListNode dummy = new ListNode();
        dummy.next = null;

        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = dummy.next;
            dummy.next = curr;
            curr = temp;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        System.out.println("hello,world");

        // 初始化链表 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        head = ReverseList.reverseList(head);
        // 遍历链表
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }

    }

}
