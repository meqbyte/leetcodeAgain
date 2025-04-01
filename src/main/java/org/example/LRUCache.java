package org.example;

import java.util.HashMap;

public class LRUCache {

    private static class Node {
        private int key;
        private int value;
        private Node pre;
        private Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
            pre = null;
            next = null;
        }
    }

    private int capacity = 0;
    private final HashMap<Integer, Node> hashMap = new HashMap<>();
    private final Node head = new Node(-1,-1);
    private final Node tail = new Node(-1,-1);

    public LRUCache(int capacity) {
        this.capacity = capacity;
        // 重要 一个优化的技巧
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {

        if (!hashMap.containsKey(key)) {
            return -1;
        }

        Node curr = hashMap.get(key);

        curr.pre.next = curr.next;
        curr.next.pre = curr.pre;

        moveToTail(curr);

        return curr.value;
    }

    public void put(int key, int value) {

        // normal case , less than capacity
        // case , reach capacity

        if (hashMap.size() == capacity) {
            // delete head next node
            Node t = head.next;
            if (t != null) {
                head.next = t.next;
                t.next.pre = head;
                hashMap.remove(t.key);
            }
        }

        // new node, hashmap put this node
        Node node = new Node(key,value);
        hashMap.put(key, node);

        moveToTail(node);

    }

    private void moveToTail(Node node) {
        // tail operation
        if (tail.pre == null) {
            tail.pre = node;
            node.next = tail;
        } else {
            Node t = tail.pre;
            t.next = node;
            node.pre = t;
            tail.pre = node;
        }
    }


}
