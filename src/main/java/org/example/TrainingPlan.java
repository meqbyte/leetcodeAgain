package org.example;

import java.util.List;

public class TrainingPlan {
    public ListNode trainingPlan(ListNode head, int cnt) {

        ListNode slow = head, fast = head;
        for (int i = 0; i < cnt; i++) {
            fast = fast.next;
        }

        while (fast != null) {

            slow = slow.next;
            fast = fast.next;

        }

        return slow;

    }
}
