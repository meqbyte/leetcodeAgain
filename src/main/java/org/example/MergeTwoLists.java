package org.example;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-999,null);

        ListNode pre = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                ListNode next = list1.next;
                list1.next = null;
                pre.next = list1;
                pre = pre.next;
                list1 = next;
            } else {
                ListNode next = list2.next;
                list2.next = null;
                pre.next = list2;
                pre = pre.next;
                list2 = next;
            }
        }

        if (list1 != null) {
            pre.next = list1;
        }

        if (list2 != null) {
            pre.next = list2;
        }

        return dummy.next;
    }
}
