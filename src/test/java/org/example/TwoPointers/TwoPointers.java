package org.example.TwoPointers;

import org.junit.Test;
import static org.junit.Assert.*;

public class TwoPointers {

    Solution solution = new Solution();

    @Test
    public void threeSum(){
        int[] test1 = new int[]{-1,0,1,2,-1,-4};

    }

    @Test
    public void maxArea(){
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};

        int test1 = solution.maxArea(height);

        assertEquals(49, test1);
    }

    @Test
    public void trap(){
//        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
//
//        assertEquals(6, solution.trap(height));

        int[] height2 = new int[]{4,2,3};

        assertEquals(1, solution.trap(height2));
    }
}
