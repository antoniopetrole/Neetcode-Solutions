package org.example.SlidingWindow;
import org.junit.Test;
import static org.junit.Assert.*;

public class SlidingWindow {
    Solution solution = new Solution();

    @Test
    public void maxProfit(){
        int[] testData = new int[]{2,4,1};

        assertEquals(2, solution.maxProfit(testData));
    }
}
