package org.example.DSA;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {
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

    private TreeNode insertRecursive(TreeNode current, int val) {
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

    private TreeNode removeRecurs(TreeNode root, int val){
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

    // Feels kind of weird having a public method that just calls a private recurs method, but this solves the public method
    // being idempotent since we're mutating the state of the arraylist
    public List<Integer> inOrderGetAllValues(){
        List<Integer> result = new ArrayList<>();
        TreeNode current = root;

        return inOrderGetallValuesRecurs(result, root);
    }

    private List<Integer> inOrderGetallValuesRecurs(List<Integer> result, TreeNode current) {
        if (current == null){
            return result;
        }
        inOrderGetallValuesRecurs(result, current.left);
        result.add(current.val);
        inOrderGetallValuesRecurs(result, current.right);
        return result;
    }

    public List<Integer> preOrderGetAllValues(){
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();

        if (root != null){
            queue.add(root);
        }

        while (!queue.isEmpty()){
            TreeNode current = queue.remove();
            if (current.left != null){
                queue.add(current.left);
            }
            if (current.right != null){
                queue.add(current.right);
            }
            result.add(current.val);
        }
        return result;
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
