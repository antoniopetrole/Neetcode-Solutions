package org.example.DSA;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestBinarySearchTree {

    @Test
    public void insertTest(){
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(5);
        binarySearchTree.insert(10);
        binarySearchTree.insert(3);
        binarySearchTree.insert(4);
        binarySearchTree.insert(1);
        binarySearchTree.insert(12);
        binarySearchTree.insert(8);
        System.out.println("Blah");
    }

    @Test
    public void remove(){
        BinarySearchTree expectedBinarySearchTree = new BinarySearchTree();
        expectedBinarySearchTree.insert(5);
        expectedBinarySearchTree.insert(10);
        expectedBinarySearchTree.insert(3);

        BinarySearchTree resultBinarySearchTree = new BinarySearchTree();
        resultBinarySearchTree.insert(5);
        resultBinarySearchTree.insert(9);
        resultBinarySearchTree.insert(10);
        resultBinarySearchTree.insert(3);
        resultBinarySearchTree.insert(2);

        resultBinarySearchTree.remove(9);
        resultBinarySearchTree.remove(2);

        // This test will fail until I implement a correct equals operator, however the current implementation works
        // via manually comparing both objects
        assertEquals(expectedBinarySearchTree, resultBinarySearchTree);
    }

}
