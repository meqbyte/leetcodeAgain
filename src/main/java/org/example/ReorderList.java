package org.example;

import java.util.ArrayList;
import java.util.List;

public class ReorderList {
    public void reorderList(ListNode head) {

        ListNode p = head;
        // 这里是用ArrayList,还是用LinkedList
        List<ListNode> list = new ArrayList<>();

        while (p != null) {

            list.add(p);
            p = p.next;

        }

        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode pre = dummy;
        int n = list.size();
        for (int i = 0; i < n / 2; i++) {
            ListNode first = list.get(i);
            ListNode second = list.get(n - 1 - i);

            pre.next = first;
            first.next = second;
            second.next = null;
            pre = second;
        }

        if (n % 2 == 1) {
            pre.next = list.get(n / 2);
            pre = pre.next;
        }

        pre.next = null;

        head = dummy.next;

    }
}
