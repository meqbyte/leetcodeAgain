package org.example;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> list = new ArrayList<>();

        if (root != null) {
            queue.offer(root);
            level(queue, list);
        }


        return list;
    }

    private void level(Queue<TreeNode> queue, List<List<Integer>> list) {

        if (queue == null || queue.isEmpty()) {
            return;
        }

        while (!queue.isEmpty()) {
            List<Integer> l = new ArrayList<>();

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                l.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            list.add(l);
        }
    }
}
