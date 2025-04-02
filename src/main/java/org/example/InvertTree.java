package org.example;

public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    private void invert(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;

        invert(root.left);
        invert(root.right);
    }

}
