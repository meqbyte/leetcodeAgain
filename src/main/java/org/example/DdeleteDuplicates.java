package org.example;

public class DdeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode();
        dummy.val = Integer.MIN_VALUE;
        dummy.next = head;

        ListNode pre = dummy;
        ListNode curr = pre.next;
        while (curr != null) {
            if (curr.val != pre.val) {
                pre.next = curr;
                pre = curr;
            }

            curr = curr.next;
        }

        pre.next = null;
        return dummy.next;
    }
}
