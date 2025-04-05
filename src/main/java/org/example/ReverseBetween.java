package org.example;

public class ReverseBetween {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode pre = dummy;
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }


        int cnt = right - left ;
        ListNode curr = pre.next;
        for (int i = 0; i < cnt; i++) {
            ListNode next = curr.next;
            // delete
            curr.next = next.next;
            // insert after pre
            next.next = pre.next;
            pre.next = next;
        }

        return dummy.next;

    }
}
