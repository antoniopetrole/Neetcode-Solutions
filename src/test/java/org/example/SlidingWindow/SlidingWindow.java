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

    @Test
    public void lengthOfLongestSubstring(){
        String test1 = "abcabcbb";

        assertEquals(3, solution.lengthOfLongestSubstring(test1));

        String test2 = "bbbbb";

        assertEquals(1, solution.lengthOfLongestSubstring(test2));

        String test3 = "pwwkew";

        assertEquals(3, solution.lengthOfLongestSubstring(test3));

        String test4 = "au";

        assertEquals(2, solution.lengthOfLongestSubstring(test4));

    }
}
