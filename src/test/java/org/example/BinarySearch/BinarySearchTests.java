package org.example.BinarySearch;
import static org.junit.Assert.*;
import org.junit.Test;

public class BinarySearchTests {
    Solution solution = new Solution();

    @Test
    public void findMin(){
        int[] testCase1 = new int[]{3,4,5,6,1,2};
        int[] testCase2 = new int[]{4,5,0,1,2,3};
        int[] testCase3 = new int[]{4,5,6,7};

        assertEquals(1,solution.findMin(testCase1));
        assertEquals(0,solution.findMin(testCase2));
        assertEquals(4,solution.findMin(testCase3));

    }

    @Test
    public void search(){
        int[] testCase1 = new int[]{ 3,4,5,6,1,2 };
        int[] testCase2 = new int[]{ 3,5,6,0,1,2 };

        assertEquals(4, solution.search(testCase1, 1));
        assertEquals(1, solution.search(testCase2, 4));

    }
}
