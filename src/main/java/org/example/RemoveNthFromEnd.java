package org.example;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode preDelete = dummy;
        ListNode fast = dummy;

        while ( n >= 0) {
            fast = fast.next;
            n--;
        }

        while (fast != null) {
            preDelete = preDelete.next;
            fast = fast.next;
        }

        preDelete.next = preDelete.next.next;

        return dummy.next;

    }
}
