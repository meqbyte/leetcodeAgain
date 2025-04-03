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

        Node node = hashMap.get(key);
        node.pre.next = node.next;
        node.next.pre = node.pre;

        Node preTail = tail.pre;
        preTail.next = node;
        node.pre = preTail;
        node.next = tail;
        tail.pre = node;

        return node.value;

    }

    public void put(int key, int value) {

        if (hashMap.containsKey(key)) {
            Node node = hashMap.get(key);
            node.value = value;

            node.pre.next = node.next;
            node.next.pre = node.pre;

            Node preTail = tail.pre;
            preTail.next = node;
            node.pre = preTail;
            node.next = tail;
            tail.pre = node;

            return;
        }

        // 到达容量限制 删除节点 更新指针head
        if (hashMap.size() == capacity) {
            Node t = head.next;
            head.next = t.next;
            t.next.pre = head;
            hashMap.remove(t.key);
        }

        Node node = new Node(key, value);
        // 插入到tail之前
        Node preTail = tail.pre;
        preTail.next = node;
        node.pre = preTail;
        node.next = tail;
        tail.pre = node;

        hashMap.put(key, node);

    }



}
