package org.example.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public boolean isPalindrome(String s) {
        String cleanedString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        StringBuffer stringBuffer = new StringBuffer(cleanedString);

        return (cleanedString.equals(stringBuffer.reverse().toString()) ? true : false);
    }

    public int[] twoSumII(int[] numbers, int target) {
        int lPointer = 0;
        int rPointer = numbers.length - 1;
        while(numbers[lPointer] + numbers[rPointer] != target){
            if (numbers[lPointer] + numbers[rPointer] < target){
                lPointer++;
            } else {
                rPointer--;
            }
        }
        return new int[]{lPointer + 1, rPointer + 1};
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> results = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++){
            List<Integer> subResult = new ArrayList<>();
            int lPointer = i + 1;
            int rPointer = nums.length - 1;
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1] )){
                while(lPointer < rPointer){
                    int intermediateSum = nums[i] + nums[lPointer] + nums[rPointer];
                    if (intermediateSum == 0){
                        subResult.add(nums[i]);
                        subResult.add(nums[lPointer]);
                        subResult.add(nums[rPointer]);
                        results.add(subResult);
                    } else if ( intermediateSum > 0){
                        rPointer--;
                    } else {
                        lPointer++;
                    }
                }
            }
        }

        return results;
    }

    public int maxArea(int[] height) {
        // Get left pointer and right pointer
        // Multiply distance against min(lPointer,rPointer)
        // Store this value
        // Loop and compare against previously found value
        // This is going to be O(n^2)?

        // Good solution
        int answer = 0;
        int rightPointer = height.length - 1;
        int leftPointer = 0;

        while(leftPointer < rightPointer){
            int distance = rightPointer - leftPointer;
            int h = Math.min(height[rightPointer], height[leftPointer]);
            int area = distance * h;
            answer = Math.max(answer, area);

            if(height[leftPointer] < height[rightPointer]) {
                leftPointer++;
            } else if(height[leftPointer] > height[rightPointer]) {
                rightPointer--;
            } else {
                leftPointer++;
                rightPointer--;
            }
        }

        // Naive solution
//        int answer = 0;
//        for (int lPointer = 0; lPointer < height.length - 1; lPointer++){
//            int rPointer = height.length - 1;
//            while(rPointer > lPointer){
//                int product = (rPointer - lPointer) * Math.min(height[rPointer], height[lPointer]);
//
//                if (product > answer){
//                    answer = product;
//                }
//
//                rPointer--;
//            }
//        }

        return answer;
    }

    public int trap(int[] height) {
        // Create while loop until left pointer hits the end of the array
        // Increment rPointer until we find another height that is >= the lPointer height
        // Calculate the area as follows
        //      1. Sum all of the numbers on the inclusive range between lPointer and rPointer
        //      2. Substract this sum from the number of summed elements * the inclusive distance between lPointer and rPointer
        //              - For example in [0, 2, 1, 0, 1, 3, 0]
        //                                   ^lPointer   ^rPointer
        //              - We first sum 1, 0, and 1 which is 2
        //              - Then we multiply the number of elements against the Math.min(2,3) which is 3 * 2 = 6
        //              - Finally we subtract our sum from our product which is 6 - 2 which leaves us with the result of 4
        // += this to our result total, then set the rPointer and lPointer positions to position of our last r value
        // This should automatically avoid issues like the 8th position in example 1 due to it never finding a height >= to left lPointer
        // Note: Need to avoid running over the index length when checking values

        // TODO doesn't currently pass all tests on Leetcode despite passing local tests
        int answer = 0;
        int lPointer = 0;
        int rPointer = lPointer + 1;

        while (lPointer < height.length - 1){

            int inclusiveSum = 0;

            while(height[rPointer] < height[lPointer] && rPointer < height.length - 1){
                rPointer++;
            }

            if (rPointer == height.length - 1 && height[rPointer] < height[lPointer]){
                lPointer++;
                rPointer = lPointer + 1;
            } else {
                for (int sumPointer = lPointer + 1; sumPointer < rPointer; sumPointer++) {
                    inclusiveSum += height[sumPointer];
                }

                int minHeight = Math.min(height[lPointer], height[rPointer]);

                int distance = rPointer - lPointer - 1;

                answer += (minHeight * distance) - inclusiveSum;

                lPointer = rPointer;
                rPointer++;
            }

        }

        return answer;
    }
}