package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ZigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }

        List<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        boolean fromLeft = true;
        while (!queue.isEmpty()) {

            int size = queue.size();
            // insert
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.get(i);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            if (fromLeft) {
                List<Integer> temp = new LinkedList<>();
                for (int i = 0; i < size; i++) {
                    temp.add(queue.get(i).val);
                }
                result.add(temp);
            } else {
                List<Integer> temp = new LinkedList<>();
                for (int i = size - 1; i >= 0; i--) {
                    temp.add(queue.get(i).val);
                }
                result.add(temp);
            }

            for (int i = 0; i < size; i++) {
                queue.removeFirst();
            }

            fromLeft = !fromLeft;
        }
        return result;
    }
}
