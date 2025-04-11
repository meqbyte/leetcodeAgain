package org.example;

public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode();
        dummy.next = head;

        exchange(head,dummy);

        return dummy.next;
    }

    private ListNode exchange(ListNode head, ListNode pre) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        ListNode first = head;
        ListNode second = head.next;
        ListNode third = second.next;

        pre.next = second;
        second.next = first;
        first.next = third;
        pre = first;

        exchange(third,pre);

        return second;

    }

}
