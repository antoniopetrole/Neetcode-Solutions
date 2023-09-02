package org.example.ArraysAndHashing;

import java.util.*;

class Solution {
    // Originally tried to brute force by listing through the arrays twice but the time complexity was O(n^2) so I ended
    // up using a hashset for constant time operations
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsMap = new HashSet<>();

        for (int i = 0; i < nums.length; i++){
            if (numsMap.contains(nums[i]) ){
                return true;
            }

            numsMap.add(nums[i]);
        }

        return false;
    }

    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }
}