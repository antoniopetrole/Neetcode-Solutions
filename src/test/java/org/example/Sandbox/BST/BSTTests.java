package org.example.Sandbox.BST;
import org.junit.Test;
import static org.junit.Assert.*;

public class BSTTests {
    @Test
    public void insert(){
        TreeNode treeNode = new TreeNode(4);

        TreeNodeAlgorithms.insertIntoBST(treeNode, 5);
        TreeNodeAlgorithms.insertIntoBST(treeNode, 1);
        TreeNodeAlgorithms.insertIntoBST(treeNode, 0);
        TreeNodeAlgorithms.insertIntoBST(treeNode, 7);
    }
}
