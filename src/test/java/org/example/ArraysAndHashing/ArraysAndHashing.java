package org.example.ArraysAndHashing;

import org.junit.Test;
import static org.junit.Assert.*;
public class ArraysAndHashing {
    @Test
    public void blah(){
        assertEquals(1,1);
    }

    @Test
    public void topKFrequentHappyPath(){
        int[] nums = new int[]{2,2,3,1,1,1,4,4,4,4,4,4};
        int top = 2;

        Solution solution = new Solution();

        assertArrayEquals(solution.topKFrequent(nums, top), new int[]{4,1});

    }
}
