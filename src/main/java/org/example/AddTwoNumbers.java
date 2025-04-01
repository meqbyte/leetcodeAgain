package org.example;

import java.util.List;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // p l1
        // q l2

        ListNode p = l1;
        ListNode q = l2;
        ListNode pre = null;
        ListNode head = null;
        int carry = 0;
        while (p != null && q != null) {
            ListNode node = new ListNode();
            node.val = (p.val + q.val + carry) % 10 ;
            node.next = null;

            carry = (p.val + q.val + carry) / 10;

            if (head == null) {
                head = node;
            }

            if (pre != null) {
                pre.next = node;
                pre = node;
            } else {
                pre = node;
            }

            p = p.next;
            q = q.next;
        }

        while (p != null) {
            ListNode node = new ListNode();
            node.val = (p.val + carry) % 10;
            node.next = null;

            carry = (p.val + carry) / 10;

            if (pre != null) {
                pre.next = node;
                pre = node;
            } else {
                pre = node;
            }

            p = p.next;
        }

        if (q != null) {
            ListNode node = new ListNode();
            node.val = (q.val + carry) % 10;
            node.next = null;

            carry = (q.val + carry) / 10;

            if (pre != null) {
                pre.next = node;
                pre = node;
            } else {
                pre = node;
            }

            q = q.next;
        }

        if (carry > 0) {
            ListNode node = new ListNode();
            node.val = carry;
            node.next = null;

            pre.next = node;
        }

        return head;

    }
}
