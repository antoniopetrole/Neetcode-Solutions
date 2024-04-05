package org.example.DSA;

import java.nio.file.Path;
import java.util.Objects;

public class BinarySearchTree {
    // TODO change interfaces for this class
    // TreeNode is public? I know we can pass a Treenode to the constructor currently but this seems wrong (breaks encapsulation)
    // findMinimumNode is public which definitely seems wrong. I set it public to test it but I guess I should only test
    // public interfaces in a real implementation

    // TODO implement generics, equals, and hashcode functions
    TreeNode root;

    public BinarySearchTree(){
        root = null;
    }

    public BinarySearchTree(int value){
        root = new TreeNode(value);
    }

    public void insert(int val){
        root = insertRecursive(root, val);
    }

    public TreeNode insertRecursive(TreeNode current, int val) {
        // base case
        if (current == null){
            return new TreeNode(val);
        }

        if (val < current.val){
            current.left = insertRecursive(current.left, val);
        } else if (val > current.val){
            current.right = insertRecursive(current.right, val);
        }

        return current;
    }

    private TreeNode findMinimumNode(TreeNode current) {
        // base case
        while (current != null && current.left != null){
            current = current.left;
        }

        return current;

    }

    public void remove(int val){
        removeRecurs(root, val);
    }

    public TreeNode removeRecurs(TreeNode root, int val){
        // if no children, set parent to point in same direction as null
        // if 1 child, parent now points at child of node to remove
        // if 2 children, replace node to remove with either left or right
        // if root node, replace with minimum function on right node

        if (root == null){
            return null;
        }

        if (val > root.val){
            root.right =  removeRecurs(root.right, val);
        } else if (val < root.val){
            root.left = removeRecurs(root.left, val);
        } else {
            if (root.left == null){
                return root.right;
            } else if (root.right == null){
                return root.left;
            } else {
                TreeNode minNode = findMinimumNode(root);
                root.val = minNode.val;
                root.right = removeRecurs(root.right, minNode.val);
            }
        }

        return root;

    }

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
