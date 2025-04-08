package org.example;

import java.util.ArrayList;
import java.util.List;

public class LevelOrder2 {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();
        level(root, list, 0);
        return list;

    }

    private void level(TreeNode root, List<List<Integer>> list, int levelIndex) {

        if (root == null) {
            return;
        }

        if (list.size() - 1 < levelIndex) {
            List<Integer> l = new ArrayList<>();
            list.add(l);
        }
        list.get(levelIndex).add(root.val);

        level(root.left, list, levelIndex + 1);
        level(root.right, list, levelIndex + 1);


    }

}
