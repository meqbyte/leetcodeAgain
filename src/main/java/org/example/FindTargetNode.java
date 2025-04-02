package org.example;

import java.util.LinkedList;
import java.util.List;

public class FindTargetNode {

    private int counter = 0;
    private int result = 0;

    public int findTargetNode(TreeNode root, int cnt) {

        inOrder(root, cnt);
        return result;

    }

    private void inOrder(TreeNode root , int cnt) {
        if (root == null) {
            return ;
        }

        this.counter++;
        inOrder(root.right, cnt);

        if (this.counter == cnt) {
            this.result = root.val;
            return;
        }

        this.counter++;
        inOrder(root.left, cnt);

    }

}
