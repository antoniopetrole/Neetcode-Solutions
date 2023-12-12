package org.example.SlidingWindow;

public class Solution {

    public int maxProfit(int[] prices) {
        int bestPrice = 0;
        int lPointer = 0;
        int rPointer = 1;

        while (rPointer < prices.length){
            if(prices[lPointer] < prices[rPointer]){
                int currentPrice = prices[rPointer] - prices[lPointer];
                bestPrice = Math.max(currentPrice, bestPrice);
            } else {
                lPointer = rPointer;
            }
            rPointer++;
        }

        return bestPrice;
    }

    public int lengthOfLongestSubstring(String s) {

        if(s.length() < 2){
            return s.length();
        }

        int l = 0;
        int r = 1;
        int length = 0;
        String substring = s.charAt(l) + "";


        while(r < s.length()){
            if(!substring.contains(s.charAt(r) + "")){
                substring += s.charAt(r);
                r++;
            } else {
                l++;
                r = l + 1;
                substring = s.charAt(l) + "";
            }
            length = Math.max(substring.length(), length);
        }
        return length;
    }
}
