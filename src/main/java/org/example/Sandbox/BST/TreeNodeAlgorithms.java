package org.example.Sandbox.BST;

public class TreeNodeAlgorithms {
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        // base case
        if (root == null){
            return new TreeNode(val);
        }

        if (val < root.val){
            root.left = insertIntoBST(root.left, val);
        } else if (val > root.val){
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }
}
