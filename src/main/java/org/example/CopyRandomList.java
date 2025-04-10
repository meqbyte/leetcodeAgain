package org.example;

import java.util.HashMap;

public class CopyRandomList {
    public Node copyRandomList(Node head) {

        HashMap<Node, Node> hashMap = new HashMap<>();

        Node curr = head;
        while (curr != null) {

            Node newNode = new Node(curr.val);
            hashMap.put(curr, newNode);
            curr = curr.next;

        }


        curr = head;
        while (curr != null) {

            Node newNode = hashMap.get(curr);
            newNode.next = hashMap.get(curr.next);
            newNode.random = hashMap.get(curr.random);

            // bug
            curr = curr.next;
        }


        return hashMap.get(head);


    }
}
