package org.example.BinarySearch;

public class Solution {
    public int findMin(int[] nums) {
        // Runs in O(log n) time complexity
        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        while(leftPointer <= rightPointer){
            if (nums[leftPointer] <= nums[rightPointer]){
                return nums[leftPointer];
            }

            int midPointer = (leftPointer + rightPointer) / 2;
            if (nums[midPointer] >= nums[leftPointer]){
                leftPointer = midPointer + 1;
            } else {
                rightPointer = midPointer;
            }
        }

        return 0;
    }

    public int search(int[] nums, int target) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        while (leftPointer <= rightPointer){
            int midPointer = (leftPointer + rightPointer) / 2;

            if (nums[midPointer] == target){
                return midPointer;
            }

            if (nums[leftPointer] <= nums[midPointer]){

            } else {

            }



//            if (nums[leftPointer] <= nums[rightPointer]){
//                return leftPointer;
//            }
//
//            int midPointer = (leftPointer + rightPointer) / 2;
//

        }

        return -1;
    }
}
