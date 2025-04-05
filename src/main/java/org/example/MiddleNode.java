package org.example;

public class MiddleNode {
    public ListNode middleNode(ListNode head) {

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast == null) {
            return slow;
        }

        if (fast.next == null) {
            return slow.next;
        }

        return null;
    }
}
