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
}
