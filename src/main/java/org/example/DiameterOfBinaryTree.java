package org.example;

public class DiameterOfBinaryTree {

    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
         height(root);
        return maxDiameter;
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (leftHeight + rightHeight > maxDiameter) {
            maxDiameter = leftHeight + rightHeight;
        }

        return Math.max(leftHeight, rightHeight) + 1;

    }

}
