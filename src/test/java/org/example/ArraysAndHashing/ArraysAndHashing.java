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

        assertArrayEquals(solution.topKFrequent(nums, top), new int[]{4,1});
    }

    @Test
    public void productExceptSelf(){
        assertArrayEquals(solution.productExceptSelf(new int[]{1,2,3,4}),new int[]{24,12,8,6});
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

        assertEquals(solution.isValidSudoku(board), true);
        assertEquals(solution.isValidSudoku(board2), false);

    }
}
