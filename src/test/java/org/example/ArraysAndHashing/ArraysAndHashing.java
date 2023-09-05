package org.example.ArraysAndHashing;

import org.junit.Test;
import static org.junit.Assert.*;
public class ArraysAndHashing {
    @Test
    public void blah(){
        assertEquals(1,1);
    }

    Solution solution = new Solution();

    @Test
    public void topKFrequentHappyPath(){
        int[] nums = new int[]{2,2,3,1,1,1,4,4,4,4,4,4};
        int top = 2;

        assertArrayEquals(new int[]{4,1}, solution.topKFrequent(nums, top));
    }

    @Test
    public void productExceptSelf(){
        assertArrayEquals(new int[]{24,12,8,6}, solution.productExceptSelf(new int[]{1,2,3,4}));
    }

    @Test
    public void isValidSodoku(){
        char[][] board ={{'5','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};

        char [][] board2 = {{'8','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};

        assertEquals(true, solution.isValidSudoku(board));
        assertEquals(false, solution.isValidSudoku(board2));

    }

    @Test
    public void longestConsecutive(){
        int[] nums = new int[]{100,4,200,1,3,2};

        assertEquals(4, solution.longestConsecutive(nums));

        int[] nums2 = new int[]{0,3,7,2,5,8,4,6,0,1};

        assertEquals(9, solution.longestConsecutive(nums2));

        int[] nums3 = new int[]{1,2,0,1};

        assertEquals(3, solution.longestConsecutive(nums3));
    }
}
