package org.example.DSA;

import com.sun.source.tree.Tree;
import org.example.Sandbox.BST.TreeNode;

public class BinarySearchTree {

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

    private class TreeNode{
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
