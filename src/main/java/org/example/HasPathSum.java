package org.example;

public class HasPathSum {


    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        return hasPath(root, targetSum);
    }

    private boolean hasPath(TreeNode root, int remain) {

        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            if (remain == root.val) {
                return true;
            }
        }



        return hasPath(root.left, remain - root.val) ||
                hasPath(root.right, remain - root.val);

    }

}
